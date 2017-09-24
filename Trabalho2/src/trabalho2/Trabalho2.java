/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author cassolli
 */
public class Trabalho2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/**1)Escreva um laço while que execute 20 vezes, imprimindo o valor da 
variável x que inicialmente está com valor 10. 
Converta este laço para um do-while.
*/
System.out.print("Exercicio 1 while\n");
int x = 10;
int countx = 0;
while (x<30){
countx++;  
    System.out.print("Numero de execução "+countx+". O valor de x é "+x+"\n");
    x++;   
}
System.out.print("========================================\n");

System.out.print("Exercicio 1 do-while\n");

int y = 10;
int county = 0;
do {
county++;    
    System.out.print("Numero de execução "+county+". O valor de x é "+y+"\n");
y++;
} while(y<30);
       

/**
2)Implemente um programa que recebe um número de 1 a 7 e imprime o dia da semana correspondente.
*/
System.out.print("Exercicio 2.\n");
JOptionPane.showMessageDialog(null,"Informe um número de 1 a 7 e te direi o dia da semana correspondente!!!");
String str_num = JOptionPane.showInputDialog("Informe número!");
int num =Integer.parseInt(str_num);
if(num == 1){
   JOptionPane.showMessageDialog(null,"O primeiro dia da semana é \"Segunda Feira\"!!!");
}if(num == 2){
    JOptionPane.showMessageDialog(null,"O segundo dia da semana é \"Terça Feira\"!!!");
}if(num == 3){
    JOptionPane.showMessageDialog(null,"O terceiro dia da semana é \"Quarta Feira\"!!!");
}if(num == 4){
    JOptionPane.showMessageDialog(null,"O quarto dia da semana é \"Quinta Feira\"!!!");
}if(num == 5){
    JOptionPane.showMessageDialog(null,"O quinto dia da semana é \"Sexta Feira\" o/!!!");
}if(num == 6){
    JOptionPane.showMessageDialog(null,"O sexto dia da semana é \"Sábado\" !!!");
}if(num == 7){
    JOptionPane.showMessageDialog(null,"O sétimo dia da semana é \"Domingo\" !!!");
}if(num < 1 || num > 7){
    JOptionPane.showMessageDialog(null,"Você digitou um número incorreto!!! Tente novamente. A semana tem 7 dias.");
}

/**
3)Implemente um programa que recebe repetidamente um número de 1 a 12, enquanto esse número for diferente de 0 (zero),
* e imprime o mês correspondente. 
Quando o número estiver fora do intervalo permitido, a mensagem “mês inválido” deverá ser exibida.
*/
System.out.print("Exercicio 3.\n");
int a = 0;
while (a<1){
JOptionPane.showMessageDialog(null,"Informe um número de 1 a 12 e te direi o mês correspondente!!!");
String str_mes = JOptionPane.showInputDialog("Informe número!");
int mes =Integer.parseInt(str_mes);
if(mes == 1){
   JOptionPane.showMessageDialog(null,"O primeiro mês é \"Janeiro\"!!!");
    a = 0;   
}if(mes == 2){
   JOptionPane.showMessageDialog(null,"O segundo mês é \"Fevereiro\"!!!");
    a = 0;   
}if(mes == 3){
   JOptionPane.showMessageDialog(null,"O terceiro mês é \"Março\"!!!");
   a = 0;   
}if(mes == 4){
   JOptionPane.showMessageDialog(null,"O quarto mês é \"Abril\"!!!");
   a = 0;
}if(mes == 5){
   JOptionPane.showMessageDialog(null,"O quinto mês é \"Maio\"!!!");
   a = 0;
}if(mes == 6){
   JOptionPane.showMessageDialog(null,"O sexto mês é \"Junho\"!!!");
   a = 0;
}if(mes == 7){
   JOptionPane.showMessageDialog(null,"O sétimo mês é \"Julho\"!!!");
   a = 0;
}if(mes == 8){
   JOptionPane.showMessageDialog(null,"O oitavo mês é \"Agosto\"!!!");
   a = 0;
}if(mes == 9){
   JOptionPane.showMessageDialog(null,"O nono mês é \"Setembro\"!!!");
   a = 0;
}if(mes == 10){
   JOptionPane.showMessageDialog(null,"O décimo mês é \"Outubro\"!!!");
   a = 0;
}if(mes == 11){
   JOptionPane.showMessageDialog(null,"O décimo primeiro mês é \"Novembro\"!!!");
   a = 0;
}if(mes == 12){
   JOptionPane.showMessageDialog(null,"O décimo segundo mês é \"Dezembro\"!!!");
}if(mes == 0){
    a = 2; 
}
if(mes < 0||mes >12){
    JOptionPane.showMessageDialog(null,"Você digitou um número incorreto!!! Tente novamente. O ano tem 12 meses!!!.");
    a = 0;   
}
}

/** 
4) Desenvolva um programa que dado um número inteiro o programa informe se o mesmo é um número primo.
*/

System.out.print("Exercicio 4.\n");

  String numero;
  int count1;
  int str_numero;
  numero=JOptionPane.showInputDialog("Digite um número e te direi se é um número primo!");
  str_numero=Integer.parseInt(numero);
  count1=0;
    for (int i=1;i<=str_numero;i++ ){
     if(str_numero%i == 0)
     count1++;
  }
       if (count1==2){
   JOptionPane.showMessageDialog(null, "O numero " +str_numero+ " é número primo.");
  }else{
   JOptionPane.showMessageDialog(null,"O numero " +str_numero+ " não é um número primo.");
  }   
   
/**
* 5) Fulano aplicou R$ 100,00 com rendimento de 5% ao mês. Quantos
* meses serão necessários para o capital investido ultrapasse a R$
* 200,00. Desenvolva um programa que realize essa operação. O Caso o
* mês for igual a janeiro então o programa deve adicionar mais R$10,00
* de juros.O sistema deve mostra a média
*/
System.out.print("Exercicio 5.\n");
        float aplic = 100.00f;
        float rend = 0.05f;
        float rendimento = 0.00f;
        float base = 0.00f;
        int count = 0;
        int ano = 2017;
        float juros = 0.0f;
        int mesatual = 9;
        System.out.println("RESULTADO PARCIAL:");
        while (aplic < 200) {
            count++;
            mesatual += 1;
            if (mesatual > 12) {
                mesatual = 1;
                ano += 1;
            }

            if (mesatual == 1) {
                aplic = aplic + 10.00f;

            }

            base = aplic;
            rendimento = aplic * rend;
            aplic = rendimento + aplic;
            juros = (aplic - 100.00f) / count;
            System.out.println("Total atual: "+aplic+", média de juros: " + 
                    juros + ", base: de cálculo: " + base +
                    ", quantidade de acréscimos: " + count + ", data: " + 
                    mesatual + "/" + ano);
            
        }
       // ini--;
        DecimalFormat df = new DecimalFormat("0.00");
        String str_aplic = df.format(aplic);
        String str_juros = df.format(juros);
        String str_base = df.format(base);
        System.out.println("RESULTADO FINAL:");
        System.out.println("Total atual: R$ " + str_aplic + 
                ", média de juros: R$ " +  str_juros +
                ", base: de cálculo: R$ " +  str_base + 
                ", quantidade de acréscimos: " + count + 
                ", data: " + mesatual + "/" + ano);


    }
    

}
