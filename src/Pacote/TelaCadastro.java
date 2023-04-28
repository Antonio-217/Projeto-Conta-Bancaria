
package Pacote;

import modelDominio.ContaBancaria;
import java.awt.Color;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import modelDominio.ContaEspecial;
import modelDominio.ContaPoupanca;


public class TelaCadastro extends javax.swing.JFrame {

     LinkedList<ContaBancaria> listaContasBancarias;
    
    public TelaCadastro(LinkedList<ContaBancaria> listaContasBancarias) {
        initComponents();
        getContentPane().setBackground(Color.decode("#f9d760"));
        
        this.listaContasBancarias = listaContasBancarias;
        
        jTFlimite.setEnabled(false);
        jTFdia.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLnome = new javax.swing.JLabel();
        jTFnome = new javax.swing.JTextField();
        jLcpf = new javax.swing.JLabel();
        jTFcpf = new javax.swing.JTextField();
        jLsaldo = new javax.swing.JLabel();
        jTFsaldo = new javax.swing.JTextField();
        jBsalvar = new javax.swing.JButton();
        jBcancelar = new javax.swing.JButton();
        jLtipo = new javax.swing.JLabel();
        jCBtipo = new javax.swing.JComboBox<>();
        jLlimite = new javax.swing.JLabel();
        jTFlimite = new javax.swing.JTextField();
        jLdia = new javax.swing.JLabel();
        jTFdia = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jBlimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Cadastro");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(600, 600));

        jLnome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLnome.setText("Nome");

        jLcpf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLcpf.setText("CPF");

        jLsaldo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLsaldo.setText("Saldo");

        jBsalvar.setBackground(new java.awt.Color(255, 153, 51));
        jBsalvar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBsalvar.setText("Salvar");
        jBsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalvarActionPerformed(evt);
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

        jLtipo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLtipo.setText("Tipo");

        jCBtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<< Selecionar >>", "Bancária", "Especial", "Poupança" }));
        jCBtipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBtipoActionPerformed(evt);
            }
        });

        jLlimite.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLlimite.setText("Limite");

        jLdia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLdia.setText("Dia");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro");

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
                .addGap(159, 159, 159)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLsaldo)
                                            .addComponent(jLtipo)
                                            .addComponent(jLdia))
                                        .addGap(22, 22, 22))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLcpf)
                                        .addGap(30, 30, 30))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLnome, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLlimite, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTFlimite, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCBtipo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTFsaldo)
                                .addComponent(jTFdia, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTFcpf)
                                .addComponent(jTFnome, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jBlimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLnome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLcpf))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLsaldo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLtipo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFlimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLlimite))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLdia))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBsalvar)
                    .addComponent(jBcancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBlimpar)
                .addGap(81, 81, 81))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalvarActionPerformed
    
         if (!jTFnome.getText().equals("")) {
            if (!jTFcpf.getText().equals("")) {
                if (!jTFsaldo.getText().equals("")) {
                    if (jCBtipo.getSelectedIndex() != 0) {
                        // obtendo as informações
                        String nome = jTFnome.getText();
                        String cpf = jTFcpf.getText();
                        float saldo = Float.parseFloat(jTFsaldo.getText());

                        // verificando o tipo de conta que será criada
                        if (jCBtipo.getSelectedIndex() == 1) { // bancária
                            // criando o objeto da classe
                            ContaBancaria minhaConta = new ContaBancaria(nome, cpf, saldo);

                            // adicionando o objeto na lista
                            this.listaContasBancarias.add(minhaConta);
                                JOptionPane.showMessageDialog(rootPane, "Conta bancária cadastrada com sucesso!");
                                limpaCampos();
                            
                        } else if (jCBtipo.getSelectedIndex() == 2) { // especial
                            // verificando se informou o limite
                            if (!jTFlimite.getText().equals("")) {
                                // obtendo a informação
                                float limite = Float.parseFloat(jTFlimite.getText());
                                
                                // criando o objeto da conta especial
                                ContaEspecial minhaContaEspecial = new ContaEspecial(limite, nome, cpf, saldo);
                               
                                // adicionando o objeto na lista
                                this.listaContasBancarias.add(minhaContaEspecial);
                                    JOptionPane.showMessageDialog(rootPane, "Conta especial cadastrada com sucesso!");
                                    limpaCampos();
                                    
                            } else {
                                JOptionPane.showMessageDialog(rootPane, "Erro: informe o limite!");
                            }
                            
                        } else if (jCBtipo.getSelectedIndex() == 3) { // conta poupança
                            // verificando se informou o dia
                            if (!jTFdia.getText().equals("")) {
                                // obtendo a informação
                                int dia = Integer.parseInt(jTFdia.getText());
                                
                                // criando o objeto da classe conta poupanca
                                ContaPoupanca minhaContaPoupanca = new ContaPoupanca(dia, nome, cpf, saldo);
                                // adicionando na lista de contas
                                this.listaContasBancarias.add(minhaContaPoupanca);
                                    JOptionPane.showMessageDialog(rootPane, "Conta poupança cadastrada com sucesso!");
                                    limpaCampos();
                                    
                            } else {
                                JOptionPane.showMessageDialog(rootPane, "Erro: informe o dia de rendimento!");
                            }
                        }                        

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Erro: informe o tipo de conta!");
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Erro: informe o saldo!");
                }                
            } else {
                JOptionPane.showMessageDialog(rootPane, "Erro: informe o CPF!");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Erro: informe o nome!");
        }
    }//GEN-LAST:event_jBsalvarActionPerformed

    private void jBcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jBcancelarActionPerformed

    private void jCBtipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBtipoActionPerformed
        if (jCBtipo.getSelectedIndex()== 0 || jCBtipo.getSelectedIndex() == 1) {
            jTFlimite.setEnabled(false);
            jTFdia.setEnabled(false);
        } else if (jCBtipo.getSelectedIndex() == 2) {
            jTFlimite.setEnabled(true);
            jTFdia.setEnabled(false);
        } else if (jCBtipo.getSelectedIndex() == 3) {
            jTFlimite.setEnabled(false);
            jTFdia.setEnabled(true);
        }
    }//GEN-LAST:event_jCBtipoActionPerformed

    private void jBlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimparActionPerformed
        limpaCampos();
    }//GEN-LAST:event_jBlimparActionPerformed

    public void limpaCampos() {
        jTFnome.setText("");
        jTFcpf.setText("");
        jTFsaldo.setText("");
        jTFlimite.setText("");
        jTFdia.setText("");
        jCBtipo.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcancelar;
    private javax.swing.JButton jBlimpar;
    private javax.swing.JButton jBsalvar;
    private javax.swing.JComboBox<String> jCBtipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLcpf;
    private javax.swing.JLabel jLdia;
    private javax.swing.JLabel jLlimite;
    private javax.swing.JLabel jLnome;
    private javax.swing.JLabel jLsaldo;
    private javax.swing.JLabel jLtipo;
    private javax.swing.JTextField jTFcpf;
    private javax.swing.JTextField jTFdia;
    private javax.swing.JTextField jTFlimite;
    private javax.swing.JTextField jTFnome;
    private javax.swing.JTextField jTFsaldo;
    // End of variables declaration//GEN-END:variables
}
