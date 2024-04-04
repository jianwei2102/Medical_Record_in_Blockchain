/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UIUX;

import Classes.Credential;
import Classes.Doctor;
import Classes.Validation;
import static DataIO.DataIO.allCredential;
import static DataIO.DataIO.allDoctor;
import javax.swing.JOptionPane;

/**
 *
 * @author xiuha
 */
public class RegisterDoctor extends javax.swing.JFrame {

    /**
     * Creates new form RegisterDoctor
     */
    public RegisterDoctor() {
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

        RegisterLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        ICLabel = new javax.swing.JLabel();
        ICTextField = new javax.swing.JTextField();
        NameTextField = new javax.swing.JTextField();
        HospitalNameLabel = new javax.swing.JLabel();
        HospitalNameTextField = new javax.swing.JTextField();
        HospitalAddressLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        HospitalAddressTextArea = new javax.swing.JTextArea();
        DepartmentLabel = new javax.swing.JLabel();
        DepartmentComboBox = new javax.swing.JComboBox<>();
        PasswordLabel = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        RegisterButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RegisterLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        RegisterLabel.setText("Doctor Registration");

        NameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NameLabel.setText("Name");

        ICLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ICLabel.setText("IC");

        ICTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        NameTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        HospitalNameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HospitalNameLabel.setText("Hospital Name");

        HospitalNameTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        HospitalAddressLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HospitalAddressLabel.setText("Hospital Address");

        HospitalAddressTextArea.setColumns(20);
        HospitalAddressTextArea.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        HospitalAddressTextArea.setRows(5);
        jScrollPane1.setViewportView(HospitalAddressTextArea);

        DepartmentLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DepartmentLabel.setText("Department");

        DepartmentComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DepartmentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Emergency Medicine", "Family Medicine", "Internal Medicine", "Laboratory Medicine", "Occupational Health", "Pediatrics", "Preventive Medicine" }));

        PasswordLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PasswordLabel.setText("Password");

        PasswordField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        RegisterButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RegisterButton.setText("Register");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        CancelButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DepartmentLabel)
                            .addComponent(PasswordLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DepartmentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(218, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RegisterLabel)
                                .addGap(127, 127, 127)
                                .addComponent(CancelButton))
                            .addComponent(RegisterButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(HospitalAddressLabel)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(HospitalNameLabel)
                                .addGap(18, 18, 18)
                                .addComponent(HospitalNameTextField))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(ICLabel)
                                .addGap(18, 18, 18)
                                .addComponent(ICTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(NameLabel)
                                .addGap(18, 18, 18)
                                .addComponent(NameTextField)))
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegisterLabel)
                    .addComponent(CancelButton))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ICLabel)
                    .addComponent(ICTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameLabel)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HospitalNameLabel)
                    .addComponent(HospitalNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HospitalAddressLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DepartmentLabel)
                    .addComponent(DepartmentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordLabel)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(RegisterButton)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        // TODO add your handling code here:
        String ic = ICTextField.getText();
        String name = NameTextField.getText();
        String hospitalName = HospitalNameTextField.getText();
        String hospitalAddress = HospitalAddressTextArea.getText();
        String department = DepartmentComboBox.getSelectedItem().toString();
        String password = new String(PasswordField.getPassword());
        String role;
        
        Validation validateID = DataIO.CredentialIO.validateUserID(ic);
        Validation validateName = DataIO.DoctorIO.validateName(name);
        Validation validateHospitalName = DataIO.DoctorIO.validateHospitalName(hospitalName);
        Validation validatePassword = DataIO.CredentialIO.validatePassword(password);
        Validation validateExist = DataIO.CredentialIO.validateExist(ic);
        
        if (!validateID.isValid()) {
            ICTextField.setText("");
            JOptionPane.showMessageDialog(null, validateID.getMessage(), validateID.getMessageType(), JOptionPane.WARNING_MESSAGE);
        }
        else if (!validateName.isValid()) {
            NameTextField.setText("");
            JOptionPane.showMessageDialog(null, validateName.getMessage(), validateName.getMessageType(), JOptionPane.WARNING_MESSAGE);
        }
        else if (!validateHospitalName.isValid()) {
            HospitalNameTextField.setText("");
            JOptionPane.showMessageDialog(null, validateHospitalName.getMessage(), validateHospitalName.getMessageType(), JOptionPane.WARNING_MESSAGE);
        }
        else if (!validatePassword.isValid()) {
            PasswordField.setText("");
            JOptionPane.showMessageDialog(null, validatePassword.getMessage(), validatePassword.getMessageType(), JOptionPane.WARNING_MESSAGE);
        }
        else if (!validateExist.isValid()) {
            ICTextField.setText("");
            JOptionPane.showMessageDialog(null, validateExist.getMessage(), validateExist.getMessageType(), JOptionPane.WARNING_MESSAGE);
        }
        else {
            role = "doctor";
            allCredential.add(new Credential(ic, password, role));
            allDoctor.add(new Doctor(ic, name, hospitalName, hospitalAddress, department, role));
            DataIO.DataIO.writeToFile();
            DataIO.DoctorIO.createKeyPair(ic);
            JOptionPane.showMessageDialog(null, "New doctor has been registered successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            MedicalOfficerMenu medicalOfficerMenu = new MedicalOfficerMenu();
            medicalOfficerMenu.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        // TODO add your handling code here:
        MedicalOfficerMenu medicalOfficerMenu = new MedicalOfficerMenu();
        medicalOfficerMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_CancelButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterDoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JComboBox<String> DepartmentComboBox;
    private javax.swing.JLabel DepartmentLabel;
    private javax.swing.JLabel HospitalAddressLabel;
    private javax.swing.JTextArea HospitalAddressTextArea;
    private javax.swing.JLabel HospitalNameLabel;
    private javax.swing.JTextField HospitalNameTextField;
    private javax.swing.JLabel ICLabel;
    private javax.swing.JTextField ICTextField;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JLabel RegisterLabel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
