/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10.trabalho;
import javax.swing.JOptionPane;
	
/**
 *
 * @author cassolli
 */
public class Aula10Exercicio1b {
     public static void main(String[] args) {
     
     //1. Faça um programa que enumere os parâmetros recebidos via linha de comando.     
     
     
     int num = 0;
     int resp =0;
     //Fazer o loop
     
     while(num <= 1)
     { 
     int cont=0;    
     //Ver quantos itens gostaria de inserir para criar o array dinamicamente
    String str_comando = JOptionPane.showInputDialog("Qual a linha de comando?use espaços  ex: Comando param1 param2 param3");
    String tem = Integer.toString(str_ehimpar);
         if (tem.contains("01")){
            ehimpar += str_ehimpar+"\n"; 

            }else{                 
            ehimpar += str_ehimpar+" "; 

     //iniciar array
     String dados[];
     dados = new String[n];
     
      for (int i = 0; i < dados.length; i++) {
          int dados_cont = cont +1;
              
          dados[i] = JOptionPane.showInputDialog("Informe o "+dados_cont+" Item");
              
              }

     
     
     //Pergunta para reiniciar whilwe ou finalizar
     resp = JOptionPane.showConfirmDialog(null, "Testar novamente?", "Pergunta", JOptionPane.YES_NO_OPTION);
        
        if (resp == JOptionPane.NO_OPTION) {
                num = 2; 
        }
     
     }
     
     }
}
