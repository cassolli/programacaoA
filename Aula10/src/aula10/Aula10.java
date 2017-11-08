/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10;
import javax.swing.JOptionPane;
/**
 *
 * @author 17213008
 */
public class Aula10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a;
        int[] b;
        int n= 2;
       String[][] tabela = new String[n][n];
       String[][] idade = new String[n][n];
     //tabela[0][0]="1";
     // tabela[0][1]="1";
      // tabela[1][0]="1";
     //tabela[1][1]="1";
     
     System.out.println(tabela.length);
        for (int i=0; i < tabela.length; i++){
            for (int x=0; x < tabela.length; x++){
                tabela[x][i] = JOptionPane.showInputDialog("Informe o ["+x+"]["+i+"] nome.");
                idade[x][i] = JOptionPane.showInputDialog("Informe ["+x+"]["+i+"] idade");     
               }
    }
        
      for (int i=0; i < tabela.length; i++){
            for (int x=0; x < tabela.length; x++){
      // JOptionPane.showMessageDialog(null, "Voce digitou na posição ["+x+"]["+i+"]"+tabela[x][i]);
        if(tabela[x].equals(tabela[i])){
            JOptionPane.showMessageDialog(null, "Voce digitou na posição ["+x+"]["+i+"] "+tabela[x][i]+" e idade "+idade[x][i]);
        }  
                }
    }
      
      
        
        
    }
    
}
