package Dhaka_Map;

import MainInterface.Start;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DhakaMap extends javax.swing.JFrame {

    private static int n = 16, st, en, INF = 9999, nextNode, m;
    static int xx, yy;
    static String stNode,endNode;

    StringBuilder stringBuilder = new StringBuilder();

    public DhakaMap() {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon icon = new ImageIcon(getClass().getResource("dhaka.png"));
        this.setIconImage(icon.getImage());
        stPoint.setBackground(new java.awt.Color(0, 0, 0, 1));
        endPoint.setBackground(new java.awt.Color(0, 0, 0, 1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        stPoint = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        endPoint = new javax.swing.JTextField();
        goBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        minimizeBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 0));
        jLabel1.setText("Your Location ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        stPoint.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        stPoint.setForeground(new java.awt.Color(0, 255, 255));
        stPoint.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        stPoint.setToolTipText("Your Location");
        getContentPane().add(stPoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 270, 207, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 0));
        jLabel2.setText("Destination");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        endPoint.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        endPoint.setForeground(new java.awt.Color(0, 255, 255));
        endPoint.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        endPoint.setToolTipText("Destination");
        getContentPane().add(endPoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 343, 221, -1));

        goBtn.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        goBtn.setText("GO");
        goBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBtnActionPerformed(evt);
            }
        });
        getContentPane().add(goBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 416, -1, -1));

        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainInterface/close final.png"))); // NOI18N
        closeBtn.setToolTipText("Close");
        closeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 27, -1));

        minimizeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainInterface/minimize final.png"))); // NOI18N
        minimizeBtn.setToolTipText("Minimize");
        minimizeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(minimizeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 28, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("Dhaka Map");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 0, -1, -1));

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Calculator/left-removebg-preview.png"))); // NOI18N
        backBtn.setToolTipText("Back");
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 34, -1));

        text.setEditable(false);
        text.setBackground(new java.awt.Color(51, 51, 51));
        text.setColumns(20);
        text.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        text.setForeground(new java.awt.Color(51, 204, 255));
        text.setRows(5);
        text.setText("  \n Farmgate,           Shewrapara,       Mirpur-10,        Kallayanpur,\n Mirpur-1,             Shamoly,            Gabtoli,            Asadgate, \n Mohammadpur,  Shahbag,           Newmarket,      Gulistan, \n Mohakhali,          Rampura,           Banani");
        jScrollPane1.setViewportView(text);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 550, 156));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dhaka_Map/dhaka_map1.jpg"))); // NOI18N
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
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBtnActionPerformed
        int[][] G = {
            {0, 5, 0, 7, 0, 4, 0, 2, 0, 5, 0, 0, 6, 0, 0, 0},
            {5, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {7, 0, 0, 0, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {4, 0, 0, 4, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {2, 0, 0, 0, 0, 0, 0, 0, 2, 0, 3, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0},
            {5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 8, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 8, 0, 0, 0, 0, 0},
            {6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 9},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 6, 8},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 8, 0, 0}
        };
        stNode = stPoint.getText().toLowerCase();
        endNode = endPoint.getText().toLowerCase();
        
        
        if (stNode.equals("") || endNode.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter Location");
        } else {
            switch (stNode) {
                case "farmgate":
                    st = 0;
                    break;
                case "shewrapara":
                    st = 1;
                    break;
                case "mirpur-10":
                    st = 2;
                    break;
                case "kallayanpur":
                    st = 3;
                    break;
                case "mirpur-1":
                    st = 4;
                    break;
                case "shamoly":
                    st = 5;
                    break;
                case "gabtoli":
                    st = 6;
                    break;
                case "asadgate":
                    st = 7;
                    break;
                case "mohammadpur":
                    st = 8;
                    break;
                case "shahbag":
                    st = 9;
                    break;
                case "newmarket":
                    st = 10;
                    break;
                case "gulistan":
                    st = 11;
                    break;
                case "mohakhali":
                    st = 12;
                    break;
                case "rampura":
                    st = 13;
                    break;
                case "banani":
                    st = 14;
                    break;
                case "jamuna":
                    st = 15;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Wrong Input!");
                    st = -1;
                    break;
            }

            switch (endNode) {
                case "farmgate":
                    en = 0;
                    break;
                case "shewrapara":
                    en = 1;
                    break;
                case "mirpur-10":
                    en = 2;
                    break;
                case "kallayanpur":
                    en = 3;
                    break;
                case "mirpur-1":
                    en = 4;
                    break;
                case "shamoly":
                    en = 5;
                    break;
                case "gabtoli":
                    en = 6;
                    break;
                case "asadgate":
                    en = 7;
                    break;
                case "mohammadpur":
                    en = 8;
                    break;
                case "shahbag":
                    en = 9;
                    break;
                case "newmarket":
                    en = 10;
                    break;
                case "gulistan":
                    en = 11;
                    break;
                case "mohakhali":
                    en = 12;
                    break;
                case "rampura":
                    en = 13;
                    break;
                case "banani":
                    en = 14;
                    break;
                case "jamuna":
                    en = 15;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Wrong Input!");
                    en = -1;
                    break;
            }
            if (en >= 0 && st >= 0) {
                DhakaMap dm = new DhakaMap();
                dm.dhakaMap(G, n, st);
            }
        }
    }//GEN-LAST:event_goBtnActionPerformed

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

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        new Start().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - yy);
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
            java.util.logging.Logger.getLogger(DhakaMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DhakaMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DhakaMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DhakaMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DhakaMap().setVisible(true);
            }
        });
    }

    public void dhakaMap(int[][] G, int n, int startnode) {
        int[][] cost = new int[n][n];
        int[] distance = new int[n];
        int[] pred = new int[n];
        int[] visited = new int[n];
        int count, minDistance;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (G[i][j] == 0) {
                    cost[i][j] = INF;
                } else {
                    cost[i][j] = G[i][j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            distance[i] = cost[startnode][i];
            pred[i] = startnode;
            visited[i] = 0;
        }

        distance[startnode] = 0;
        visited[startnode] = 1;
        count = 1;

        while (count < n - 1) {
            minDistance = INF;

            for (int i = 0; i < n; i++) {
                if (distance[i] < minDistance && visited[i] == 0) {

                    minDistance = distance[i];

                    nextNode = i;

                }
            }

            visited[nextNode] = 1;

            for (int i = 0; i < n; i++) {
                if (visited[i] == 0) {
                    if (minDistance + cost[nextNode][i] < distance[i]) {

                        distance[i] = minDistance + cost[nextNode][i];

                        pred[i] = nextNode;

                    }
                }
            }

            count++;
        }

        for (int i = 0; i < n; i++) {

            int a[] = new int[n];
            if (i != startnode) {
                m = 0;
            }
            {

                if (i != en) {
                    continue;
                }
                stringBuilder.append(stNode.substring(0, 1).toUpperCase()).append(stNode.substring(1)).append("  to  ").append(endNode.substring(0, 1).toUpperCase()).append(endNode.substring(1)).append(" = ").append(distance[i]).append(" km\n\n");

                int j = i;
                a[m] = j;

                do {

                    m++;
                    j = pred[j];
                    a[m] = j;

                } while (j != startnode);

                stringBuilder.append("Path :  ");

                for (int k = m; k >= 0;) {

                    switch (a[k]) {
                        case 0:
                            stringBuilder.append("Farmgate");
                            break;
                        case 1:
                            stringBuilder.append("Shewrapara");
                            break;
                        case 2:
                            stringBuilder.append("Mirpur-10");
                            ;
                            break;
                        case 3:
                            stringBuilder.append("Kallayanpur");
                            break;
                        case 4:
                            stringBuilder.append("Mirpur-1");
                            break;
                        case 5:
                            stringBuilder.append("Shamoly");
                            break;
                        case 6:
                            stringBuilder.append("Gabtoli");
                            break;
                        case 7:
                            stringBuilder.append("Asadgate");
                            break;
                        case 8:
                            stringBuilder.append("Mohammadpur");
                            break;
                        case 9:
                            stringBuilder.append("Shahbag");
                            break;
                        case 10:
                            stringBuilder.append("Newmarket");
                            break;
                        case 11:
                            stringBuilder.append("Gulistan");
                            break;
                        case 12:
                            stringBuilder.append("Mohakhali");
                            break;
                        case 13:
                            stringBuilder.append("Rampura");
                            break;
                        case 14:
                            stringBuilder.append("Banani");
                            break;
                        case 15:
                            stringBuilder.append("Jamuna");
                            break;

                    }
                    k--;
                    if (k >= 0) {
                        stringBuilder.append(" >>> ");
                    } else {
                        String s = stringBuilder.toString();
                        new result(s).setVisible(true);
                        break;
                    }
                }

            }
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton closeBtn;
    private javax.swing.JTextField endPoint;
    private javax.swing.JButton goBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton minimizeBtn;
    private javax.swing.JTextField stPoint;
    private javax.swing.JTextArea text;
    // End of variables declaration//GEN-END:variables
}
