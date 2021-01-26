/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buuh.ui;

import buuh.daos.ItemDAO;
import buuh.daos.SupplierDAO;
import buuh.dtos.ItemDTO;
import buuh.dtos.SupplierDTO;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import valid.validation;

/**
 *
 * @author Buu Huynh
 */
public class Main extends javax.swing.JFrame {

    SupplierDAO supDAO = new SupplierDAO();
    List<SupplierDTO> supList = supDAO.getAllSup();
    DefaultTableModel Smodel = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    ItemDAO itemDAO = new ItemDAO();
    DefaultTableModel Imodel = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    List<ItemDTO> itemList = itemDAO.getAllItem();
    DefaultComboBoxModel combobox = new DefaultComboBoxModel();
    validation vl = new validation();

    boolean checkAdd = false;
    boolean checkUpdate = false;
    boolean checkUpdateSup = false;
    boolean checkAddSup = false;

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        setLocationRelativeTo(null);

        // show sup table
        tblSup.setModel(Smodel);
        Smodel.addColumn("Code");
        Smodel.addColumn("Name");
        Smodel.addColumn("Address");
        showSupTable();
        // show item table
        tblItem.setModel(Imodel);
        Imodel.addColumn("Code");
        Imodel.addColumn("Name");
        Imodel.addColumn("Supplier");
        Imodel.addColumn("Unit");
        Imodel.addColumn("Price");
        Imodel.addColumn("Supply");
        showItemTable();
        //add combobox
        addComboBox();
//        btnSaveSup.setEnabled(false);
//        btnDeleteSup.setEnabled(false);
//        btnSaveItem.setEnabled(false);
//        btnDeleteItem.setEnabled(false);
        closeTextItem();
        closeTextSup();

    }

    public void closeTextSup() {
        txtSupCode.setEnabled(false);
        txtSupName.setEnabled(false);
        txtSupAddress.setEnabled(false);
        ckbColla.setEnabled(false);
    }

    public void closeTextItem() {
        txtItemCode1.setEnabled(false);
        txtItemName.setEnabled(false);
        txtPrice.setEnabled(false);
        txtUnit.setEnabled(false);
        cbxSup.setEnabled(false);
        ckbSup.setEnabled(false);
    }

    public void openTextSup() {
        txtSupCode.setEnabled(true);
        txtSupName.setEnabled(true);
        txtSupAddress.setEnabled(true);
        ckbColla.setEnabled(true);
    }

    public void openTextItem() {
        txtItemCode1.setEnabled(true);
        txtItemName.setEnabled(true);
        txtPrice.setEnabled(true);
        txtUnit.setEnabled(true);
        cbxSup.setEnabled(true);
        ckbSup.setEnabled(true);
    }

    public void addComboBox() {
        combobox.removeAllElements();
        for (SupplierDTO sup : supList) {
            combobox.addElement(sup.toString());
        }
        cbxSup.setModel(combobox);
    }

    public void addToCombobox() {
        combobox.removeAllElements();
        for (SupplierDTO supplierDTO : supList) {
            combobox.addElement(supplierDTO);
        }
        cbxSup.setModel(combobox);
    }

    public void showItemTable() {
        itemList = itemDAO.getAllItem();
        Imodel.setRowCount(0);
        for (ItemDTO Item : itemList) {
            SupplierDTO sup = supDAO.getSupByCode(Item.getSupCode());
            Imodel.addRow(new Object[]{Item.getItemCode(), Item.getItemName(), sup.toString(), Item.getUnit(), Item.getPrice(), Item.isSupplying()});
        }
    }

    public void clearItemForm() {
        txtItemCode1.setText("");
        txtItemCode1.setEnabled(true);
        txtItemName.setText("");
        txtPrice.setText("");
        txtUnit.setText("");
//        checkboxSupplying.setState(false);
  
    }

    public void showSupTable() {
        supList = supDAO.getAllSup();
        Smodel.setRowCount(0);
        for (SupplierDTO Supplier : supList) {
            Smodel.addRow(new Object[]{Supplier.getSupCode(), Supplier.getSupName(), Supplier.getAddress()});
        }
    }

    public void clearSupForm() {
        txtSupCode.setText("");
        txtSupCode.setEnabled(true);
        txtSupName.setText("");
        txtSupAddress.setText("");
//        checkboxCollaborating.setState(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSup = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSupName = new javax.swing.JTextField();
        txtSupAddress = new javax.swing.JTextField();
        txtSupCode = new javax.swing.JTextField();
        ckbColla = new java.awt.Checkbox();
        btnAddSup = new javax.swing.JButton();
        btnDeleteSup = new javax.swing.JButton();
        btnSaveSup = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtItemName = new javax.swing.JTextField();
        txtUnit = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        ckbSup = new java.awt.Checkbox();
        cbxSup = new javax.swing.JComboBox<>();
        btnAddItem = new javax.swing.JButton();
        btnDeleteItem = new javax.swing.JButton();
        btnSaveItem = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblItem = new javax.swing.JTable();
        txtItemCode1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        tblSup.setModel(new javax.swing.table.DefaultTableModel(
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
        tblSup.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblSup.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblSup.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblSup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSupMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSup);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Code :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Name :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Collaborating :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Address :");

        btnAddSup.setText("ADD");
        btnAddSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSupActionPerformed(evt);
            }
        });

        btnDeleteSup.setText("DELETE");
        btnDeleteSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSupActionPerformed(evt);
            }
        });

        btnSaveSup.setText("SAVE");
        btnSaveSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveSupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSupName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSupAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtSupCode, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(ckbColla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnAddSup, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(btnSaveSup, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDeleteSup, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(txtSupCode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSupName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSupAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckbColla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddSup, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteSup, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveSup, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Supplier", jPanel1);

        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Item Code :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Suppiler :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Item Name :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Price :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Supplying :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Unit :");

        btnAddItem.setText("ADD");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        btnDeleteItem.setText("DELETE");
        btnDeleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteItemActionPerformed(evt);
            }
        });

        btnSaveItem.setText("SAVE");
        btnSaveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveItemActionPerformed(evt);
            }
        });

        tblItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Code", "Name", "Supplier", "Unit", "Price", "Supply"
            }
        ));
        tblItem.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblItemMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblItem);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtItemCode1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbxSup, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ckbSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSaveItem, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDeleteItem, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtItemCode1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(cbxSup, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ckbSup, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteItem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveItem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Item", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSupActionPerformed
        // TODO add your handling code here:
//        SupplierDTO sup = new SupplierDTO();
//        sup.setSupCode(txtSupCode.getText());
//        sup.setSupName(txtSupName.getText());
//        sup.setAddress(txtSupAddress.getText());
//        sup.setCollaborating(ckbColla.getState());
//
//        if (vl.checkSup(sup, true, supList)) {
//            supDAO.addSup(sup);
//            JOptionPane.showMessageDialog(null, "Add success");
//            showSupTable();
//            clearSupForm();
//            addComboBox();
//        } else {
//            JOptionPane.showMessageDialog(null, "Add failed");
//        }
        checkAddSup = true;
        openTextSup();
        clearSupForm();
    }//GEN-LAST:event_btnAddSupActionPerformed

    private void btnDeleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteItemActionPerformed
        // TODO add your handling code here:
        String code = txtItemCode1.getText();
        if (itemDAO.deleteItem(code)) {
            JOptionPane.showMessageDialog(null, "Delete success");
        } else {
            JOptionPane.showMessageDialog(null, "Delete faild");
        }
        showItemTable();
        clearItemForm();
    }//GEN-LAST:event_btnDeleteItemActionPerformed

    private void tblSupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSupMouseClicked
        // TODO add your handling code here:
        int index = tblSup.getSelectedRow();
        txtSupCode.setText((String) tblSup.getValueAt(index, 0));
        txtSupCode.setEnabled(false);
        txtSupName.setText((String) tblSup.getValueAt(index, 1));
        txtSupAddress.setText((String) tblSup.getValueAt(index, 2));
        ckbColla.setState(supList.get(index).isCollaborating());
        checkUpdateSup = true;
        openTextSup();

    }//GEN-LAST:event_tblSupMouseClicked

    private void btnDeleteSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSupActionPerformed
        String code = txtSupCode.getText();
        List<ItemDTO> list = new ItemDAO().getAllItemBySupCode(code);
        if (list.isEmpty()) {
            if (supDAO.deleteSup(code)) {
                JOptionPane.showMessageDialog(null, "Delete success");
            } else {
                JOptionPane.showMessageDialog(null, "Delete faild");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Supplier have constraint");
        }
        showSupTable();
        clearSupForm();
        addComboBox();
    }//GEN-LAST:event_btnDeleteSupActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        clearSupForm();
//        btnSaveSup.setEnabled(false);
//        btnDeleteSup.setEnabled(false);
//        btnAddSup.setEnabled(true);
    }//GEN-LAST:event_jPanel1MouseClicked

    private void btnSaveSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveSupActionPerformed
        // TODO add your handling code here:


        if (checkUpdateSup == true) {
            String supCode = txtSupCode.getText();
            String supName = txtSupName.getText();
            String supAddress = txtSupAddress.getText();
            boolean collaborating = ckbColla.getState();
            SupplierDTO dto = new SupplierDTO(supCode, supName, supAddress, collaborating);
            if (vl.checkSup(dto, false, supList)) {
                if (supDAO.updateSup(dto)) {
                    JOptionPane.showMessageDialog(null, "Success");
                    clearSupForm();
                    addComboBox();
                    showSupTable();
                } else {
                    JOptionPane.showMessageDialog(null, "You are Adding");
                }
            } else {
                JOptionPane.showMessageDialog(null, "faild2");
            }
        }

        if (checkAddSup == true) {
            SupplierDTO sup = new SupplierDTO();
            sup.setSupCode(txtSupCode.getText());
            sup.setSupName(txtSupName.getText());
            sup.setAddress(txtSupAddress.getText());
            sup.setCollaborating(ckbColla.getState());

            if (vl.checkSup(sup, true, supList)) {
                supDAO.addSup(sup);
                JOptionPane.showMessageDialog(null, "Add success");
                showSupTable();
                clearSupForm();
                addComboBox();
            } else {
                JOptionPane.showMessageDialog(null, "Add failed");
            }
        }
    }//GEN-LAST:event_btnSaveSupActionPerformed

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        // TODO add your handling code here:
//        ItemDTO item = new ItemDTO();
//        String code = txtItemCode.getText();
//        String name = txtItemName.getText();
//        String supCode = "";
//        for (SupplierDTO Supplier : supList) {
//            if (Supplier.toString().equals(cbxSup.getSelectedItem().toString())) {
//                supCode = Supplier.getSupCode();
//            }
//        }
//        String unit = txtUnit.getText();
//        String price = txtPrice.getText();
//        boolean supplying = ckbSup.getState();
//        item = vl.checkItem(item, true, itemList, code, name, supCode, unit, price, supplying);
//        if (item != null) {
//            itemDAO.addItem(item);
//            JOptionPane.showMessageDialog(null, "Add Success");
//            showItemTable();
//            clearItemForm();
//            btnSaveItem.setEnabled(false);
//            btnDeleteItem.setEnabled(false);
//        } else {
//            JOptionPane.showMessageDialog(null, "Add failed");
//        }
        clearItemForm();
        openTextItem();
        checkAdd = true;
        btnAddSup.setEnabled(true);
        btnDeleteSup.setEnabled(true);

    }//GEN-LAST:event_btnAddItemActionPerformed

    private void tblItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItemMouseClicked
        // TODO add your handling code here:
        int index = tblItem.getSelectedRow();
        txtItemCode1.setText((String) tblItem.getValueAt(index, 0));
        txtItemCode1.setEnabled(false);
        txtItemName.setText((String) tblItem.getValueAt(index, 1));
        cbxSup.setSelectedItem(tblItem.getValueAt(index, 2));
        txtUnit.setText((String) tblItem.getValueAt(index, 3));
        txtPrice.setText(String.valueOf(tblItem.getValueAt(index, 4)));
        ckbSup.setState((boolean) tblItem.getValueAt(index, 5));
        checkUpdate = true;
        openTextItem();
    }//GEN-LAST:event_tblItemMouseClicked

    private void btnSaveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveItemActionPerformed
        // TODO add your handling code here:

        ItemDTO item = new ItemDTO();
        String code = txtItemCode1.getText();
        String name = txtItemName.getText();
        String supCode = "";
        String unit = txtUnit.getText();
        String price = txtPrice.getText();
        boolean supplying = ckbSup.getState();
        for (SupplierDTO Supplier : supList) {
            if (Supplier.toString().equals(cbxSup.getSelectedItem().toString())) {
                supCode = Supplier.getSupCode();
            }
        }

        if (checkAdd == true) {
            item = vl.checkItem(item, true, itemList, code, name, supCode, unit, price, supplying);
            if (item != null) {
                itemDAO.addItem(item);
                JOptionPane.showMessageDialog(null, "Add Success");
                showItemTable();
                clearItemForm();
            } else {
                JOptionPane.showMessageDialog(null, "Add failed");
            }
        }

        if (checkUpdate == true) {
            item = vl.checkItem(item, false, itemList, code, name, supCode, unit, price, supplying);
            if (item != null) {
                itemDAO.saveItem(item);
                JOptionPane.showMessageDialog(null, "Edit Success");
                showItemTable();
                clearItemForm();
            } else {
                JOptionPane.showMessageDialog(null, "Edit failed");
            }
        }
    }//GEN-LAST:event_btnSaveItemActionPerformed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
        clearItemForm();
//        btnSaveItem.setEnabled(false);
//        btnDeleteItem.setEnabled(false);
//        btnAddItem.setEnabled(true);
    }//GEN-LAST:event_jPanel2MouseClicked

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
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnAddSup;
    private javax.swing.JButton btnDeleteItem;
    private javax.swing.JButton btnDeleteSup;
    private javax.swing.JButton btnSaveItem;
    private javax.swing.JButton btnSaveSup;
    private javax.swing.JComboBox<String> cbxSup;
    private java.awt.Checkbox ckbColla;
    private java.awt.Checkbox ckbSup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblItem;
    private javax.swing.JTable tblSup;
    private javax.swing.JTextField txtItemCode1;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSupAddress;
    private javax.swing.JTextField txtSupCode;
    private javax.swing.JTextField txtSupName;
    private javax.swing.JTextField txtUnit;
    // End of variables declaration//GEN-END:variables
}
