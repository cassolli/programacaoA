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
public class trabalho2 {
     public static void main(String[] args) {
    //2. Ler vários números e mostrar a quantidade de pares.
int num = 0;
int resp =0;
    // Criar loop para varios testes, no final será perguntado se que testar novamente
    while(num <= 1)
    {  
        //Perguntar quantas pessoas você que testar para gerar o array que o número de cadastros
        String str_quantidade = JOptionPane.showInputDialog("Informe quantas pessoas você que testar");
        int n = Integer.parseInt(str_quantidade); 
  
        //Gerar array de acordo com o numero de testes =)
        n = n;
    
        int par =0;
        int[]numeros; 
            numeros = new int[n];
                for (int i = 0; i < numeros.length; i++) {
                String str_numero = JOptionPane.showInputDialog("Informe "+i+"º numero.");
                numeros[i] = Integer.parseInt(str_numero);
                    if((numeros[i]  % 2) == 0) {
                        par = par+1;
                        //debug
                        //System.out.println("Par "+numeros[i]+ "contador de pares"+par);
                     } 
                }
    JOptionPane.showMessageDialog(null,"O número de pares digitados foram "+par+"."); 
    resp = JOptionPane.showConfirmDialog(null, "Testar novamente?", "Pergunta", JOptionPane.YES_NO_OPTION);
        
                if (resp == JOptionPane.NO_OPTION) {
                    num = 2; 
                }
        }
    
    
    
    }

}