/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula7;

import javax.swing.JOptionPane;

/**
 *
 * @author 17213008
 */
public class Aula7exe3 {
    public static void main(String[] args) {
   //String nome = JOptionPane.showInputDialog("Informe o nome");
   int vetorf  = 0 ;
   int vetor1f = 0;
   
   int[]vetor; 
   vetor = new int[2];
   
   
        for (int i = 0; i < vetor.length; i++) {
            String str_ventor = JOptionPane.showInputDialog("Informe "+i+" º numero.");
            vetor[i] = Integer.parseInt(str_ventor);
        }
   
   int[]vetor1; 
   vetor1 = new int[2];
   
        for (int z = 0; z < vetor1.length; z++) {
            String str_ventor1 = JOptionPane.showInputDialog("Informe "+z+"º numero.");
            vetor1[z] = Integer.parseInt(str_ventor1);
        }
  
    for (int i = 0; i < vetor.length; i++) {
         for (int z = 0; z < vetor1.length; z++) {
            if (vetor[i] == vetor1[z]){
                 System.out.print("Os valores são iguais vetor1[i] = "+vetor[i]+" vetor1[z] = "+vetor1[z]+"\n");    
    } 
         }
    }
   
   
/**
   for (int i = 0; i < vetor.length; i++) {
   System.out.print("Debug "+vetor[i]);           
   } 
    
 */ 
   
   
   
 
 }  
}
