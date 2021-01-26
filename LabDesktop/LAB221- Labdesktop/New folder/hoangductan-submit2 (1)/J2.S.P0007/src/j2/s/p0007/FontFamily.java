/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2.s.p0007;

import java.awt.Font;
import java.awt.GraphicsEnvironment;

/**
 *
 * @author kim ngân
 */
public class FontFamily extends javax.swing.JFrame {

    /**
     * Creates new form FontFamily
     */
    public FontFamily() {
        initComponents();
        setLocationRelativeTo(null);
       GraphicsEnvironment g = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Font[] fonts = g.getAllFonts();
        for (int i = 0; i < fonts.length; i++) {
            cbFont.addItem(fonts[i].getFontName());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     *  GraphicsEnvironment g = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Font[] fonts = g.getAllFonts();
       
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbFont = new javax.swing.JComboBox<>();
        lbFontFamily = new javax.swing.JLabel();
        lbNameOfFont = new javax.swing.JLabel();
        lbText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbFont.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbFontItemStateChanged(evt);
            }
        });
        cbFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFontActionPerformed(evt);
            }
        });

        lbFontFamily.setText("Font family name");

        lbNameOfFont.setText("NameOfFamily");

        lbText.setText("Le Thi Kim Ngan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNameOfFont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbText, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbFontFamily)
                                    .addComponent(cbFont, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbFontFamily)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbFont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbNameOfFont, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbText)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbFontItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbFontItemStateChanged
        // TODO add your handling code here:
        String FontName = "";
        FontName = cbFont.getSelectedItem().toString();
        lbNameOfFont.setText("Name of font: " + FontName);
        lbText.setFont(new Font(FontName, 15, 20));
    }//GEN-LAST:event_cbFontItemStateChanged

    private void cbFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFontActionPerformed
        // TODO add your handling code here:v
        String FontName = "";
        FontName = cbFont.getSelectedItem().toString();
        lbNameOfFont.setText("Name of font: " + FontName);
        lbText.setFont(new Font(FontName, 15, 20));
    }//GEN-LAST:event_cbFontActionPerformed

    /**
     * @param args the command line arguments
     * for (int i = 0; i < fonts.length; i++) {
            cbFont.addItem(fonts[i].getFontName());
        }
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
            java.util.logging.Logger.getLogger(FontFamily.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FontFamily.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FontFamily.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FontFamily.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* String FontName = "";
        FontName = cbFont.getSelectedItem().toString();
        lbNameOfFont.setText("Name of font: " + FontName);
        lbText.setFont(new Font(FontName, 15, 20));*/
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FontFamily().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbFont;
    private javax.swing.JLabel lbFontFamily;
    private javax.swing.JLabel lbNameOfFont;
    private javax.swing.JLabel lbText;
    // End of variables declaration//GEN-END:variables
}
