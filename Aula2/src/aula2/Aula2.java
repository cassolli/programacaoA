/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

/**
 *
 * @author 17213008
 */

    // Duas barras significa comentário
    /* comentários também podem seguir o formato C+++ */
public class Aula2 {
    
    //O método main sempre deve estar presente para que um código
    //Java possa ser executado
    /**
     * @param args the command line arguments
     */
       
        
    public static void main(String[] args) {
        // TODO code application logic here
        //aqui virão os comandos, que parecidos com C++são 
    int semestre = 2;
    String mensagem = "Alo Mundo.";
    System.out.println(mensagem+semestre);
    
        //Exemplo de variável que suporta valores booleanos
    boolean anoBissexto = false;
    boolean anoPar = true;
        //Apesar de uma variavel poder ser declarada
        //sem receber valor,ela só poderá ser usada
        //após a atribuição de algum valor a ela.
        
      if (anoBissexto) {
    System.out.println("True");
    } else {
    System.out.println("False");
    }
    
     if (anoPar) {
    System.out.println("True");
    } else {
    System.out.println("False");
    }
    
      switch (semestre){
        case 1:
            System.out.print("Estou no semestre "+semestre);
            break;
        case 2:    
              System.out.print("Estou no semestre "+semestre);
        case 3:
            System.out.print("Vou para o semestre "+semestre);
            break;
     }    
  
              
    boolean valido;
    
    //Exemplo de representação de caracteres UNICODE
    char primeiraLetra = 'a';
    char tabulacao = '\t';
    //Código UNICODE para o caractere de interrogação
    char unicode = 'u';
    //lembre-se: Uma variavel só poderá.
    //ser manipulada após receber um valor.
    char inutil; // variavel sem utilidade neste momento
    inutil ='@'; // variavel util a partir de agora
    String planeta = "Urano";
    
    //Valores inteiros representaveis pelos tipos
    //numéricos em JAVA
    
    byte a = 127;                            // -2n7 .... 2n7 -1
    short b = 32767;                         // -2n15 ... 2n15 -1
    int c = 2147483647;                      // -231 .... 2n31 -1
    long d = 638963493642333L;      //-2n63 ... 2n63 -1       
    //Representação de valores numéricos de ponto flutuantes
   // float pi = 2,141516;                   // 32 bits
    float taxa = 6.02E23F;                  // 32 bits
    double valor = 123.4E+306D;              //64 bits
        
}
    
}   
