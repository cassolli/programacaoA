/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula0609;
import javax.swing.JOptionPane;
import java.text.ParseException;

/**
 *
 * @author 17213008
 */
public class Aula0609 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /**   int x = 0;
        while(x<=10)
        {     
        System.out.println(+x);
        //JOptionPane.showMessageDialog(null,""+x);
        
        x = x +1;
        }
         JOptionPane.showMessageDialog(null,"Informe o nome");
         String nome = JOptionPane.showInputDialog("Informe o nome");
         JOptionPane.showMessageDialog(null,"Seu nome é "+nome);
         String str_idade = JOptionPane.showInputDialog("Informe sua idade");
            if (idade < 12 ){
                JOptionPane.showMessageDialog(null,nome+" você é menor, sua idade "+idade);
            }else{
                JOptionPane.showMessageDialog(null,nome+" você é maior, sua idade "+idade);
            }
        
        int y = 0;
                do {
                    x++; // memso que x=x+1;
                    JOptionPane.showMessageDialog(null,"O valor de x é"+y);
                   } while(x<10);
       
     */           
                //Exercio teste 1;
        int num = 0;
        int resp =0;
         while(num <= 1)
         {     
         JOptionPane.showMessageDialog(null,"Informe o número 5");
         String str_numero = JOptionPane.showInputDialog("Qual número?");
         int numero = Integer.parseInt(str_numero);
            if(numero == 5){
                  
                JOptionPane.showMessageDialog(null,"O Numero é "+numero);
                resp = JOptionPane.showConfirmDialog(null, "Você deseja continuar", "Pergunta", JOptionPane.YES_NO_OPTION);
                
                }else{
                JOptionPane.showMessageDialog(null,"O Numero não é 5, você digitou "+numero);
//                JOptionPane.showMessageDialog(null,“O Numero não é 5”,“alerta”,JOptionPane.ERROR_MESSAGE);

            }
        if (resp == JOptionPane.NO_OPTION) {
            num = 2; 
        }
        num++; 
        }
                
    }
    
}
