/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8.trabalho;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author 17213008
 */
public class trabalho5 {
      public static void main(String[] args) {
    /**      5. Escrever um main Java que lê 20 números reais e armazena esses valores em um array. O programa deve 
calcular a média aritmética dos valores do vetor e imprimir todos os valores menores do que a média 
calculada.
*/
int num = 0;
int resp =0;
  // Criar loop para varios testes, no final será perguntado se que testar novamente
    while(num <= 1)
    {   
        /*Para revisão aconselho a alterar o numero para 5, pois terá um jopntionPane que irá perguntar os numeros
        criada variavel n para ajustar arrays e calculo de media de uma vez só, pois se alterar o numero de posições
        o calculo muda*/ 
        
        int n = 5;   
        String menores = "";
        //float pois pode haver média com quebrada exemplo 35.5
        float[]numeros; 
        numeros = new float[n];
 
        float[]calculo; 
        calculo = new float[n];
        float soma = 0;
            for (int i = 0; i < numeros.length; i++) {
                int cont = i+1;
                String str_numeros = JOptionPane.showInputDialog("Digite "+cont+" numero dos "+n+" que lhe direi todos menores que a média");
                numeros[i] = Integer.parseInt(str_numeros);
                //fazer soma
                soma = soma + numeros[i];
            }
        //descobrir media 
        float media = soma / n;
        
        /*Para debugar descomentar*/
        //System.out.println("soma "+soma+ "media "+media);
    
            for (int i = 0; i < numeros.length; i++) {
                if(numeros[i] < media){
        /*Para debugar descomentar*/
        //System.out.println("Numeros menores que a media "+numeros[i]);
                //Deixar resposta mais amigavel removendo o 0 dos numeros menores que a media
                DecimalFormat df = new DecimalFormat("0");
                String str_numeros1 = df.format(numeros[i]);
                String str_menores = str_numeros1;
                //concatenar
                menores += str_menores+"\n";
        
        
                }
            }
 
        
        JOptionPane.showMessageDialog(null, "A média é "+media+" e os menores são \n"+menores);
        resp = JOptionPane.showConfirmDialog(null, "Testar novamente?", "Pergunta", JOptionPane.YES_NO_OPTION);
            // de novo?
            if (resp == JOptionPane.NO_OPTION) {
                num = 2; 
            }
        }
    }    
}


