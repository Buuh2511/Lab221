/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2.s.p0116;

import buuh.dao.StockDAO;
import buuh.dto.StockDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Buu Huynh
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    DefaultTableModel model = new DefaultTableModel();
    Vector header = new Vector<>();
    Vector data = new Vector<>();
    StockDAO stockDao;

    public Main() {
        initComponents();
        stockDao = new StockDAO();
        model = (DefaultTableModel) tblStock.getModel();
        model.getDataVector().removeAllElements();
        header.add("StockID");
        header.add("Stock name");
        header.add("Address");
        header.add("Date available");
        header.add("Note");

        Vector row1 = new Vector();
        row1.add(1);
        row1.add("Stock one");
        row1.add("No1-washington");
        row1.add("11/09/2001");
        row1.add("");
        data.add(row1);
        Vector row2 = new Vector();
        row2.add(2);
        row2.add("Stock two");
        row2.add("32-cave town");
        row2.add("07/09/2011");
        row2.add("");
        data.add(row2);
        Vector row3 = new Vector();
        row3.add(3);
        row3.add("Stock there");
        row3.add("Nary Angel");
        row3.add("12/05/2010");
        row3.add("stote dangerous");
        data.add(row3);
        tblStock.setModel(new DefaultTableModel(data, header));
    }

    private ArrayList<StockDTO> getStockFromTable() {
        ArrayList<StockDTO> al = new ArrayList<>();
        for (int i = 0; i < tblStock.getRowCount(); i++) {
            int code = Integer.parseInt(tblStock.getValueAt(i, 0).toString());
            String name = tblStock.getValueAt(i, 1).toString();
            String address = tblStock.getValueAt(i, 2).toString();
            String date = tblStock.getValueAt(i, 3).toString();
            String note = tblStock.getValueAt(i, 4).toString();
            StockDTO dto = new StockDTO(code, name, address, date, note);
            al.add(dto);
        }
        return al;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblStock = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblStock);

        jButton1.setText("Insert to DB");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ArrayList<StockDTO> al = getStockFromTable();
        try {
            boolean check = stockDao.insertTransactionToDB(al);
            if (check) {
                JOptionPane.showMessageDialog(this, "Insert success");
            } else {
                JOptionPane.showMessageDialog(this, "Roll Back");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblStock;
    // End of variables declaration//GEN-END:variables
}