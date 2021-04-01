package Calculator;

import MainInterface.Start;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
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
        closeOperation();
        ImageIcon icon = new ImageIcon(getClass().getResource("calculator.png"));
        this.setIconImage(icon.getImage());
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        dataTF = new javax.swing.JTextField();
        resultTF = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
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
        factorialBtn = new javax.swing.JButton();
        oneBtn = new javax.swing.JButton();
        twoBtn = new javax.swing.JButton();
        zeroBtn = new javax.swing.JButton();
        threeBtn = new javax.swing.JButton();
        dotBtn = new javax.swing.JButton();
        plusBtn = new javax.swing.JButton();
        equalBtn = new javax.swing.JButton();
        sinBtn = new javax.swing.JButton();
        cosBtn = new javax.swing.JButton();
        tantBtn = new javax.swing.JButton();
        factBtn = new javax.swing.JButton();
        acBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Calculators");
        setUndecorated(true);
        setResizable(false);

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
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dataTF, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultTF, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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

        factorialBtn.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        factorialBtn.setText("±");
        factorialBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        factorialBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorialBtnActionPerformed(evt);
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

        sinBtn.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        sinBtn.setText("sin");
        sinBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sinBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinBtnActionPerformed(evt);
            }
        });

        cosBtn.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        cosBtn.setText("cos");
        cosBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosBtnActionPerformed(evt);
            }
        });

        tantBtn.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        tantBtn.setText("tan");
        tantBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tantBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tantBtnActionPerformed(evt);
            }
        });

        factBtn.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        factBtn.setText("n!");
        factBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        factBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factBtnActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sinBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(oneBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(factorialBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fourBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(oneByXBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(sevenBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cosBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(twoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fiveBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eightBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(zeroBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(x2Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
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
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(nineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(multiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(dotBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23)
                                        .addComponent(equalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tantBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(persentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(divisionBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                            .addComponent(factBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(acBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acBtn)
                    .addComponent(backBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sinBtn)
                    .addComponent(cosBtn)
                    .addComponent(tantBtn)
                    .addComponent(factBtn))
                .addGap(18, 18, 18)
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
                    .addComponent(factorialBtn)
                    .addComponent(zeroBtn)
                    .addComponent(dotBtn)
                    .addComponent(equalBtn))
                .addContainerGap())
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainInterface/minimize final.png"))); // NOI18N
        jButton1.setToolTipText("Minimize");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainInterface/close final.png"))); // NOI18N
        jButton2.setToolTipText("Close");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 153));
        jLabel1.setText("Calculator");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Calculator/left-removebg-preview.png"))); // NOI18N
        jButton3.setToolTipText("Back");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(89, 89, 89)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1)
            .addComponent(jButton2)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void equalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalBtnActionPerformed
        if (!(operations == "+" || operations == "-" || operations == "/" || operations == "*")) {
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
                if (minus > 0) {
                    dataTF.setText(String.valueOf(fristNumber) + operations + second + " =");
                    result = fristNumber - secondNumber;
                } else {
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

    private void dotBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotBtnActionPerformed
        String dot = resultTF.getText() + dotBtn.getText();
        resultTF.setText(dot);
    }//GEN-LAST:event_dotBtnActionPerformed

    private void threeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeBtnActionPerformed
        String three = resultTF.getText() + threeBtn.getText();
        resultTF.setText(three);
    }//GEN-LAST:event_threeBtnActionPerformed

    private void zeroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroBtnActionPerformed
        String zero = resultTF.getText() + zeroBtn.getText();
        resultTF.setText(zero);
    }//GEN-LAST:event_zeroBtnActionPerformed

    private void twoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoBtnActionPerformed
        String two = resultTF.getText() + twoBtn.getText();
        resultTF.setText(two);
    }//GEN-LAST:event_twoBtnActionPerformed

    private void oneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneBtnActionPerformed
        String one = resultTF.getText() + oneBtn.getText();
        resultTF.setText(one);
    }//GEN-LAST:event_oneBtnActionPerformed

    private void factorialBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factorialBtnActionPerformed
        if (resultTF.getText().equals("")) {
            return;
        }
        fristNumber = Double.parseDouble(resultTF.getText());
        result = fristNumber * (-1);
        boolean dot = String.valueOf(resultTF.getText()).contains(".");
        if (dot == true) {
            resultTF.setText(String.valueOf(String.format("%.2f", result)));
        } else {
            resultTF.setText(String.valueOf(String.format("%.0f", result)));
        }

        dataTF.setText("");
    }//GEN-LAST:event_factorialBtnActionPerformed

    private void minusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusBtnActionPerformed
        if (!(resultTF.getText().equals(""))) {
            String data = resultTF.getText() + " " + minusBtn.getText();
            dataTF.setText(data);
            fristNumber = Double.parseDouble(resultTF.getText());
            resultTF.setText("");
            operations = "-";
        }
    }//GEN-LAST:event_minusBtnActionPerformed

    private void sixBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixBtnActionPerformed
        String six = resultTF.getText() + sixBtn.getText();
        resultTF.setText(six);
    }//GEN-LAST:event_sixBtnActionPerformed

    private void fiveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveBtnActionPerformed
        String five = resultTF.getText() + fiveBtn.getText();
        resultTF.setText(five);
    }//GEN-LAST:event_fiveBtnActionPerformed

    private void fourBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourBtnActionPerformed
        String four = resultTF.getText() + fourBtn.getText();
        resultTF.setText(four);
    }//GEN-LAST:event_fourBtnActionPerformed

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

    private void nineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineBtnActionPerformed
        String nine = resultTF.getText() + nineBtn.getText();
        resultTF.setText(nine);
    }//GEN-LAST:event_nineBtnActionPerformed

    private void eightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightBtnActionPerformed
        String eight = resultTF.getText() + eightBtn.getText();
        resultTF.setText(eight);
    }//GEN-LAST:event_eightBtnActionPerformed

    private void sevenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenBtnActionPerformed
        String seven = resultTF.getText() + sevenBtn.getText();
        resultTF.setText(seven);
    }//GEN-LAST:event_sevenBtnActionPerformed

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

    private void persentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_persentBtnActionPerformed
        if (resultTF.getText().equals("")) {
            return;
        }
        fristNumber = Double.parseDouble(resultTF.getText());
        result = fristNumber / 100;
        resultTF.setText(String.valueOf(String.format("%.2f", result)));
        dataTF.setText("");
    }//GEN-LAST:event_persentBtnActionPerformed

    private void x2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x2BtnActionPerformed
        if (resultTF.getText().equals("")) {
            return;
        }
        fristNumber = Double.parseDouble(resultTF.getText());
        result = fristNumber * fristNumber;
        boolean dot = String.valueOf(resultTF.getText()).contains(".");
        if (dot == true) {
            resultTF.setText(String.valueOf(String.format("%.2f", result)));
        } else {
            resultTF.setText(String.valueOf(String.format("%.0f", result)));
        }
        dataTF.setText("");
    }//GEN-LAST:event_x2BtnActionPerformed

    private void oneByXBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneByXBtnActionPerformed
        if (resultTF.getText().equals("")) {
            return;
        }
        fristNumber = Double.parseDouble(resultTF.getText());
        result = 1 / fristNumber;
        resultTF.setText(String.valueOf(String.format("%.4f", result)));
        dataTF.setText("");
    }//GEN-LAST:event_oneByXBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        String backspace = null;

        if (resultTF.getText().length() > 0) {
            StringBuilder strB = new StringBuilder(resultTF.getText());
            strB.deleteCharAt(resultTF.getText().length() - 1);
            backspace = strB.toString();
            resultTF.setText(backspace);
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void acBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acBtnActionPerformed
        dataTF.setText("");
        resultTF.setText("");
        count = 1;
    }//GEN-LAST:event_acBtnActionPerformed

    private void resultTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_resultTFKeyPressed
        String backspace = null;
        char ch = evt.getKeyChar();
        if (Character.isAlphabetic(ch) || Character.isSpaceChar(ch)) {
            if (Character.isAlphabetic(ch)) {
                JOptionPane.showMessageDialog(null, "Alphabet not allowed!");
            } else {
                JOptionPane.showMessageDialog(null, "Space not allowed!");
            }
            StringBuilder strB = new StringBuilder(resultTF.getText());
            strB.deleteCharAt(resultTF.getText().length() - 1);
            backspace = strB.toString();
            resultTF.setText(backspace);
        }
    }//GEN-LAST:event_resultTFKeyPressed

    private void resultTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultTFMouseClicked

    }//GEN-LAST:event_resultTFMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "Do you want to close it ?", "Close Window", JOptionPane.YES_NO_OPTION);
        if (x == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new Start().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void sinBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinBtnActionPerformed
        if (resultTF.getText().equals("")) {
            return;
        }
        double num = Double.parseDouble(resultTF.getText());
        double ans = Math.toRadians(num);
        ans = Math.sin(ans);
        dataTF.setText("sin( " + num + " )");
        resultTF.setText(String.valueOf(String.format("%.1f", ans)));
    }//GEN-LAST:event_sinBtnActionPerformed

    private void cosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosBtnActionPerformed
        if (resultTF.getText().equals("")) {
            return;
        }
        double num = Double.parseDouble(resultTF.getText());
        double ans = Math.toRadians(num);
        ans = Math.cos(ans);
        dataTF.setText("cos( " + num + " )");
        resultTF.setText(String.valueOf(String.format("%.1f", ans)));
    }//GEN-LAST:event_cosBtnActionPerformed

    private void tantBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tantBtnActionPerformed
        if (resultTF.getText().equals("")) {
            return;
        }
        double num = Double.parseDouble(resultTF.getText());
        double ans = Math.toRadians(num);
        ans = Math.tan(ans);
        dataTF.setText("tan( " + num + " )");
        resultTF.setText(String.valueOf(String.format("%.1f", ans)));
    }//GEN-LAST:event_tantBtnActionPerformed

    private void factBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factBtnActionPerformed
        if (resultTF.getText().equals("")) {
            dataTF.setText("fact(0)");
            resultTF.setText("1");
            return;
        }
        try {
            int number = Integer.parseInt(resultTF.getText());
            long factorial = fact(number);
            dataTF.setText(String.valueOf("fact( " + number + " )"));
            resultTF.setText(String.valueOf(factorial));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please Insert Any Integer Value");
            return;
        }
    }//GEN-LAST:event_factBtnActionPerformed

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

    public static long fact(int number) {
        if (number >= 1) { // Base condition
            return number * fact(number - 1);
        } else {
            return 1;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton cosBtn;
    private javax.swing.JTextField dataTF;
    private javax.swing.JButton divisionBtn;
    private javax.swing.JButton dotBtn;
    private javax.swing.JButton eightBtn;
    private javax.swing.JButton equalBtn;
    private javax.swing.JButton factBtn;
    private javax.swing.JButton factorialBtn;
    private javax.swing.JButton fiveBtn;
    private javax.swing.JButton fourBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton minusBtn;
    private javax.swing.JButton multiBtn;
    private javax.swing.JButton nineBtn;
    private javax.swing.JButton oneBtn;
    private javax.swing.JButton oneByXBtn;
    private javax.swing.JButton persentBtn;
    private javax.swing.JButton plusBtn;
    private javax.swing.JTextField resultTF;
    private javax.swing.JButton sevenBtn;
    private javax.swing.JButton sinBtn;
    private javax.swing.JButton sixBtn;
    private javax.swing.JButton tantBtn;
    private javax.swing.JButton threeBtn;
    private javax.swing.JButton twoBtn;
    private javax.swing.JButton x2Btn;
    private javax.swing.JButton zeroBtn;
    // End of variables declaration//GEN-END:variables
}
