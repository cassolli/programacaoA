/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1_23_08;
import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
 //exercicio 6
/**
 *
 * @author 17213008
 */
public class Exercicio1_23_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        /*1)Faça um programa que leia três variáveis do tipo int e que calcula e mostra o produto dos três inteiros e a
            divisão do primeiro pelo segundo.
        */
        System.out.println("Exercicio 1");

        int var1 = 50;
        int var2 = 10;
        int var3 = 15;
        int mult = var1*var2*var3;
        int div = var1/var2;
        
        System.out.println(mult);
        System.out.println(div);

         // 2)Faça um programa que leia dois valores e calcula o resto da divisão do segundo pelo primeiro.
        System.out.println("Exercicio 2");

        int var4 = 5;
        int var5 = 51;
        int resto = var5%var4;
        
                System.out.println("O Resto é "+resto+".");
     /* 3)Elaborar um programa que leia dois valores inteiros e troque o valor, a e b de forma que a fique com o valor de
b, b com o valor de a.
*/
        System.out.println("Exercicio 3");

        int a = 10;
        int b = 20;
        int c = 0;
        c = a;
        a = b;
        b = c;
        
        System.out.println("O valor de a="+a);
        System.out.println("O valor de b="+b);

    // 4)Leia três notas de um aluno e calcule sua média aritmética.
        System.out.println("Exercicio 4");

    
    int n1 = 5;
    int n2 = 7;
    float n3 = 7.5f;
    float media = (n1+n2+n3)/3;
    System.out.println("Média: "+media);

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

        
/*6)Crie um programa que peça o nome e a altura de uma pessoa em centímetros e apresente na tela o nome e a
altura em metros.
*/        
    System.out.println("Exercicio 6");

 
Scanner scanner = new Scanner(System.in);

/*System.out.print("Qual seu nome?\t");
String nome = scanner.nextLine();

System.out.print("Qual sua altura?\t");
float altura = scanner.nextFloat();

System.out.println("\nSeu nome é\t" + nome);
System.out.println("Sua altura é\t" + altura);

/*
7)Crie um programa que leia 5 números inteiros e apresente a soma de todos os números lidos.
*/
   System.out.println("Exercicio 7");
int num1 = 1;
int num2 = 2;
int num3 = 3;
int num4 = 4;
int num5 = 5;

int sum = num1+num2+num3+num4+num5;
   System.out.println("A soma é "+sum);
/*
8. Faça um programa que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa
apenas em dias.
*/
System.out.println("Exercicio 8");


Scanner scandias = new Scanner(System.in);
System.out.println("Quando você nasceu?(aaaa/mm/d)");
//String qnasc = scandias.nextLine();
String qnasc = "1991/11/29";
String[] tokens = qnasc.split("/");
int ano = Integer.parseInt(tokens[0]);
int mes = Integer.parseInt(tokens[1]);
int dia = Integer.parseInt(tokens[2]);

int mestodia = 0;
int somames = (mes-1);
int bisexto = ano/6;
int anotodia = (ano-1)*365;


if(somames == 0){
   mestodia = 365;
}if(somames == 01){
    mestodia = 31;   
}if(somames == 02){
    mestodia = 59;
}if(somames == 03){
    mestodia = 90;
}if(somames == 04){
    mestodia = 120;
}if(somames == 05){
    mestodia = 151;
}if(somames == 06){
    mestodia = 181;
}if(somames == 07){
    mestodia = 212;
}if(somames == 8){
    mestodia = 243;
}if(somames == 9){
    mestodia = 273;
}if(somames == 10){
    mestodia = 304;
}if(somames == 11){
    mestodia = 334;
}if(somames == 12){
    mestodia = 365;
}


System.out.println("Qual a data de hoje?(aaaa/mm/dd)");
//String hoje = scandias.nextLine();
String hoje = "2017/8/26";
String[] tokenshoje = hoje.split("/");
int ano2 = Integer.parseInt(tokenshoje[0]);
int mes2 = Integer.parseInt(tokenshoje[1]);
int dia2 = Integer.parseInt(tokenshoje[2]);

int ano2todia = (ano2-1)*365;
int mes2todia = 0;
int somames2 = (mes2-1);
int bisexto2 = ano2/6;
int diafinal;
int mesfinal = 0;


if(somames2 == 0){
   mes2todia = 365;
}if(somames2 == 1){
    mes2todia = 31;   
}if(somames2 == 2){
    mes2todia = 59;
}if(somames2 == 3){
    mes2todia = 90;
}if(somames2 == 4){
    mes2todia = 120;
}if(somames2 == 5){
    mes2todia = 151;
}if(somames2 == 6){
    mes2todia = 181;
}if(somames2 == 7){
    mes2todia = 212;
}if(somames2 == 8){
    mes2todia = 243;
}if(somames2 == 9){
    mes2todia = 273;
}if(somames2 == 10){
    mes2todia = 304;
}if(somames2 == 11){
    mes2todia = 334;
}if(somames2 == 12){
    mes2todia = 365;
}
if (mes2todia > mestodia)
        {
            mesfinal = mes2todia-mestodia;
    }else{
        mesfinal = mestodia-mes2todia;
    }

        if(dia2>dia){
            diafinal = dia2-dia;
        }else{
            diafinal = dia-dia2;
        }
            
int finalbisexto = bisexto2-bisexto;
int idadedias = (ano2todia-anotodia)+mesfinal+diafinal+finalbisexto;

System.out.println("variavel ano2todia= "+ano2todia+" variavel anotodia= "+anotodia+"variavel mes2todia= "+mes2todia+" variavel mestodia= "+mestodia+" variavel dia20= "+dia2+"variavel dia = "+dia+ "variavel bisexto2"+bisexto2+" variavel bisexto="+bisexto);
System.out.println("Você nasceu em "+ qnasc);
System.out.println("Hoje é "+hoje);
System.out.println("Sua idade em dia é "+idadedias);





/*
9)Faça um programa que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e
dias.
*/


Scanner scanemdias = new Scanner(System.in);
System.out.println("Qual sua idade em dias?(aaaa/mm/dd)");
//String idadeemdias = scanemdias.nextLine();
String idadeemdias = "9590";
Date date = new SimpleDateFormat("D yyyy").parse(idadeemdias + " " + Calendar.getInstance().get(Calendar.YEAR));

/*
10)Faça um programa que leia as 3 notas de um aluno e calcule a média final deste aluno. Considerar que a
média é ponderada e que o peso das notas é: 2, 3 e 5, respectivamente.
11)Faça um programa que leia o tempo de duração de um evento em uma fábrica expressa em segundos e
mostre-o expresso em horas, minutos e segundos.
12)O custo ao consumidor de um carro novo é a soma do custo de fábrica com a porcentagem do distribuidor e
dos impostos (aplicados ao custo de fábrica). Supondo que a porcentagem do distribuidor seja de 28% e os
impostos de 45%, escrever um programa que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.
*/       
        




    }
    
}
