/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioaula10;

/**
 *
 * @author cassolli
 */
public class ExercicioAula10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*
10)Faça um programa que leia as 3 notas de um aluno e calcule a média final deste aluno. Considerar que a
média é ponderada e que o peso das notas é: 2, 3 e 5, respectivamente.
*/
System.out.println("Exercicio 10");
int nota1 = 2;
int nota2 = 3;
int nota3 = 5;

float notaf = (nota1+nota2+nota3)/3f; 

System.out.println("A média é "+notaf);
    }
    
}
