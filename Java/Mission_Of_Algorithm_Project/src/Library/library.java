
package Library;

import MainInterface.Start;
import java.awt.print.PrinterException;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class library extends javax.swing.JFrame {

    int i = 0;
    String s, name[];
    StringBuilder stringBuilder = new StringBuilder();
    static int xx,yy;

    public library() {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon icon = new ImageIcon(getClass().getResource("Library.jpg"));
        this.setIconImage(icon.getImage());

        bookText.setBackground(new java.awt.Color(0, 0, 0, 1));
        searchText.setBackground(new java.awt.Color(0, 0, 0, 1));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        minimizeBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        bookText = new javax.swing.JTextField();
        enterBtn = new javax.swing.JButton();
        showBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        res = new javax.swing.JTextArea();
        searchText = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        printBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
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
        getContentPane().add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 34, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 0));
        jLabel1.setText("Digital Library");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 0, -1, -1));

        minimizeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainInterface/minimize final.png"))); // NOI18N
        minimizeBtn.setToolTipText("Minimize");
        minimizeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(minimizeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 28, -1));

        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainInterface/close final.png"))); // NOI18N
        closeBtn.setToolTipText("Close");
        closeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 27, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 0));
        jLabel2.setText("Enter Book Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 72, -1, -1));

        bookText.setBackground(new java.awt.Color(204, 204, 204));
        bookText.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        bookText.setForeground(new java.awt.Color(255, 255, 255));
        bookText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bookText.setToolTipText("Enter Book Name");
        getContentPane().add(bookText, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 70, 246, -1));

        enterBtn.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        enterBtn.setText("Enter");
        enterBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterBtnActionPerformed(evt);
            }
        });
        getContentPane().add(enterBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 137, -1, -1));

        showBtn.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        showBtn.setText("Show");
        showBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBtnActionPerformed(evt);
            }
        });
        getContentPane().add(showBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 137, -1, -1));

        res.setEditable(false);
        res.setBackground(new java.awt.Color(0, 0, 0));
        res.setColumns(20);
        res.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        res.setForeground(new java.awt.Color(255, 255, 255));
        res.setRows(5);
        jScrollPane1.setViewportView(res);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 197, 478, 237));

        searchText.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        searchText.setForeground(new java.awt.Color(255, 255, 255));
        searchText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchText.setToolTipText("Search book");
        getContentPane().add(searchText, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 455, 253, -1));

        searchBtn.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 452, -1, -1));

        printBtn.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        printBtn.setText("Print");
        printBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        printBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBtnActionPerformed(evt);
            }
        });
        getContentPane().add(printBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 452, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library/book2.jpg"))); // NOI18N
        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel3MouseDragged(evt);
            }
        });
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, -1));

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
        if (!(bookText.getText().isEmpty())) {
            stringBuilder.append(bookText.getText()).append(" ");
            JOptionPane.showMessageDialog(null, bookText.getText() + " Book Inserted!");
            bookText.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Please Enter Book Name!");
        }
    }//GEN-LAST:event_enterBtnActionPerformed

    private void showBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBtnActionPerformed
        int len = stringBuilder.length();
        if (len > 0) {
            s = stringBuilder.toString();
            name = s.split(" ");
            Arrays.sort(name);
            for (String n : name) {
                res.append(n + "\n");
            }
            enterBtn.setEnabled(false);
            showBtn.setEnabled(false);
            bookText.setEditable(false);
        } else {
            JOptionPane.showMessageDialog(null, "Library Is Empty!");
        }
    }//GEN-LAST:event_showBtnActionPerformed

    private void printBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBtnActionPerformed
        try {
            res.print();
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(null, "Printer not found");
        }
    }//GEN-LAST:event_printBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        String searchBook = searchText.getText();
        if (!(searchBook.isEmpty())) {
            if (!(res.getText().isEmpty())) {
                boolean b = s.toLowerCase().contains(searchBook.toLowerCase());
                if (b) {
                    JOptionPane.showMessageDialog(null, searchBook + " book is avaiable in our library !");
                    searchText.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Sorry! " + searchBook + " book is Out of Stock !");
                    searchText.setText("");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Library Is Empty!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please Enter your book name!");
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx, y-yy);
    }//GEN-LAST:event_jLabel3MouseDragged

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new library().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField bookText;
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton enterBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton minimizeBtn;
    private javax.swing.JButton printBtn;
    private javax.swing.JTextArea res;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchText;
    private javax.swing.JButton showBtn;
    // End of variables declaration//GEN-END:variables
}
