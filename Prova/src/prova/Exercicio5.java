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
public class Exercicio5 {
     public static void main(String[] args) {
/**
 * 5) Pedro aplicou R$ 102,99 com rendimento de 15% ao mês. Quantos meses serão necessários para o capital investido ultrapasse a 
Re 200,00. Desenvolva um programa que realize essa operação. O Caso o mês for igual a janeiro então o programa deve adicionar 
mais R$10,00 de juros. O sistema deve mostra a média
*/
//float aplic = 102.99f;

float rend = 0.15f;
float rendimento = 0.00f;
float base = 0.00f;
int count = 0;
int ano = 2017;
float juros = 0.0f;
int mesatual = 9;
String mensagem = "";
int countdo = 0; 
int continuar = 0;
do {
JOptionPane.showMessageDialog(null,"Vamos calcular quanto tempo você terá de deixar investido seu dinheiro para chegar ao valor desejado?");
String str_aplic = JOptionPane.showInputDialog("Quanto você investiu?");
float aplic = Float.parseFloat(str_aplic);
//necessário para saber só o juros e calcular o juros médio
float ini_aplic = aplic;
String str_valorfinal = JOptionPane.showInputDialog("Até quanto você gosdtaria que seu dinheiro rendesse?");
float valorfinal = Float.parseFloat(str_valorfinal);
//debug
//System.out.println("aplic "+aplic);
    while (aplic <= valorfinal) {
            count++;
            mesatual += 1;
            if (mesatual > 12) {
                mesatual = 1;
                ano += 1;
            }

            if (mesatual == 1) {
                aplic = aplic + 10.00f;

            }

            base = aplic;
            rendimento = aplic * rend;
            aplic = rendimento + aplic;
            juros = (aplic - ini_aplic) / count;
            mensagem = mensagem + "Total atual: "+aplic+", média de juros: " + 
                    juros + ", base: de cálculo: " + base +
                    ", quantidade de acréscimos: " + count + ", data: " + 
                    mesatual + "/" + ano+"\n";
                     
              /**Debug
                System.out.println("Total atual: R$ " + Sstr_aplic + 
                ", média de juros: R$ " +  Sstr_juros +
                ", base: de cálculo: R$ " +  Sstr_base + 
                ", quantidade de acréscimos: " + count + 
                ", data: " + mesatual + "/" + ano);
         */       
             
        }
       // ini--;
        JOptionPane.showMessageDialog(null,"Seu rendimento mensal será:\n"+mensagem);
        //Para ficar bonito para o usuário
        DecimalFormat df = new DecimalFormat("0.00");
        String Sstr_aplic = df.format(aplic);
        String Sstr_juros = df.format(juros);
        String Sstr_base = df.format(base);
        
        JOptionPane.showMessageDialog(null,"Será necessário "+count+" meses. O qual você terá um total investido de R$ "+Sstr_aplic+" com juros médio de R$ "+Sstr_juros );
        /**Debug
        System.out.println("RESULTADO FINAL:");
        System.out.println("Total atual: R$ " + Sstr_aplic + 
                ", média de juros: R$ " +  Sstr_juros +
                ", base: de cálculo: R$ " +  Sstr_base + 
                ", quantidade de acréscimos: " + count + 
                ", data: " + mesatual + "/" + ano);
         */       
        //Pergunta se gostaria de reexecutar script
        continuar = JOptionPane.showConfirmDialog(null, "Deseja fazer uma nova simulação?" , "\"Pergunta\"" , JOptionPane.YES_NO_OPTION); 
       if(continuar == JOptionPane.NO_OPTION) { 
             countdo = 1;
      }

} while(countdo <1);                     
    }
}
