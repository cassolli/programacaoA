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

  int num = 0;
  int resp =0;
  // Criar loop para varios testes, no final será perguntado se que testar novamente
    while(num <= 1)
    {     
  
    //Perguntar quantas pessoas você que testar para gerar o array que o número de cadastros
    String str_quantidade = JOptionPane.showInputDialog("Informe quantas pessoas você que testar");
    int n = Integer.parseInt(str_quantidade); 
  
     //variavel para alterar todos array de uma vez =)
    n = n;
    //iniciar arrays
    String nome[];
    nome = new String[n];
      
    String[]endereco; 
    endereco = new String[n];
   
    String[]telefone; 
    telefone = new String[n];
  
    int[]idade; 
    idade = new int[n];
    //contador para incrementar menores de 18, para exibir no joptionpane  
    int cont=0;
   
        for (int i = 0; i < nome.length; i++) {
            nome[i] = JOptionPane.showInputDialog("Informe seu nome");
            endereco[i] = JOptionPane.showInputDialog("Informe seu endereço");
            telefone[i] = JOptionPane.showInputDialog("Informe seu telefone");
            String str_idade = JOptionPane.showInputDialog("Informe sua idade");
            idade[i] = Integer.parseInt(str_idade);
            //testar número de pessoas menores de 18
                if (idade[i] <18){
                    cont = cont + 1;
                }
        }
          
    JOptionPane.showMessageDialog(null,"Atualmente foi cadastrado "+cont+" menore(s) de 18 anos"); 
    resp = JOptionPane.showConfirmDialog(null, "Testar novamente?", "Pergunta", JOptionPane.YES_NO_OPTION);
        
            if (resp == JOptionPane.NO_OPTION) {
                num = 2; 
            }
        }
    }
}