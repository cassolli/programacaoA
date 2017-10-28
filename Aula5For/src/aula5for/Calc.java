/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5for;

import javax.swing.JOptionPane;

/**
 *
 * @author 17213008
 */
public class Calc {
    public static void main(String[] args) {
    int oper = 0;
    int dig1 = 0;
    int dig2 = 0 ;
    int total = 0;
    int verdade = 1;
   // String novamente = " ";
    JOptionPane.showMessageDialog(null,"Vamos calcular?");
       while (verdade==1){
        String str_oper = JOptionPane.showInputDialog("O que gostatria de fazer\n1.Somar\n2.Subtrair\n3.Dividir\n4.Multiplicar");
        oper=Integer.parseInt(str_oper);
        String str_dig1 = JOptionPane.showInputDialog("Qual o primeiro digito?");
        dig1=Integer.parseInt(str_dig1);
        String str_dig2 = JOptionPane.showInputDialog("Qual o segundo digito?");
        dig2=Integer.parseInt(str_dig2);
             if(oper == 1){
                total = dig1+dig2;
            }if(oper == 2){ 
                total = dig1-dig2;
            }if(oper == 3){
                total = dig1/dig2;
            }if(oper == 4){
                total = dig1*dig2;
        }
          JOptionPane.showMessageDialog(null,"Resultado "+total);         
            
    int novamente = JOptionPane.showConfirmDialog(null, "Deseja fazer um novo calculo?", "Pergunta", JOptionPane.YES_NO_OPTION);
       if (novamente == JOptionPane.NO_OPTION) {
            verdade = 2; 
        }
   
    }
    }
}
