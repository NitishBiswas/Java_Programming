
package MainInterface;

import Calculator.GeneralCalculator;
import Library.library;
import Result_Sheet.resultSheet;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Start extends javax.swing.JFrame {

    static int xx,yy;
    public Start() {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon icon = new ImageIcon(getClass().getResource("algorithm.png"));
        this.setIconImage(icon.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calculatorFrame = new javax.swing.JButton();
        minimizeBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        libraryFrame = new javax.swing.JButton();
        resultFrame = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calculatorFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainInterface/cal copy1.jpg"))); // NOI18N
        calculatorFrame.setToolTipText("Calculator");
        calculatorFrame.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calculatorFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorFrameActionPerformed(evt);
            }
        });
        getContentPane().add(calculatorFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 150, 150));

        minimizeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainInterface/minimize final.png"))); // NOI18N
        minimizeBtn.setToolTipText("Minimize");
        minimizeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(minimizeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, -1, -1));

        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainInterface/close final.png"))); // NOI18N
        closeBtn.setToolTipText("Close");
        closeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 153));
        jLabel3.setText("Mission Of Algorithm");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, -1));

        logo.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        logo.setForeground(new java.awt.Color(204, 0, 0));
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainInterface/algorithm (1).png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 29));

        libraryFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainInterface/Library.jpg"))); // NOI18N
        libraryFrame.setToolTipText("Library System");
        libraryFrame.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        libraryFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libraryFrameActionPerformed(evt);
            }
        });
        getContentPane().add(libraryFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 170, 150));

        resultFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainInterface/result-list1.jpg"))); // NOI18N
        resultFrame.setToolTipText("Result List");
        resultFrame.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resultFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultFrameActionPerformed(evt);
            }
        });
        getContentPane().add(resultFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 150, 149));

        updateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainInterface/Update.jpg"))); // NOI18N
        updateBtn.setToolTipText("Update");
        updateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        getContentPane().add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 151, 149));

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 153));
        jLabel2.setText("Map");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainInterface/dhakaBtn.png"))); // NOI18N
        jButton1.setToolTipText("Dhaka Map");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 150, 150));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainInterface/cse1.jpg"))); // NOI18N
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, 560, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "Do you want to close it ?", "Close Window", JOptionPane.YES_NO_OPTION);
        if (x == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Thanks You!");
            System.exit(0);
        }
    }//GEN-LAST:event_closeBtnActionPerformed

    private void minimizeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeBtnActionPerformed
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        JOptionPane.showMessageDialog(null,"The application is already the latest version");
    }//GEN-LAST:event_updateBtnActionPerformed

    private void calculatorFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatorFrameActionPerformed
        new GeneralCalculator().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_calculatorFrameActionPerformed

    private void resultFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultFrameActionPerformed
        new resultSheet().setVisible(true);
        dispose();
    }//GEN-LAST:event_resultFrameActionPerformed

    private void libraryFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libraryFrameActionPerformed
        this.dispose();
        new library().setVisible(true);
    }//GEN-LAST:event_libraryFrameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new Dhaka_Map.DhakaMap().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx, y-yy);
    }//GEN-LAST:event_jLabel1MouseDragged

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculatorFrame;
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton libraryFrame;
    private javax.swing.JLabel logo;
    private javax.swing.JButton minimizeBtn;
    private javax.swing.JButton resultFrame;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
