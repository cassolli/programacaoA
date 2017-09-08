/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3_28_08;

/**
 *
 * @author 17213008
 */
public class Exercicio3_28_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 3)Elaborar um programa que leia dois valores inteiros e troque o valor, a e b de forma que a fique com o valor de
b, b com o valor de a.
*/
        int a = 10;
        int b = 20;
        int c = 0;
        c = a;
        a = b;
        b = c;
        
        System.out.println("O valor de a="+a);
        System.out.println("O valor de b="+b);
    }
    
}
