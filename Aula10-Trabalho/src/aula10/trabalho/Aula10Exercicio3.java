/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10.trabalho;

import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author cassolli
 */
public class Aula10Exercicio3 {

    public static void main(String[] args) {

        //3. Altere o programa acima para que ele continue a ler nomes do teclado até que o usuário digite a palavra 
        //"fim", e então imprima os nomes digitados na ordem em que foram digitados. 
        //variaveis do loop e pergunta
        int num = 0;
        int resp = 0;
        int cont = 1;
        String agrupanome = ""; 
        //Fazer o loop
        while (num <= 1) {
            //Utilizado arraylist para criar um array dinamico com os dados
            ArrayList<String> nomes = new ArrayList();
            String nome = JOptionPane.showInputDialog("Informe o " + cont + " Nome");
            cont++;
            while (!nome.toLowerCase().equals("fim")) {
                nomes.add(nome);
                nome = JOptionPane.showInputDialog("Informe o " + cont + " Nome");
                cont++;
               
            }
            
            for (String n : nomes) {
                agrupanome += n+"\n";
            }
            JOptionPane.showMessageDialog(null, "Os nomes digitados foram\n"+agrupanome);
            //Pergunta para reiniciar while ou finalizar
            resp = JOptionPane.showConfirmDialog(null, "Testar novamente?", "Pergunta", JOptionPane.YES_NO_OPTION);

            if (resp == JOptionPane.NO_OPTION) {
                num = 2;
            }

        }
    }
}
