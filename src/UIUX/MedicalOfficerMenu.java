/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UIUX;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author xiuha
 */
public class MedicalOfficerMenu extends javax.swing.JFrame {

    /**
     * Creates new form MedicalOfficerMenu
     */
    public MedicalOfficerMenu() {
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

        MenuLabel = new javax.swing.JLabel();
        AddNewDoctorButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        AddNewDoctorButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MenuLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        MenuLabel.setText("Medical Officer Menu");

        AddNewDoctorButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AddNewDoctorButton.setText("Add New Doctor");
        AddNewDoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewDoctorButtonActionPerformed(evt);
            }
        });

        LogoutButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LogoutButton.setText("Logout");
        LogoutButton.setToolTipText("");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        AddNewDoctorButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AddNewDoctorButton1.setText("Verify Transaction");
        AddNewDoctorButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewDoctorButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(MenuLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddNewDoctorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddNewDoctorButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(MenuLabel)
                .addGap(48, 48, 48)
                .addComponent(AddNewDoctorButton)
                .addGap(61, 61, 61)
                .addComponent(AddNewDoctorButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(LogoutButton)
                .addGap(50, 50, 50))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddNewDoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewDoctorButtonActionPerformed
        // TODO add your handling code here:
        RegisterDoctor registerDoctor = new RegisterDoctor();
        registerDoctor.setVisible(true);
        dispose();
    }//GEN-LAST:event_AddNewDoctorButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void AddNewDoctorButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewDoctorButton1ActionPerformed
        try {
            VerifyTransaction verifyTransaction = new VerifyTransaction();
            verifyTransaction.setVisible(true);
            dispose();
        } catch (Exception ex) {
            Logger.getLogger(MedicalOfficerMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AddNewDoctorButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MedicalOfficerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicalOfficerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicalOfficerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicalOfficerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicalOfficerMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddNewDoctorButton;
    private javax.swing.JButton AddNewDoctorButton1;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JLabel MenuLabel;
    // End of variables declaration//GEN-END:variables
}
