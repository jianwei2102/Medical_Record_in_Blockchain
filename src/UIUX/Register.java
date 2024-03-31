/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UIUX;

import Classes.Credential;
import Classes.Patient;
import Classes.Validation;
import static DataIO.DataIO.allCredential;
import static DataIO.DataIO.allPatient;
import javax.swing.JOptionPane;

/**
 *
 * @author xiuha
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
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

        RegistrationLabel = new javax.swing.JLabel();
        ICLabel = new javax.swing.JLabel();
        ICTextField = new javax.swing.JTextField();
        NameLabel = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        DOBLabel = new javax.swing.JLabel();
        DOBTextField = new javax.swing.JTextField();
        GenderLabel = new javax.swing.JLabel();
        GenderMaleRadioButton = new javax.swing.JRadioButton();
        GenderFemaleRadioButton = new javax.swing.JRadioButton();
        AddressLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AddressTextArea = new javax.swing.JTextArea();
        ContactLabel = new javax.swing.JLabel();
        ContactTextField = new javax.swing.JTextField();
        EmergencyContactLabel = new javax.swing.JLabel();
        EmergencyContactTextField = new javax.swing.JTextField();
        PasswordLabel = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        RegisterButton = new javax.swing.JButton();
        LoginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RegistrationLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        RegistrationLabel.setText("Patient Registration");

        ICLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ICLabel.setText("IC");

        ICTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        NameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NameLabel.setText("Name");

        NameTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        DOBLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DOBLabel.setText("Date of Birth");

        DOBTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DOBTextField.setToolTipText("");

        GenderLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        GenderLabel.setText("Gender");

        GenderMaleRadioButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        GenderMaleRadioButton.setText("Male");

        GenderFemaleRadioButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        GenderFemaleRadioButton.setText("Female");

        AddressLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AddressLabel.setText("Address");

        AddressTextArea.setColumns(20);
        AddressTextArea.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        AddressTextArea.setRows(5);
        jScrollPane1.setViewportView(AddressTextArea);

        ContactLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ContactLabel.setText("Contact");

        ContactTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        EmergencyContactLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EmergencyContactLabel.setText("Emergency Contact");

        EmergencyContactTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

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

        LoginButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(AddressLabel)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ICLabel)
                                .addGap(18, 18, 18)
                                .addComponent(ICTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DOBLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(DOBTextField)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NameLabel)
                                .addGap(18, 18, 18)
                                .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(GenderLabel)
                                .addGap(18, 18, 18)
                                .addComponent(GenderMaleRadioButton)
                                .addGap(18, 18, 18)
                                .addComponent(GenderFemaleRadioButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RegistrationLabel)
                        .addGap(125, 125, 125)
                        .addComponent(LoginButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ContactLabel)
                            .addComponent(PasswordLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ContactTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(EmergencyContactLabel))
                            .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(EmergencyContactTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(RegisterButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegistrationLabel)
                    .addComponent(LoginButton))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ICLabel)
                    .addComponent(ICTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameLabel)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DOBLabel)
                    .addComponent(DOBTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GenderLabel)
                    .addComponent(GenderMaleRadioButton)
                    .addComponent(GenderFemaleRadioButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddressLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContactLabel)
                    .addComponent(ContactTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmergencyContactLabel)
                    .addComponent(EmergencyContactTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordLabel)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(RegisterButton)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        // TODO add your handling code here:
        String ic = ICTextField.getText();
        String name = NameTextField.getText();
        String dob = DOBTextField.getText();
        String gender;
        String address = AddressTextArea.getText();
        String contact = ContactTextField.getText();
        String emergencyContact = EmergencyContactTextField.getText();
        String password = new String(PasswordField.getPassword());
        String role = "patient";
        
        Validation validateID = DataIO.CredentialIO.validateUserID(ic);
        Validation validateName = DataIO.PatientIO.validateName(name);
        Validation validateGender = DataIO.PatientIO.validateGender(GenderMaleRadioButton, GenderFemaleRadioButton);
        Validation validateContact = DataIO.PatientIO.validateContact(contact);
        Validation validateEmergencyContact = DataIO.PatientIO.validateEmergencyContact(emergencyContact);
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
        else if (!validateGender.isValid()) {
            JOptionPane.showMessageDialog(null, validateGender.getMessage(), validateGender.getMessageType(), JOptionPane.WARNING_MESSAGE);
        }
        else if (!validateContact.isValid()) {
            ContactTextField.setText("");
            JOptionPane.showMessageDialog(null, validateContact.getMessage(), validateContact.getMessageType(), JOptionPane.WARNING_MESSAGE);
        }
        else if (!validateEmergencyContact.isValid()) {
            EmergencyContactTextField.setText("");
            JOptionPane.showMessageDialog(null, validateEmergencyContact.getMessage(), validateEmergencyContact.getMessageType(), JOptionPane.WARNING_MESSAGE);
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
            gender = GenderMaleRadioButton.isSelected() ? "male" : "female";
            allCredential.add(new Credential(ic, password, role));
            allPatient.add(new Patient(ic, name, dob, gender, address, contact, emergencyContact));
            DataIO.DataIO.writeToFile();
            Login login = new Login();
            login.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_LoginButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JTextArea AddressTextArea;
    private javax.swing.JLabel ContactLabel;
    private javax.swing.JTextField ContactTextField;
    private javax.swing.JLabel DOBLabel;
    private javax.swing.JTextField DOBTextField;
    private javax.swing.JLabel EmergencyContactLabel;
    private javax.swing.JTextField EmergencyContactTextField;
    private javax.swing.JRadioButton GenderFemaleRadioButton;
    private javax.swing.JLabel GenderLabel;
    private javax.swing.JRadioButton GenderMaleRadioButton;
    private javax.swing.JLabel ICLabel;
    private javax.swing.JTextField ICTextField;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JLabel RegistrationLabel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
