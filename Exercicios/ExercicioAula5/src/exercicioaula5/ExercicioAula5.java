/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioaula5;

/**
 *
 * @author cassolli
 */
public class ExercicioAula5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // 5)Faça um programa que leia dois valores do tipo float e calcule +, -, *, / e o %.
        System.out.println("Exercicio 5");

float valor1 = 15.2f;
float valor2 = 6.1f;

float soma = valor1+valor2;
float sub = valor1-valor2;
float multi = valor1*valor2;
float rest = valor1%valor2;
        System.out.println("A soma é "+soma);
        System.out.println("A subtração é "+sub);
        System.out.println("A multiplicação é "+multi);
        System.out.println("O resto é "+rest);
    }
    
}
