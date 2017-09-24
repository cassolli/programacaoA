/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalh2.exe4;

import javax.swing.JOptionPane;

/**
 *
 * @author cassolli
 */
public class Trabalh2Exe4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /** 
4) Desenvolva um programa que dado um número inteiro o programa informe se o mesmo é um número primo.
*/

  String numero;
  int count;
  int str_numero;
  numero=JOptionPane.showInputDialog("Digite um número e te direi se é um número primo!");
  str_numero=Integer.parseInt(numero);
  count=0;
  for (int i=1;i<=str_numero;i++ ){
   if(str_numero%i == 0)
   count++;
  }
  if (count==2){
   JOptionPane.showMessageDialog(null, "O numero " +str_numero+ " é número primo.");
  }else{
   JOptionPane.showMessageDialog(null,"O numero " +str_numero+ " não é um número primo.");
  }   
    }
    
}
