
package Pacote;

import java.awt.Color;
import java.util.HashSet;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import modelDominio.ContaBancaria;
import modelDominio.ContaEspecial;
import modelDominio.ContaPoupanca;

public class TelaVisualizacao extends javax.swing.JFrame {

    LinkedList<ContaBancaria> listaContasBancarias;
    
    public TelaVisualizacao(LinkedList<ContaBancaria> listaContasBancarias) {
        initComponents();
        getContentPane().setBackground(Color.decode("#f9d760"));
        
        this.listaContasBancarias = listaContasBancarias;
        
        //carregando a tabela de contas bancarias
        DefaultTableModel modelo = (DefaultTableModel)jTcontasBancarias.getModel();
        modelo.setNumRows(0);
        //navegando na lista
        for (int x = 0; x < this.listaContasBancarias.size(); x++) {
            ContaBancaria minhaConta = this.listaContasBancarias.get(x);
            
            modelo.addRow(new Object[] {""});
            modelo.setValueAt(minhaConta.getNomeTitular(), x, 0);
            modelo.setValueAt(minhaConta.getCpfTitular(), x, 1);
            modelo.setValueAt(minhaConta.getSaldo(), x, 2);
            
            //verificando o tipo de conta
            String tipo = "";
            if (minhaConta instanceof ContaEspecial) {
                tipo = "Conta Especial";
            } else if (minhaConta instanceof ContaPoupanca) {
                       tipo = "Conta Poupança";
            } else {
                tipo = "Bancária";
            }
            modelo.setValueAt(tipo, x, 3);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTcontasBancarias = new javax.swing.JTable();
        jBdetalhes = new javax.swing.JButton();
        jBvoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Visualização de Contas");
        setPreferredSize(new java.awt.Dimension(600, 600));

        jTcontasBancarias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Saldo", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTcontasBancarias);

        jBdetalhes.setBackground(new java.awt.Color(255, 153, 51));
        jBdetalhes.setText("Detalhar");
        jBdetalhes.setToolTipText("");
        jBdetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdetalhesActionPerformed(evt);
            }
        });

        jBvoltar.setBackground(new java.awt.Color(255, 153, 0));
        jBvoltar.setText("Voltar");
        jBvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBvoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBvoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBdetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBdetalhes)
                    .addComponent(jBvoltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBdetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdetalhesActionPerformed
        
    }//GEN-LAST:event_jBdetalhesActionPerformed

    private void jBvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvoltarActionPerformed
        dispose();
    }//GEN-LAST:event_jBvoltarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBdetalhes;
    private javax.swing.JButton jBvoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTcontasBancarias;
    // End of variables declaration//GEN-END:variables
}
