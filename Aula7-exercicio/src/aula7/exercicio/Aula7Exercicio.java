/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula7.exercicio;
import javax.swing.JOptionPane;

/**
 *
 * @author cassolli
 */
public class Aula7Exercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Faça um programa que leia cinco números do teclado, e depois imprima esses números na ordem inversa em que 
    //foram digitados pelo usuário.
    int[]numero; 
    numero = new int[5];
    String num = "";
                   

        for (int n = 0; n < numero.length; n++) {
            String str_numero = JOptionPane.showInputDialog("Informe "+n+"º numero.");
            numero[n] = Integer.parseInt(str_numero);
        }
        int count = numero.length;
        for (int n = 0; n < numero.length; n++) {
             count--;
             int numerof = numero[count];
             num += numerof+"\n";
             
         }
  //debug System.out.print(num);
        JOptionPane.showMessageDialog(null, "O array invejo é: \n"+num);       
    }
}
    

