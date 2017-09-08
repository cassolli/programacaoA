/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioaula11;

import java.util.Scanner;

/**
 *
 * @author cassolli
 */
public class ExercicioAula11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

/**  11)Faça um programa que leia o tempo de duração de um evento em uma fábrica expressa em segundos e
mostre-o expresso em horas, minutos e segundos.
*/

System.out.println("Exercicio 11");
Scanner scanprod = new Scanner(System.in);
System.out.print("Quantos segundos leva para fazer um carro?\t");
String segundos = scanprod.nextLine();
int segundo = Integer.parseInt(segundos) % 60;
int minutos = Integer.parseInt(segundos) / 60;
int minuto = minutos % 60;
int hora = minutos / 60;
String horaf = String.format ("\n%02d:%02d:%02d", hora, minuto, segundo);

System.out.print("Um carro demora ?\t"+horaf+" para ser produzido!\n");
    }
    
}
