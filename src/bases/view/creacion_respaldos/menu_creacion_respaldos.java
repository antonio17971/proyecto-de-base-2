/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bases.view.creacion_respaldos;

import bases.view.menuprincipal;

/**
 *
 * @author CALIL
 */
public class menu_creacion_respaldos extends javax.swing.JFrame {

    /**
     * Creates new form menu_creacion_respaldos
     */
    public menu_creacion_respaldos() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo( null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_regresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_regresar1 = new javax.swing.JButton();
        btn_schemas = new javax.swing.JButton();
        btn_tablas = new javax.swing.JButton();
        btn_full = new javax.swing.JButton();

        btn_regresar.setText("Regresar");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Menu de creacion de respaldos");

        btn_regresar1.setText("Regresar");
        btn_regresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresar1ActionPerformed(evt);
            }
        });

        btn_schemas.setText("Schemas");
        btn_schemas.setToolTipText("");
        btn_schemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_schemasActionPerformed(evt);
            }
        });

        btn_tablas.setText("Tablas");
        btn_tablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tablasActionPerformed(evt);
            }
        });

        btn_full.setText("Full");
        btn_full.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fullActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(283, Short.MAX_VALUE)
                        .addComponent(btn_regresar1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_schemas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_tablas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_full, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btn_schemas)
                .addGap(27, 27, 27)
                .addComponent(btn_tablas)
                .addGap(27, 27, 27)
                .addComponent(btn_full)
                .addGap(36, 36, 36)
                .addComponent(btn_regresar1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void btn_regresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresar1ActionPerformed
        // TODO add your handling code here:
        menuprincipal menu = new menuprincipal();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_btn_regresar1ActionPerformed

    private void btn_schemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_schemasActionPerformed
        // TODO add your handling code here:
        menu_creacion_respaldos_schemas menu = new menu_creacion_respaldos_schemas();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_btn_schemasActionPerformed

    private void btn_tablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tablasActionPerformed
        // TODO add your handling code here:
        menu_creacion_respaldos_tablas menu = new menu_creacion_respaldos_tablas();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_btn_tablasActionPerformed

    private void btn_fullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fullActionPerformed
        // TODO add your handling code here:
        menu_creacion_respaldos_full menu = new menu_creacion_respaldos_full();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_btn_fullActionPerformed

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
            java.util.logging.Logger.getLogger(menu_creacion_respaldos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_creacion_respaldos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_creacion_respaldos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_creacion_respaldos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_creacion_respaldos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_full;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JButton btn_regresar1;
    private javax.swing.JButton btn_schemas;
    private javax.swing.JButton btn_tablas;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
