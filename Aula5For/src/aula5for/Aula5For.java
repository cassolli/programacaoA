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
public class Aula5For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int num = 0;
    int mult = 0;
    int i = 0;
    String tabu = " ";        
    JOptionPane.showMessageDialog(null,"Informe um número e lhe direi sua tabuada");
    String str_numero = JOptionPane.showInputDialog("Informe o número!");
    num=Integer.parseInt(str_numero);
        for (i=1; i<=10; i++){
           mult = num*i;
           tabu = tabu + "O valor de "+num+"x"+i+"="+mult+"\n";
        }
        JOptionPane.showMessageDialog(null, tabu);
        
    }
    
}
