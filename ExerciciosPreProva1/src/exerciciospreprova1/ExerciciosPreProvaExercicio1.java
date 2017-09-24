/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciospreprova1;
import javax.swing.JOptionPane;
/**
 *
 * @author cassolli
 */
public class ExerciciosPreProvaExercicio1 {
     public static void main(String[] args) {
/**         
1) Escreva um algoritmo para calcular a nota final e apresentar a situação de um aluno na disciplina de "Programação'. 
* O aluno deverá fazer duas avaliações (nota de 0 a 100) e estará aprovado se alcançar uma nota maior ou igual a 70 
* e se tiver frequência de no mínimo 75%. Caso o aluno não alcance a média 70 mas tenha frequência suficiente então ele 
* tem direito a realizar o EXAME. Neste caso, para ele ser aprovado, a média ponderada entre o primeiro resultado 
* (com peso de 60%) e a nota do exame (com peso de 40%) deverá ser maior ou igual a 50.
*/ 

float nota1 = 0f;
float nota2 = 0f;
float notarepo = 0f;
float media = 0f;
float totalaula = 0f;
float totalfalta = 0f;
float frequencia = 0f;
float pesodia = 0f;
float nota3 = 0f;
float media_final = 0f;
float total_frequencia = 0f;
float nova_media = 0f;
int contador = 0;
int contador1 = 0;
int continuar = 0;
while (contador == 0) {
    String nome = JOptionPane.showInputDialog("Qual o nome do Aluno?");
    JOptionPane.showMessageDialog(null,"Vamos ver se o aulo "+nome+" passou na cadeira de Programação A?");    
    
   while (contador1 == 0) {

    String capnota1 = JOptionPane.showInputDialog("Quanto "+nome+" tirou na primeira avaliação?");
    nota1 = Integer.parseInt(capnota1);
    String capnota2 = JOptionPane.showInputDialog("Quanto "+nome+" tirou na segunda avaliação?");
    nota2 = Integer.parseInt(capnota2);
    
if ((nota1 >= 0 && nota1 <=100) && (nota2 >= 0 && nota2 <=100)){ 
    
    String capaula = JOptionPane.showInputDialog("Quantas Aulas tivemos no ano?");
    totalaula = Integer.parseInt(capaula);
    String capfalta = JOptionPane.showInputDialog("Quantas faltas o aluno "+nome+ "teve?");
    totalfalta = Integer.parseInt(capfalta);

/**Debug*
String nome = "Diego";
totalaula = 150f;
totalfalta = 147f;
nota1 =100f;
nota2 = 75f;
*/

    media = (nota1+nota2)/2;

    frequencia =(totalaula-totalfalta);
    total_frequencia = (frequencia*100)/totalaula;


/**Debug
System.out.print("TotalAula "+totalaula+" Total falta "+totalfalta+" PesoDia "+pesodia+" frequencia "+frequencia+"% frenquancia"+total_frequencia);
/***/

        if (media >=70 && total_frequencia >=75){
                    JOptionPane.showMessageDialog(null,"O aluno "+nome+" passou na cadeira de Programação A com nota "+media+". E sua frequência foi de "+total_frequencia+"."); 
                    contador1 = 1;
                }else{
                JOptionPane.showMessageDialog(null,"O aluno "+nome+" não passou na cadeira de Programação sua nota foi "+media+". E sua frequência foi de "+total_frequencia+".");
                    contador1 = 1;
                    if (total_frequencia >=75){
                        contador1 = 1;
                        nova_media = (media*0.60f)/0.60f;
                        String capnota3 = JOptionPane.showInputDialog("Quanto "+nome+" tirou na terceira avaliação? Sabendo que essa prova tem como nota máxima 40");
                        nota3 = Integer.parseInt(capnota3);
                        /**Debug
                         nota3= 50f;  
                        */
                        nota3 = (nota3*0.40f)/0.40f;
                        media_final = (nova_media+nota3)/2;
                        if (media_final >= 50f){
                        JOptionPane.showMessageDialog(null,"O aluno "+nome+" passou na cadeira de Programação com a nota final "+media_final+" e frequancia de "+total_frequencia+"%.");
                        contador1 = 1;
                        }
                    }
               
                }
        }else{
                JOptionPane.showMessageDialog(null,"Valor das notas incorretas, nota deve ser entre 0 e 100");
                contador1 = 0;
    }
}
    continuar = JOptionPane.showConfirmDialog(null, "Deseja ver se outro aluno passou na cadeira de Programação A?" , "\"Pergunta\"" , JOptionPane.YES_NO_OPTION); 
   if(continuar == JOptionPane.YES_OPTION) { 
    contador1 = 0;
    contador = 0;
   }else{
       JOptionPane.showMessageDialog(null,"Programa finalizado!");  
   contador =1;
   }
   }
}   
   
    }