/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8.trabalho;

import javax.swing.JOptionPane;

/**
 *
 * @author 17213008
 */
public class trabalho5 {
      public static void main(String[] args) {
    /**      5. Escrever um main Java que lê 20 números reais e armazena esses valores em um array. O programa deve 
calcular a média aritmética dos valores do vetor e imprimir todos os valores menores do que a média 
calculada.
*/
    
    
 int[]numeros; 
 numeros = new int[2];
 
 int[]calculo; 
 calculo = new int[2];
 int soma = 0;
    for (int i = 0; i < numeros.length; i++) {
      String str_numeros = JOptionPane.showInputDialog("Informe sua idade");
      numeros[i] = Integer.parseInt(str_numeros);
      soma = soma + numeros[i];
      }
int media = soma / 2;
 System.out.println(soma);
    
 for (int i = 0; i < numeros.length; i++) {
      if(numeros[i] < media){
          System.out.println(media+"\n");
          System.out.println(numeros[i]);
      }
      }
      }    
}


