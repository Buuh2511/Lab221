/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2.s.p0119;

import daos.StockDAO;
import dtos.StockDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
  static DefaultTableModel model = new DefaultTableModel();
    Vector header = new Vector<>();
    Vector data = new Vector<>();
    StockDAO stockDao;
    public Main() {
        initComponents();
        stockDao = new StockDAO();
        model = (DefaultTableModel) tblStocks.getModel();
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
        row1.add("11/09/2010");
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
        Vector row4 = new Vector();
        row4.add(4);
        row4.add("Stock four");
        row4.add("twin tower");
        row4.add("04/07/2015");
        row4.add("");
        data.add(row4);
        Vector row5 = new Vector();
        row5.add(5);
        row5.add("Stock five");
        row5.add("victory aniversa");
        row5.add("08/12/2014");
        row5.add("");
        data.add(row5);

        tblStocks.setModel(new DefaultTableModel(data, header));
    }

  private ArrayList<StockDTO> getStockFromTable() {
         ArrayList<StockDTO> al = new ArrayList<>();       
      for (int i = 0; i < tblStocks.getRowCount(); i++) {
            int code = Integer.parseInt(tblStocks.getValueAt(i, 0).toString());
            String name = tblStocks.getValueAt(i, 1).toString();
            String address = tblStocks.getValueAt(i, 2).toString();
            String date = tblStocks.getValueAt(i, 3).toString();
            String note = tblStocks.getValueAt(i, 4).toString();
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
        tblStocks = new javax.swing.JTable();
        btnInsert = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblStocks.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblStocks);

        btnInsert.setText("Insert into DB");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnInsert)
                .addGap(0, 49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:       
     ArrayList<StockDTO> al = getStockFromTable();
        try {
            boolean check = stockDao.insertUsePreparedStatementToDB(al);
            if (check) {
                JOptionPane.showMessageDialog(this, "Insert success");
            } else {
                JOptionPane.showMessageDialog(this, "Roll back");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
          Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
      }
    }//GEN-LAST:event_btnInsertActionPerformed

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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsert;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tblStocks;
    // End of variables declaration//GEN-END:variables
}