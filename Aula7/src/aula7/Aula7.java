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
public class Aula7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        
        
   String[]jogoSena;
   jogoSena = new String[6]; 
   
   String nome = JOptionPane.showInputDialog("Informe o nome");
   jogoSena[0] = JOptionPane.showInputDialog("Informe 1º numero.");
   jogoSena[1] = JOptionPane.showInputDialog("Informe 2º numero.");
   jogoSena[2] = JOptionPane.showInputDialog("Informe 3º numero.");
   jogoSena[3] = JOptionPane.showInputDialog("Informe 4º numero.");
   jogoSena[4] = JOptionPane.showInputDialog("Informe 5º numero.");
   jogoSena[5] = JOptionPane.showInputDialog("Informe 6º numero."); 
   
  
   
   
    System.out.print("O tamanho do array é  "+jogoSena.length+".\n");
        for (int i = 0; i < jogoSena.length; i++) {
            
            System.out.print("Na posição "+i+" o valor armazenado é "+str_jogoSena[i]+".\n");
            if (jogoSena[i] == jogoSena[0] && jogoSena[0] == 23){
            if (str_jogoSena[i] == 23){
                System.out.print("Parabéns "+nome+" você acertou um número!!!\n");
                
            }
            if (str_jogoSena[i] == 12){
                System.out.print("Parabéns "+nome+" você acertou dois numeros!!!\n");
                
           }
    }     
   
int soma = jogoSena[0]+jogoSena[5]; 
System.out.print("O resultado da soma da posição 0 e 5 é: "+ soma);



   
 //  System.out.println(Arrays.toString(jogoSena));
//length  tamanho do array no for         
    }
    
}
