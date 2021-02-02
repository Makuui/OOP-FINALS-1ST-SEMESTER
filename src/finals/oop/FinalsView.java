package finals.oop;


import java.awt.event.ActionListener;

public class FinalsView extends javax.swing.JFrame {
    
    public FinalsView(){
        initComponents();
        ActionListener actionListener = new FinalsController(cName, cNum, carSP, comButton, resetButton, cOutput, ptButton, dpButton);
        comButton.addActionListener(actionListener);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpButton = new javax.swing.ButtonGroup();
        ptButton = new javax.swing.ButtonGroup();
        body = new javax.swing.JPanel();
        CustomerPanel = new javax.swing.JPanel();
        cNumlabel = new javax.swing.JLabel();
        cNum = new javax.swing.JTextField();
        cNamelabel = new javax.swing.JLabel();
        cName = new javax.swing.JTextField();
        ComputationPanel = new javax.swing.JPanel();
        carSlabel = new javax.swing.JLabel();
        carSP = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        radioT1 = new javax.swing.JRadioButton();
        radioT3 = new javax.swing.JRadioButton();
        radioT4 = new javax.swing.JRadioButton();
        radioT2 = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        radioPT1 = new javax.swing.JRadioButton();
        radioPT3 = new javax.swing.JRadioButton();
        radioPT4 = new javax.swing.JRadioButton();
        radioPT2 = new javax.swing.JRadioButton();
        radioPT5 = new javax.swing.JRadioButton();
        comButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        OutputPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cOutput = new javax.swing.JTextPane();
        titleL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CAR LOAN CALCULATOR ");
        setResizable(false);

        body.setBackground(new java.awt.Color(8, 61, 119));

        CustomerPanel.setBackground(new java.awt.Color(8, 61, 119));
        CustomerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 235, 211)), "CUSTOMER INFORMATION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(235, 235, 211))); // NOI18N
        CustomerPanel.setForeground(new java.awt.Color(235, 235, 211));

        cNumlabel.setBackground(new java.awt.Color(235, 235, 211));
        cNumlabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        cNumlabel.setForeground(new java.awt.Color(235, 235, 211));
        cNumlabel.setText("CUSTOMER NUMBER :");

        cNum.setBackground(new java.awt.Color(235, 235, 211));
        cNum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cNum.setBorder(null);
        cNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cNumActionPerformed(evt);
            }
        });

        cNamelabel.setBackground(new java.awt.Color(235, 235, 211));
        cNamelabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        cNamelabel.setForeground(new java.awt.Color(235, 235, 211));
        cNamelabel.setText("CUSTOMER NAME :");

        cName.setBackground(new java.awt.Color(235, 235, 211));
        cName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cName.setBorder(null);
        cName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CustomerPanelLayout = new javax.swing.GroupLayout(CustomerPanel);
        CustomerPanel.setLayout(CustomerPanelLayout);
        CustomerPanelLayout.setHorizontalGroup(
            CustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CustomerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cNumlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cNamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(CustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cNum)
                    .addComponent(cName, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );
        CustomerPanelLayout.setVerticalGroup(
            CustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomerPanelLayout.createSequentialGroup()
                .addGroup(CustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cNum, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CustomerPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cNumlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cNamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        ComputationPanel.setBackground(new java.awt.Color(8, 61, 119));
        ComputationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 235, 211)), "CAR LOAN COMPUTATION ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(235, 235, 211))); // NOI18N
        ComputationPanel.setForeground(new java.awt.Color(235, 235, 211));

        carSlabel.setBackground(new java.awt.Color(235, 235, 211));
        carSlabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        carSlabel.setForeground(new java.awt.Color(235, 235, 211));
        carSlabel.setText("CAR SELLING PRICE :");

        carSP.setBackground(new java.awt.Color(235, 235, 211));
        carSP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        carSP.setBorder(null);
        carSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carSPActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(8, 61, 119));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 235, 211)), "DOWN PAYMENT METHOD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(235, 235, 211))); // NOI18N

        radioT1.setBackground(new java.awt.Color(8, 61, 119));
        dpButton.add(radioT1);
        radioT1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        radioT1.setForeground(new java.awt.Color(235, 235, 211));
        radioT1.setText("TERM 1 - 20%");
        radioT1.setActionCommand("");
        radioT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioT1ActionPerformed(evt);
            }
        });

        radioT3.setBackground(new java.awt.Color(8, 61, 119));
        dpButton.add(radioT3);
        radioT3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        radioT3.setForeground(new java.awt.Color(235, 235, 211));
        radioT3.setText("TERM 3 - 40%");
        radioT3.setActionCommand("");
        radioT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioT3ActionPerformed(evt);
            }
        });

        radioT4.setBackground(new java.awt.Color(8, 61, 119));
        dpButton.add(radioT4);
        radioT4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        radioT4.setForeground(new java.awt.Color(235, 235, 211));
        radioT4.setText("TERM 4 - 50%");
        radioT4.setActionCommand("");
        radioT4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioT4ActionPerformed(evt);
            }
        });

        radioT2.setBackground(new java.awt.Color(8, 61, 119));
        dpButton.add(radioT2);
        radioT2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        radioT2.setForeground(new java.awt.Color(235, 235, 211));
        radioT2.setText("TERM 2 - 30%");
        radioT2.setActionCommand("");
        radioT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioT2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(radioT3)
                    .addComponent(radioT4)
                    .addComponent(radioT2)
                    .addComponent(radioT1))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(radioT1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioT2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioT3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioT4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(8, 61, 119));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 235, 211)), "PAYMENT TERMS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(235, 235, 211))); // NOI18N

        radioPT1.setBackground(new java.awt.Color(8, 61, 119));
        ptButton.add(radioPT1);
        radioPT1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        radioPT1.setForeground(new java.awt.Color(235, 235, 211));
        radioPT1.setText("12 MONTHS -  12%");
        radioPT1.setActionCommand("");
        radioPT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPT1ActionPerformed(evt);
            }
        });

        radioPT3.setBackground(new java.awt.Color(8, 61, 119));
        ptButton.add(radioPT3);
        radioPT3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        radioPT3.setForeground(new java.awt.Color(235, 235, 211));
        radioPT3.setText("24 MONTHS -  16%");
        radioPT3.setActionCommand("");
        radioPT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPT3ActionPerformed(evt);
            }
        });

        radioPT4.setBackground(new java.awt.Color(8, 61, 119));
        ptButton.add(radioPT4);
        radioPT4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        radioPT4.setForeground(new java.awt.Color(235, 235, 211));
        radioPT4.setText("36 MONTHS -  18%");
        radioPT4.setActionCommand("");
        radioPT4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPT4ActionPerformed(evt);
            }
        });

        radioPT2.setBackground(new java.awt.Color(8, 61, 119));
        ptButton.add(radioPT2);
        radioPT2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        radioPT2.setForeground(new java.awt.Color(235, 235, 211));
        radioPT2.setText("14 MONTHS -  14%");
        radioPT2.setActionCommand("");
        radioPT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPT2ActionPerformed(evt);
            }
        });

        radioPT5.setBackground(new java.awt.Color(8, 61, 119));
        ptButton.add(radioPT5);
        radioPT5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        radioPT5.setForeground(new java.awt.Color(235, 235, 211));
        radioPT5.setText("48 MONTHS -  20%");
        radioPT5.setActionCommand("");
        radioPT5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPT5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioPT5)
                    .addComponent(radioPT2)
                    .addComponent(radioPT1)
                    .addComponent(radioPT3)
                    .addComponent(radioPT4))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(radioPT1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioPT2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioPT3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioPT4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioPT5)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        comButton.setBackground(new java.awt.Color(8, 61, 119));
        comButton.setForeground(new java.awt.Color(235, 235, 211));
        comButton.setText("COMPUTE");
        comButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 235, 211)));
        comButton.setContentAreaFilled(false);
        comButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comButtonActionPerformed(evt);
            }
        });

        resetButton.setBackground(new java.awt.Color(8, 61, 119));
        resetButton.setForeground(new java.awt.Color(235, 235, 211));
        resetButton.setText("RESET");
        resetButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 235, 211)));
        resetButton.setContentAreaFilled(false);
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ComputationPanelLayout = new javax.swing.GroupLayout(ComputationPanel);
        ComputationPanel.setLayout(ComputationPanelLayout);
        ComputationPanelLayout.setHorizontalGroup(
            ComputationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComputationPanelLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ComputationPanelLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(ComputationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ComputationPanelLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ComputationPanelLayout.createSequentialGroup()
                        .addComponent(carSlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carSP, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        ComputationPanelLayout.setVerticalGroup(
            ComputationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComputationPanelLayout.createSequentialGroup()
                .addGroup(ComputationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carSlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carSP, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ComputationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ComputationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jSeparator2.setBackground(new java.awt.Color(235, 235, 211));
        jSeparator2.setForeground(new java.awt.Color(235, 235, 211));

        OutputPanel.setBackground(new java.awt.Color(8, 61, 119));
        OutputPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 235, 211)), "OUTPUT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(235, 235, 211))); // NOI18N
        OutputPanel.setForeground(new java.awt.Color(235, 235, 211));

        cOutput.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jScrollPane2.setViewportView(cOutput);

        javax.swing.GroupLayout OutputPanelLayout = new javax.swing.GroupLayout(OutputPanel);
        OutputPanel.setLayout(OutputPanelLayout);
        OutputPanelLayout.setHorizontalGroup(
            OutputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OutputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        OutputPanelLayout.setVerticalGroup(
            OutputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OutputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        titleL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finals/oop/stitle.png"))); // NOI18N

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 936, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ComputationPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CustomerPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(OutputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleL)
                .addGap(88, 88, 88))
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(titleL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addComponent(CustomerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComputationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(OutputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cNumActionPerformed

    private void cNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cNameActionPerformed

    private void carSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carSPActionPerformed
        // TODO add your handling code here:
  
    }//GEN-LAST:event_carSPActionPerformed

    private void radioT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioT1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioT1ActionPerformed

    private void radioT3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioT3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioT3ActionPerformed

    private void radioT4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioT4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioT4ActionPerformed

    private void radioT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioT2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioT2ActionPerformed

    private void radioPT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPT1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioPT1ActionPerformed

    private void radioPT3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPT3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioPT3ActionPerformed

    private void radioPT4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPT4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioPT4ActionPerformed

    private void radioPT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPT2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioPT2ActionPerformed

    private void radioPT5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPT5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioPT5ActionPerformed

    private void comButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comButtonActionPerformed
        
    }//GEN-LAST:event_comButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
     
    }//GEN-LAST:event_resetButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ComputationPanel;
    private javax.swing.JPanel CustomerPanel;
    private javax.swing.JPanel OutputPanel;
    private javax.swing.JPanel body;
    protected javax.swing.JTextField cName;
    private javax.swing.JLabel cNamelabel;
    protected javax.swing.JTextField cNum;
    private javax.swing.JLabel cNumlabel;
    protected javax.swing.JTextPane cOutput;
    public javax.swing.JTextField carSP;
    private javax.swing.JLabel carSlabel;
    protected javax.swing.JButton comButton;
    private javax.swing.ButtonGroup dpButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.ButtonGroup ptButton;
    protected javax.swing.JRadioButton radioPT1;
    protected javax.swing.JRadioButton radioPT2;
    protected javax.swing.JRadioButton radioPT3;
    protected javax.swing.JRadioButton radioPT4;
    protected javax.swing.JRadioButton radioPT5;
    protected javax.swing.JRadioButton radioT1;
    protected javax.swing.JRadioButton radioT2;
    protected javax.swing.JRadioButton radioT3;
    protected javax.swing.JRadioButton radioT4;
    protected javax.swing.JButton resetButton;
    private javax.swing.JLabel titleL;
    // End of variables declaration//GEN-END:variables
    private ActionListener actionListener;

    

   


}
