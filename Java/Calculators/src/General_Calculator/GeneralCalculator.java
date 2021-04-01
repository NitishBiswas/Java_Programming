
package General_Calculator;

import Length_Calculator.LengthCalculator;
import Age_Calculator.AgeCalculator;
import Information.Info;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class GeneralCalculator extends javax.swing.JFrame {

    private double fristNumber;
    private double secondNumber;
    private double result;
    private String operations;
    private int count = 1;
    private int minus = 0;
    

    public GeneralCalculator() {
        initComponents();
        this.setLocationRelativeTo(null);
        createIcon();
        closeOperation();
    }

    private void checkCalculator() {
        int i = choiceCalculator.getSelectedIndex();
        if (i == 1) {
            new LengthCalculator().setVisible(true);
            this.dispose();
        }else if(i == 2){
            new AgeCalculator().setVisible(true);
            this.dispose();
        }else if(i == 3){
            new Info().setVisible(true);
            this.dispose();
        }
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

    private void createIcon() {
        ImageIcon icon = new ImageIcon(getClass().getResource("calculator.png"));
        this.setIconImage(icon.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        choiceCalculator = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        dataTF = new javax.swing.JTextField();
        resultTF = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        acBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        oneByXBtn = new javax.swing.JButton();
        x2Btn = new javax.swing.JButton();
        persentBtn = new javax.swing.JButton();
        divisionBtn = new javax.swing.JButton();
        sevenBtn = new javax.swing.JButton();
        eightBtn = new javax.swing.JButton();
        nineBtn = new javax.swing.JButton();
        multiBtn = new javax.swing.JButton();
        fourBtn = new javax.swing.JButton();
        fiveBtn = new javax.swing.JButton();
        sixBtn = new javax.swing.JButton();
        minusBtn = new javax.swing.JButton();
        plusMinusBtn = new javax.swing.JButton();
        oneBtn = new javax.swing.JButton();
        twoBtn = new javax.swing.JButton();
        zeroBtn = new javax.swing.JButton();
        threeBtn = new javax.swing.JButton();
        dotBtn = new javax.swing.JButton();
        plusBtn = new javax.swing.JButton();
        equalBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Calculators");
        setResizable(false);

        choiceCalculator.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        choiceCalculator.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General Calculator", "Length Calculator", "Age Calculator", "Information" }));
        choiceCalculator.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        choiceCalculator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceCalculatorActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(208, 205, 244));

        dataTF.setEditable(false);
        dataTF.setBackground(new java.awt.Color(208, 205, 244));
        dataTF.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        dataTF.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        dataTF.setBorder(null);

        resultTF.setBackground(new java.awt.Color(208, 205, 244));
        resultTF.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        resultTF.setForeground(new java.awt.Color(255, 0, 51));
        resultTF.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        resultTF.setBorder(null);
        resultTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultTFMouseClicked(evt);
            }
        });
        resultTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                resultTFKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(dataTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addComponent(resultTF, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dataTF, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultTF, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        oneByXBtn.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        oneByXBtn.setText("1/x");
        oneByXBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        oneByXBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneByXBtnActionPerformed(evt);
            }
        });

        x2Btn.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        x2Btn.setText("x^2");
        x2Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        x2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x2BtnActionPerformed(evt);
            }
        });

        persentBtn.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        persentBtn.setText("%");
        persentBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        persentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                persentBtnActionPerformed(evt);
            }
        });

        divisionBtn.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        divisionBtn.setText("÷");
        divisionBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        divisionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionBtnActionPerformed(evt);
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

        multiBtn.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        multiBtn.setText("X");
        multiBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        multiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiBtnActionPerformed(evt);
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

        minusBtn.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        minusBtn.setText("-");
        minusBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusBtnActionPerformed(evt);
            }
        });

        plusMinusBtn.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        plusMinusBtn.setText("±");
        plusMinusBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plusMinusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusMinusBtnActionPerformed(evt);
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

        plusBtn.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        plusBtn.setText("+");
        plusBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusBtnActionPerformed(evt);
            }
        });

        equalBtn.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        equalBtn.setText("=");
        equalBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        equalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(acBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(oneBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(plusMinusBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fourBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(oneByXBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(sevenBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(twoBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fiveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eightBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(zeroBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(x2Btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(threeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sixBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(minusBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(plusBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(0, 1, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(nineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                        .addComponent(multiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(persentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                                .addGap(22, 22, 22))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(dotBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(23, 23, 23)))
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(divisionBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(equalBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))))))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acBtn)
                    .addComponent(backBtn))
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oneByXBtn)
                    .addComponent(x2Btn)
                    .addComponent(persentBtn)
                    .addComponent(divisionBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sevenBtn)
                    .addComponent(nineBtn)
                    .addComponent(multiBtn)
                    .addComponent(eightBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fourBtn)
                    .addComponent(fiveBtn)
                    .addComponent(sixBtn)
                    .addComponent(minusBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oneBtn)
                    .addComponent(twoBtn)
                    .addComponent(threeBtn)
                    .addComponent(plusBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plusMinusBtn)
                    .addComponent(zeroBtn)
                    .addComponent(dotBtn)
                    .addComponent(equalBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 0));
        jLabel1.setText("N");
        jLabel1.setToolTipText("Nitish Biswas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(choiceCalculator, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(choiceCalculator, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void resultTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultTFMouseClicked
        
    }//GEN-LAST:event_resultTFMouseClicked

    private void nineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineBtnActionPerformed
        String nine = resultTF.getText() + nineBtn.getText();
        resultTF.setText(nine);
    }//GEN-LAST:event_nineBtnActionPerformed

    private void minusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusBtnActionPerformed
        if (!(resultTF.getText().equals(""))) {
            String data = resultTF.getText() + " " + minusBtn.getText();
            dataTF.setText(data);
            fristNumber = Double.parseDouble(resultTF.getText());
            resultTF.setText("");
            operations = "-";
        }
    }//GEN-LAST:event_minusBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        String backspace = null;

        if (resultTF.getText().length() > 0) {
            StringBuilder strB = new StringBuilder(resultTF.getText());
            strB.deleteCharAt(resultTF.getText().length() - 1);
            backspace = strB.toString();
            resultTF.setText(backspace);
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void sevenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenBtnActionPerformed
        String seven = resultTF.getText() + sevenBtn.getText();
        resultTF.setText(seven);
    }//GEN-LAST:event_sevenBtnActionPerformed

    private void eightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightBtnActionPerformed
        String eight = resultTF.getText() + eightBtn.getText();
        resultTF.setText(eight);
    }//GEN-LAST:event_eightBtnActionPerformed

    private void acBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acBtnActionPerformed
        dataTF.setText("");
        resultTF.setText("");
        count = 1;
    }//GEN-LAST:event_acBtnActionPerformed

    private void fourBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourBtnActionPerformed
        String four = resultTF.getText() + fourBtn.getText();
        resultTF.setText(four);
    }//GEN-LAST:event_fourBtnActionPerformed

    private void fiveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveBtnActionPerformed
        String five = resultTF.getText() + fiveBtn.getText();
        resultTF.setText(five);
    }//GEN-LAST:event_fiveBtnActionPerformed

    private void sixBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixBtnActionPerformed
        String six = resultTF.getText() + sixBtn.getText();
        resultTF.setText(six);
    }//GEN-LAST:event_sixBtnActionPerformed

    private void oneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneBtnActionPerformed
        String one = resultTF.getText() + oneBtn.getText();
        resultTF.setText(one);
    }//GEN-LAST:event_oneBtnActionPerformed

    private void twoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoBtnActionPerformed
        String two = resultTF.getText() + twoBtn.getText();
        resultTF.setText(two);
    }//GEN-LAST:event_twoBtnActionPerformed

    private void threeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeBtnActionPerformed
        String three = resultTF.getText() + threeBtn.getText();
        resultTF.setText(three);
    }//GEN-LAST:event_threeBtnActionPerformed

    private void zeroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroBtnActionPerformed
        String zero = resultTF.getText() + zeroBtn.getText();
        resultTF.setText(zero);
    }//GEN-LAST:event_zeroBtnActionPerformed

    private void dotBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotBtnActionPerformed
        String dot = resultTF.getText() + dotBtn.getText();
        resultTF.setText(dot);
    }//GEN-LAST:event_dotBtnActionPerformed

    private void oneByXBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneByXBtnActionPerformed
        if(resultTF.getText().equals("")){
            return;
        }
        fristNumber = Double.parseDouble(resultTF.getText());
        result = 1 / fristNumber;
        resultTF.setText(String.valueOf(String.format("%.4f", result)));
        dataTF.setText("");
    }//GEN-LAST:event_oneByXBtnActionPerformed

    private void plusMinusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusMinusBtnActionPerformed
        if(resultTF.getText().equals("")){
            return;
        }
        fristNumber = Double.parseDouble(resultTF.getText());
        result = fristNumber * (-1);
        boolean dot = String.valueOf(resultTF.getText()).contains(".");
        if(dot == true){
            resultTF.setText(String.valueOf(String.format("%.2f", result)));
        }else{
            resultTF.setText(String.valueOf(String.format("%.0f", result)));
        }
        
        dataTF.setText("");
    }//GEN-LAST:event_plusMinusBtnActionPerformed

    private void x2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x2BtnActionPerformed
        if(resultTF.getText().equals("")){
            return;
        }
        fristNumber = Double.parseDouble(resultTF.getText());
        result = fristNumber * fristNumber;
        boolean dot = String.valueOf(resultTF.getText()).contains(".");
        if(dot == true){
            resultTF.setText(String.valueOf(String.format("%.2f", result)));
        }else{
            resultTF.setText(String.valueOf(String.format("%.0f", result)));
        }
        dataTF.setText("");
    }//GEN-LAST:event_x2BtnActionPerformed

    private void persentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_persentBtnActionPerformed
        if(resultTF.getText().equals("")){
            return;
        }
        fristNumber = Double.parseDouble(resultTF.getText());
        result = fristNumber / 100;
        resultTF.setText(String.valueOf(String.format("%.2f", result)));
        dataTF.setText("");
    }//GEN-LAST:event_persentBtnActionPerformed

    private void divisionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionBtnActionPerformed
        if (!(resultTF.getText().equals(""))) {
            String data = resultTF.getText() + " " + divisionBtn.getText();
            dataTF.setText(data);
            fristNumber = Double.parseDouble(resultTF.getText());
            resultTF.setText("");
            operations = "/";
            count = 1;
        }
    }//GEN-LAST:event_divisionBtnActionPerformed

    private void multiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiBtnActionPerformed
        if (!(resultTF.getText().equals(""))) {
            String data = resultTF.getText() + " " + multiBtn.getText();
            dataTF.setText(data);
            fristNumber = Double.parseDouble(resultTF.getText());
            resultTF.setText("");
            operations = "*";
            count = 1;
        }
    }//GEN-LAST:event_multiBtnActionPerformed

    private void plusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusBtnActionPerformed
        if (!(resultTF.getText().equals(""))) {
            String data = resultTF.getText() + " " + plusBtn.getText();
            dataTF.setText(data);
            fristNumber = Double.parseDouble(resultTF.getText());
            resultTF.setText("");
            operations = "+";
            count = 1;
        }
    }//GEN-LAST:event_plusBtnActionPerformed

    private void equalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalBtnActionPerformed
        if(!(operations == "+" || operations == "-" || operations == "/" || operations == "*")){
            return;
        }
        String second = resultTF.getText();
        String data = dataTF.getText();
        boolean dot1 = String.valueOf(second).contains(".");
        boolean dot2 = String.valueOf(data).contains(".");
        String dataInfo = data + " " + second + " " + equalBtn.getText();
        
        if (count > 1) {
            dataTF.setText(second + operations + String.valueOf(fristNumber) + " =");
        } else {
            dataTF.setText(dataInfo);
        }
        secondNumber = Double.parseDouble(second);
        switch (operations) {
            case "+":
                result = fristNumber + secondNumber;
                if (dot1 == true || dot2 == true) {
                    resultTF.setText(String.format("%.2f", result));
                } else {
                    resultTF.setText(String.format("%.0f", result));
                }
                break;
            case "-":
                if(minus>0){
                    dataTF.setText(String.valueOf(fristNumber) + operations +second + " =");
                    result = fristNumber - secondNumber;
                }else{
                    result = fristNumber - secondNumber;
                    minus++;
                }
                
                if (dot1 == true || dot2 == true) {
                    resultTF.setText(String.format("%.2f", result));
                } else {
                    resultTF.setText(String.format("%.0f", result));
                }
                break;
            case "*":
                result = fristNumber * secondNumber;
                if (dot1 == true || dot2 == true) {
                    resultTF.setText(String.format("%.2f", result));
                } else {
                    resultTF.setText(String.format("%.0f", result));
                }
                break;
            case "/":
                result = fristNumber / secondNumber;
                resultTF.setText(String.format("%.4f", result));
                break;
        }
        count++;
    }//GEN-LAST:event_equalBtnActionPerformed

    private void resultTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_resultTFKeyPressed
        String backspace = null;
        char ch = evt.getKeyChar();
        if (Character.isAlphabetic(ch) || Character.isSpaceChar(ch)) {
            if(Character.isAlphabetic(ch)){
                JOptionPane.showMessageDialog(null, "Alphabet not allowed!");
            }else{
                JOptionPane.showMessageDialog(null, "Space not allowed!");
            }
            StringBuilder strB = new StringBuilder(resultTF.getText());
            strB.deleteCharAt(resultTF.getText().length() - 1);
            backspace = strB.toString();
            resultTF.setText(backspace);
        }
    }//GEN-LAST:event_resultTFKeyPressed

    private void choiceCalculatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceCalculatorActionPerformed
        checkCalculator();
    }//GEN-LAST:event_choiceCalculatorActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GeneralCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeneralCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeneralCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeneralCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GeneralCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox<String> choiceCalculator;
    private javax.swing.JTextField dataTF;
    private javax.swing.JButton divisionBtn;
    private javax.swing.JButton dotBtn;
    private javax.swing.JButton eightBtn;
    private javax.swing.JButton equalBtn;
    private javax.swing.JButton fiveBtn;
    private javax.swing.JButton fourBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton minusBtn;
    private javax.swing.JButton multiBtn;
    private javax.swing.JButton nineBtn;
    private javax.swing.JButton oneBtn;
    private javax.swing.JButton oneByXBtn;
    private javax.swing.JButton persentBtn;
    private javax.swing.JButton plusBtn;
    private javax.swing.JButton plusMinusBtn;
    private javax.swing.JTextField resultTF;
    private javax.swing.JButton sevenBtn;
    private javax.swing.JButton sixBtn;
    private javax.swing.JButton threeBtn;
    private javax.swing.JButton twoBtn;
    private javax.swing.JButton x2Btn;
    private javax.swing.JButton zeroBtn;
    // End of variables declaration//GEN-END:variables
}
