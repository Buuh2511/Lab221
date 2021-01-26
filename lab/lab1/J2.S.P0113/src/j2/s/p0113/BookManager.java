/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2.s.p0113;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class BookManager extends javax.swing.JFrame {

    DefaultListModel<String> model;
    ArrayList<Book> lst;
    boolean isUpdate = false;

    public BookManager() {
        initComponents();
        setLocationRelativeTo(null);
        date();
        lst = new ArrayList<>();
        lst.add(new Book("HPT001", "Harry Potter 1", "J. K. Rowling", "England", 2001, true));
        lst.add(new Book("HPT002", "Harry Potter 2", "J. K. Rowling", "England", 2002, false));
        lst.add(new Book("HPT003", "Harry Potter 3", "J. K. Rowling", "England", 2004, true));
        lst.add(new Book("HPT004", "Harry Potter 4", "J. K. Rowling", "England", 2005, false));
        loadData();
    }

    void loadData() {
        model = new DefaultListModel<>();
        for (Book x : lst) {
            model.addElement(x.toString());
        }
        listBook.setModel(model);
    }

    void date() {
        for (int i = 1990; i <= 2020; i++) {
            jcbYear.addItem(i + "");
        }
    }

    boolean check() {
        String code = txtCode.getText();
        String name = txtName.getText().trim();
        String author = txtAuthor.getText().trim();
        String publisher = txtPublisher.getText().trim();
        if (code.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Code null");
            return false;
        }
//        for (Book x : lst) {
//            if (x.getCode().equals(code)) {
//                JOptionPane.showMessageDialog(null, "Identical code");
//                return false;
//            }
//        }
        for (Book x : lst) {
            if (x.getCode().equals(code)) {
                JOptionPane.showMessageDialog(null, "Identical code");
                return false;
            }
        }
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Name null");
            return false;
        }
        if (author.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Author must not null");
            return false;
        }
        if (publisher.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Publisher must not null");
            return false;
        }
        return true;

    }

    private void clearText() {
//        txtCode.setText("");
//        txtCode.setEditable(true);
//        txtAuthor.setText("");
//        txtName.setText("");
//        txtPublisher.setText("");
//        jcbYear.setSelectedIndex(0);
//        cbRent.setSelected(false);
        txtCode.setText("");
        txtCode.setEditable(true);
        txtAuthor.setText("");
        txtName.setText("");
        txtPublisher.setText("");
        jcbYear.setSelectedIndex(0);
        cbRent.setSelected(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listBook = new javax.swing.JList<>();
        txtCode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAuthor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPublisher = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jcbYear = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbRent = new javax.swing.JCheckBox();
        btnSave = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listBook.setBorder(javax.swing.BorderFactory.createTitledBorder("Book List\n"));
        listBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listBookMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listBook);

        jLabel1.setText("Book Code");

        txtName.setToolTipText("");

        jLabel2.setText("Book Name");

        jLabel3.setText("Author");

        jLabel4.setText("Publisher");

        jLabel5.setText("Published Year");

        cbRent.setText("For rent");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPublisher)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtCode)
                                        .addComponent(txtName)
                                        .addComponent(txtAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cbRent)
                                .addGap(73, 73, 73))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jcbYear, 0, 189, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnRemove)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbRent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave)
                            .addComponent(btnRemove)
                            .addComponent(btnExit))))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listBookMouseClicked
//        int selectedIndex = listBook.getSelectedIndex();
//        Book selectedBook = lst.get(selectedIndex);
//        txtCode.setText(selectedBook.getCode());
//        txtCode.setEditable(false);
//        txtName.setText(selectedBook.getName());
//        txtAuthor.setText(selectedBook.getAuthor());
//        txtPublisher.setText(selectedBook.getPublisher());
//        jcbYear.setSelectedItem(selectedBook.getYear() + "");
//        cbRent.setSelected(selectedBook.isRent());
//        isUpdate = true;
        int selected = listBook.getSelectedIndex();
        Book b = lst.get(selected);
        txtCode.setText(b.getCode());
        txtName.setText(b.getName());
        txtAuthor.setText(b.getAuthor());
        txtPublisher.setText(b.getPublisher());
        jcbYear.setSelectedItem(b.getYear() + "");
        cbRent.setSelected(b.isRent());
        isUpdate = true;
    }//GEN-LAST:event_listBookMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        int selected = listBook.getSelectedIndex();
        if (selected < 0) {
            if (check()) {
//                Book tmp = new Book();
//                tmp.setCode(txtCode.getText());
//                tmp.setName(txtName.getText());
//                tmp.setAuthor(txtAuthor.getText());
//                tmp.setPublisher(txtPublisher.getText());
//                tmp.setYear(Integer.parseInt(jcbYear.getSelectedItem().toString()));
//                tmp.setRent(cbRent.isSelected());
//                JOptionPane.showMessageDialog(null, "Add Succesfull");
//                lst.add(tmp);
//                loadData();
//                clearText();
//                isUpdate = false;
                    Book tmp=new Book();
           tmp.setCode(txtCode.getText());
           tmp.setName(txtName.getText());
           tmp.setAuthor(txtAuthor.getText());
           tmp.setPublisher(txtPublisher.getText());
           tmp.setYear(Integer.parseInt(jcbYear.getSelectedItem().toString()));
           tmp.setRent(cbRent.isSelected());
           JOptionPane.showMessageDialog(null, "Add Succesfull");
           lst.add(tmp);
           clearText();
           loadData();
           isUpdate=false;
            }
        } else if (isUpdate) {
           txtCode.setEditable(false);
           Book b=lst.get(selected);
           b.setCode(txtCode.getText());
           b.setName(txtName.getText());
           b.setAuthor(txtAuthor.getText());
           b.setPublisher(txtPublisher.getText());
           b.setYear(Integer.parseInt(jcbYear.getSelectedItem().toString()));
           b.setRent(cbRent.isSelected());
           JOptionPane.showMessageDialog(null, "Succesfull");
           clearText();
           loadData();
           isUpdate=false;
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
       int select=listBook.getSelectedIndex();
       if(select<0){
           JOptionPane.showMessageDialog(null,"again");
       }else{
           lst.remove(select);
           model.remove(select);
           JOptionPane.showMessageDialog(null, "removed");
       }if(model.getSize()>0){
           txtCode.setEditable(false);
           listBook.setSelectedIndex(0);          
           txtCode.setText(lst.get(0).getCode());
           txtName.setText(lst.get(0).getName());
           txtAuthor.setText(lst.get(0).getAuthor());
           txtPublisher.setText(lst.get(0).getPublisher());
           jcbYear.setSelectedItem(lst.get(0).getYear());
           cbRent.setSelected(lst.get(0).isRent());
       }

    }//GEN-LAST:event_btnRemoveActionPerformed


    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(BookManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSave;
    private javax.swing.JCheckBox cbRent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbYear;
    private javax.swing.JList<String> listBook;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPublisher;
    // End of variables declaration//GEN-END:variables
}
