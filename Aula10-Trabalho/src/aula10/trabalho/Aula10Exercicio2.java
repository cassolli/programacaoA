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
public class Aula10Exercicio2 {
     public static void main(String[] args) {
     
     //2. Faça um programa que leia cinco nomes do teclado, e depois imprima esses nomes na ordem inversa em que foram 
     //digitados pelo usuário. 

     //variaveis do loop e pergunta
     int num = 0;
     int resp =0;
     
     //Fazer o loop
     while(num <= 1)
     { 
     //Contador para usar nas mensagens 
     int cont=0;
     //variaveis para concatenar os nomes na ordem normal e inversa para exibir no final do programa
     String semon = "";
     String nomesordem = "";
     //Ver quantos itens gostaria de inserir para criar o array dinamicamente
         
     //iniciar array
     String nomes[];
     nomes = new String[5];
     
      for (int i = 0; i < nomes.length; i++) {
          //fazer o cont virar um contador =)
          cont = cont+1;
          //Perguntar os nomes
          nomes[i] = JOptionPane.showInputDialog("Informe o "+cont+" Nome");  
          //Concatenar para mostrar no final os nomes na ordem digitada
          nomesordem += cont+". "+nomes[i]+"\n";
      
      }
      
      //iniciar contador inverso "semon" é nomes ao contrário =)
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
     //Pergunta para reiniciar while ou finalizar
     resp = JOptionPane.showConfirmDialog(null, "Testar novamente?", "Pergunta", JOptionPane.YES_NO_OPTION);
        
        if (resp == JOptionPane.NO_OPTION) {
                num = 2; 
        }
     
     }
     
     }
}
