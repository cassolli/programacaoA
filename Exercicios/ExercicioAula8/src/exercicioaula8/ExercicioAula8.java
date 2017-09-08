/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioaula8;

import java.util.Scanner;

/**
 *
 * @author cassolli
 */
public class ExercicioAula8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*
8. Faça um programa que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa
apenas em dias.
*/
System.out.println("Exercicio 8");


/** Descomentar para usar scanner
Scanner scandias = new Scanner(System.in);
System.out.println("Quando você nasceu?(aaaa/mm/dd)");
String qnasc = scandias.nextLine();
*/ 
String qnasc = "1991/11/29"; //Comentar para usar scanner
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

/** Descomentar para usar scanner
System.out.println("Qual a data de hoje?(aaaa/mm/dd)");

String hoje = scandias.nextLine();
*/
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
/**Debug variaveis
System.out.println("variavel ano2todia= "+ano2todia+" variavel anotodia= "+anotodia+"variavel mes2todia= "+mes2todia+" variavel mestodia= "+mestodia+" variavel dia20= "+dia2+"variavel dia = "+dia+ "variavel bisexto2"+bisexto2+" variavel bisexto="+bisexto);
*/
System.out.println("Você nasceu em "+ qnasc);
System.out.println("Hoje é "+hoje);
System.out.println("Sua idade em dia é "+idadedias);





    }
    
}
