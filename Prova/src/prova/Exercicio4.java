/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

import javax.swing.JOptionPane;

/**
 *
 * @author 17213008
 */
public class Exercicio4 {
        public static void main(String[] args) {
 /**   4)Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendo vendida
respectivamente por 10, 12 e 15 reais. Construa um algoritmo em que o usuário forneça a quantidade de
camisetas pequenas, médias e grandes referentes a uma venda, e a máquina informe quanto será o valor
arrecadado.
*/
//Valores camiseta
int camP = 10;
int camM = 12;
int camG = 15;
//inicializar variaveis
int quantcamP = 0;
int quantcamM = 0;
int quantcamG = 0;
int continuar = 0;
int contador = 0;

do {                 
//Perguntas para saber o que foi vendido.
String str_quantcamP = JOptionPane.showInputDialog("Quantas camisas P foram vendidas?");
quantcamP = Integer.parseInt(str_quantcamP);
String str_quantcamM = JOptionPane.showInputDialog("Quantas camisas M foram vendidas?");
quantcamM = Integer.parseInt(str_quantcamM);
String str_quantcamG = JOptionPane.showInputDialog("Quantas camisas G foram vendidas?");
quantcamG = Integer.parseInt(str_quantcamG);

//calculos para saber o total de venda
int totalP = quantcamP*camP;
int totalM = quantcamM*camM;
int totalG = quantcamG*camG;
int total = totalP+totalM+totalG;
//Mostrar resultados
//Mostrar valores
JOptionPane.showMessageDialog(null,"O lucro pela venda será:\ncamisas P R$ "+totalP+".\ncamisas M R$ "+totalM+".\ncamisas G R$ "+totalG+".\nSomando um total de R$ "+total+"."); 
contador = 0; 
//Pergunta se gostaria de reexecutar script
continuar = JOptionPane.showConfirmDialog(null, "Deseja recalcular a venda de camisetas?" , "\"Pergunta\"" , JOptionPane.YES_NO_OPTION); 
       if(continuar == JOptionPane.NO_OPTION) { 
             contador = 1;
      }

} while(contador<1);
        }


}
