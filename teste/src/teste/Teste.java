/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

/**
 *
 * @author cassolli
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/**
5) Fulano aplicou R$ 100,00 com rendimento de 5% ao mês. Quantos meses serão necessários para o capital investido 
ultrapasse a R$ 200,00. Desenvolva um programa que realize essa operação. O Caso o mês for igual a janeiro então 
o programa deve adicionar mais R$10,00 de juros.O sistema deve mostra a média
*/
float aplic = 100.00f;
float rend = 0.05f;
int ini = 0;
int mes = 8;
while(ini <= 2){
   System.out.println("aplic1 " +aplic);
   aplic = (aplic*rend)+100f;
   System.out.println("aplic2 "+aplic+" rend2"+rend);
   System.out.println("aplic "+aplic+" rend"+rend);
  
ini++;
}

}
    
}
