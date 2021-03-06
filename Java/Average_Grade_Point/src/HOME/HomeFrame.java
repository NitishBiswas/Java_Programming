/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HOME;

/**
 *
 * @author raj
 */

import GPA.GPAFrame;
import CGPA.CGPAFrame;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class HomeFrame extends javax.swing.JFrame {

    /**
     * Creates new form HomeFrame
     */
    GPAFrame gpa = new GPAFrame();
    CGPAFrame cgpa = new CGPAFrame();
    public HomeFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        closeOperation();
        createIcon();
    }

    
    
    private void closeOperation() {
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                int c = JOptionPane.showConfirmDialog(null, "Do you want to close it ?","Close Operation",JOptionPane.YES_NO_OPTION);
                if(c == JOptionPane.YES_OPTION){
                    System.exit(0);
                }
            }
            
        });
    }
    
    
    private void createIcon(){
        ImageIcon icon = new ImageIcon(getClass().getResource("logo.jpg"));
        this.setIconImage(icon.getImage());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GPA = new javax.swing.JButton();
        CGPA = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Home");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GPA.setBackground(new java.awt.Color(153, 255, 153));
        GPA.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        GPA.setForeground(new java.awt.Color(255, 102, 102));
        GPA.setText("GPA");
        GPA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GPAActionPerformed(evt);
            }
        });
        getContentPane().add(GPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 157, -1));

        CGPA.setBackground(new java.awt.Color(255, 102, 102));
        CGPA.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        CGPA.setForeground(new java.awt.Color(153, 255, 153));
        CGPA.setText("CGPA");
        CGPA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CGPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CGPAActionPerformed(evt);
            }
        });
        getContentPane().add(CGPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 160, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HOME/gpa.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GPAActionPerformed
        gpa.setVisible(true);
        dispose();
    }//GEN-LAST:event_GPAActionPerformed

    private void CGPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CGPAActionPerformed
        cgpa.setVisible(true);
        dispose();
    }//GEN-LAST:event_CGPAActionPerformed

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
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CGPA;
    private javax.swing.JButton GPA;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
