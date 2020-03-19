/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import classes.CadastroEventos;
import classes.InscritosEvento;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author P2
 */
public class AtribuirPresenca extends javax.swing.JFrame {

    /**
     * Creates new form AtribuirPresenca
     */
    public AtribuirPresenca() {
        initComponents();

        btnVerAlunos.setEnabled(false);

        DefaultTableModel dtm = (DefaultTableModel) tabelaEventos.getModel();
        for (int i = 0; i < CadastroEventos.eventos.size(); i++) {
            dtm.addRow(new Object[]{CadastroEventos.eventos.get(i).getCodigo(), CadastroEventos.eventos.get(i).getNome(),
                CadastroEventos.eventos.get(i).getData(),
                CadastroEventos.eventos.get(i).getHoraInicio(), CadastroEventos.eventos.get(i).getHoraFim()});
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEventos = new javax.swing.JTable();
        btnVerAlunos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaInscritos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Eventos"));

        tabelaEventos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Data", "Hora de Início", "Hora de Término"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabelaEventosMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaEventos);

        btnVerAlunos.setText("Ver Alunos");
        btnVerAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerAlunosActionPerformed(evt);
            }
        });

        jLabel1.setText("Selecione o evento para ver os alunos inscritos no mesmo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVerAlunos)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnVerAlunos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Alunos Inscritos"));

        tabelaInscritos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código de Inscrição", "Evento", "Aluno", "CPF", "Presença"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaInscritos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabelaInscritosMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaInscritos);

        jLabel2.setText("Selecione o aluno para atribuir/retirar presença");

        jLabel3.setText("Presenças são atribuidas automaticamente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaEventosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaEventosMouseReleased
        // TODO add your handling code here:
        if (tabelaEventos.getSelectedRow() != -1) {
            btnVerAlunos.setEnabled(true);

        }
    }//GEN-LAST:event_tabelaEventosMouseReleased

    private void btnVerAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerAlunosActionPerformed
        // TODO add your handling code here:
        btnVerAlunos.setEnabled(false);
        int linhaSel = tabelaEventos.getSelectedRow();
        int codigoEvento = CadastroEventos.eventos.get(linhaSel).getCodigo();

        DefaultTableModel tblRemove = (DefaultTableModel) tabelaInscritos.getModel();
        tblRemove.setNumRows(0);

        DefaultTableModel dtm = (DefaultTableModel) tabelaInscritos.getModel();
        for (int i = 0; i < InscritosEvento.inscritos.size(); i++) {
            if (codigoEvento == InscritosEvento.inscritos.get(i).getCodEvento()) {
                dtm.addRow(new Object[]{InscritosEvento.inscritos.get(i).getCodInscritos(),
                    InscritosEvento.inscritos.get(i).getNomeEvento(),
                    InscritosEvento.inscritos.get(i).getNome(), InscritosEvento.inscritos.get(i).getCpf(),
                    InscritosEvento.inscritos.get(i).isPresente()});
            }
        }
        if (dtm.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "NÃO HÁ ALUNO INSCRITO NESSE EVENTO");
        }
    }//GEN-LAST:event_btnVerAlunosActionPerformed

    private void tabelaInscritosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaInscritosMouseReleased
        // TODO add your handling code here:
        if (tabelaInscritos.getSelectedRow() != -1) {
            int linhaSel = tabelaInscritos.getSelectedRow();
            int codigoInscricao = (Integer) tabelaInscritos.getValueAt(linhaSel, 0);
            int pos = -1;

            for (int i = 0; i < InscritosEvento.inscritos.size(); i++) {
                if (codigoInscricao == InscritosEvento.inscritos.get(i).getCodInscritos()) {
                    pos = i;
                }
            }
            if (pos != -1) {
                if (InscritosEvento.inscritos.get(pos).isPresente() == false) {
                    InscritosEvento.inscritos.get(pos).setPresente(true);
                    tabelaInscritos.setValueAt(true, linhaSel, 4);
                } else {
                    InscritosEvento.inscritos.get(pos).setPresente(false);
                    tabelaInscritos.setValueAt(false, linhaSel, 4);
                }
            } else {
                JOptionPane.showMessageDialog(null, "ERRO AO ENCONTRAR O ALUNO INSCRITO");
            }

        }
    }//GEN-LAST:event_tabelaInscritosMouseReleased

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
            java.util.logging.Logger.getLogger(AtribuirPresenca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtribuirPresenca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtribuirPresenca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtribuirPresenca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtribuirPresenca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerAlunos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaEventos;
    private javax.swing.JTable tabelaInscritos;
    // End of variables declaration//GEN-END:variables
}
