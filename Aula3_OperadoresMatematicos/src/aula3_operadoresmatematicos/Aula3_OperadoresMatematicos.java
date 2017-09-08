/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3_operadoresmatematicos;

/**
 *
 * @author 17213008
 */
public class Aula3_OperadoresMatematicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a = 40, b =20 , soma = 0, mult = 0, div =0, resto = 0, sub =0 ;
       soma = a + b;
       mult = a * b;
       div = a / b;
       resto = a % b;
       sub = a-b;
       System.out.println("Resultados: soma = " +soma+" mult = "+mult+" div = "+div+" resto = "+resto+" sub = "+sub);
       
       if(resto == 0 ){
         System.out.println("É par !!!");
         resto = 0;
       }else{
         System.out.println("É impar !!!");
         resto = 1;
       }
       int var1 = 1;
       int var2 = 2;
       if (var1 == var2) {
        System.out.println("Oi =D ");
        }else{
        System.out.println("tchau");
       }
       
       
       //tarefa 1
float x = 34.5f;   // int somente recebe número inteiros, alterado para float
double resp = x;  // boolean somente pode receber true ou false ajustado para double, pois contempla float.
boolean rep = true;
int g = 17;
int y = g;
y = y + 10;
double t = 45;
float p = 32.7f; // faltou o f no final
char respa = '1'; // valor incorreto para char, ajustado para double e a
String n = "ana"; // estava com aspas simples
      

//tarefa 2

/*2)Quais as sequências de caracteres são válidas na declaração de variáveis? E comentar o porque.

• a123 
• sal * 
• 1interface 
• _nome 
• $$a 
• valores reais
*/


int a123 = '1'; 
//int sal * = '1';  // Não pode pois tem espaço e caractere de multiplicação *
//int 1interface = '1'; // Não pode pois inicia com númeral
int _nome = '1';
int $$a = '1';
//int valores reais = '1'; //Não pode pois tem espaço no nome da variavel
   }
}