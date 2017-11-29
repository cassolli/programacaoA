/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10.trabalho;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author cassolli
 */
public class Aula10Exercicio1 {

    public static void main(String[] args) {

        //1. Faça um programa que enumere os parâmetros recebidos via linha de comando.     
        int num = 0;
        int resp = 0;
        //Fazer o loop
        String enumere = "";
        String str_enumere = "";
        while (num <= 1) {
            int cont = 0;
            //entrada de dados
            String str_comando = JOptionPane.showInputDialog("Qual a linha de comando?use espaços  ex: Comando param1 param2 param3");
            //gerar array para depois contar
            String[] comando = str_comando.split(" ");
            //percorrer o array
            for (String n : comando) {
                if (cont == 0) {
                    str_enumere = "Comando Digitado: " + n + "\n\nParametros Digitados:";
                    //System.out.println(enumere);
                    enumere += str_enumere + "\n";
                    cont++;
                } else {
                    str_enumere = cont + "." + n + "\n";
                    enumere += str_enumere;
                    cont++;
                }
            }
            JOptionPane.showMessageDialog(null, enumere);

            //Pergunta para reiniciar whilwe ou finalizar
            resp = JOptionPane.showConfirmDialog(null, "Testar novamente?", "Pergunta", JOptionPane.YES_NO_OPTION);

            if (resp == JOptionPane.NO_OPTION) {
                num = 2;
            }

        }

    }
}
