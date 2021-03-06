/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summit.s.p0123;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ButtonGroup;

/**
 *
 * @author DoanNC
 */
public class DrawingShape extends javax.swing.JFrame {

    /**
     * Creates new form DrawingShape
     */
    private int x, y;
    private int shapeWidth;
    private int shapeHeight;
    Color color, BGColor;
    ButtonGroup group = new ButtonGroup();
    ButtonGroup BGGroup = new ButtonGroup();
    String type = "Oval";

    public DrawingShape() {
        initComponents();
        makeButtonGroup();
        setShapeSize(60, 100);
        miRedActionPerformed(null);
        miBGWhiteActionPerformed(null);
    }

    private void makeButtonGroup() {
        group.add(miRed);
        group.add(miGreen);
        group.add(miBlue);
        group.add(miCyan);
        group.add(miMagenta);
        group.add(miYellow);
        group.add(miBlack);
        group.add(miGray);
        group.add(miWhite);
        group.clearSelection();
        BGGroup.add(miBGWhite);
        BGGroup.add(miBGRed);
        BGGroup.add(miBGGreen);
        BGGroup.add(miBGBlue);
        BGGroup.clearSelection();
    }

    private void setShapeSize(int shapeHeight, int shapeWidth) {
        this.shapeHeight = shapeHeight;
        this.shapeWidth = shapeWidth;
    }

    private void draw() {
        int tmpWidth = this.shapeWidth, tmpHeight = this.shapeHeight;
        Graphics g = pDraw.getGraphics();
        g.setColor(color);
        if (cbmiLargeShape.isSelected()) {
            tmpWidth = 2 * this.shapeWidth;
            tmpHeight = 2 * this.shapeHeight;
        }
        switch (type) {
            case "Oval":
                g.fillOval(x, y, tmpWidth, tmpHeight);
                break;
            case "Rectangle":
                g.fillRect(x, y, tmpWidth, tmpHeight);
                break;
            case "RoundRect":
                int arc = (tmpHeight < tmpWidth) ? tmpHeight / 2 : tmpWidth / 2;
                g.fillRoundRect(x, y, tmpWidth, tmpHeight, arc, arc);
                break;
        }
        if (cbmiBorder.isSelected()) {
            drawBorder();
        }
    }

    private void drawBorder() {
        int tmpWidth = this.shapeWidth, tmpHeight = this.shapeHeight;
        Graphics g = pDraw.getGraphics();
        if (cbmiLargeShape.isSelected()) {
            tmpWidth = 2 * this.shapeWidth;
            tmpHeight = 2 * this.shapeHeight;
        }
        g.setColor(Color.BLACK);
        switch (type) {
            case "Oval":
                g.drawOval(x, y, tmpWidth, tmpHeight);
                break;
            case "Rectangle":
                g.drawRect(x, y, tmpWidth, tmpHeight);
                break;
            case "RoundRect":
                int arc = (tmpHeight < tmpWidth) ? tmpHeight / 2 : tmpWidth / 2;
                g.drawRoundRect(x, y, tmpWidth, tmpHeight, arc, arc);
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pDraw = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        mAdd = new javax.swing.JMenu();
        miRectangle = new javax.swing.JMenuItem();
        miOval = new javax.swing.JMenuItem();
        miRoundRect = new javax.swing.JMenuItem();
        mColor = new javax.swing.JMenu();
        miRed = new javax.swing.JRadioButtonMenuItem();
        miGreen = new javax.swing.JRadioButtonMenuItem();
        miBlue = new javax.swing.JRadioButtonMenuItem();
        miCyan = new javax.swing.JRadioButtonMenuItem();
        miMagenta = new javax.swing.JRadioButtonMenuItem();
        miYellow = new javax.swing.JRadioButtonMenuItem();
        miBlack = new javax.swing.JRadioButtonMenuItem();
        miGray = new javax.swing.JRadioButtonMenuItem();
        miWhite = new javax.swing.JRadioButtonMenuItem();
        mOptions = new javax.swing.JMenu();
        miClear = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        cbmiLargeShape = new javax.swing.JCheckBoxMenuItem();
        cbmiBorder = new javax.swing.JCheckBoxMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mBG = new javax.swing.JMenu();
        miBGWhite = new javax.swing.JRadioButtonMenuItem();
        miBGRed = new javax.swing.JRadioButtonMenuItem();
        miBGGreen = new javax.swing.JRadioButtonMenuItem();
        miBGBlue = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Drawing Pane");
        setResizable(false);

        pDraw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pDrawMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pDrawLayout = new javax.swing.GroupLayout(pDraw);
        pDraw.setLayout(pDrawLayout);
        pDrawLayout.setHorizontalGroup(
            pDrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        pDrawLayout.setVerticalGroup(
            pDrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );

        mAdd.setText("Add");

        miRectangle.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        miRectangle.setText("Rectangle");
        miRectangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRectangleActionPerformed(evt);
            }
        });
        mAdd.add(miRectangle);

        miOval.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        miOval.setText("Oval");
        miOval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miOvalActionPerformed(evt);
            }
        });
        mAdd.add(miOval);

        miRoundRect.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        miRoundRect.setText("Round Rect");
        miRoundRect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRoundRectActionPerformed(evt);
            }
        });
        mAdd.add(miRoundRect);

        menuBar.add(mAdd);

        mColor.setText("Color");

        miRed.setSelected(true);
        miRed.setText("Red");
        miRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRedActionPerformed(evt);
            }
        });
        mColor.add(miRed);

        miGreen.setText("Green");
        miGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miGreenActionPerformed(evt);
            }
        });
        mColor.add(miGreen);

        miBlue.setText("Blue");
        miBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBlueActionPerformed(evt);
            }
        });
        mColor.add(miBlue);

        miCyan.setText("Cyan");
        miCyan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCyanActionPerformed(evt);
            }
        });
        mColor.add(miCyan);

        miMagenta.setText("Magenta");
        miMagenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miMagentaActionPerformed(evt);
            }
        });
        mColor.add(miMagenta);

        miYellow.setText("Yellow");
        miYellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miYellowActionPerformed(evt);
            }
        });
        mColor.add(miYellow);

        miBlack.setText("Black");
        miBlack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBlackActionPerformed(evt);
            }
        });
        mColor.add(miBlack);

        miGray.setText("Gray");
        miGray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miGrayActionPerformed(evt);
            }
        });
        mColor.add(miGray);

        miWhite.setText("White");
        miWhite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miWhiteActionPerformed(evt);
            }
        });
        mColor.add(miWhite);

        menuBar.add(mColor);

        mOptions.setText("Options");

        miClear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        miClear.setText("Clear");
        miClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClearActionPerformed(evt);
            }
        });
        mOptions.add(miClear);
        mOptions.add(jSeparator1);

        cbmiLargeShape.setText("Add Large Shapes");
        cbmiLargeShape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmiLargeShapeActionPerformed(evt);
            }
        });
        mOptions.add(cbmiLargeShape);

        cbmiBorder.setText("Add Shapes with Border");
        cbmiBorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmiBorderActionPerformed(evt);
            }
        });
        mOptions.add(cbmiBorder);
        mOptions.add(jSeparator2);

        mBG.setText("Background Color");

        miBGWhite.setSelected(true);
        miBGWhite.setText("White");
        miBGWhite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBGWhiteActionPerformed(evt);
            }
        });
        mBG.add(miBGWhite);

        miBGRed.setText("Light Red");
        miBGRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBGRedActionPerformed(evt);
            }
        });
        mBG.add(miBGRed);

        miBGGreen.setText("Light Green");
        miBGGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBGGreenActionPerformed(evt);
            }
        });
        mBG.add(miBGGreen);

        miBGBlue.setText("Light Blue");
        miBGBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBGBlueActionPerformed(evt);
            }
        });
        mBG.add(miBGBlue);

        mOptions.add(mBG);

        menuBar.add(mOptions);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pDraw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pDraw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pDrawMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pDrawMouseClicked
        // TODO add your handling code here:
        this.x = evt.getX() - shapeWidth / 2;
        this.y = evt.getY() - shapeHeight / 2;
        draw();
    }//GEN-LAST:event_pDrawMouseClicked

    private void miRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRedActionPerformed
        // TODO add your handling code here:
        miRed.setSelected(true);
        color = Color.RED;
    }//GEN-LAST:event_miRedActionPerformed

    private void miGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGreenActionPerformed
        // TODO add your handling code here:
        miGreen.setSelected(true);
        color = Color.GREEN;
    }//GEN-LAST:event_miGreenActionPerformed

    private void miBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBlueActionPerformed
        // TODO add your handling code here:
        miBlue.setSelected(true);
        color = Color.BLUE;
    }//GEN-LAST:event_miBlueActionPerformed

    private void miCyanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCyanActionPerformed
        // TODO add your handling code here:
        miCyan.setSelected(true);
        color = Color.CYAN;
    }//GEN-LAST:event_miCyanActionPerformed

    private void miMagentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMagentaActionPerformed
        // TODO add your handling code here:
        miMagenta.setSelected(true);
        color = Color.MAGENTA;
    }//GEN-LAST:event_miMagentaActionPerformed

    private void miYellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miYellowActionPerformed
        // TODO add your handling code here:
        miYellow.setSelected(true);
        color = Color.YELLOW;
    }//GEN-LAST:event_miYellowActionPerformed

    private void miBlackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBlackActionPerformed
        // TODO add your handling code here:
        miBlack.setSelected(true);
        color = Color.BLACK;
    }//GEN-LAST:event_miBlackActionPerformed

    private void miGrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGrayActionPerformed
        // TODO add your handling code here:
        miGray.setSelected(true);
        color = Color.GRAY;
    }//GEN-LAST:event_miGrayActionPerformed

    private void miWhiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miWhiteActionPerformed
        // TODO add your handling code here:
        miWhite.setSelected(true);
        color = Color.WHITE;
    }//GEN-LAST:event_miWhiteActionPerformed

    private void miRectangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRectangleActionPerformed
        // TODO add your handling code here:
        type = "Rectangle";
    }//GEN-LAST:event_miRectangleActionPerformed

    private void miOvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miOvalActionPerformed
        // TODO add your handling code here:
        type = "Oval";
    }//GEN-LAST:event_miOvalActionPerformed

    private void miRoundRectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRoundRectActionPerformed
        // TODO add your handling code here:
        type = "RoundRect";
    }//GEN-LAST:event_miRoundRectActionPerformed

    private void cbmiLargeShapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmiLargeShapeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbmiLargeShapeActionPerformed

    private void miClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miClearActionPerformed
        // TODO add your handling code here:
        pDraw.getGraphics().clearRect(0, 0, pDraw.getWidth(), pDraw.getHeight());
    }//GEN-LAST:event_miClearActionPerformed

    private void cbmiBorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmiBorderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbmiBorderActionPerformed

    private void miBGWhiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBGWhiteActionPerformed
        // TODO add your handling code here:
        miBGWhite.setSelected(true);
        BGColor = Color.WHITE;
        pDraw.setBackground(BGColor);
    }//GEN-LAST:event_miBGWhiteActionPerformed

    private void miBGRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBGRedActionPerformed
        // TODO add your handling code here:
        miBGRed.setSelected(true);
        BGColor = new Color(255, 255 / 2, 255 / 2);
        pDraw.setBackground(BGColor);
    }//GEN-LAST:event_miBGRedActionPerformed

    private void miBGGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBGGreenActionPerformed
        // TODO add your handling code here:
        miBGGreen.setSelected(true);
        BGColor = new Color(255 / 2, 255, 255 / 2);
        pDraw.setBackground(BGColor);
    }//GEN-LAST:event_miBGGreenActionPerformed

    private void miBGBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBGBlueActionPerformed
        // TODO add your handling code here:
        miBGBlue.setSelected(true);
        BGColor = new Color(255 / 2, 255 / 2, 255);
        pDraw.setBackground(BGColor);
    }//GEN-LAST:event_miBGBlueActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DrawingShape.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new DrawingShape().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem cbmiBorder;
    private javax.swing.JCheckBoxMenuItem cbmiLargeShape;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu mAdd;
    private javax.swing.JMenu mBG;
    private javax.swing.JMenu mColor;
    private javax.swing.JMenu mOptions;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JRadioButtonMenuItem miBGBlue;
    private javax.swing.JRadioButtonMenuItem miBGGreen;
    private javax.swing.JRadioButtonMenuItem miBGRed;
    private javax.swing.JRadioButtonMenuItem miBGWhite;
    private javax.swing.JRadioButtonMenuItem miBlack;
    private javax.swing.JRadioButtonMenuItem miBlue;
    private javax.swing.JMenuItem miClear;
    private javax.swing.JRadioButtonMenuItem miCyan;
    private javax.swing.JRadioButtonMenuItem miGray;
    private javax.swing.JRadioButtonMenuItem miGreen;
    private javax.swing.JRadioButtonMenuItem miMagenta;
    private javax.swing.JMenuItem miOval;
    private javax.swing.JMenuItem miRectangle;
    private javax.swing.JRadioButtonMenuItem miRed;
    private javax.swing.JMenuItem miRoundRect;
    private javax.swing.JRadioButtonMenuItem miWhite;
    private javax.swing.JRadioButtonMenuItem miYellow;
    private javax.swing.JPanel pDraw;
    // End of variables declaration//GEN-END:variables
}
