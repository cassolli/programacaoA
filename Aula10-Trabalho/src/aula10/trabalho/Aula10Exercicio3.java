/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10.trabalho;
import javax.swing.JOptionPane;
	
/**
 *
 * @author cassolli
 */
public class Aula10Exercicio3 {
     public static void main(String[] args) {
     
     //3. Altere o programa acima para que ele continue a ler nomes do teclado até que o usuário digite a palavra 
     //"fim", e então imprima os nomes digitados na ordem em que foram digitados. 


     //variaveis do loop e pergunta
     int num = 0;
     int resp =0;
     
     //Fazer o loop
     while(num <= 1)
     { 
     //Contador para usar nas mensagens 
     int cont=0;
     int cont_array =0;
     //variaveis para concatenar os nomes na ordem normal e inversa para exibir no final do programa
     String semon = "";
     String nomesordem = "";
     //Ver quantos itens gostaria de inserir para criar o array dinamicamente
         int n =2;
     //iniciar array
     String nomes[];
     nomes = new String[n];
     
      for (int i = 0; i < nomes.length; i++) {
          //fazer o cont virar um contador =)
          cont = cont+1;
          int tamanho_array = nomes.length;
         cont_array = cont_array +1;  
          //Perguntar os nomes
          nomes[i] = JOptionPane.showInputDialog("Informe o "+cont+" Nome");  
          //Concatenar para mostrar no final os nomes na ordem digitada
          System.out.println("testando"+cont_array+tamanho_array);
          nomesordem += cont+". "+nomes[i]+"\n";
          
          
          if (cont_array == tamanho_array){
          System.out.println("chegou ao limite"+cont_array+tamanho_array);
          String novoarray += novoarray+cont;
          int novoarray = new int[nomes.length + 1 ];
          System.arraycopy(nomes, 0, novoArray, 0, nomes.length);
          
          }
      
          
          
      }
      
      
      
      
      /**iniciar contador inverso "semon" é nomes ao contrário =)
      int cont_semon = nomes.length;
      
      for (int x = 0; x < nomes.length; x++) {
         //contador inverso
         cont_semon--;
         //debug
         //System.out.println(nomes[semon]);
         //concatenar valores inversos
         semon += cont+". "+nomes[cont_semon]+"\n";
         //diminuir contador aqui ele chega com os valores do primeiro for
         cont = cont-1;
      }
     //Mostrar 
     JOptionPane.showMessageDialog(null, "A ordem digitada foi: \n"+nomesordem +"\nA ordem inversa dos nomes digitados é: \n"+semon);
     */
      //Pergunta para reiniciar while ou finalizar
     resp = JOptionPane.showConfirmDialog(null, "Testar novamente?", "Pergunta", JOptionPane.YES_NO_OPTION);
        
        if (resp == JOptionPane.NO_OPTION) {
                num = 2; 
        }
     
     }
     }
}
     
     

