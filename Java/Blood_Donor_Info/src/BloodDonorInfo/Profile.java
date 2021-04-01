/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BloodDonorInfo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Nitish Biswas
 */
public class Profile extends javax.swing.JFrame {

    /**
     * Creates new form Profile
     */
    ConnectionClass cc = new ConnectionClass();
    Connection con;

    void createIcon(){
        ImageIcon icon = new ImageIcon(getClass().getResource("icon.png"));
        this.setIconImage(icon.getImage());
    }
    
    public Profile() {
        initComponents();
        this.setLocationRelativeTo(null);
        con = cc.connector();
        profile();
        createIcon();
       
    }

    void profile() {
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Registration");
            while (rs.next()) {
                String name = rs.getString("FullName");
                String gmail = rs.getString("Gmail");
                String uName = rs.getString("UserName");
                String number = rs.getString("PhoneNumber");
                String gender = rs.getString("Gender");
                nameL.setText(name);
                gmailL.setText(gmail);
                uNameL.setText(uName);
                numberL.setText(number);
                genderL.setText(gender);
            }
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameL = new javax.swing.JLabel();
        gmailL = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        uNameL = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        numberL = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        genderL = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Profile");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Profile");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name : ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        nameL.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        nameL.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(nameL, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 260, 30));

        gmailL.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        gmailL.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(gmailL, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 270, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gmail : ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        uNameL.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        uNameL.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(uNameL, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 280, 30));

        jLabel7.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("UserName : ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        numberL.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        numberL.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(numberL, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 270, 30));

        jLabel9.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Number : ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        genderL.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        genderL.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(genderL, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 190, 30));

        jLabel11.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Gender : ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, 32));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BloodDonorInfo/icons8-back-arrow-48.png"))); // NOI18N
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BloodDonorInfo/icons8-close-window-48.png"))); // NOI18N
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 30, 30));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BloodDonorInfo/icons8-minus-64.png"))); // NOI18N
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 30, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BloodDonorInfo/user-male.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 90, 90));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BloodDonorInfo/profile.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DataTable dt = new DataTable();
        dt.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "Do you want to close it ?", "Close Window", JOptionPane.YES_NO_OPTION);
        if (x == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel genderL;
    private javax.swing.JLabel gmailL;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel nameL;
    private javax.swing.JLabel numberL;
    private javax.swing.JLabel uNameL;
    // End of variables declaration//GEN-END:variables
}
