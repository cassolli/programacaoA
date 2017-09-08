/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioaula12;

/**
 *
 * @author cassolli
 */
public class ExercicioAula12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/**
12)O custo ao consumidor de um carro novo é a soma do custo de fábrica com a porcentagem do distribuidor e
dos impostos (aplicados ao custo de fábrica). Supondo que a porcentagem do distribuidor seja de 28% e os
impostos de 45%, escrever um programa que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.
*/     
System.out.println("Exercicio 12");
float vcarro = 45.000f;        
float pdistri = 45.000f * 0.28f;
float imposto = 45.000f * 0.45f;

float custo = imposto+pdistri+vcarro;
System.out.print("O valor final do carro é "+custo+"\n");

    }
    
}
