/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1;
import java.util.Scanner;
/**
 *
 * @author 17213008
 * Por Diego Cassolli dos Santos
 */
public class Trabalho1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /** 1) A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade de broas a cada dia. Cada
pãozinho custa R$ 0,12 e a broa custa R$ 1,50. Ao final do dia, o dono quer saber quanto arrecadou com a
venda dos pães e broas (juntos), e quanto deve guardar numa conta de poupança (10% do total arrecadado).
Você foi contratado para fazer os cálculos para o dono. Com base nestes fatos, faça um algoritmo para ler as
quantidades de pães e de broas, e depois calcular os dados solicitados.

*/
System.out.println("Exercicio 1");
//Valor venda pao
float vpao = 0.12f;
//valor venda broa
float vbroa = 1.50f;
// quantidade de venda de paes
int quantpao = 100;
// quantidade de venda de broas
int quantbroa = 50;
//Calculo para saber valor total da venda dos paes.
float vendeupao = quantpao*vpao;
//Calculo para saber valor total da venda das broas.
float vendeubroa = quantbroa*vbroa;
//calculo para saber o valor das duas vendas juntas (paes+broas)
float totalvenda = vendeupao+vendeubroa;
//calculo para saber quanto deve ser guardado no banco (10%)
float guardarvenda = totalvenda*0.10f;

//Mostrar valores
System.out.println("Você vendeu "+quantpao+" PÃES. Valor Total R$ "+vendeupao+" dos pães.");
System.out.println("Você vendeu "+quantbroa+" BROAS Valor Total R$ "+vendeubroa+" das broas.");

//Informação que o Hotpão que saber =)
System.out.println("Valor Total de venda (broas+paes) R$ "+totalvenda);
System.out.println("Você deve guardar R$ "+guardarvenda+"em sua poupança.");
/**
2)Faça um programa que receba um valor que foi depositado e exiba o valor com rendimento após um mês.
Considere fixo o juro da poupança em 0,70% a. m.
*/
System.out.println("Exercicio 2");
//valor do deposito
int valordep = 100;
//calcular lucro/juros
float lucro = valordep*0.0070f;
//Somar o lucro com o valor que foi depositado
float valorfinal = lucro+valordep;
//Mostrar o que foi pedido
System.out.println("O valor final do deposito + o lucro é "+valorfinal+".");

/**
3)Escreva um algoritmo para ler o nome e a idade de uma pessoa, e exibir quantos dias de vida ela possui.
Considere sempre anos completos, e que um ano possui 365 dias. Ex: uma pessoa com 19 anos possui 6935
dias de vida; veja um exemplo de saída: MARIA, VOCÊ JÁ VIVEU 6935 DIAS.
*/

System.out.println("Exercicio 3");
//Nome da pessoa
String nome = "Diego";
//idade da pessoa
int idade = 25;
//calculo para saber quantos dias de vida a pessoa tem
int idadef = idade*365;
//Mostrar resultado
System.out.println(nome+" você já viveu "+idadef+".");

/**
4)Entrar com o dia e o mês de uma data e informar quantos dias se passaram desde o início do ano. Esqueça a
questão dos anos bissextos e considere sempre que um mês possui 30 dias.
*/
System.out.println("Exercicio 4");

//DIA
int data = 30;
//Mes
int mes = 8;
//calculo para saber quantos se passaram até a data. 
int dia = (mes*30)+data;
//Mostrar resultado
System.out.println("Já se passaram " +dia+ " dias.");

/**
5)Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendo vendida
respectivamente por 10, 12 e 15 reais. Construa um algoritmo em que o usuário forneça a quantidade de
camisetas pequenas, médias e grandes referentes a uma venda, e a máquina informe quanto será o valor
arrecadado.
*/
System.out.println("Exercicio 5");
//valor camisas P
int camP = 10;
//valor camisas M
int camM = 12;
//valor camisas G
int camG = 15;
//Quantidade camisas P
int quantcamP = 13;
//Quantidade camisas M
int quantcamM = 20;
//Quantidade camisas G
int quantcamG = 16;
//calculo do valor final de camisas P
int totalP = quantcamP*camP;
//calculo do valor final de camisas M
int totalM = quantcamM*camM;
//calculo do valor final de camisas G
int totalG = quantcamG*camG;

//Mostrar resultados
System.out.println("O lucro da venda das camisas P será de "+totalP+".");
System.out.println("O lucro da venda das camisas M será de "+totalM+".");
System.out.println("O lucro da venda das camisas G será de "+totalG+".");


    }
    
}
