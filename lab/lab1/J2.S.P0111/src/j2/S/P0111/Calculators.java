/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2.S.P0111;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 *
 * @author Admin
 */
public class Calculators extends javax.swing.JFrame {

    Calculus cal;
    boolean isDecimal = false;
    boolean isNewNum = true;
    int maxLength = 9;
    double buffer = 0;
    Color hover = new Color(0, 255, 255);
    Color originColor;
    String operation = "none";
    double result = 0;

    public Calculators() {
        initComponents();
        setLocationRelativeTo(null);
        cal = new Calculus();
        txtResult.setEditable(false);
        txtResult.setFocusable(false);
        removeFocusable();
        createKeyRecorder((Container) this);
        setTitle("Calculator");
    }

    private void removeFocusable() {
        jButton1.setFocusable(false);
        jButton2.setFocusable(false);
        jButton3.setFocusable(false);
        jButton4.setFocusable(false);
        jButton5.setFocusable(false);
        jButton10.setFocusable(false);
        jButton15.setFocusable(false);
        jButton20.setFocusable(false);
        btnSquare.setFocusable(false);
        btnSpace.setFocusable(false);
        btnClear.setFocusable(false);
        btnClears.setFocusable(false);
        btn0.setFocusable(false);
        btn1.setFocusable(false);
        btn2.setFocusable(false);
        btn3.setFocusable(false);
        btn4.setFocusable(false);
        btn5.setFocusable(false);
        btn6.setFocusable(false);
        btn7.setFocusable(false);
        btn8.setFocusable(false);
        btn9.setFocusable(false);
        btnDiv.setFocusable(false);
        btnDot.setFocusable(false);
        btnMul.setFocusable(false);
        btnAdd.setFocusable(false);
        btnSub.setFocusable(false);
        btnOpposite.setFocusable(false);
        btnResult.setFocusable(false);
    }

    private void createKeyRecorder(Container x) {
        x.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_0 || e.getKeyCode() == KeyEvent.VK_NUMPAD0) {
                    btn0ActionPerformed(null);
                }
                if (e.getKeyCode() == KeyEvent.VK_1 || e.getKeyCode() == KeyEvent.VK_NUMPAD1) {
                    btn1ActionPerformed(null);
                }
                if (e.getKeyCode() == KeyEvent.VK_2 || e.getKeyCode() == KeyEvent.VK_NUMPAD2) {
                    btn2ActionPerformed(null);
                }
                if (e.getKeyCode() == KeyEvent.VK_3 || e.getKeyCode() == KeyEvent.VK_NUMPAD3) {
                    btn3ActionPerformed(null);
                }
                if (e.getKeyCode() == KeyEvent.VK_4 || e.getKeyCode() == KeyEvent.VK_NUMPAD4) {
                    btn4ActionPerformed(null);
                }
                if (e.getKeyCode() == KeyEvent.VK_5 || e.getKeyCode() == KeyEvent.VK_NUMPAD5) {
                    btn5ActionPerformed(null);
                }
                if (e.getKeyCode() == KeyEvent.VK_6 || e.getKeyCode() == KeyEvent.VK_NUMPAD6) {
                    btn6ActionPerformed(null);
                }
                if (e.getKeyCode() == KeyEvent.VK_7 || e.getKeyCode() == KeyEvent.VK_NUMPAD7) {
                    btn7ActionPerformed(null);
                }
                if (e.getKeyCode() == KeyEvent.VK_8 || e.getKeyCode() == KeyEvent.VK_NUMPAD8) {
                    btn8ActionPerformed(null);
                }
                if (e.getKeyCode() == KeyEvent.VK_9 || e.getKeyCode() == KeyEvent.VK_NUMPAD9) {
                    btn9ActionPerformed(null);
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    btnResultActionPerformed(null);
                }
                if (e.getKeyCode() == KeyEvent.VK_ADD) {
                    btnAddActionPerformed(null);
                }
                if (e.getKeyCode() == KeyEvent.VK_SUBTRACT) {
                    btnSubActionPerformed(null);
                }
                if (e.getKeyCode() == KeyEvent.VK_DIVIDE) {
                    btnDivActionPerformed(null);
                }
                if (e.getKeyCode() == KeyEvent.VK_MULTIPLY) {
                    btnMulActionPerformed(null);
                }
                if (e.getKeyCode() == KeyEvent.VK_SHIFT) {
                    btnSquareActionPerformed(null);
                }
                if (e.getKeyCode() == KeyEvent.VK_DELETE) {
                    btnClearActionPerformed(null);
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    btnSpaceActionPerformed(null);
                }
                if (e.getKeyCode() == 110) {
                    btnDotActionPerformed(null);
                }

                repaint();
            }
        });
    }

    private void setNum(int num) {
//        if (isNewNum) {
//            txtResult.setText("0");
//            isDecimal = false;
//            isNewNum = false;
//        }
//        String tmp = txtResult.getText();
//        if (tmp.equals("0")) {
//            if (num != 0) {
//                txtResult.setText(num + "");
//            } else {
//                txtResult.setText("0");
//            }
//        } else {
//            if (tmp.length() < maxLength) {
//                txtResult.setText(tmp + num);
//            }
//        }
       if(isNewNum){
           txtResult.setText("0");
           isNewNum=false;
           isDecimal=false;
       }
       String tmp=txtResult.getText();
       if(tmp.equals("0")){
           if(num!=0){
               txtResult.setText(num + "");
            } else {
                txtResult.setText("0");
            }
        } else {
            if (tmp.length() < maxLength) {
                txtResult.setText(tmp + num);
            }
        }
    }

    String getDF(double num) {
//        String df = "";
//        int val = (int) num / 1;
//        String len = val + "";
//        if (len.length() < maxLength - 1) {
//            for (int i = 0; i < len.length(); i++) {
//                df += "#";
//            }
//            df += ".";
//            String tmp = df;
//            for (int i = tmp.length(); i < maxLength; i++) {
//                df += "#";
//            }
//        }
//        return df;
        String df = "";
        int val = (int) num / 1;
        String len = val + "";
        if (len.length() < maxLength - 1) {
            for (int i = 0; i < len.length(); i++) {
                df += "#";
            }
            df += ".";
            String tmp = df;
            for (int i = tmp.length(); i < maxLength; i++) {
                df += "#";
            }
        }
        return df;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtResult = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnSpace = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnClears = new javax.swing.JButton();
        btnSquare = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnMul = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnDot = new javax.swing.JButton();
        btnOpposite = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnResult = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 255));

        txtResult.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        txtResult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtResult.setText("0");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("MC");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("MR");

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("M+");

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("M-");

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setText("MS");

        btnSpace.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSpace.setText("<-");
        btnSpace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpaceActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnClear.setText("CE");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnClears.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnClears.setText("C");
        btnClears.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearsActionPerformed(evt);
            }
        });

        btnSquare.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        btnSquare.setText("x^2");
        btnSquare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSquareActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton10.setText("√");

        btn7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnDiv.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDiv.setText("/");
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton15.setText("%");

        btn4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btnMul.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnMul.setText("x");
        btnMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMulActionPerformed(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton20.setText("1/x");

        btn1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        btn1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn1KeyPressed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btnSub.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSub.setText("-");
        btnSub.setToolTipText("");
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });

        btn0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnDot.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDot.setText(".");
        btnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDotActionPerformed(evt);
            }
        });

        btnOpposite.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOpposite.setText("+/-");
        btnOpposite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOppositeActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAdd.setText("+");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnResult.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnResult.setText("=");
        btnResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtResult)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnClears, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSquare)
                            .addGap(6, 6, 6)
                            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnMul, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnOpposite, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnResult, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClears, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMul, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOpposite, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        setNum(0);
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        setNum(1);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        setNum(2);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        setNum(3);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        setNum(4);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        setNum(5);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        setNum(6);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        setNum(7);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        setNum(8);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        setNum(9);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDotActionPerformed
//        if (txtResult.getText().length() < maxLength) {
//            if (isNewNum) {
//                txtResult.setText("0");
//                isDecimal = false;
//                isNewNum = false;
//            }
//            if (!isDecimal) {
//                txtResult.setText(txtResult.getText() + ".");
//                isDecimal = true;
//                maxLength += 1;
//
//            }
//        }
        if (txtResult.getText().length() < maxLength) {
            if (isNewNum) {
                txtResult.setText("0");
                isDecimal = false;
                isNewNum = false;
            }
            if (!isDecimal) {
                txtResult.setText(txtResult.getText() + ".");
                isDecimal = true;
                maxLength += 1;
            }
        }
    }//GEN-LAST:event_btnDotActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtResult.setText("0");
        maxLength = 9;
        isNewNum = true;
        isDecimal = false;
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnOppositeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOppositeActionPerformed
//        double tmp = cal.opposite(Double.parseDouble(txtResult.getText()));
//        if (tmp < 0) {
//            maxLength += 1;
//        } else {
//            maxLength -= 1;
//        }
//        if (tmp % 1 == 0) {
//            txtResult.setText((int) tmp + "");
//            isDecimal = false;
//        } else {
//            txtResult.setText(tmp + "");
//            isDecimal = true;
//        }
        double num=cal.opposite(Double.parseDouble(txtResult.getText()));
        if(num<0){
            maxLength +=1;
        }else{
            maxLength -=1;
        }
        if(num%1==0){
            txtResult.setText((int) num+"");
            isDecimal=false;
        }else{
            txtResult.setText( num+"");
            isDecimal=true;
        }
    }//GEN-LAST:event_btnOppositeActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
//        if (buffer != 0) {
//            btnResultActionPerformed(null);
//        }
//        operation = "div";
//        buffer = Double.parseDouble(txtResult.getText());
//        isDecimal = false;
//        isNewNum = true;
//        btnDiv.setBackground(hover);
        if (buffer != 0) {
            btnResultActionPerformed(null);
        }
        operation = "div";
        buffer = Double.parseDouble(txtResult.getText());
        isDecimal = false;
        isNewNum = true;
        btnDiv.setBackground(hover);
    }//GEN-LAST:event_btnDivActionPerformed

    public void resultDiv() {
//        double num = Double.parseDouble(txtResult.getText());
//        if (num == 0) {
//            txtResult.setText("error");
//        } else if (cal.divide(buffer, num) % 1 == 0) {
//            result = cal.divide(buffer, num);
//            if (BigDecimal.valueOf(num).toString().replace("", "").length() < 10) {
//                txtResult.setText((int) result + "");
//            }
//            isDecimal = false;
//        } else {
//            DecimalFormat df = new DecimalFormat(getDF(cal.divide(buffer, num)));
//            txtResult.setText(df.format(cal.divide(buffer, num)));
//            isDecimal = false;
//            result = Double.parseDouble(df.format(cal.divide(buffer, num)));
//        }

       double num=Double.parseDouble(txtResult.getText());
       if(num==0){
           txtResult.setText("error");
       }else if(cal.divide(buffer, num)%1==0){
           result=cal.divide(buffer, num);
           if(BigDecimal.valueOf(num).toString().replace("", "").length()<10){
               txtResult.setText((int)result+"");
           }       
           isDecimal=false;
       }else{
           DecimalFormat df=new DecimalFormat(getDF(cal.divide(buffer, num)));
           txtResult.setText(df.format(cal.divide(buffer, num)));
           isDecimal=false;
           result=Double.parseDouble(df.format(cal.divide(buffer, num)));
       }
    
    }

    public void resultMul() {
//        double num = Double.parseDouble(txtResult.getText());
//        if (num < -100000000 || num > 100000000) {
//            txtResult.setText("error");
//        } else if (cal.multiply(buffer, num) % 1 == 0) {
//            txtResult.setText((int) cal.multiply(buffer, num) + "");
//            isDecimal = false;
//        } else {
//            txtResult.setText(cal.multiply(buffer, num) + "");
//            isDecimal = true;
//        }
       double num =Double.parseDouble(txtResult.getText());
       if(num<-100000000||num>10000000){
           txtResult.setText("error");
       }else if(cal.multiply(buffer, num)%1==0){
           txtResult.setText((int) cal.multiply(buffer, num)+"");
           isDecimal=false;
       }else{
           txtResult.setText(cal.multiply(buffer, num)+"");
           isDecimal=true;
       }
    }

    public void resultSqaure() {
        double num = Double.parseDouble(txtResult.getText());
        if (num < -100000000 || num > 100000000) {
            txtResult.setText("Error");
        } else if (cal.square(num) % 1 == 0) {
            txtResult.setText((int) cal.square(num) + "");
            isDecimal = false;
        } else {
            txtResult.setText(cal.square(num) + "");
            isDecimal = true;
        }
    }

    public void resultAdd() {
        double num = Double.parseDouble(txtResult.getText());
        if (cal.add(buffer, num) % 1 == 0) {
            txtResult.setText((int) cal.add(buffer, num) + "");
            isDecimal = false;
        } else {
            txtResult.setText(cal.add(buffer, num) + "");
            isDecimal = true;
        }
    }

    public void resultSub() {
        double num = Double.parseDouble(txtResult.getText());
        if (cal.subtract(buffer, num) % 1 == 0) {
            txtResult.setText((int) cal.subtract(buffer, num) + "");
            isDecimal = false;
        } else {
            txtResult.setText(cal.subtract(buffer, num) + "");
            isDecimal = true;
        }
    }
    private void btnResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultActionPerformed

        if (operation == null) {
            operation = "none";
        } else if (operation == "div") {
            resultDiv();
        } else if (operation == "mul") {
            resultMul();
        } else if (operation == "square") {
            resultSqaure();
        } else if (operation == "add") {
            resultAdd();
        } else if (operation == "sub") {
            resultSub();
        }

        defaultOperationBtnColor();
        operation = "none";
        isNewNum = true;
    }//GEN-LAST:event_btnResultActionPerformed
    void defaultOperationBtnColor() {
        btnDiv.setBackground(originColor);
        btnMul.setBackground(originColor);
        btnAdd.setBackground(originColor);
        btnSub.setBackground(originColor);
        btnSquare.setBackground(originColor);
    }
    private void btnMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMulActionPerformed
        if (buffer != 0) {
            btnResultActionPerformed(null);
        }
        operation = "mul";
        buffer = Double.parseDouble(txtResult.getText());
        isNewNum = true;
        isDecimal = false;
        btnMul.setBackground(hover);
    }//GEN-LAST:event_btnMulActionPerformed

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
        if (buffer != 0) {
            btnResultActionPerformed(null);
        }
        operation = "sub";
        buffer = Double.parseDouble(txtResult.getText());
        isNewNum = true;
        isDecimal = false;
        btnSub.setBackground(hover);
    }//GEN-LAST:event_btnSubActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (buffer != 0) {
            btnResultActionPerformed(null);
        }
        operation = "add";
        buffer = Double.parseDouble(txtResult.getText());
        isNewNum = true;
        isDecimal = false;
        btnAdd.setBackground(hover);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSquareActionPerformed
        if (buffer != 0) {
            btnResultActionPerformed(null);
        }
        operation = "square";
        buffer = Double.parseDouble(txtResult.getText());
        isNewNum = true;
        isDecimal = false;
        btnSquare.setBackground(hover);
    }//GEN-LAST:event_btnSquareActionPerformed

    private void btn1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn1KeyPressed
    }//GEN-LAST:event_btn1KeyPressed

    private void btnClearsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearsActionPerformed
        txtResult.setText("0");
        maxLength = 9;
        isNewNum = true;
        isDecimal = false;
    }//GEN-LAST:event_btnClearsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSpaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpaceActionPerformed
        int length;
        String str = txtResult.getText();
        length = str.length();
        if (length > 1) {
            str = str.substring(0, length - 1);
            txtResult.setText(str);
        } else if (length == 1) {
            txtResult.setText("0");
            isNewNum = true;
            isDecimal = false;
        }
    }//GEN-LAST:event_btnSpaceActionPerformed

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
            java.util.logging.Logger.getLogger(Calculators.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculators.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculators.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculators.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculators().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClears;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnDot;
    private javax.swing.JButton btnMul;
    private javax.swing.JButton btnOpposite;
    private javax.swing.JButton btnResult;
    private javax.swing.JButton btnSpace;
    private javax.swing.JButton btnSquare;
    private javax.swing.JButton btnSub;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables
}
