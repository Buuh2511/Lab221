/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import dao.StockDAO;
import dto.StockDTO;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SE130485
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    DefaultTableModel tblmodel = new DefaultTableModel();

    StockDAO dao = new StockDAO();
    Vector<StockDTO> list;

    public Main() throws SQLException {
        initComponents();
        setup();
        loadData();
        setLocationRelativeTo(null);
    }

    private void loadData() {
        try {
            tblmodel.getDataVector().removeAllElements();
            list = dao.getDataDemo();
            tblmodel.setRowCount(0);
            for (StockDTO x : list) {
                tblmodel.addRow(new Object[]{x.getStockID(), x.getStockName(), x.getAddress(), x.getDateAvailble(), x.getNote()});
            }

        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setup() throws SQLException {

        tblmodel.addColumn("stockID");
        tblmodel.addColumn("stockName");
        tblmodel.addColumn("address");
        tblmodel.addColumn("dateAvailble");
        tblmodel.addColumn("note");
        tblItem.setModel(tblmodel);

    }

    /**
             
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     *    for (StockDTO dto : list) {
                    int stockID = dto.getStockID();
                    String stockName = dto.getStockName();
                    String address = dto.getAddress();
                    Timestamp dateAvailble = dto.getDateAvailble();
                    String note = dto.getNote();
                    stm.setInt(1, stockID);
                    stm.setString(2, stockName);
                    stm.setString(3, address);
                    stm.setTimestamp(4, dateAvailble);
                    stm.setString(5, note);
                    stm.executeUpdate();
                }

                conn.commit();
                result = true;
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInsert = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblItem = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnInsert.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnInsert.setText("Insert to DB");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        tblItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblItem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        Vector listStock = tblmodel.getDataVector();
        ArrayList<StockDTO> list = new ArrayList<>();
        boolean rs = false;
        for (int i = 0; i < listStock.size(); i++) {
            int stockID = 0;
            String stockName = null;
            String address = null;
            Timestamp dateAvailble = null;
            String note = null;
            try {
                stockID = Integer.parseInt(tblItem.getValueAt(i, 0).toString());
                stockName = (String) tblItem.getValueAt(i, 1);
                address = (String) tblItem.getValueAt(i, 2);
                dateAvailble = (Timestamp)  tblItem.getValueAt(i, 3);
                note = (String) tblItem.getValueAt(i, 4);
            } catch (Exception e) {
            }
            StockDTO temp = new StockDTO(stockID, stockName, address, dateAvailble, note);
            list.add(temp);
        }

        try {
            rs = dao.inserDataTrans(list);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (rs == false) {
            JOptionPane.showMessageDialog(this, "Can't import ");
        } else {
            JOptionPane.showMessageDialog(this, "Import successful");
        }

    }//GEN-LAST:event_btnInsertActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel 
         Vector listStock = tblmodel.getDataVector();
        ArrayList<StockDTO> list = new ArrayList<>();
        boolean rs = false;
        for (int i = 0; i < listStock.size(); i++) {
            int stockID = 0;
            String stockName = null;
            String address = null;
            Timestamp dateAvailble = null;
            String note = null;
            try {
                stockID = Integer.parseInt(tblItem.getValueAt(i, 0).toString());
                stockName = (String) tblItem.getValueAt(i, 1);
                address = (String) tblItem.getValueAt(i, 2);
                dateAvailble = (Timestamp)  tblItem.getValueAt(i, 3);
                note = (String) tblItem.getValueAt(i, 4);
            } catch (Exception e) {
            }
            StockDTO temp = new StockDTO(stockID, stockName, address, dateAvailble, note);
            list.add(temp);
        }

        try {
            rs = dao.inserDataTrans(list);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (rs == false) {
            JOptionPane.showMessageDialog(this, "Can't import ");
        } else {
            JOptionPane.showMessageDialog(this, "Import successful");
        }
*/
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
                try {
                    new Main().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsert;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblItem;
    // End of variables declaration//GEN-END:variables
}
