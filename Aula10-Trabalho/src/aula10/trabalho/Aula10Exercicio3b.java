/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10.trabalho;

import javax.swing.JOptionPane;

/**
 *
 * @author 17213008
 */
//3. Altere o programa acima para que ele continue a ler nomes do teclado até que o usuário digite a palavra 
//"fim", e então imprima os nomes digitados na ordem em que foram digitados. 

//variaveis do loop e pergunta
public class Aula10Exercicio3b {

    public static void main(String[] args) {

        //variaveis do loop e pergunta
        int num = 0;
        int resp = 0;

        //Fazer o loop
  
            //Contador para usar nas mensagens 
            int cont = 1;
            //variaveis para concatenar os nomes na ordem normal e inversa para exibir no final do programa
            String semon = "";
            String nomesordem = "";
            //Ver quantos itens gostaria de inserir para criar o array dinamicamente

            //iniciar array
            String nomes[];
            nomes = new String[5];

            for (int i = 0; i < nomes.length; i++) {
                nomes[i] = JOptionPane.showInputDialog("Informe o " + cont + " Nome");
                //Concatenar para mostrar no final os nomes na ordem digitada
                nomesordem += cont + ". " + nomes[i] + "\n";
                if (nomes[i].toLowerCase().equals("fim")) {
                 JOptionPane.showMessageDialog(null, "Os nomes digitados foram\n"+nomesordem+"\n");
                 //para não quebrar o array
                 i=6;
                }
                cont++;
             
            

        }
    }
}
