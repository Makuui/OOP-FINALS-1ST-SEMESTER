package finals.oop;


import java.awt.event.ActionListener;

public class FinalsView extends javax.swing.JFrame {
    
    public FinalsView(){
        initComponents();
        ActionListener actionListener = new FinalsController(cName, cNum, carSP, comButton, resetButton, cOutput,dpmJF,PTM,PTT);
        comButton.addActionListener(actionListener);
        resetButton.addActionListener(actionListener);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpButton = new javax.swing.ButtonGroup();
        ptButton = new javax.swing.ButtonGroup();
        cNumlabel10 = new javax.swing.JLabel();
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
        dpmJF = new javax.swing.JTextField();
        cNumlabel1 = new javax.swing.JLabel();
        cNumlabel2 = new javax.swing.JLabel();
        cNumlabel3 = new javax.swing.JLabel();
        cNumlabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        PTM = new javax.swing.JTextField();
        PTT = new javax.swing.JTextField();
        cNumlabel5 = new javax.swing.JLabel();
        cNumlabel6 = new javax.swing.JLabel();
        cNumlabel7 = new javax.swing.JLabel();
        cNumlabel9 = new javax.swing.JLabel();
        cNumlabel11 = new javax.swing.JLabel();
        comButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        OutputPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cOutput = new javax.swing.JTextPane();
        titleL = new javax.swing.JLabel();

        cNumlabel10.setBackground(new java.awt.Color(235, 235, 211));
        cNumlabel10.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        cNumlabel10.setForeground(new java.awt.Color(235, 235, 211));
        cNumlabel10.setText("12 MONTHS     |     12% (0.12)");

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
                    .addComponent(cName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
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

        dpmJF.setBackground(new java.awt.Color(235, 235, 211));
        dpmJF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dpmJF.setBorder(null);
        dpmJF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpmJFActionPerformed(evt);
            }
        });

        cNumlabel1.setBackground(new java.awt.Color(235, 235, 211));
        cNumlabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        cNumlabel1.setForeground(new java.awt.Color(235, 235, 211));
        cNumlabel1.setText("TERM 1  --- 20% (0.20)");

        cNumlabel2.setBackground(new java.awt.Color(235, 235, 211));
        cNumlabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        cNumlabel2.setForeground(new java.awt.Color(235, 235, 211));
        cNumlabel2.setText("TERM 3  --- 40% (0.40)");

        cNumlabel3.setBackground(new java.awt.Color(235, 235, 211));
        cNumlabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        cNumlabel3.setForeground(new java.awt.Color(235, 235, 211));
        cNumlabel3.setText("TERM 2  --- 30% (0.30)");

        cNumlabel4.setBackground(new java.awt.Color(235, 235, 211));
        cNumlabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        cNumlabel4.setForeground(new java.awt.Color(235, 235, 211));
        cNumlabel4.setText("TERM 4  --- 50% (0.50)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cNumlabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cNumlabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cNumlabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cNumlabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(dpmJF, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(dpmJF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cNumlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cNumlabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cNumlabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cNumlabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(8, 61, 119));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 235, 211)), "PAYMENT TERMS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(235, 235, 211))); // NOI18N

        PTM.setBackground(new java.awt.Color(235, 235, 211));
        PTM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PTM.setBorder(null);
        PTM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PTMActionPerformed(evt);
            }
        });

        PTT.setBackground(new java.awt.Color(235, 235, 211));
        PTT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PTT.setBorder(null);
        PTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PTTActionPerformed(evt);
            }
        });

        cNumlabel5.setBackground(new java.awt.Color(235, 235, 211));
        cNumlabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        cNumlabel5.setForeground(new java.awt.Color(235, 235, 211));
        cNumlabel5.setText("12 MONTHS     |     12% (0.12)");

        cNumlabel6.setBackground(new java.awt.Color(235, 235, 211));
        cNumlabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        cNumlabel6.setForeground(new java.awt.Color(235, 235, 211));
        cNumlabel6.setText("24 MONTHS     |     16% (0.16)");

        cNumlabel7.setBackground(new java.awt.Color(235, 235, 211));
        cNumlabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        cNumlabel7.setForeground(new java.awt.Color(235, 235, 211));
        cNumlabel7.setText("14 MONTHS     |     14% (0.14)");

        cNumlabel9.setBackground(new java.awt.Color(235, 235, 211));
        cNumlabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        cNumlabel9.setForeground(new java.awt.Color(235, 235, 211));
        cNumlabel9.setText("36 MONTHS     |     18% (0.18)");

        cNumlabel11.setBackground(new java.awt.Color(235, 235, 211));
        cNumlabel11.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        cNumlabel11.setForeground(new java.awt.Color(235, 235, 211));
        cNumlabel11.setText("48 MONTHS     |     20% (0.20)");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(PTM, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PTT))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap(23, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cNumlabel9)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cNumlabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cNumlabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cNumlabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cNumlabel11))))
                .addGap(14, 14, 14))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PTM, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PTT, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cNumlabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cNumlabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cNumlabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cNumlabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cNumlabel11)
                .addContainerGap(26, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ComputationPanelLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(ComputationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ComputationPanelLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ComputationPanelLayout.createSequentialGroup()
                        .addComponent(carSlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carSP, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
            .addGroup(ComputationPanelLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ComputationPanelLayout.setVerticalGroup(
            ComputationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComputationPanelLayout.createSequentialGroup()
                .addGroup(ComputationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carSlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carSP, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(ComputationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ComputationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jSeparator2.setBackground(new java.awt.Color(235, 235, 211));
        jSeparator2.setForeground(new java.awt.Color(235, 235, 211));

        OutputPanel.setBackground(new java.awt.Color(8, 61, 119));
        OutputPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 235, 211)), "OUTPUT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(235, 235, 211))); // NOI18N
        OutputPanel.setForeground(new java.awt.Color(235, 235, 211));

        cOutput.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jScrollPane2.setViewportView(cOutput);

        javax.swing.GroupLayout OutputPanelLayout = new javax.swing.GroupLayout(OutputPanel);
        OutputPanel.setLayout(OutputPanelLayout);
        OutputPanelLayout.setHorizontalGroup(
            OutputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OutputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        OutputPanelLayout.setVerticalGroup(
            OutputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OutputPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        titleL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finals/oop/stitle.png"))); // NOI18N

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 936, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ComputationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustomerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void comButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comButtonActionPerformed
        
    }//GEN-LAST:event_comButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
     
     
    }//GEN-LAST:event_resetButtonActionPerformed

    private void PTMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PTMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PTMActionPerformed

    private void PTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PTTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PTTActionPerformed

    private void dpmJFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpmJFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dpmJFActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ComputationPanel;
    private javax.swing.JPanel CustomerPanel;
    private javax.swing.JPanel OutputPanel;
    public javax.swing.JTextField PTM;
    public javax.swing.JTextField PTT;
    private javax.swing.JPanel body;
    protected javax.swing.JTextField cName;
    private javax.swing.JLabel cNamelabel;
    protected javax.swing.JTextField cNum;
    private javax.swing.JLabel cNumlabel;
    private javax.swing.JLabel cNumlabel1;
    private javax.swing.JLabel cNumlabel10;
    private javax.swing.JLabel cNumlabel11;
    private javax.swing.JLabel cNumlabel2;
    private javax.swing.JLabel cNumlabel3;
    private javax.swing.JLabel cNumlabel4;
    private javax.swing.JLabel cNumlabel5;
    private javax.swing.JLabel cNumlabel6;
    private javax.swing.JLabel cNumlabel7;
    private javax.swing.JLabel cNumlabel9;
    protected javax.swing.JTextPane cOutput;
    public javax.swing.JTextField carSP;
    private javax.swing.JLabel carSlabel;
    protected javax.swing.JButton comButton;
    private javax.swing.ButtonGroup dpButton;
    public javax.swing.JTextField dpmJF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.ButtonGroup ptButton;
    protected javax.swing.JButton resetButton;
    private javax.swing.JLabel titleL;
    // End of variables declaration//GEN-END:variables
    private ActionListener actionListener;

    

   


}
