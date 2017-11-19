/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10.trabalho;

import javax.swing.JOptionPane;

/**
 *
 * @author cassolli
 */
public class Aula10Exercicio4b extends javax.swing.JFrame {

    /**
     * Creates new form Aula10Exercicio4b
     */
    public Aula10Exercicio4b() {
        initComponents();
    }
    String JogadorX = "jogando";
    String JogadorO = "nao";
    String JogadorNome= "0";
    String JogadorXNome = JOptionPane.showInputDialog("Qual o Nome do Primeiro Jogador");
    String JogadorONome = JOptionPane.showInputDialog("Qual o Nome do Segundo Jogador");
    
    public void TrocaJogador(){
        if (JogadorX == "jogando"){ 
            JogadorX = "nao";
            JogadorO = "jogando";
            JogadorNome = JogadorXNome;
            Valida();
        }else{
            JogadorX = "jogando";
            JogadorO = "nao";
            JogadorNome = JogadorONome;
                Valida();
        }
    }
    public void Reseta(){
        botao0.setText("");
        botao1.setText("");
        botao2.setText("");
        botao3.setText("");
        botao4.setText("");
        botao5.setText("");
        botao6.setText("");
        botao7.setText("");
        botao8.setText("");
        JogadorX = "jogando";
        String JogadorXNome = JOptionPane.showInputDialog("Qual o Nome do Primeiro Jogador");
        String JogadorONome = JOptionPane.showInputDialog("Qual o Nome do Segundo Jogador");
    }   
    
    
    int cont = 0;
    public void Valida(){
        int n = 3;
        String[][] valida = new String[n][n];
         for (int x=0; x < valida.length; x++){
            for (int y=0; y < valida.length; y++){
                     valida[0][0] = botao0.getText();
                     valida[0][1] = botao1.getText();
                     valida[0][2] = botao2.getText();
                     valida[1][0] = botao3.getText();
                     valida[1][1] = botao4.getText();
                     valida[1][2] = botao5.getText();
                     valida[2][0] = botao6.getText();
                     valida[2][1] = botao7.getText();
                     valida[2][2] = botao8.getText();
                     System.out.println(cont+" - Voce digitou na posição ["+x+"]["+y+"]"+valida[x][y]);
            }
         }
           
                    if(valida[0][0].equals("X") && valida[0][1].equals("X") && valida[0][2].equals("X") || valida[0][0].equals("O") && valida[0][1].equals("O") && valida[0][2].equals("O") ){
                         JOptionPane.showMessageDialog(null, "Vitoria do jogador"+JogadorNome);
                    Reseta();    
                         
                    }if(valida[1][0].equals("X") && valida[1][1].equals("X") && valida[1][2].equals("X") || valida[1][0].equals("O") && valida[1][1].equals("O") && valida[1][2].equals("O") ){
                        JOptionPane.showMessageDialog(null, "Vitoria do jogador"+JogadorNome);
                       
                    
                    }if(valida[2][0].equals("X") && valida[2][1].equals("X") && valida[2][2].equals("X") || valida[2][0].equals("O") && valida[2][1].equals("O") && valida[2][2].equals("O")){
                        JOptionPane.showMessageDialog(null, "Vitoria do jogador"+JogadorNome);
                    
                        
                    }if(valida[0][0].equals("X") && valida[1][1].equals("X") && valida[2][2].equals("X") ){
                        JOptionPane.showMessageDialog(null, "Vitoria do jogador"+JogadorNome);    
                    
                    }if(valida[0][2].equals("X") && valida[1][1].equals("X") && valida[2][0].equals("X")){
                        JOptionPane.showMessageDialog(null, "Vitoria do jogador"+JogadorNome);    
    
                        
                    }if(valida[0][0].equals("X") && valida[1][0].equals("X") && valida[2][0].equals("X") || valida[0][0].equals("O") && valida[1][0].equals("O") && valida[2][0].equals("O")){
                        JOptionPane.showMessageDialog(null, "Vitoria do jogador"+JogadorNome);
                        
                    }if(valida[0][1].equals("X") && valida[1][1].equals("X") && valida[2][1].equals("X") || valida[0][1].equals("O") && valida[1][1].equals("O") && valida[2][1].equals("O")){
                        JOptionPane.showMessageDialog(null, "Vitoria do jogador"+JogadorNome);  
                    
                    }if(valida[0][2].equals("X") && valida[1][2].equals("X") && valida[2][2].equals("X") || valida[0][2].equals("O") && valida[1][2].equals("O") && valida[2][2].equals("O")){
                        JOptionPane.showMessageDialog(null, "Vitoria do jogador"+JogadorNome);  
                    }
                      if(!botao0.getText().equals("") && 
                       !botao1.getText().equals("") && 
                       !botao2.getText().equals("") && 
                       !botao3.getText().equals("") && 
                       !botao4.getText().equals("") && 
                       !botao5.getText().equals("") && 
                       !botao6.getText().equals("") && 
                       !botao7.getText().equals("") &&
                       !botao8.getText().equals("")){
                      JOptionPane.showMessageDialog(null,"Todo mundo ganhou, pois empatou =)");
                       } 
                    
    
             /**        String botao = "";
            botao += "botao"+1;
            valida[x][y] = botao0.getText();       
      */              
// valida[x][y][y] = JOptionPane.showInputDialog("Informe o ["+x+"]["+i+"] nome.");
                
    
         
     //debug
 System.out.println("Proximo");  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botao0 = new javax.swing.JButton();
        botao1 = new javax.swing.JButton();
        botao2 = new javax.swing.JButton();
        botao3 = new javax.swing.JButton();
        botao4 = new javax.swing.JButton();
        botao5 = new javax.swing.JButton();
        botao6 = new javax.swing.JButton();
        botao7 = new javax.swing.JButton();
        botao8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botao0.setFont(new java.awt.Font("Open Sans", 0, 36)); // NOI18N
        botao0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao0ActionPerformed(evt);
            }
        });

        botao1.setFont(new java.awt.Font("Open Sans", 0, 36)); // NOI18N
        botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao1ActionPerformed(evt);
            }
        });

        botao2.setFont(new java.awt.Font("Open Sans", 0, 36)); // NOI18N
        botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao2ActionPerformed(evt);
            }
        });

        botao3.setFont(new java.awt.Font("Open Sans", 0, 36)); // NOI18N
        botao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao3ActionPerformed(evt);
            }
        });

        botao4.setFont(new java.awt.Font("Open Sans", 0, 36)); // NOI18N
        botao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao4ActionPerformed(evt);
            }
        });

        botao5.setFont(new java.awt.Font("Open Sans", 0, 36)); // NOI18N
        botao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao5ActionPerformed(evt);
            }
        });

        botao6.setFont(new java.awt.Font("Open Sans", 0, 36)); // NOI18N
        botao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao6ActionPerformed(evt);
            }
        });

        botao7.setFont(new java.awt.Font("Open Sans", 0, 36)); // NOI18N
        botao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao7ActionPerformed(evt);
            }
        });

        botao8.setFont(new java.awt.Font("Open Sans", 0, 36)); // NOI18N
        botao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao8ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Open Sans", 0, 48)); // NOI18N
        jLabel1.setText("Jogo da Velha !!!");

        jButton1.setText("Novo Jogo?");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botao6, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(botao3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botao0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botao4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botao1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botao7, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botao8, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(botao2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botao5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botao0, botao1, botao2, botao3, botao4, botao5, botao6, botao7, botao8});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botao2, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(botao0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao5, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(botao4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botao6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao8, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botao0, botao1, botao2, botao3, botao4, botao5, botao6, botao7, botao8});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao0ActionPerformed
         if(botao0.getText().equals("X") || botao0.getText().equals("O")){
                JOptionPane.showMessageDialog(null, "Você não pode jogar em uma coluna com valor");
            }else{
         if (JogadorX == "jogando"){
               botao0.setText("X");
                //debug
         //System.out.println(JogadorX+" - "+JogadorO);
               TrocaJogador();
                            //debug
         //System.out.println(JogadorX+" - "+JogadorO);
            }else {
               botao0.setText("O");
                               //debug
         //System.out.println(JogadorX+" - "+JogadorO);
               TrocaJogador();
                               //debug
         //System.out.println(JogadorX+" - "+JogadorO);
         }
         }
         cont = 0;
    }//GEN-LAST:event_botao0ActionPerformed

    private void botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao1ActionPerformed
         if(botao1.getText().equals("X") || botao1.getText().equals("O")){
                JOptionPane.showMessageDialog(null, "Você não pode jogar em uma coluna com valor");
            }else{
         if (JogadorX == "jogando"){
               botao1.setText("X");
                               //debug
         //System.out.println(JogadorX+" - "+JogadorO);
               TrocaJogador();
                               //debug
        // System.out.println(JogadorX+" - "+JogadorO);
            }else {
               botao1.setText("O");
                               //debug
        // System.out.println(JogadorX+" - "+JogadorO);
               TrocaJogador();
                               //debug
         //System.out.println(JogadorX+" - "+JogadorO);
         }
         }
         cont = 1;
    }//GEN-LAST:event_botao1ActionPerformed

    private void botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao2ActionPerformed
         if(botao2.getText().equals("X") || botao2.getText().equals("O")){
                JOptionPane.showMessageDialog(null, "Você não pode jogar em uma coluna com valor");
            }else{
         if (JogadorX == "jogando"){
               botao2.setText("X");
               TrocaJogador();
            }else {
               botao2.setText("O");
               TrocaJogador();
         }
         }
         cont=2;
    }//GEN-LAST:event_botao2ActionPerformed

    private void botao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao3ActionPerformed
        if(botao3.getText().equals("X") || botao3.getText().equals("O")){
                JOptionPane.showMessageDialog(null, "Você não pode jogar em uma coluna com valor");
            }else{
         if (JogadorX == "jogando"){
               botao3.setText("X");
               TrocaJogador();
            }else {
               botao3.setText("O");
               TrocaJogador();
         }
         }
    }//GEN-LAST:event_botao3ActionPerformed

    private void botao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao4ActionPerformed
 if(botao4.getText().equals("X") || botao4.getText().equals("O")){
                JOptionPane.showMessageDialog(null, "Você não pode jogar em uma coluna com valor");
            }else{
         if (JogadorX == "jogando"){
               botao4.setText("X");
               TrocaJogador();
            }else {
               botao4.setText("O");
               TrocaJogador();
         }
         }
    }//GEN-LAST:event_botao4ActionPerformed

    private void botao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao5ActionPerformed
 if(botao5.getText().equals("X") || botao5.getText().equals("O")){
                JOptionPane.showMessageDialog(null, "Você não pode jogar em uma coluna com valor");
            }else{
         if (JogadorX == "jogando"){
               botao5.setText("X");
               TrocaJogador();
            }else {
               botao5.setText("O");
               TrocaJogador();
         }
         }    }//GEN-LAST:event_botao5ActionPerformed

    private void botao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao6ActionPerformed
 if(botao6.getText().equals("X") || botao6.getText().equals("O")){
                JOptionPane.showMessageDialog(null, "Você não pode jogar em uma coluna com valor");
            }else{
         if (JogadorX == "jogando"){
               botao6.setText("X");
               TrocaJogador();
            }else {
               botao6.setText("O");
               TrocaJogador();
         }
         }    }//GEN-LAST:event_botao6ActionPerformed

    private void botao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao7ActionPerformed
 if(botao7.getText().equals("X") || botao7.getText().equals("O")){
                JOptionPane.showMessageDialog(null, "Você não pode jogar em uma coluna com valor");
            }else{
         if (JogadorX == "jogando"){
               botao7.setText("X");
               TrocaJogador();
            }else {
               botao7.setText("O");
               TrocaJogador();
         }
         }    }//GEN-LAST:event_botao7ActionPerformed

    private void botao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao8ActionPerformed
       
        if(botao8.getText().equals("X") || botao8.getText().equals("O")){
                JOptionPane.showMessageDialog(null, "Você não pode jogar em uma coluna com valor");
            }else{
         if (JogadorX == "jogando"){
               botao8.setText("X");
               TrocaJogador();
            }else {
             
               botao8.setText("O");
               TrocaJogador();
         }
         }    }//GEN-LAST:event_botao8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           int resp = JOptionPane.showConfirmDialog(null, "Deseja reiniciar o Jogo?", "Pergunta", JOptionPane.YES_NO_OPTION);
        
        if (resp == JOptionPane.YES_OPTION) {
               Reseta();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Aula10Exercicio4b.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aula10Exercicio4b.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aula10Exercicio4b.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aula10Exercicio4b.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aula10Exercicio4b().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao0;
    private javax.swing.JButton botao1;
    private javax.swing.JButton botao2;
    private javax.swing.JButton botao3;
    private javax.swing.JButton botao4;
    private javax.swing.JButton botao5;
    private javax.swing.JButton botao6;
    private javax.swing.JButton botao7;
    private javax.swing.JButton botao8;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
