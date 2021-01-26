/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2.s.p0106;

import java.util.Calendar;
import java.util.Vector;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class TransferDataBetweenParentDialogAndChildDialog extends javax.swing.JFrame {

    Vector header = new Vector();
    
    
    //vector chua header
    Vector data = new Vector();
    //vetor chua du lieu trong bang Parent
    
    //Vector chua du lieu bang Child
       
    
    public TransferDataBetweenParentDialogAndChildDialog() {
        initComponents();
        header.add("StockID");
        header.add("StockName");
        header.add("Address");
        header.add("DateAvailable");
        header.add("Note");
        
        
        Vector row1 = new Vector();
        row1.add("1");
        row1.add("Stock one");
        row1.add("No1-Washington street");
        row1.add("11/05/2010");
        row1.add("");
        data.add(row1);
        Vector row2 = new Vector();
        row2.add("2");
        row2.add("Stock two");
        row2.add("372 Cave town - 001 Banks ");
        row2.add("09/07/2011");
        row2.add("");
        data.add(row2);
        Vector row3 = new Vector();
        row3.add("3");
        row3.add("Stock three");
        row3.add("Nary angle- 890 Number one");
        row3.add("13/05/2010");
        row3.add("Store dangerous materials");
        data.add(row3);
        Vector row4 = new Vector();
        row4.add("4");
        row4.add("Stock four");
        row4.add("Twin tower - 01 Main street");
        row4.add("04/07/2015");
        row4.add("");
        data.add(row4);
        Vector row5 = new Vector();
        row5.add("5");
        row5.add("Stock five");
        row5.add("Victory anniversary district");
        row5.add("08/12/2014");
        row5.add("");
        data.add(row5);
        tblParent.setModel(new DefaultTableModel(data, header));
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DialogChild = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblChild = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblParent = new javax.swing.JTable();
        btnOpen = new javax.swing.JButton();

        tblChild.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "null"
            }
        ));
        jScrollPane2.setViewportView(tblChild);

        javax.swing.GroupLayout DialogChildLayout = new javax.swing.GroupLayout(DialogChild.getContentPane());
        DialogChild.getContentPane().setLayout(DialogChildLayout);
        DialogChildLayout.setHorizontalGroup(
            DialogChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogChildLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
                .addContainerGap())
        );
        DialogChildLayout.setVerticalGroup(
            DialogChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DialogChildLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblParent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "StockID", "StockName", "Address", "DateAvailable", "note"
            }
        ));
        tblParent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblParentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblParent);

        btnOpen.setText("Open Item");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(btnOpen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOpen)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        int rowSeclected = tblParent.getSelectedRow();
//        System.out.println(rowSeclected);
        Vector rowChild1 = new Vector();
        rowChild1  = (Vector)data.get(rowSeclected); 
        Vector dataChild = new Vector();
        dataChild.add(rowChild1);
        System.out.println(dataChild);
        tblChild.setModel(new DefaultTableModel(dataChild, header));
        tblChild.updateUI();   
        
        DialogChild.setSize(700, 200);
        DialogChild.setVisible(true);
        tblChild.updateUI();
    }//GEN-LAST:event_btnOpenActionPerformed

    private void tblParentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblParentMouseClicked
        
        
    }//GEN-LAST:event_tblParentMouseClicked

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
            java.util.logging.Logger.getLogger(TransferDataBetweenParentDialogAndChildDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransferDataBetweenParentDialogAndChildDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransferDataBetweenParentDialogAndChildDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransferDataBetweenParentDialogAndChildDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransferDataBetweenParentDialogAndChildDialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog DialogChild;
    private javax.swing.JButton btnOpen;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblChild;
    private javax.swing.JTable tblParent;
    // End of variables declaration//GEN-END:variables
}
