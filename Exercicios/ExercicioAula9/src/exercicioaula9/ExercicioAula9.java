/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioaula9;

/**
 *
 * @author cassolli
 */
public class ExercicioAula9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/**9)Faça um programa que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e
dias.
*/
System.out.println("Exercicio 9");

/**Para usar scanner
Scanner scanemdias = new Scanner(System.in);
//System.out.println("Qual sua idade em dias?(aaaa/mm/dd)");
String idadeemdias = scanemdias.nextLine();
*/
int idadeemdias = 9590;
float qano = idadeemdias / 365f;
float qmes = idadeemdias / 30f;
System.out.println("ANOS "+qano);  
System.out.println("Meses "+qmes);  


    }
    
}
