/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioaula6;

import java.util.Scanner;

/**
 *
 * @author cassolli
 */
public class ExercicioAula6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*6)Crie um programa que peça o nome e a altura de uma pessoa em centímetros e apresente na tela o nome e a
altura em metros.
*/        
    System.out.println("Exercicio 6");

 
Scanner scanner = new Scanner(System.in);

System.out.print("Qual seu nome?\t");
String nome = scanner.nextLine();

System.out.print("Qual sua altura? Use virgula\t");
float altura = scanner.nextFloat();
//String nome = "Diego"; //Variaveis fixas para teste
//float altura = 1.77f; // Variaveis fixas para teste
System.out.println("\nSeu nome é\t" + nome);
System.out.println("Sua altura é\t" + altura);
    }
    
}
