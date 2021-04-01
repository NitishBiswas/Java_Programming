
package Length_Calculator;

import General_Calculator.GeneralCalculator;
import Age_Calculator.AgeCalculator;
import Information.Info;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class LengthCalculator extends javax.swing.JFrame {


    private int i = 0;

    GeneralCalculator gc = new GeneralCalculator();

    public LengthCalculator() {
        initComponents();
        this.setLocationRelativeTo(null);
        createIcon();
        closeOperation();
    }

    private void closeOperation() {
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                int close = JOptionPane.showConfirmDialog(null, "Do you want to close this Calculator ?", "Close Operation", JOptionPane.YES_NO_OPTION);
                if (close == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }

        });
    }

    private void checkCalculator() {
        int i = choiceCalculator.getSelectedIndex();
        if (i == 0) {
            gc.setVisible(true);
            this.dispose();
        }else if(i == 2){
            new AgeCalculator().setVisible(true);
            this.dispose();
        }else if(i == 3){
            new Info().setVisible(true);
            this.dispose();
        }
    }

    private void createIcon() {
        ImageIcon icon = new ImageIcon(getClass().getResource("calculator.png"));
        this.setIconImage(icon.getImage());
    }

    private void calculation() {
        int selectLength = lengthMeter.getSelectedIndex();
        double lengthValue = Double.parseDouble(dataNumberTF.getText());
        switch (selectLength) {
            case 0:
                resultTF.setText(String.valueOf(String.format("%.3f", lengthValue / 1000.0)));
                break;
            case 1:
                resultTF.setText(String.valueOf(String.format("%.6f", lengthValue / 1000000.0)));
                break;
            case 2:
                resultTF.setText(String.valueOf(String.format("%.7f", lengthValue / 10000000.0)));
                break;
            case 3:
                resultTF.setText(String.valueOf(String.format("%.9f", lengthValue / 1000000000.0)));
                break;
            case 4:
                resultTF.setText(String.valueOf(String.format("%.12f", lengthValue / 1000000000000.0)));
                break;

            case 6:
                resultTF.setText(String.valueOf(String.format("%.2f", lengthValue * 1000.0)));
                break;
            case 7:
                resultTF.setText(String.valueOf(String.format("%.3f", lengthValue / 1000.0)));
                break;
            case 8:
                resultTF.setText(String.valueOf(String.format("%.4f", lengthValue / 10000.0)));
                break;
            case 9:
                resultTF.setText(String.valueOf(String.format("%.6f", lengthValue / 1000000.0)));
                break;
            case 10:
                resultTF.setText(String.valueOf(String.format("%.9f", lengthValue / 1000000000.0)));
                break;

            case 12:
                resultTF.setText(String.valueOf(String.format("%.2f", lengthValue * 1000000.0)));
                break;
            case 13:
                resultTF.setText(String.valueOf(String.format("%.2f", lengthValue * 1000.0)));
                break;
            case 14:
                resultTF.setText(String.valueOf(String.format("%.2f", lengthValue / 10.0)));
                break;
            case 15:
                resultTF.setText(String.valueOf(String.format("%.3f", lengthValue / 1000.0)));
                break;
            case 16:
                resultTF.setText(String.valueOf(String.format("%.6f", lengthValue / 1000000.0)));
                break;

            case 18:
                resultTF.setText(String.valueOf(String.format("%.2f", lengthValue * 10000000.0)));
                break;
            case 19:
                resultTF.setText(String.valueOf(String.format("%.2f", lengthValue * 10000.0)));
                break;
            case 20:
                resultTF.setText(String.valueOf(String.format("%.2f", lengthValue * 10.0)));
                break;
            case 21:
                resultTF.setText(String.valueOf(String.format("%.2f", lengthValue / 100.0)));
                break;
            case 22:
                resultTF.setText(String.valueOf(String.format("%.5f", lengthValue / 100000.0)));
                break;

            case 24:
                resultTF.setText(String.valueOf(String.format("%.2f", lengthValue * 1000000000.0)));
                break;
            case 25:
                resultTF.setText(String.valueOf(String.format("%.2f", lengthValue * 1000000.0)));
                break;
            case 26:
                resultTF.setText(String.valueOf(String.format("%.2f", lengthValue * 1000.0)));
                break;
            case 27:
                resultTF.setText(String.valueOf(String.format("%.2f", lengthValue * 100.0)));
                break;
            case 28:
                resultTF.setText(String.valueOf(String.format("%.3f", lengthValue / 1000.0)));
                break;

            case 30:
                resultTF.setText(String.valueOf(String.format("%.2f", lengthValue * 1000000000000.0)));
                break;
            case 31:
                resultTF.setText(String.valueOf(String.format("%.2f", lengthValue * 1000000000.0)));
                break;
            case 32:
                resultTF.setText(String.valueOf(String.format("%.2f", lengthValue * 1000000.0)));
                break;
            case 33:
                resultTF.setText(String.valueOf(String.format("%.2f", lengthValue * 100000.0)));
                break;
            case 34:
                resultTF.setText(String.valueOf(String.format("%.2f", lengthValue * 1000.0)));
                break;
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        choiceCalculator = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dataNumberTF = new javax.swing.JTextField();
        resultTF = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        acBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        sevenBtn = new javax.swing.JButton();
        eightBtn = new javax.swing.JButton();
        nineBtn = new javax.swing.JButton();
        fourBtn = new javax.swing.JButton();
        fiveBtn = new javax.swing.JButton();
        sixBtn = new javax.swing.JButton();
        oneBtn = new javax.swing.JButton();
        twoBtn = new javax.swing.JButton();
        zeroBtn = new javax.swing.JButton();
        threeBtn = new javax.swing.JButton();
        dotBtn = new javax.swing.JButton();
        lengthMeter = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Calculators");
        setResizable(false);

        choiceCalculator.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        choiceCalculator.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General Calculator", "Length Calculator", "Age Calculator", "Information" }));
        choiceCalculator.setSelectedIndex(1);
        choiceCalculator.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        choiceCalculator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceCalculatorActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel1.setText("Enter Number");

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel2.setText("Result");

        dataNumberTF.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        dataNumberTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dataNumberTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dataNumberTFKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dataNumberTFKeyReleased(evt);
            }
        });

        resultTF.setEditable(false);
        resultTF.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        resultTF.setForeground(new java.awt.Color(255, 0, 51));
        resultTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataNumberTF)
                    .addComponent(resultTF))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addComponent(resultTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        acBtn.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        acBtn.setText("AC");
        acBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        acBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        backBtn.setText("←");
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        sevenBtn.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        sevenBtn.setText("7");
        sevenBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sevenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenBtnActionPerformed(evt);
            }
        });

        eightBtn.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        eightBtn.setText("8");
        eightBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightBtnActionPerformed(evt);
            }
        });

        nineBtn.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        nineBtn.setText("9");
        nineBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineBtnActionPerformed(evt);
            }
        });

        fourBtn.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        fourBtn.setText("4");
        fourBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fourBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourBtnActionPerformed(evt);
            }
        });

        fiveBtn.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        fiveBtn.setText("5");
        fiveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fiveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveBtnActionPerformed(evt);
            }
        });

        sixBtn.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        sixBtn.setText("6");
        sixBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sixBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixBtnActionPerformed(evt);
            }
        });

        oneBtn.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        oneBtn.setText("1");
        oneBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        oneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneBtnActionPerformed(evt);
            }
        });

        twoBtn.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        twoBtn.setText("2");
        twoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        twoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoBtnActionPerformed(evt);
            }
        });

        zeroBtn.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        zeroBtn.setText("0");
        zeroBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        zeroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroBtnActionPerformed(evt);
            }
        });

        threeBtn.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        threeBtn.setText("3");
        threeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        threeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeBtnActionPerformed(evt);
            }
        });

        dotBtn.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        dotBtn.setText(".");
        dotBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dotBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sevenBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(oneBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                        .addComponent(fourBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(acBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(eightBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(fiveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(twoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(zeroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(threeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sixBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nineBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(backBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)))
                    .addComponent(dotBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sevenBtn)
                    .addComponent(nineBtn)
                    .addComponent(eightBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fourBtn)
                    .addComponent(fiveBtn)
                    .addComponent(sixBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oneBtn)
                    .addComponent(twoBtn)
                    .addComponent(threeBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zeroBtn)
                    .addComponent(dotBtn)
                    .addComponent(acBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lengthMeter.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lengthMeter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nano Meters - Micro Meters", "Nano Meters - Mili Meters", "Nano Meters - Centi Meters", "Nano Meters - Meters", "Nano Meters - Kilo Meters", " ", "Micro Meters - Nano Meters", "Micro Meters - Mili Meters", "Micro Meters - Centi Meters", "Micro Meters - Meters", "Micro Meters - Kilo Meters", " ", "Mili Meters - Nano Meters", "Mili Meters - Micro Meters", "Mili Meters - Centi Meters", "Mili Meters - Meters", "Mili Meters - Kilo Meters", " ", "Centi Meters - Nano Meters", "Centi Meters - Micro Meters", "Centi Meters - Mili Meters", "Centi Meters - Meters", "Centi Meters - Kilo Meters", " ", "Meters - Nano Meters", "Meters - Micro Meters", "Meters - Mili Meters", "Meters - Centi Meters", "Meters - Kilo Meters", " ", "Kilo Meters - Nano Meters", "Kilo Meters - Micro Meters", "Kilo Meters - Mili Meters", "Kilo Meters - Centi Meters", "Kilo Meters - Meters" }));
        lengthMeter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lengthMeterActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 0));
        jLabel3.setText("N");
        jLabel3.setToolTipText("Nitish Biswas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(choiceCalculator, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lengthMeter, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(choiceCalculator, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lengthMeter, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void acBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acBtnActionPerformed
        dataNumberTF.setText("");
        resultTF.setText("");
    }//GEN-LAST:event_acBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        String backspace = null;
        if (dataNumberTF.getText().length() > 0) {
            StringBuilder strB = new StringBuilder(dataNumberTF.getText());
            strB.deleteCharAt(dataNumberTF.getText().length() - 1);
            backspace = strB.toString();
            dataNumberTF.setText(backspace);
        }
        resultTF.setText("");
        if (dataNumberTF.getText().length() > 0) {
            calculation();
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void sevenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenBtnActionPerformed
        String seven = dataNumberTF.getText() + sevenBtn.getText();
        dataNumberTF.setText(seven);
        calculation();
    }//GEN-LAST:event_sevenBtnActionPerformed

    private void eightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightBtnActionPerformed
        String eight = dataNumberTF.getText() + eightBtn.getText();
        dataNumberTF.setText(eight);
        calculation();
    }//GEN-LAST:event_eightBtnActionPerformed

    private void nineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineBtnActionPerformed
        String nine = dataNumberTF.getText() + nineBtn.getText();
        dataNumberTF.setText(nine);
        calculation();
    }//GEN-LAST:event_nineBtnActionPerformed

    private void fourBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourBtnActionPerformed
        String four = dataNumberTF.getText() + fourBtn.getText();
        dataNumberTF.setText(four);
        calculation();
    }//GEN-LAST:event_fourBtnActionPerformed

    private void fiveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveBtnActionPerformed
        String five = dataNumberTF.getText() + fiveBtn.getText();
        dataNumberTF.setText(five);
        calculation();
    }//GEN-LAST:event_fiveBtnActionPerformed

    private void sixBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixBtnActionPerformed
        String six = dataNumberTF.getText() + sixBtn.getText();
        dataNumberTF.setText(six);
        calculation();
    }//GEN-LAST:event_sixBtnActionPerformed

    private void oneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneBtnActionPerformed
        String one = dataNumberTF.getText() + oneBtn.getText();
        dataNumberTF.setText(one);
        calculation();
    }//GEN-LAST:event_oneBtnActionPerformed

    private void twoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoBtnActionPerformed
        String two = dataNumberTF.getText() + twoBtn.getText();
        dataNumberTF.setText(two);
        calculation();
    }//GEN-LAST:event_twoBtnActionPerformed

    private void zeroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroBtnActionPerformed
        String zero = dataNumberTF.getText() + zeroBtn.getText();
        dataNumberTF.setText(zero);
        calculation();
    }//GEN-LAST:event_zeroBtnActionPerformed

    private void threeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeBtnActionPerformed
        String three = dataNumberTF.getText() + threeBtn.getText();
        dataNumberTF.setText(three);
        calculation();
    }//GEN-LAST:event_threeBtnActionPerformed

    private void dotBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotBtnActionPerformed
        if (!(String.valueOf(dataNumberTF.getText()).contains("."))) {
            String dot = dataNumberTF.getText() + dotBtn.getText();
            dataNumberTF.setText(dot);
        }

    }//GEN-LAST:event_dotBtnActionPerformed

    private void choiceCalculatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceCalculatorActionPerformed
        checkCalculator();
    }//GEN-LAST:event_choiceCalculatorActionPerformed

    private void dataNumberTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dataNumberTFKeyPressed

    }//GEN-LAST:event_dataNumberTFKeyPressed

    private void dataNumberTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dataNumberTFKeyReleased
        String back = null;
        char ch = evt.getKeyChar();
        if (Character.isDigit(ch)) {
            calculation();
        } else {
            if (Character.isAlphabetic(ch)) {
                JOptionPane.showMessageDialog(null, "Alphabet not allowed!");
            } else {
                JOptionPane.showMessageDialog(null, "Space not allowed!");
            }
            if(dataNumberTF.getText().equals(" ")){
                dataNumberTF.setText("");
            }else{
                StringBuilder strB = new StringBuilder(dataNumberTF.getText());
                strB.deleteCharAt(dataNumberTF.getText().length() - 1);
                back = strB.toString();
                dataNumberTF.setText(back);
            }
        }
    }//GEN-LAST:event_dataNumberTFKeyReleased

    private void lengthMeterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthMeterActionPerformed
        if(!(dataNumberTF.getText().equals(""))){
            calculation();
        }
    }//GEN-LAST:event_lengthMeterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox<String> choiceCalculator;
    private javax.swing.JTextField dataNumberTF;
    private javax.swing.JButton dotBtn;
    private javax.swing.JButton eightBtn;
    private javax.swing.JButton fiveBtn;
    private javax.swing.JButton fourBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox<String> lengthMeter;
    private javax.swing.JButton nineBtn;
    private javax.swing.JButton oneBtn;
    private javax.swing.JTextField resultTF;
    private javax.swing.JButton sevenBtn;
    private javax.swing.JButton sixBtn;
    private javax.swing.JButton threeBtn;
    private javax.swing.JButton twoBtn;
    private javax.swing.JButton zeroBtn;
    // End of variables declaration//GEN-END:variables
}
