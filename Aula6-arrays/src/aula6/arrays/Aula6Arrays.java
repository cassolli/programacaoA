/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6.arrays;
import java.util.Arrays;
/**
 *
 * @author 17213008
 */
public class Aula6Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   int[]jogoSena; //Declaração
   jogoSena = new int[6]; //Criação
   jogoSena[0] = 23; // posição 1
   jogoSena[1] = 12; // posição 2
   jogoSena[2] = 55; // posição 3
   jogoSena[3] = 02; // posição 4
   jogoSena[4] = 07; // posição 5
   jogoSena[5] = 19; // posição 6
   
   
   
    System.out.print("O tamanho do array é  "+jogoSena.length+".\n");
        for (int i = 0; i < jogoSena.length; i++) {
            
            System.out.print("Na posição "+i+" o valor armazenado é "+jogoSena[i]+".\n");
            //if (jogoSena[i] == jogoSena[0] && jogoSena[0] == 23){
            if (jogoSena[i] == 23){
                System.out.print("Você acertou um número!!!\n");
                
            }
            if (jogoSena[i] == 12){
                System.out.print("Você acertou dois numeros!!!\n");
                
            }
    }     
   
int soma = jogoSena[0]+jogoSena[5]; 
System.out.print("O resultado da soma da posição 0 e 5 é: "+ soma);



   
 //  System.out.println(Arrays.toString(jogoSena));
//length  tamanho do array no for         
                   
                   
                   
    }
    
}
