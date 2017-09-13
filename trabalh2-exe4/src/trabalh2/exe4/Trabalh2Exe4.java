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
String entrada;
  int n,cont;
  entrada=JOptionPane.showInputDialog("informe um numero");
  n=Integer.parseInt(entrada);
  cont=0;
  for (int i=1;i<=n;i++ ){
   if(n%i == 0)
   cont++;
  }
  if (cont==2){
   JOptionPane.showMessageDialog(null, "o numero " +n+ " é primo");
  }else{
   JOptionPane.showMessageDialog(null,"o numero " +n+ " não é primo");
  }   
    }
    
}
