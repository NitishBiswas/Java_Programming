
package Result_Sheet;

import MainInterface.Start;
import java.awt.print.PrinterException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class resultSheet extends javax.swing.JFrame {

    StringBuilder str1 = new StringBuilder();
    StringBuilder str2 = new StringBuilder();
    static int xx,yy;

    String s, r;

    public resultSheet() {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon icon = new ImageIcon(getClass().getResource("resultI.png"));
        this.setIconImage(icon.getImage());
        
        nameText.setBackground(new java.awt.Color(0, 0, 0, 1));
        cgpaText.setBackground(new java.awt.Color(0, 0, 0, 1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        minimizeBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        cgpaText = new javax.swing.JTextField();
        enterBtn = new javax.swing.JButton();
        showBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        res = new javax.swing.JTextArea();
        printBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Calculator/left-removebg-preview.png"))); // NOI18N
        backBtn.setToolTipText("Back");
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 43, 37));

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Results Sheet");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 166, 37));

        minimizeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainInterface/minimize final.png"))); // NOI18N
        minimizeBtn.setToolTipText("Minimize");
        minimizeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(minimizeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 46, 37));

        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainInterface/close final.png"))); // NOI18N
        closeBtn.setToolTipText("Close");
        closeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 44, 37));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("Enter Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("Enter CGPA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        nameText.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        nameText.setForeground(new java.awt.Color(0, 255, 255));
        nameText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameText.setToolTipText("Enter Name");
        getContentPane().add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 226, -1));

        cgpaText.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        cgpaText.setForeground(new java.awt.Color(0, 255, 255));
        cgpaText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cgpaText.setToolTipText("Enter CGPA");
        getContentPane().add(cgpaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 226, -1));

        enterBtn.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        enterBtn.setText("Enter");
        enterBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterBtnActionPerformed(evt);
            }
        });
        getContentPane().add(enterBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        showBtn.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        showBtn.setText("Show");
        showBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBtnActionPerformed(evt);
            }
        });
        getContentPane().add(showBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

        res.setEditable(false);
        res.setBackground(new java.awt.Color(0, 0, 0));
        res.setColumns(20);
        res.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        res.setForeground(new java.awt.Color(255, 255, 255));
        res.setRows(5);
        jScrollPane1.setViewportView(res);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 470, 220));

        printBtn.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        printBtn.setText("Print");
        printBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        printBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBtnActionPerformed(evt);
            }
        });
        getContentPane().add(printBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Result_Sheet/ed1.jpg"))); // NOI18N
        jLabel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel4MouseDragged(evt);
            }
        });
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        new Start().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void minimizeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeBtnActionPerformed
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeBtnActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "Do you want to close it ?", "Close Window", JOptionPane.YES_NO_OPTION);
        if (x == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Thanks You!");
            System.exit(0);
        }
    }//GEN-LAST:event_closeBtnActionPerformed

    private void enterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterBtnActionPerformed
        if (!(nameText.getText().isEmpty() || cgpaText.getText().isEmpty())) {
            str1.append(nameText.getText()).append(" ");
            str2.append(cgpaText.getText()).append(" ");
            JOptionPane.showMessageDialog(null, "Name & CGPA Inserted!");
            nameText.setText("");
            cgpaText.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Please Enter Name & CGPA!");
        }
    }//GEN-LAST:event_enterBtnActionPerformed

    private void showBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBtnActionPerformed
        if (str1.length() > 0) {
            s = str1.toString();
            r = str2.toString();
            String name[] = s.split(" ");
            String cgpa[] = r.split(" ");
            double re[] = new double[cgpa.length];
            for (int i = 0; i < cgpa.length; i++) {
                re[i] = Double.parseDouble(cgpa[i]);
            }

            double temp;
            String t;
            for (int i = 0; i < cgpa.length; i++) {
                for (int j = i + 1; j < cgpa.length; j++) {
                    if (re[i] > re[j]) {
                        temp = re[i];
                        re[i] = re[j];
                        re[j] = temp;
                        t = name[i];
                        name[i] = name[j];
                        name[j] = t;
                    }
                }
            }
            res.append(" Roll\t Name \t CGPA\n");
            int c = 1;
            for (int i = cgpa.length - 1; i >= 0; i--) {
                res.append("  " + c++ + "\t" + name[i] + "\t" + "  " + re[i] + "\n\n");
            }
            enterBtn.setEnabled(false);
            showBtn.setEnabled(false);
            nameText.setEditable(false);
            cgpaText.setEditable(false);
        } else {
            JOptionPane.showMessageDialog(null, "Result Sheet Is Empty!");
        }
    }//GEN-LAST:event_showBtnActionPerformed

    private void printBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBtnActionPerformed
        try {
            res.print();
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(null, "Printer not found");
        }
    }//GEN-LAST:event_printBtnActionPerformed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx, y-yy);
    }//GEN-LAST:event_jLabel4MouseDragged

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(resultSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resultSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resultSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resultSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resultSheet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField cgpaText;
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton enterBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton minimizeBtn;
    private javax.swing.JTextField nameText;
    private javax.swing.JButton printBtn;
    private javax.swing.JTextArea res;
    private javax.swing.JButton showBtn;
    // End of variables declaration//GEN-END:variables
}
