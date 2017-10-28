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
public class trabalho2 {
     public static void main(String[] args) {
    //2. Ler vários números e mostrar a quantidade de pares.
 int par =0;
  int[]numeros; 
  numeros = new int[2];
  for (int i = 0; i < numeros.length; i++) {
      String str_numero = JOptionPane.showInputDialog("Informe "+i+"º numero.");
      numeros[i] = Integer.parseInt(str_numero);
           if((numeros[i]  % 2) == 0) {
               par = par+1;
             //debug
             //System.out.println("Par "+numeros[i]+ "contador de pares"+par);
           } 
     }
JOptionPane.showMessageDialog(null,"O número de pares digitados foram "+par+"."); 
 
     }

}