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
public class ExerciciosPreProvaExercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/**
2. Determinado município gaúcho estipulou o pagamento de um auxílio de R$ 25 por membro familiar, às famílias que atenderem 
os seguintes critérios:
a) Renda familiar per capta de até R$ 120,00
b) Ter filhos em idade escolar obrigatória (de 5 a 17 anos) ou ter membros com mais de 18 anos que não estejam trabalhando 
mas estejam matriculados em curso de qualificação.
O algoritmo deverá coletar as seguintes informações: Qual é a renda total da família (soma de todos os salários)? 
Quantos membros dependem dessa renda? Existem filhos em idade escolar (5 a 17) anos? Na família há desempregados com 
mais de 18 anos? Se a resposta na questão anterior for positiva o sistema deve perguntar se estes membros do grupo 
familiar estão frequentando cursos de qualificação. Ao final o sistema deve indicar se a família tem direito ou não a 
receber o benefício e qual é o valor total.
*/
int beneficio = 25; //pormembro
//ganha que:
//renda percapita de R$ 120 
//idade entre 5 e 17
float totalrenda = 0f;
float integrantes = 0f;
int filhos5a17 = 0;
int filhos18 = 0;
int fcurso = 0;
int continuar = 1;
float totalbeneficio = 0f;
float rendaPintegrante = 0f;
    JOptionPane.showMessageDialog(null,"Vamos ver se a familia está eleita para receber o auxilio?");    
    String nomefamilia = JOptionPane.showInputDialog("Qual o nome da familia que vamos testar?");
    String  str_renda= JOptionPane.showInputDialog("Qual a renda per capita familiar?");
    totalrenda = Float.parseFloat(str_renda);
    String  str_integrantes= JOptionPane.showInputDialog("Quantos integrantes a famila tem?");
    integrantes = Integer.parseInt(str_integrantes);
    rendaPintegrante = totalrenda/integrantes;        
//Para debug descomentar os system.out    
    if (rendaPintegrante <= 120){
        filhos5a17 = JOptionPane.showConfirmDialog(null, "A familia "+nomefamilia+" tem filhos entre 5 e 17 anos" , "\"Pergunta\"" , JOptionPane.YES_NO_OPTION); 
            if(filhos5a17 == JOptionPane.YES_OPTION) {
                filhos18 = JOptionPane.showConfirmDialog(null, "A familia "+nomefamilia+" tem filhos maiores de 18 anos desempegrado?" , "\"Pergunta\"" , JOptionPane.YES_NO_OPTION); 
//                 System.out.print("filhos5a17"+filhos5a17+"\n");
                 if(filhos18 == JOptionPane.YES_OPTION) { 
                    fcurso = JOptionPane.showConfirmDialog(null, "Você disse que tem integrantes maiores de 18 anos, ele(s) estão fazendo algum curso?" , "\"Pergunta\"" , JOptionPane.YES_NO_OPTION); 
//                  System.out.print("filhos18"+filhos18+"\n");
                        if(fcurso == JOptionPane.YES_OPTION) {   
//                            System.out.print("fcurso"+fcurso+"\n");
                            totalbeneficio = integrantes*beneficio;
                            JOptionPane.showMessageDialog(null,"A familia "+nomefamilia+" está eleita a receber o benecio de R$ 25,00 por integrante.\n A familia irá receber "+totalbeneficio);    

                         }else{
                         JOptionPane.showMessageDialog(null,"A familia "+nomefamilia+" não está eleita a receber o benecio.");    
                         }

                 }else{
                    JOptionPane.showMessageDialog(null,"A familia "+nomefamilia+" não está eleita a receber o benecio.");    
                 }
            }else{
                 JOptionPane.showMessageDialog(null,"A familia "+nomefamilia+" não está eleita a receber o benecio.");    
            }

            

                    
                
            
    }else{
           JOptionPane.showMessageDialog(null,"A familia "+nomefamilia+" não está eleita a receber o benecio.");    
           }

        
/**Debug
System.out.print("nomefamilia"+nomefamilia+"totalrenda"+totalrenda);
/***/

    }    
}
