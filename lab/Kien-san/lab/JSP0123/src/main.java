
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.ButtonGroup;
import javax.swing.JColorChooser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vu Quoc Hung
 */
public class main extends javax.swing.JFrame {
//JSP0123
    /**
     * Creates new form MAIN
     */
    int shape;// 1 là rect, 2 là oval, 3 là round rect
    int fill; //fill = 1, no fill = 2
    int x1, y1;   
    int x2, y2;
    Color curColor;
    Color curBackgroundColor;
    ButtonGroup bg = new ButtonGroup();
    
    public main() {
        shape = 1;
        initComponents();
        bg.add(rdFill);
        bg.add(rdNoFill);
        curColor= Color.BLACK;
        curBackgroundColor= Color.GRAY;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAdd = new javax.swing.JMenu();
        itemRect = new javax.swing.JMenuItem();
        itemOval = new javax.swing.JMenuItem();
        itemRoundRect = new javax.swing.JMenuItem();
        menuColor = new javax.swing.JMenu();
        itemBgColor = new javax.swing.JMenuItem();
        itemColor = new javax.swing.JMenuItem();
        menuOption = new javax.swing.JMenu();
        itemClear = new javax.swing.JMenuItem();
        rdFill = new javax.swing.JRadioButtonMenuItem();
        rdNoFill = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 696, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 413, Short.MAX_VALUE)
        );

        menuAdd.setText("Add");

        itemRect.setText("Rectangle");
        itemRect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRectActionPerformed(evt);
            }
        });
        menuAdd.add(itemRect);

        itemOval.setText("Oval");
        itemOval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemOvalActionPerformed(evt);
            }
        });
        menuAdd.add(itemOval);

        itemRoundRect.setText("RoundRect");
        itemRoundRect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRoundRectActionPerformed(evt);
            }
        });
        menuAdd.add(itemRoundRect);

        jMenuBar1.add(menuAdd);

        menuColor.setText("Color");

        itemBgColor.setText("BackgroundColor");
        itemBgColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBgColorActionPerformed(evt);
            }
        });
        menuColor.add(itemBgColor);

        itemColor.setText("Color");
        itemColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemColorActionPerformed(evt);
            }
        });
        menuColor.add(itemColor);

        jMenuBar1.add(menuColor);

        menuOption.setText("Options");

        itemClear.setText("Clear");
        itemClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemClearActionPerformed(evt);
            }
        });
        menuOption.add(itemClear);

        rdFill.setSelected(true);
        rdFill.setText("Fill");
        menuOption.add(rdFill);

        rdNoFill.setSelected(true);
        rdNoFill.setText("No Fill");
        menuOption.add(rdNoFill);

        jMenuBar1.add(menuOption);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        x1 = evt.getX();
        y1 = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        x2 = evt.getX();
        y2 = evt.getY();
        if(rdFill.isSelected()) {
            fill = 1;
        } else if(rdNoFill.isSelected()) {
            fill = 0;
        }
        Graphics g = jPanel1.getGraphics();
        g.setColor(curColor);
        if(shape == 1 && fill == 0) {
            if(x1<x2 && y1>y2) g.drawRect(x1, y2, 600, 200);
            else if(x1<x2 && y1<y2) g.drawRect(x1, y1, 600 , 200);
            else if(x1>x2 && y1<y2) g.drawRect(x2, y1, 600  , 200);
            else if(x1>x2 && y1>y2) g.drawRect(x2, y2, 600 , 200);
                       
        }else if(shape == 1 && fill == 1) {
            if(x1<x2 && y1>y2) g.fillRect(x1, y2, x2-x1, y1-y2);
            else if(x1<x2 && y1<y2) g.fillRect(x1, y1, x2-x1 , y2-y1);
            else if(x1>x2 && y1<y2) g.fillRect(x2, y1, x1-x2, y2-y1);
            else if(x1>x2 && y1>y2) g.fillRect(x2, y2, x1-x2 ,y1-y2);
            
        } else if(shape == 2 && fill == 0) {
            if(x1<x2 && y1>y2) g.drawOval(x1, y2, x2-x1, y1-y2);
            else if(x1<x2 && y1<y2) g.drawOval(x1, y1, x2-x1 , y2-y1);
            else if(x1>x2 && y1<y2) g.drawOval(x2, y1, x1-x2, y2-y1);
            else if(x1>x2 && y1>y2) g.drawOval(x2, y2, x1-x2 ,y1-y2);
            
        } else if(shape == 2 && fill == 1) {
            if(x1<x2 && y1>y2) g.fillOval(x1, y2, x2-x1, y1-y2);
            else if(x1<x2 && y1<y2) g.fillOval(x1, y1, x2-x1 , y2-y1);
            else if(x1>x2 && y1<y2) g.fillOval(x2, y1, x1-x2, y2-y1);
            else if(x1>x2 && y1>y2) g.fillOval(x2, y2, x1-x2 ,y1-y2);
            
        } else if(shape == 3 && fill == 0) {
            if(x1<x2 && y1>y2) g.drawRoundRect(x1, y2, x2-x1, y1-y2, 20, 20);
            else if(x1<x2 && y1<y2) g.drawRoundRect(x1, y1, x2-x1 , y2-y1, 20, 20);
            else if(x1>x2 && y1<y2) g.drawRoundRect(x2, y1, x1-x2, y2-y1, 20, 20);
            else g.drawRoundRect(x2, y2, x1-x2 ,y1-y2, 20, 20);
            
        } else if(shape == 3 && fill == 1) {
            if(x1<x2 && y1>y2) g.fillRoundRect(x1, y2, x2-x1, y1-y2, 20, 20);
            else if(x1<x2 && y1<y2) g.fillRoundRect(x1, y1, x2-x1 , y2-y1, 20, 20);
            else if(x1>x2 && y1<y2) g.fillRoundRect(x2, y1, x1-x2, y2-y1, 20, 20);
            else if(x1>x2 && y1>y2) g.fillRoundRect(x2, y2, x1-x2 , y1-y2, 20, 20);
            
        }
            

        
    }//GEN-LAST:event_jPanel1MouseReleased

    private void itemRectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRectActionPerformed
        shape = 1;
    }//GEN-LAST:event_itemRectActionPerformed

    private void itemOvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemOvalActionPerformed
        shape = 2;
    }//GEN-LAST:event_itemOvalActionPerformed

    private void itemRoundRectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRoundRectActionPerformed
        shape = 3;
    }//GEN-LAST:event_itemRoundRectActionPerformed

    private void itemClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemClearActionPerformed
        Graphics g = jPanel1.getGraphics();
        Rectangle r = jPanel1.getVisibleRect();
        g.clearRect(r.x, r.y, r.width, r.height);
        jPanel1.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_itemClearActionPerformed

    private void itemBgColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBgColorActionPerformed
        JColorChooser c=new JColorChooser(Color.BLACK);
        curBackgroundColor=c.showDialog(null,"choose a color",curBackgroundColor);
        if(curBackgroundColor==null) curBackgroundColor = Color.WHITE;
        jPanel1.setBackground(curBackgroundColor);
    }//GEN-LAST:event_itemBgColorActionPerformed

    private void itemColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemColorActionPerformed
        JColorChooser c=new JColorChooser(Color.BLACK);
        curColor=c.showDialog(null,"choose a color",curColor);
        if(curColor==null) curColor=Color.BLACK;
    }//GEN-LAST:event_itemColorActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemBgColor;
    private javax.swing.JMenuItem itemClear;
    private javax.swing.JMenuItem itemColor;
    private javax.swing.JMenuItem itemOval;
    private javax.swing.JMenuItem itemRect;
    private javax.swing.JMenuItem itemRoundRect;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuAdd;
    private javax.swing.JMenu menuColor;
    private javax.swing.JMenu menuOption;
    private javax.swing.JRadioButtonMenuItem rdFill;
    private javax.swing.JRadioButtonMenuItem rdNoFill;
    // End of variables declaration//GEN-END:variables
}