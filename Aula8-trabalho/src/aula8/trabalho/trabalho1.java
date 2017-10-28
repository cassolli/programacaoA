/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8.trabalho;
import javax.swing.JOptionPane;
/**
 *
 * @author 17213008
 */
public class trabalho1 {
     public static void main(String[] args) {
  //   1. Implemente um aplicativo que cadastre uma pessoa com os seguintes atributos: nome , endereço , telefone e idade, caso idade menor de 18 anos o 
  // aplicativo deve contar quantos usuários menores de 18 anos.

  //variavel para alterar todos array de uma vez =)
  int n = 2;
  String nome[];
  nome = new String[n];
      
  String[]endereco; 
  endereco = new String[n];
   
  String[]telefone; 
  telefone = new String[n];
  
  int[]idade; 
  idade = new int[n];
    
     int cont=0;
   
     for (int i = 0; i < nome.length; i++) {
     nome[i] = JOptionPane.showInputDialog("Informe seu nome");
     endereco[i] = JOptionPane.showInputDialog("Informe seu endereço");
     telefone[i] = JOptionPane.showInputDialog("Informe seu telefone");
     String str_idade = JOptionPane.showInputDialog("Informe sua idade");
     idade[i] = Integer.parseInt(str_idade); 
      if (idade[i] <18){
         cont = cont + 1;
        }
     }
          
    JOptionPane.showMessageDialog(null,"Atualmente foi cadastrado "+cont+" menore(s) de 18 anos"); 
 
    
     }
}
  
