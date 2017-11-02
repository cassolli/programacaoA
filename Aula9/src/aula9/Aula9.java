/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula9;

/**
 *
 * @author 17213008
 */
public class Aula9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String a= "Faculdade";
     String b= "Dom Bosco";
     String c= a+" "+b;
     
    String s= a.substring(0,5); //Irá pegar as posições 0 1 2 3 4 5
    String s1= a.substring(0,2);
    String s2= a.substring(0,7  );
    System.out.println(s); //Retorno Facul ou seja irá pegar de f atél. 
    System.out.println(s1);
    System.out.println(s2); 
    
    //Comparar
    
    a= "Faculdade";
    b= "Faculdade";
        System.out.println(b.equals(a)); //true
        
    a= "Faculdade";
    b= "faculdade";
        System.out.println(b.equals(a)); //false
    
    //ignore case
    a= "Faculdade";
    b= "faculdade";
        System.out.println(b.equalsIgnoreCase(a));   //true 
    
    //contar caracteres
    
    a= "Faculdade";
    //int n = a.length;
     
    a= "Faculdade";
    char d = a.charAt(0);
    System.out.println(d);  // retorna f
    
    //replace
    a= "Faculdade";
    a = a.replace('F','f');  // replace F para f
    System.out.println(a);
    
    a= "faculdade";
    a = a.toUpperCase();
    System.out.println(a); // tudo maiusculo
    
    a= "FACULDADE";
    a = a.toLowerCase();
    System.out.println(a); // tudo minusculo
    
    a= "FACULDADE 1 ";
    a = a.trim();
    System.out.println(a.trim()); //tirar espaços
    
    String str = "Ana";
    int posicao = str.indexOf('a');// retorn a posição da primeira ocorrência do caracter caseSesitive
    System.out.println(posicao);
    
   }
    
}
