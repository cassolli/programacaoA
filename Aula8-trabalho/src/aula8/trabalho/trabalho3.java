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
    //Ajustar arrays de uma vez só
    int n = 501;
    int cont= 0;
    String ehimpar = "";
    String ehimpar2 = "";
    
    int[]numeros; 
    numeros = new int[n];
    
    int[]impar; 
    impar = new int[n];
    
        for (int i = 0; i < numeros.length; i++) {
            //gerar numeros 0 a 500
            numeros[i] = cont;
             cont = cont+1;
             //ver se é impar
                if((numeros[i]  % 2) == 1) {
                    impar[i] = numeros[i];
                    int str_ehimpar = numeros[i];
                    //quebrar linha para melhor exibir na tela
                    String tem = Integer.toString(str_ehimpar);
                        if (tem.contains("01")){
                            ehimpar += str_ehimpar+"\n"; 

                        }else{                 
                            ehimpar += str_ehimpar+" "; 
             }
             //debug
             // System.out.println("Par "+impar[i]+" NUMEROS "+numeros[i]);
                 
                }
        }
            //mostrar os impares de 0 a 500
            JOptionPane.showMessageDialog(null, "Os impares de 0 a 500 são: \n"+ehimpar);
            
            //iniciar contador inverso
            int negativo = numeros.length;
                for (int x = 0; x < numeros.length; x++) {
                    //contador inverso
                    negativo--;
                        if(impar[negativo] != 0){
                            int str_impar2 = impar[negativo];
                            //Deixar mais amigável, quebrar a linha no n01
                            String tem = Integer.toString(str_impar2);
                                if (tem.contains("01")){
                                    ehimpar2 += str_impar2+"\n";
                                }else{                 
                                    ehimpar2 += str_impar2+" "; 
                                }
                 
                        }
                    }
            //mostrar impares inverso 500 a 0
            JOptionPane.showMessageDialog(null, "Os impares de 500 a 0 são: \n"+ehimpar);       
    }
                
}