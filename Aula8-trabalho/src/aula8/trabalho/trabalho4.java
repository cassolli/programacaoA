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
public class trabalho4 {

    public static void main(String[] args) {
        /**
         * 4. Escreva um programa para repetir a leitura de um número enquanto o
         * valor fornecido for diferente de 0. Para cada número fornecido,
         * imprimir se ele é NEGATIVO ou POSITIVO. Quando o número 0 for
         * fornecido a repetição de ser encerrada sem imprimir mensagem alguma.
         */
        //contador para mensagem amigavel
        int cont=0;
        int x = 1;
        while (x >= 1) 
        {
          String str_quantidade = JOptionPane.showInputDialog("Quantos você que testar?");
          int n = Integer.parseInt(str_quantidade); 
  
          //variavel para alterar todos array de uma vez =)
           n = n;
            int[] vetor;
            vetor = new int[n];
            for (int i = 0; i < vetor.length; i++) {
                //adicionar valor ao contador
                cont = cont + 1;
                //solicitar numeros
                String str_vetor = JOptionPane.showInputDialog("Informe o "+cont+" º número");
                vetor[i] = Integer.parseInt(str_vetor);
               
            }
            //resetar pois irei usar para deixar amigavel a messagem final
            cont =0;
            for (int i = 0; i < vetor.length; i++) {
                
                cont = cont + 1;
                //se for 0 PARA!!!!
                if (vetor[i] == 0) {
                    x = 0;
                }else{
                if (vetor[i] > 0) {
                    JOptionPane.showMessageDialog(null,"O "+cont+"º é Positivo: " + vetor[i]);
                    //System.out.println("Positivo");
                } else {
                    JOptionPane.showMessageDialog(null,"O "+cont+"º é Negativo: " + vetor[i]);
                    //    System.out.println("Negativo");
                }
            
                }
            
            }
        }
    }
}

