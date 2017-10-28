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

        int x = 1;
        while (x >= 1) 
        {
            
            int[] vetor;
            vetor = new int[2];
            for (int i = 0; i < vetor.length; i++) {
                String str_vetor = JOptionPane.showInputDialog("Informe um número");
                vetor[i] = Integer.parseInt(str_vetor);
               
            }
            
            
            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] == 0) {
                    x = 0;
                }else{
                if (vetor[i] > 0) {
                    JOptionPane.showMessageDialog(null, "Positivo: " + vetor[i]);
                    //System.out.println("Positivo");
                } else {
                    JOptionPane.showMessageDialog(null, "Negativo: " + vetor[i]);
                    //    System.out.println("Negativo");
                }
            
}
            
        }}
        }
    }

