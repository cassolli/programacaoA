/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;

/**
 *
 * @author 17213008
 */
public class Aula4 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int a = 1 ;
    int b = 1;
        
        if (a==b){
            System.out.println("Usuario Logado");
        }else{
            System.out.println("Usuario sem Permissão");
    }   
    
    
    if (1==0) {
    System.out.println("Entrou no if");
}
else if (1==0){
    System.out.println("Entrou no elseif");
}
else{
    System.out.println("Entrou no else");
}



//Exercicio1;

short ano_atual = 2017;
short ano_nascimento = 1945;
int idade = ano_atual - ano_nascimento ;

System.out.println("Idade = "+idade);
if (idade <= 10){
    System.out.println("Você é uma criança");
}else {
  System.out.println("Você é um adulto");
}

//Exercicio2
float valormaca = 0;
int quantidade = 10;
if (quantidade <= 12){
    valormaca = 1.30f;
}else {
    valormaca = 1.00f;
}
    
     float valorfinal = quantidade*valormaca;
     System.out.println("Total = R$ " + valorfinal);
    
//Exercicio3 

char n1 = 6;
char n2 = 7;
float n3 = 8.9f;

float notafinal = (n1 + n2 + n3) /3;

System.out.println("Média = "+notafinal);

if(notafinal >= 7){
    System.out.println("Passou o/!!! Sua nota foi "+notafinal);
}else {
System.out.println("Deu ruim :/ Sua nota foi "+notafinal);
    }

}
}
     

