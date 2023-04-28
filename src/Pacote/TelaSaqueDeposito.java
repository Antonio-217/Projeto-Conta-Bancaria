
package Pacote;

import java.awt.Color;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import modelDominio.ContaBancaria;

public class TelaSaqueDeposito extends javax.swing.JFrame {
    // declarando a lista de contas
    LinkedList<ContaBancaria> listaContasBancarias;
    
    public TelaSaqueDeposito(LinkedList<ContaBancaria> listaContasBancarias) {
        initComponents();
         getContentPane().setBackground(Color.decode("#f9d760"));
        // inicializando a lista de contas
        this.listaContasBancarias = listaContasBancarias;
        //carregando a combo box das contas
        jCBconta.addItem("Selecionar");
        for (int i = 0; i < this.listaContasBancarias.size(); i++) {
            ContaBancaria minhaConta = this.listaContasBancarias.get(i);
            jCBconta.addItem(minhaConta.getCpfTitular()+ " - " + minhaConta.getNomeTitular());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGoperacoes = new javax.swing.ButtonGroup();
        jLoperacao = new javax.swing.JLabel();
        jRBsacar = new javax.swing.JRadioButton();
        jRBdepositar = new javax.swing.JRadioButton();
        jLconta = new javax.swing.JLabel();
        jCBconta = new javax.swing.JComboBox<>();
        jLvalor = new javax.swing.JLabel();
        jTFvalor = new javax.swing.JTextField();
        jBefetuar = new javax.swing.JButton();
        jBcancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBlimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Saque e Depósito");
        setPreferredSize(new java.awt.Dimension(600, 600));

        jLoperacao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLoperacao.setText("Operação");
        jLoperacao.setToolTipText("");

        bGoperacoes.add(jRBsacar);
        jRBsacar.setText("Sacar");

        bGoperacoes.add(jRBdepositar);
        jRBdepositar.setText("Depositar");

        jLconta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLconta.setText("Conta");

        jLvalor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLvalor.setText("Valor");

        jTFvalor.setToolTipText("");
        jTFvalor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFvalorActionPerformed(evt);
            }
        });

        jBefetuar.setBackground(new java.awt.Color(255, 153, 51));
        jBefetuar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBefetuar.setText("Efetuar");
        jBefetuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBefetuarActionPerformed(evt);
            }
        });

        jBcancelar.setBackground(new java.awt.Color(255, 153, 51));
        jBcancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBcancelar.setText("Cancelar");
        jBcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Saque/Depósito");

        jBlimpar.setBackground(new java.awt.Color(255, 153, 51));
        jBlimpar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBlimpar.setText("Limpar");
        jBlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLconta)
                            .addComponent(jLvalor))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFvalor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCBconta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLoperacao)
                                .addGap(18, 18, 18)
                                .addComponent(jRBsacar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRBdepositar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBefetuar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jBlimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBsacar)
                    .addComponent(jRBdepositar)
                    .addComponent(jLoperacao))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBconta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLconta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLvalor))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBefetuar)
                    .addComponent(jBcancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBlimpar)
                .addContainerGap(185, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBefetuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBefetuarActionPerformed
        if (jRBsacar.isSelected() || jRBdepositar.isSelected()) {
            if (jCBconta.getSelectedIndex()!=0) {
                if (!jTFvalor.getText().equals("")) {
                    float valor = Float.parseFloat(jTFvalor.getText());
                    
                    int posicao = jCBconta.getSelectedIndex() - 1;
                    
                    ContaBancaria minhaConta = this.listaContasBancarias.get(posicao);
                    
                    if (jRBsacar.isSelected()) { //sacar
                        boolean resultado = minhaConta.sacar(valor);
                        
                        if (resultado == true) {
                            JOptionPane.showMessageDialog(rootPane, "Saque efetuado com sucesso!");
                            limpaCampos();
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "Erro: não foi posível efetuar o saque!");
                        }
                        
                    } else if (jRBdepositar.isSelected()){ //depositar
                        boolean resultado = minhaConta.depositar(valor);
                        
                        if (resultado == true) {
                            JOptionPane.showMessageDialog(rootPane, "Depósito efetuado com sucesso!");
                            limpaCampos();
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "Erro: não foi posível efetuar o depósito!");
                        }
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Erro: informe o valor!");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Erro: selecione a conta!");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Erro: selecione a operação desejada!");
        } 
    }//GEN-LAST:event_jBefetuarActionPerformed

    public void limpaCampos() {
        bGoperacoes.clearSelection();
        jCBconta.setSelectedIndex(0);
        jTFvalor.setText("");
    }    
    
    private void jTFvalorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFvalorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFvalorActionPerformed

    private void jBcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jBcancelarActionPerformed

    private void jBlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimparActionPerformed
        limpaCampos();
    }//GEN-LAST:event_jBlimparActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGoperacoes;
    private javax.swing.JButton jBcancelar;
    private javax.swing.JButton jBefetuar;
    private javax.swing.JButton jBlimpar;
    private javax.swing.JComboBox<String> jCBconta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLconta;
    private javax.swing.JLabel jLoperacao;
    private javax.swing.JLabel jLvalor;
    private javax.swing.JRadioButton jRBdepositar;
    private javax.swing.JRadioButton jRBsacar;
    private javax.swing.JTextField jTFvalor;
    // End of variables declaration//GEN-END:variables
}
