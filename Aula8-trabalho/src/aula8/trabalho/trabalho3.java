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
public class trabalho3 {
    public static void main(String[] args) {
    //3. Mostrar os números ímpares entre 1 e 500, inclusive, em ordem decrescente.
    int n = 501;
    int cont= 0;
    String ehimpar = "";
    int[]numeros; 
    numeros = new int[n];
      
    int[]impar; 
    impar = new int[n];
    
        for (int i = 0; i < numeros.length; i++) {
             numeros[i] = cont;
             cont = cont+1;
            if((numeros[i]  % 2) == 1) {
               impar[i] = numeros[i];
               //debug
               System.out.println("Par "+impar[i]+" NUMEROS "+numeros[i]);
         
        
            
      }       
 }
            int negativo = numeros.length;
             for (int x = 0; x < numeros.length; x++) {
             negativo--;
             int str_impar = impar[negativo];
             ehimpar = str_impar"\n";
}
  //debug System.out.print(num);
        JOptionPane.showMessageDialog(null, "O array invejo é: \n"+ehimpar);       
    }
                
    }
    
     

 
    

