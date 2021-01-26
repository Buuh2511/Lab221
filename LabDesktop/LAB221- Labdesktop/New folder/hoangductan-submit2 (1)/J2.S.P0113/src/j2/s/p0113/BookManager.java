/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2.s.p0113;

import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author kim ngân
 */
public class BookManager extends javax.swing.JFrame {
    DefaultListModel<String> listModel = new DefaultListModel<>();
    Vector<Book> vt = new Vector<>();
    /**
     * Creates new form BookManager
     */
    public BookManager() {
        initComponents();
        setLocationRelativeTo(null);
        list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        for (int i = 1990; i < 2020; i++) {
            cbYear.addItem(i + "");
        }
        cbRent.setSelected(false);
        
    }
            public  boolean  checkCode(){
                String code = txtCode.getText();
                if (code.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "It is empty");
                    txtCode.requestFocus();
                    return false;
                }
                return true;
            }
//             list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//        for (int i = 1990; i < 2020; i++) {
//            cbYear.addItem(i + "");
//        }
//        cbRent.setSelected(false);
             public  boolean  checkName(){
                String name = txtName.getText();
                if (name.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "It is empty");
                    txtCode.requestFocus();
                    return false;
                }
                return true;
            }
              public  boolean  checkAuthor(){
                String author = txtAuthor.getText();
                if (author.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "It is empty");
                    txtCode.requestFocus();
                    return false;
                }
                return true;
            }
               public  boolean  checkPulisher(){
                String pulisher = txtPublisher.getText();
                if (pulisher.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "It is empty");
                    txtCode.requestFocus();
                    return false;
                }
                return true;
            }
               public void showList(){
                   listModel.removeAllElements();
                   for (int i = 0; i < vt.size(); i++) {
                       listModel.addElement(vt.get(i).getName());
                   }
                   list1.setModel(listModel);
               }
               public void clearText(){
                   txtCode.setEditable(true);
                   txtCode.setText("");
                   txtName.setText("");
                   txtAuthor.setText("");
                   txtPublisher.setText("");
                   cbYear.setSelectedIndex(0);
                   cbRent.setSelected(false);
               }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list1 = new javax.swing.JList<>();
        cbYear = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btNew = new javax.swing.JButton();
        btSave = new javax.swing.JButton();
        btRemove = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbRent = new javax.swing.JCheckBox();
        txtCode = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAuthor = new javax.swing.JTextField();
        txtPublisher = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Book list", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24))); // NOI18N

        list1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(list1);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel1.setText("Book Code:");

        btNew.setText("New");
        btNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewActionPerformed(evt);
            }
        });

        btSave.setText("Save");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        btRemove.setText("Remove");
        btRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoveActionPerformed(evt);
            }
        });

        btExit.setText("Exit");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel2.setText("Book Name:");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel3.setText("Author:");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel4.setText("Publisher:");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel5.setText("Published Year:");

        cbRent.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        cbRent.setText("For rent");

        txtPublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPublisherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbRent)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btNew, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addComponent(btRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(txtPublisher, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName)
                            .addComponent(txtCode))
                        .addGap(59, 59, 59))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(48, 48, 48)
                        .addComponent(cbRent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btNew, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void list1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list1MouseClicked
        int row = list1.getSelectedIndex();
            txtCode.setEditable(false);
            txtCode.setText(vt.get(row).getCode());
            txtName.setText(vt.get(row).getName());
            txtAuthor.setText(vt.get(row).getAuthor());
            txtPublisher.setText(vt.get(row).getPublisher());
            cbYear.setSelectedItem(vt.get(row).getYear());
            cbRent.setSelected(vt.get(row).isRent());

        
    }//GEN-LAST:event_list1MouseClicked

    private void btNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewActionPerformed
txtCode.setEditable(true);
        txtCode.setText("");
        txtName.setText("");
        txtAuthor.setText("");
        txtPublisher.setText("");
        cbRent.setSelected(true);
        cbYear.setSelectedIndex(0);

    }//GEN-LAST:event_btNewActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        // TODO add your handling code here:

        int row = list1.getSelectedIndex();
        if (row < 0) {
            if (checkCode() && checkAuthor() && checkName() && checkPulisher()) {
                String code = txtCode.getText();
                String name = txtName.getText();
                String author = txtAuthor.getText();
                String publisher = txtPublisher.getText();
                String year = cbYear.getItemAt(cbYear.getSelectedIndex());
                boolean rent = cbRent.isSelected();
                boolean check = checkId(code);
                if(!check){
                    txtCode.setEditable(true);
                    txtCode.setText("");
                    JOptionPane.showMessageDialog(this, "It is E..");
                }
                else if (!checkcodeExits(code)) {
                    txtCode.setEditable(true);
                    txtCode.setText("");
                    JOptionPane.showMessageDialog(this, "it is exit");
                } else{
                Book books = new Book(code, name, author, publisher, year, rent);
                vt.add(books);
                clearText();
                showList();
                JOptionPane.showMessageDialog(null, "Save book successfull!!!!!!");
                }
            }
        } else {
            String code = txtCode.getText();
            String name = txtName.getText();
            String author = txtAuthor.getText();
            String publisher = txtPublisher.getText();
            String year = cbYear.getItemAt(cbYear.getSelectedIndex());
            boolean rent = cbRent.isSelected();          
            vt.get(row).setName(name);
            vt.get(row).setAuthor(author);
            vt.get(row).setPublisher(publisher);
            vt.get(row).setYear(year);
            vt.get(row).setRent(rent);
            clearText();
            list1.clearSelection();
            txtCode.setEnabled(true);
            showList();
            JOptionPane.showMessageDialog(null, "Update success full");
                
        }
    }//GEN-LAST:event_btSaveActionPerformed

    private void btRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoveActionPerformed
        int row = list1.getSelectedIndex();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please choose ");
        } else {
            String code = txtCode.getText();
            for (int i = 0; i < vt.size(); i++) {
                if (code.equals(vt.get(i).getCode())) {
                    vt.remove(i);
                    JOptionPane.showMessageDialog(null, "Delete successfull!!!!!");
                    showList();
                }
                if (listModel.getSize() == 0) {
                    txtCode.setEditable(true);
                    txtCode.setText("");
                    txtName.setText("");
                    txtAuthor.setText("");
                    txtPublisher.setText("");
                    cbYear.setSelectedIndex(0);
                    cbRent.setSelected(false);
                }
                if (listModel.getSize() > 0) {
                    txtCode.setEditable(false);
                    txtCode.setText(vt.get(0).getCode());
                    txtName.setText(vt.get(0).getName());
                    txtAuthor.setText(vt.get(0).getAuthor());
                    txtPublisher.setText(vt.get(0).getPublisher());
                    cbYear.setSelectedItem(vt.get(0).getYear());
                    cbRent.setSelected(vt.get(0).isRent());
                }

            }
        }
    }//GEN-LAST:event_btRemoveActionPerformed

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btExitActionPerformed

    private void txtPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPublisherActionPerformed

    }//GEN-LAST:event_txtPublisherActionPerformed
private boolean checkId(String id) {
        if (id.matches("E{1}[0-9]{3,5}")) {
            return true;
        } else {
            return false;
        }
    }
public boolean checkcodeExits (String id){
    for (Book book : vt) {
        if (id.equals(book.getCode())) {
            return false;
        }
    }
    return true;
}
//public boolean checkIDExit(String id){
//        
//    for (Book book : vt) {
//        if(book.getCode().equals(id)){
//            return false;
//        }
//    }
//    return true;
//    }
    /**
     *  
     * @param args the command line arguments
     *  
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel 
        int row = list1.getSelectedIndex();
        if (row < 0) {
            clearText();
            txtCode.setEnabled(true);
        } else {
            txtCode.setEnabled(false);
            txtCode.setText(vt.get(row).getCode());
            txtName.setText(vt.get(row).getName());
            txtAuthor.setText(vt.get(row).getAuthor());
            txtPublisher.setText(vt.get(row).getPublisher());
            cbYear.setSelectedItem(vt.get(row).getYear());
            cbRent.setSelected(vt.get(row).isRent());

        }
        */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        int row = list1.getSelectedIndex();
//        if (row < 0) {
//            JOptionPane.showMessageDialog(null, "Please choose ");
//        } else {
//            String code = txtCode.getText();
//            for (int i = 0; i < vt.size(); i++) {
//                if (code.equals(vt.get(i).getCode())) {
//                    vt.remove(i);
//                    JOptionPane.showMessageDialog(null, "Delete successfull!!!!!");
//                    showList();
//                }
//                if (listModel.getSize() == 0) {
//                    txtCode.setEditable(true);
//                    txtCode.setText("");
//                    txtName.setText("");
//                    txtAuthor.setText("");
//                    txtPublisher.setText("");
//                    cbYear.setSelectedIndex(0);
//                    cbRent.setSelected(false);
//                }
//                if (listModel.getSize() > 0) {
//                    txtCode.setEditable(false);
//                    txtCode.setText(vt.get(0).getCode());
//                    txtName.setText(vt.get(0).getName());
//                    txtAuthor.setText(vt.get(0).getAuthor());
//                    txtPublisher.setText(vt.get(0).getPublisher());
//                    cbYear.setSelectedItem(vt.get(0).getYear());
//                    cbRent.setSelected(vt.get(0).isRent());
//                }
//
//            }
//        }
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form 
        int row = list1.getSelectedIndex();
        if (row < 0) {
            if (checkCode() && checkAuthor() && checkName() && checkPulisher()) {
                String code = txtCode.getText();
                String name = txtName.getText();
                String author = txtAuthor.getText();
                String publisher = txtPublisher.getText();
                String year = cbYear.getItemAt(cbYear.getSelectedIndex());
                boolean rent = cbRent.isSelected();
                boolean check = checkId(code);
                if(!check){
                    txtCode.setEditable(true);
                    txtCode.setText("");
                    JOptionPane.showMessageDialog(this, "It is E..");
                }else{
                Book books = new Book(code, name, author, publisher, year, rent);
                vt.add(books);
                clearText();
                showList();
                JOptionPane.showMessageDialog(null, "Save book successfull!!!!!!");
                }
            }
        } else {
            String code = txtCode.getText();
            String name = txtName.getText();
            String author = txtAuthor.getText();
            String publisher = txtPublisher.getText();
            String year = cbYear.getItemAt(cbYear.getSelectedIndex());
            boolean rent = cbRent.isSelected();          
            vt.get(row).setName(name);
            vt.get(row).setAuthor(author);
            vt.get(row).setPublisher(publisher);
            vt.get(row).setYear(year);
            vt.get(row).setRent(rent);
            clearText();
            list1.clearSelection();
            txtCode.setEnabled(true);
            showList();
            JOptionPane.showMessageDialog(null, "Update success full");
                
        }
    }                                      */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExit;
    private javax.swing.JButton btNew;
    private javax.swing.JButton btRemove;
    private javax.swing.JButton btSave;
    private javax.swing.JCheckBox cbRent;
    private javax.swing.JComboBox<String> cbYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> list1;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPublisher;
    // End of variables declaration//GEN-END:variables
}