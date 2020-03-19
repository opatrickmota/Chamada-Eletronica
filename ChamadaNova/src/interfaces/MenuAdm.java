/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Rafael Soares
 */
public class MenuAdm extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipalADM
     */
    public MenuAdm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        BtnEditarPerfil = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        BtnCriarEventos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        BtnAtribuirPresença = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        BtnGerarRelatorio = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        BtnAddAdm = new javax.swing.JMenuItem();
        TrocarUsuário = new javax.swing.JMenuItem();

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Área de Trabalho\\Trabalho Myllene\\ChamadaNova\\imagens\\Fundo.png")); // NOI18N

        jMenu4.setIcon(new javax.swing.ImageIcon("D:\\Área de Trabalho\\Trabalho Myllene\\ChamadaNova\\imagens\\user.png")); // NOI18N
        jMenu4.setText("Perfil");

        BtnEditarPerfil.setIcon(new javax.swing.ImageIcon("D:\\Área de Trabalho\\Trabalho Myllene\\ChamadaNova\\imagens\\Editar.png")); // NOI18N
        BtnEditarPerfil.setText("Editar Perfil");
        BtnEditarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarPerfilActionPerformed(evt);
            }
        });
        jMenu4.add(BtnEditarPerfil);

        jMenuBar1.add(jMenu4);

        jMenu1.setIcon(new javax.swing.ImageIcon("D:\\Área de Trabalho\\Trabalho Myllene\\ChamadaNova\\imagens\\evento.png")); // NOI18N
        jMenu1.setText("Eventos");

        BtnCriarEventos.setIcon(new javax.swing.ImageIcon("D:\\Área de Trabalho\\Trabalho Myllene\\ChamadaNova\\imagens\\add.png")); // NOI18N
        BtnCriarEventos.setText("Criar Eventos");
        BtnCriarEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCriarEventosActionPerformed(evt);
            }
        });
        jMenu1.add(BtnCriarEventos);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon("D:\\Área de Trabalho\\Trabalho Myllene\\ChamadaNova\\imagens\\Presença.png")); // NOI18N
        jMenu2.setText("Presença");

        BtnAtribuirPresença.setIcon(new javax.swing.ImageIcon("D:\\Área de Trabalho\\Trabalho Myllene\\ChamadaNova\\imagens\\accept.png")); // NOI18N
        BtnAtribuirPresença.setText("Atribuir Presença");
        BtnAtribuirPresença.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtribuirPresençaActionPerformed(evt);
            }
        });
        jMenu2.add(BtnAtribuirPresença);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon("D:\\Área de Trabalho\\Trabalho Myllene\\ChamadaNova\\imagens\\rel.png")); // NOI18N
        jMenu3.setText("Relatório");

        BtnGerarRelatorio.setIcon(new javax.swing.ImageIcon("D:\\Área de Trabalho\\Trabalho Myllene\\ChamadaNova\\imagens\\printer.png")); // NOI18N
        BtnGerarRelatorio.setText("Gerar Relatório");
        BtnGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGerarRelatorioActionPerformed(evt);
            }
        });
        jMenu3.add(BtnGerarRelatorio);

        jMenuBar1.add(jMenu3);

        jMenu5.setIcon(new javax.swing.ImageIcon("D:\\Área de Trabalho\\Trabalho Myllene\\ChamadaNova\\imagens\\adm.png")); // NOI18N
        jMenu5.setText("Administrador");

        BtnAddAdm.setIcon(new javax.swing.ImageIcon("D:\\Área de Trabalho\\Trabalho Myllene\\ChamadaNova\\imagens\\users.png")); // NOI18N
        BtnAddAdm.setText("Adicionar Função Administrador");
        BtnAddAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddAdmActionPerformed(evt);
            }
        });
        jMenu5.add(BtnAddAdm);

        TrocarUsuário.setIcon(new javax.swing.ImageIcon("D:\\Área de Trabalho\\Trabalho Myllene\\ChamadaNova\\imagens\\trocarUsu.png")); // NOI18N
        TrocarUsuário.setText("Trocar Usuário");
        TrocarUsuário.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrocarUsuárioActionPerformed(evt);
            }
        });
        jMenu5.add(TrocarUsuário);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 50, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCriarEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCriarEventosActionPerformed
        // TODO add your handling code here:
        CriarEvento evento = new CriarEvento();
        evento.setVisible(true);
    }//GEN-LAST:event_BtnCriarEventosActionPerformed

    private void BtnAtribuirPresençaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtribuirPresençaActionPerformed
        // TODO add your handling code here:
        AtribuirPresenca atribuir = new AtribuirPresenca();
        atribuir.setVisible(true);
    }//GEN-LAST:event_BtnAtribuirPresençaActionPerformed

    private void BtnEditarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarPerfilActionPerformed
        // TODO add your handling code here:
        EditarPerfil editar = new EditarPerfil();
        editar.setVisible(true);
    }//GEN-LAST:event_BtnEditarPerfilActionPerformed

    private void BtnGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGerarRelatorioActionPerformed
        // TODO add your handling code here:
        Relatorio relatorio = new Relatorio();
        relatorio.setVisible(true);
    }//GEN-LAST:event_BtnGerarRelatorioActionPerformed

    private void BtnAddAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddAdmActionPerformed
        // TODO add your handling code here:
        AddAdministrador addAdm = new AddAdministrador();
        addAdm.setVisible(true);
    }//GEN-LAST:event_BtnAddAdmActionPerformed

    private void TrocarUsuárioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrocarUsuárioActionPerformed
        // TODO add your handling code here:
                this.dispose(); 
    }//GEN-LAST:event_TrocarUsuárioActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
  

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdm().setVisible(true);
                
                
                                MenuAdm p = new MenuAdm();
                p.setVisible(true);
                
                Toolkit tool = Toolkit.getDefaultToolkit();
                Dimension tamanho = tool.getScreenSize();
                p.setSize(tamanho);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BtnAddAdm;
    private javax.swing.JMenuItem BtnAtribuirPresença;
    private javax.swing.JMenuItem BtnCriarEventos;
    private javax.swing.JMenuItem BtnEditarPerfil;
    private javax.swing.JMenuItem BtnGerarRelatorio;
    private javax.swing.JMenuItem TrocarUsuário;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
