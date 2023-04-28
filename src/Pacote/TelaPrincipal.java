
package Pacote;

import java.awt.Color;
import java.util.LinkedList;
import modelDominio.ContaBancaria;

public class TelaPrincipal extends javax.swing.JFrame {
    // declarando a lista de contas
    LinkedList<ContaBancaria> listaContasBancarias;

    public TelaPrincipal() {
        initComponents();
        getContentPane().setBackground(Color.decode("#f9d760"));
        // instanciando a lista de contas
        this.listaContasBancarias = new LinkedList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLTitulo = new javax.swing.JLabel();
        jBCadastroConta = new javax.swing.JButton();
        jBEfetuaSaqueDeposito = new javax.swing.JButton();
        jBvisualizacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setPreferredSize(new java.awt.Dimension(600, 600));

        jLTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLTitulo.setText("Deseja escolher:");

        jBCadastroConta.setBackground(new java.awt.Color(255, 153, 51));
        jBCadastroConta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBCadastroConta.setText("Cadastrar Conta");
        jBCadastroConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastroContaActionPerformed(evt);
            }
        });

        jBEfetuaSaqueDeposito.setBackground(new java.awt.Color(255, 153, 51));
        jBEfetuaSaqueDeposito.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBEfetuaSaqueDeposito.setText("Saque/Depósito");
        jBEfetuaSaqueDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEfetuaSaqueDepositoActionPerformed(evt);
            }
        });

        jBvisualizacao.setBackground(new java.awt.Color(255, 153, 51));
        jBvisualizacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBvisualizacao.setText("Visualizar Conta");
        jBvisualizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBvisualizacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBvisualizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jBEfetuaSaqueDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBCadastroConta, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLTitulo)))))
                .addContainerGap(216, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLTitulo)
                .addGap(43, 43, 43)
                .addComponent(jBCadastroConta)
                .addGap(18, 18, 18)
                .addComponent(jBEfetuaSaqueDeposito)
                .addGap(18, 18, 18)
                .addComponent(jBvisualizacao)
                .addContainerGap(224, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastroContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastroContaActionPerformed
        TelaCadastro telaCadastro = new TelaCadastro(this.listaContasBancarias);
        telaCadastro.setVisible(true);
    }//GEN-LAST:event_jBCadastroContaActionPerformed

    private void jBEfetuaSaqueDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEfetuaSaqueDepositoActionPerformed
        TelaSaqueDeposito telaSaqueDeposito = new TelaSaqueDeposito(this.listaContasBancarias);
        telaSaqueDeposito.setVisible(true);
    }//GEN-LAST:event_jBEfetuaSaqueDepositoActionPerformed

    private void jBvisualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvisualizacaoActionPerformed
        TelaVisualizacao telaVisualizacao = new TelaVisualizacao(this.listaContasBancarias);
        telaVisualizacao.setVisible(true);
    }//GEN-LAST:event_jBvisualizacaoActionPerformed
   
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastroConta;
    private javax.swing.JButton jBEfetuaSaqueDeposito;
    private javax.swing.JButton jBvisualizacao;
    private javax.swing.JLabel jLTitulo;
    // End of variables declaration//GEN-END:variables
}
