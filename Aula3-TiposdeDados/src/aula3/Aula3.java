/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

/**
 *
 * @author 17213008
 */
public class Aula3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Conversão de tipos de dados
       boolean bo;
       char c;
       byte b;
       short s;
       int i;
       long l;
       float f;
       double d;
       
       c = 65;
       System.out.println("========");
       System.out.println("char");
       //Note a diferença entre a impressão das duas linhas abaixo:*/
       System.out.println("=======================");
       System.out.println("valor de c como char = " + c);
       System.out.printf("valor de c como numero = %d \n",(int)c);
              
       b = 10;
       s = b;
       i = s;
       System.out.println("=======================");
       System.out.println("inteiros");
       System.out.println("=======================");
       System.out.println("i = s = b = "+i);
       i *=100; // i = i * 100;
       System.out.println("novo valor de i= "+i);
       
       b =(byte)i;
       System.out.println("=======================");
       System.out.println("novo valor de b = "+b);
       /*Porque o valor é -24?
       Saída da impressão:
       novo valor de b = -24
       */
           
       d = 125.32d;
       f = (float)125.32d;
       System.out.println("valor de f = " +d);
       f = 125.32f;
       System.out.println("valor de f = " +d);
       f =(float)125.32d;
       System.out.println("valor de f = " +d);
       System.out.println("=======================");
    }
    
}
