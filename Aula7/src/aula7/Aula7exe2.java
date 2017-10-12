/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula7;

/**
 *
 * @author 17213008
 */
public class Aula7exe2 {
 public static void main(String[] args) {
   int[]vetor; //Declaração
   vetor = new int[5];
   vetor[0] = 7;
   vetor[1] = 8;
   vetor[2] = 9;
   vetor[3] = 10;
   vetor[4] = 11;
   
  int[]vetor1; //Declaração
   vetor1 = new int[5];
   vetor1[0] = 0;
   vetor1[1] = 1;
   vetor1[2] = 2;
   vetor1[3] = 3;
   vetor1[4] = 4;
   
    for (int i = 0; i < vetor.length; i++) {
         for (int z = 0; z < vetor.length; z++) {
             int soma = vetor[i]+vetor1[z];
             System.out.print("A soma de "+vetor[i]+ " + "+vetor1[z]+" é: "+soma+"\n");
         }
    }
   
 }  
}
