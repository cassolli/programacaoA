/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author 17213008
 */
public class Exercicio3 {
    public static void main(String[] args) {
/**    3) A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade de broas a cada dia. Cada
pãozinho custa R$ 0,25 e a broa custa R$ 5,50. Ao final do dia, o dono quer saber quanto arrecadou com a
venda dos pães e broas (juntos), e quanto deve guardar numa conta de poupança (10% do total arrecadado).
Você foi contratado para fazer os cálculos para o dono. Com base nestes fatos, faça um algoritmo para ler as
quantidades de pães e de broas, e depois calcular os dados solicitados.
*/


float vpao = 0.25f;
float vbroa = 5.50f;
int quantpao = 0;
int quantbroa = 0;
int contador = 0;
int continuar = 0;
JOptionPane.showMessageDialog(null,"Olá vamos ver seu lucro?"); 
while(contador == 0){
//Perguntas sobre as vendas
String str_quantpao = JOptionPane.showInputDialog("Quantos pães foram vendidos?");
quantpao = Integer.parseInt(str_quantpao);

String str_quantbroa = JOptionPane.showInputDialog("Quantos broas foram vendidas?");
quantbroa = Integer.parseInt(str_quantbroa);

//calculos de venda
float vendeupao = quantpao*vpao;
float vendeubroa = quantbroa*vbroa;
float totalvenda = vendeupao+vendeubroa;
float guardarvenda = totalvenda*0.10f;
//Converter valor para duas casas decimais, caso seja superior, para ficar mais bonito para o usuário
DecimalFormat df = new DecimalFormat("0.00");
String DFtotalvenda = df.format(totalvenda);
String DFguardarvenda = df.format(guardarvenda);


       
//Mostrar valores
JOptionPane.showMessageDialog(null,"Você vendeu um total de R$ "+DFtotalvenda+". E deve guardar R$ "+DFguardarvenda+" em sua poupança."); 
   
    continuar = JOptionPane.showConfirmDialog(null, "Deseja recalcular sua venda" , "\"Pergunta\"" , JOptionPane.YES_NO_OPTION); 
        if(continuar == JOptionPane.NO_OPTION) { 
             contador = 1;
        }
        }
    }
}
