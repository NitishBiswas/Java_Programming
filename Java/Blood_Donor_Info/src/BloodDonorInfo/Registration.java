package BloodDonorInfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Registration extends javax.swing.JFrame {

    Connection con;
    ConnectionClass cc = new ConnectionClass();

    void createIcon(){
        ImageIcon icon = new ImageIcon(getClass().getResource("icon.png"));
        this.setIconImage(icon.getImage());
    }
    
    public Registration() {
        initComponents();
        this.setLocationRelativeTo(null);
        con = cc.connector();
        createIcon();
    }

    void dis() {
        Login lg = new Login();
        lg.setVisible(true);
        this.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        fName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        uName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pass1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        mail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        num = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pass2 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        showPass = new javax.swing.JCheckBox();
        invalid = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Registration");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Full Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 76, -1, -1));

        fName.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        fName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(fName, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 74, 143, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 142, -1, -1));

        uName.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        uName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        uName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uNameKeyTyped(evt);
            }
        });
        getContentPane().add(uName, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 140, 141, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 196, -1, -1));

        pass1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        pass1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 194, 144, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gmail");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 76, -1, -1));

        mail.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        mail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mailKeyTyped(evt);
            }
        });
        getContentPane().add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 74, 140, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Number");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 142, -1, -1));

        num.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        num.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformed(evt);
            }
        });
        num.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numKeyTyped(evt);
            }
        });
        getContentPane().add(num, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 140, 138, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("RePassword");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 196, -1, -1));

        pass2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        pass2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pass2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pass2FocusLost(evt);
            }
        });
        pass2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pass2KeyTyped(evt);
            }
        });
        getContentPane().add(pass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 194, 138, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Gender");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 252, -1, -1));

        gender.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 140, -1));

        jButton1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BloodDonorInfo/icons8-submit-progress-48.png"))); // NOI18N
        jButton1.setText("Submit");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, -1, -1));

        jButton2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BloodDonorInfo/icons8-reset-48.png"))); // NOI18N
        jButton2.setText("Reset");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Registration Form");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, -1));

        showPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassActionPerformed(evt);
            }
        });
        getContentPane().add(showPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));

        invalid.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        invalid.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(invalid, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 70, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BloodDonorInfo/icons8-back-arrow-48.png"))); // NOI18N
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BloodDonorInfo/icons8-close-window-48.png"))); // NOI18N
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 30, 30));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BloodDonorInfo/icons8-minus-64.png"))); // NOI18N
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 30, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BloodDonorInfo/reg.jpeg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numActionPerformed

    }//GEN-LAST:event_numActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Statement st = con.createStatement();
            boolean checkTab = st.execute("SELECT COUNT(*) FROM Registration");
            if (!checkTab) {
                String name = fName.getText();
                String gmail = mail.getText();
                String userName = uName.getText();
                String number = num.getText();
                String pass = pass2.getText();
                String sex = null;
                if (name.equals("") || gmail.equals("") || userName.equals("") || number.equals("") || pass.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please complete this form !");

                } else {
                    int g = gender.getSelectedIndex();
                    if (g == 0) {
                        sex = "Male";
                    } else {
                        sex = "Female";
                    }
                    PreparedStatement pst = con.prepareStatement("INSERT INTO Registration VALUES(?,?,?,?,?,?)");
                    pst.setString(1, name);
                    pst.setString(2, gmail);
                    pst.setString(3, userName);
                    pst.setString(4, number);
                    pst.setString(5, pass);
                    pst.setString(6, sex);
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Registration completed");
                    pst.close();
                    this.dis();
                }
            } else {
                String name = fName.getText();
                String gmail = mail.getText();
                String userName = uName.getText();
                String number = num.getText();
                String pass = pass2.getText();
                String sex = null;
                if (name.equals("") || gmail.equals("") || userName.equals("") || number.equals("") || pass.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Complete This Form !");
                } else {
                    int lost = JOptionPane.showConfirmDialog(null, "Do you want to create another account ?\n[Warning : Your previous data will be deleted !]", "Warning", JOptionPane.YES_NO_OPTION);
                    if (lost == JOptionPane.YES_OPTION) {
                        Statement stmt = con.createStatement();
                        stmt.execute("DELETE FROM Registration WHERE true");
                        stmt.close();
                        Statement dataTable = con.createStatement();
                        dataTable.execute("DELETE FROM DonorInfo WHERE true");
                        stmt.close();
                        int g = gender.getSelectedIndex();
                        if (g == 0) {
                            sex = "Male";
                        } else {
                            sex = "Female";
                        }
                        PreparedStatement pst = con.prepareStatement("INSERT INTO Registration VALUES(?,?,?,?,?,?)");
                        pst.setString(1, name);
                        pst.setString(2, gmail);
                        pst.setString(3, userName);
                        pst.setString(4, number);
                        pst.setString(5, pass);
                        pst.setString(6, sex);
                        pst.execute();
                        JOptionPane.showMessageDialog(null, "Registration Completed");
                        pst.close();
                        this.dis();
                    }

                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void showPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassActionPerformed
        if (showPass.isSelected()) {
            pass1.setEchoChar((char) 0);
            pass2.setEchoChar((char) 0);
        } else {
            pass1.setEchoChar('*');
            pass2.setEchoChar('*');
        }
    }//GEN-LAST:event_showPassActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        fName.setText("");
        uName.setText("");
        mail.setText("");
        num.setText("");
        pass1.setText("");
        pass2.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void pass2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pass2KeyTyped

    }//GEN-LAST:event_pass2KeyTyped

    private void pass2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass2FocusLost
        if (!pass1.getText().equals(pass2.getText())) {
            JOptionPane.showMessageDialog(null, "Password Does Not Match !");
            pass1.setText("");
            pass2.setText("");
        }
    }//GEN-LAST:event_pass2FocusLost

    private void uNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uNameKeyTyped
        char un = evt.getKeyChar();
        if (!Character.isAlphabetic(un)) {
            evt.consume();
        }
    }//GEN-LAST:event_uNameKeyTyped

    private void numKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numKeyTyped
        char nm = evt.getKeyChar();
        if (!Character.isDigit(nm)) {
            evt.consume();
        }
    }//GEN-LAST:event_numKeyTyped

    private void mailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mailKeyTyped

    }//GEN-LAST:event_mailKeyTyped

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "Do you want to close it ?", "Close Window", JOptionPane.YES_NO_OPTION);
        if (x == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dis();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fName;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel invalid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField num;
    private javax.swing.JPasswordField pass1;
    private javax.swing.JPasswordField pass2;
    private javax.swing.JCheckBox showPass;
    private javax.swing.JTextField uName;
    // End of variables declaration//GEN-END:variables
}
