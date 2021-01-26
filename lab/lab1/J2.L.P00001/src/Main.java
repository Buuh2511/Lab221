/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DAO.SupplierFullModel;
import DAO.ItemFullModel;
import DTO.Supplier;
import DTO.Item;
import DB.ItemDBAccess;
import DAO.Suppliers;
import DAO.Items;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;


/**
 *
 * @author admin
 */
public class Main extends javax.swing.JFrame {

    ItemDBAccess dBAccess = null;
    Suppliers suppliers;
    Items items;
    ItemFullModel itemModel;
    SupplierFullModel supplierModel;
    boolean addNewItem = false;
    boolean addNewSupplier = false;

    private void setupModel() {  //Data model đảm nhận nhiệm vụ cung cấp dữ liệu hiển thị cho JTable
        tblItem.setModel(itemModel);
        tblSupplier.setModel(supplierModel);
        this.cbSuppliers.setModel(new DefaultComboBoxModel(suppliers));
    }

    public Main() {
        initComponents();
        this.setSize(1000, 500);
        this.setLocation(500, 250);
        dBAccess = new ItemDBAccess();
        suppliers = new Suppliers();
        suppliers.loadFromDB(dBAccess);
        int getAll = 3;
        items = new Items();
        items.loadFromDB(dBAccess, suppliers, getAll);
        itemModel = new ItemFullModel(items);
        supplierModel = new SupplierFullModel(suppliers);
        setupModel();
        txtAddress.setEnabled(false);
        txtSupCode.setEnabled(false);
        txtSupName.setEnabled(false);
        txtItemCode.setEnabled(false);
        txtItemName.setEnabled(false);
        txtUnit.setEnabled(false);
        txtPrice.setEnabled(false);

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        ManageSuppliers = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSupplier = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtSupCode = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtSupName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jCBCollaborating = new javax.swing.JCheckBox();
        btnAddNewSup = new javax.swing.JButton();
        btnSaveSup = new javax.swing.JButton();
        btnDeleteSup = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        ManageItems = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItem = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtItemCode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtItemName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbSuppliers = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtUnit = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jCBItem = new javax.swing.JCheckBox();
        btnAddNewItem = new javax.swing.JButton();
        btnSaveItem = new javax.swing.JButton();
        btnDeleteItem = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ManageSuppliers.setLayout(null);

        tblSupplier.setModel(new javax.swing.table.DefaultTableModel(
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
        tblSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSupplierMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblSupplierMouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tblSupplier);

        ManageSuppliers.add(jScrollPane3);
        jScrollPane3.setBounds(30, 40, 519, 306);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Supplier Details"));
        jPanel2.setMinimumSize(new java.awt.Dimension(200, 150));
        jPanel2.setName(""); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 150));

        jLabel8.setText("Sup Code");

        txtSupCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSupCodeActionPerformed(evt);
            }
        });

        jLabel9.setText("Sup Name");

        jLabel11.setText("Address");

        jLabel10.setText("Collaborating");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSupName, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addComponent(txtSupCode)
                    .addComponent(txtAddress)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jCBCollaborating)))
                .addGap(0, 6, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSupCode, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSupName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBCollaborating, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        ManageSuppliers.add(jPanel2);
        jPanel2.setBounds(543, 40, 400, 310);

        btnAddNewSup.setText("Add New ");
        btnAddNewSup.setMaximumSize(new java.awt.Dimension(100, 30));
        btnAddNewSup.setMinimumSize(new java.awt.Dimension(100, 30));
        btnAddNewSup.setPreferredSize(new java.awt.Dimension(100, 30));
        btnAddNewSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewSupActionPerformed(evt);
            }
        });
        ManageSuppliers.add(btnAddNewSup);
        btnAddNewSup.setBounds(500, 370, 113, 30);

        btnSaveSup.setText("Save");
        btnSaveSup.setMaximumSize(new java.awt.Dimension(120, 30));
        btnSaveSup.setMinimumSize(new java.awt.Dimension(120, 30));
        btnSaveSup.setPreferredSize(new java.awt.Dimension(100, 30));
        btnSaveSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveSupActionPerformed(evt);
            }
        });
        ManageSuppliers.add(btnSaveSup);
        btnSaveSup.setBounds(660, 370, 100, 30);

        btnDeleteSup.setText("Delete");
        btnDeleteSup.setPreferredSize(new java.awt.Dimension(100, 30));
        btnDeleteSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSupActionPerformed(evt);
            }
        });
        ManageSuppliers.add(btnDeleteSup);
        btnDeleteSup.setBounds(810, 370, 100, 30);

        jLabel14.setText("Supplier List");
        ManageSuppliers.add(jLabel14);
        jLabel14.setBounds(15, 11, 100, 16);

        jTabbedPane1.addTab("Manage Suppliers", ManageSuppliers);

        ManageItems.setLayout(null);

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
        tblItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblItemMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblItemMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblItem);

        ManageItems.add(jScrollPane1);
        jScrollPane1.setBounds(15, 40, 519, 306);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Item Details"));

        jLabel1.setText("Item Code");

        jLabel2.setText("Item Name");

        jLabel3.setText("Supplier");

        cbSuppliers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Unit");

        jLabel5.setText("Price");

        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPriceKeyTyped(evt);
            }
        });

        jLabel6.setText("Supplying");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPrice, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUnit, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbSuppliers, javax.swing.GroupLayout.Alignment.LEADING, 0, 297, Short.MAX_VALUE)
                            .addComponent(txtItemName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtItemCode, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCBItem, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtItemCode, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSuppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBItem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        ManageItems.add(jPanel1);
        jPanel1.setBounds(543, 35, 400, 310);

        btnAddNewItem.setText("Add New ");
        btnAddNewItem.setMaximumSize(new java.awt.Dimension(100, 30));
        btnAddNewItem.setMinimumSize(new java.awt.Dimension(100, 30));
        btnAddNewItem.setPreferredSize(new java.awt.Dimension(100, 30));
        btnAddNewItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewItemActionPerformed(evt);
            }
        });
        ManageItems.add(btnAddNewItem);
        btnAddNewItem.setBounds(450, 360, 113, 30);

        btnSaveItem.setText("Save");
        btnSaveItem.setMaximumSize(new java.awt.Dimension(120, 30));
        btnSaveItem.setMinimumSize(new java.awt.Dimension(120, 30));
        btnSaveItem.setPreferredSize(new java.awt.Dimension(100, 30));
        btnSaveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveItemActionPerformed(evt);
            }
        });
        ManageItems.add(btnSaveItem);
        btnSaveItem.setBounds(630, 360, 100, 30);

        btnDeleteItem.setText("Delete");
        btnDeleteItem.setPreferredSize(new java.awt.Dimension(100, 30));
        btnDeleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteItemActionPerformed(evt);
            }
        });
        ManageItems.add(btnDeleteItem);
        btnDeleteItem.setBounds(800, 360, 100, 30);

        jLabel7.setText("Item List");
        ManageItems.add(jLabel7);
        jLabel7.setBounds(15, 11, 49, 16);

        jTabbedPane1.addTab("Manage Items", ManageItems);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean validItem() {
        String itemCode = txtItemCode.getText();
        String itemName = txtItemName.getText();
        String itemprice = txtPrice.getText();
        int price = Integer.parseInt(txtPrice.getText());
        String itemunit = txtUnit.getText();
        if (itemCode == null || itemName == null || itemprice == null || itemunit == null) {
            return false;
        }
        if (!itemCode.matches("I\\d{4}")) {
            return false;
        }
        if (!itemName.matches("[a-zA-Z0-9\\. -]+")) {
            return false;
        }
        if (price <= 0) {
            return false;
        }
        return true;
    }

    public boolean validSupplier() {
        String supCode = txtSupCode.getText();
        String supName = txtSupName.getText();
        String address = txtAddress.getText();
        if (supCode == null || supName == null || address == null) {
            return false;
        }
        if (!supCode.matches("[a-zA-Z\\. ]+")) {
            return false;
        }
        if (!supName.matches("[a-zA-Z\\. ]+")) {
            return false;
        }
        return true;
       
    }


    private void btnSaveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveItemActionPerformed
        String itemCode = txtItemCode.getText();
        String itemName = txtItemName.getText();
        Supplier supplier = (Supplier) cbSuppliers.getSelectedItem();
        String supCode = supplier.getSupCode();
        String unit = txtUnit.getText();
        boolean supplying = jCBItem.isSelected();
        if (validItem() == false) {
            JOptionPane.showMessageDialog(this, "Invalid Item.Please input again");
            return;
        }
        int price = Integer.parseInt(txtPrice.getText());
        Item item = new Item(itemCode, itemName, supplier, unit, price, supplying);
        String sql = "";
        if (addNewItem == true) {
            sql = "Insert into items values('" + itemCode + "','" + itemName + "','" + supCode + "','" + unit + "','" + price + "','" + (supplying ? "True" : "False") + "')";
        } else {
            sql = "Update items set " + "itemName='" + itemName + "'," + "supCode='" + supCode + "',unit='" + unit + "',price=" + price + ",supplying='" + (supplying ? "True" : "False") + "' where itemcode='" + itemCode + "'";
        }
        JOptionPane.showMessageDialog(this, sql);
        String msg = "An item has been added/updated.";
        try {
            int n = dBAccess.executeUpdate(sql);
            if (n > 0) {
                JOptionPane.showMessageDialog(this, msg);
                if (addNewItem == false) {
                    int pos = tblItem.getSelectedRow();
                    itemModel.getItems().set(pos, item);
                } else {
                    itemModel.getItems().add(item);
                }
                tblItem.updateUI();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
        addNewItem = false;

    }//GEN-LAST:event_btnSaveItemActionPerformed

    private void btnSaveSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveSupActionPerformed
        String supCode = txtSupCode.getText();
        String supName = txtSupName.getText();
        String address = txtAddress.getText();
        boolean collaborating = jCBCollaborating.isSelected();
        if (validSupplier() == false) {
            JOptionPane.showMessageDialog(this, "Invalid Supplier.Please input again");
            return;
        }
        Supplier supplier = new Supplier(supCode, supName, address, collaborating);
        String sql = "";
        if (addNewSupplier == true) {
            sql = "Insert into suppliers values('" + supCode + "','" + supName + "','" + address + "','" + (collaborating ? "True" : "False") + "')";
        } else {
           sql = "Update suppliers set " + "supName='" + supName + "',address='" + address + "',colloborating='" + (collaborating ? "True" : "False") + "' where supCode='" + supCode + "'";
        }
        JOptionPane.showMessageDialog(this, sql);
        String msg = "A suppliers has been added/updated.";
        try {
            int n = dBAccess.executeUpdate(sql);
            if (n > 0) {
                JOptionPane.showMessageDialog(this, msg);
                if (addNewSupplier == false) {
                    int pos = tblSupplier.getSelectedRow();
                    supplierModel.getSuppliers().set(pos, supplier);
                } else {
                    supplierModel.getSuppliers().add(supplier);
                }
                tblSupplier.updateUI();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
        addNewSupplier = false;

    }//GEN-LAST:event_btnSaveSupActionPerformed

    private void tblItemMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItemMouseReleased

        int row = tblItem.getSelectedRow();
        int column = tblItem.getSelectedColumn();
        tblItem.getCellEditor(row, column).cancelCellEditing();

    }//GEN-LAST:event_tblItemMouseReleased

    private void tblSupplierMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSupplierMouseReleased
        int row = tblSupplier.getSelectedRow();
        int column = tblSupplier.getSelectedColumn();
        tblSupplier.getCellEditor(row, column).cancelCellEditing();

    }//GEN-LAST:event_tblSupplierMouseReleased

    private void tblSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSupplierMouseClicked
        addNewSupplier = false;
        int pos = tblSupplier.getSelectedRow();
        Supplier supplier = supplierModel.getSuppliers().get(pos);
        txtSupCode.setText(supplier.getSupCode());
        txtSupCode.setEditable(false);
        txtSupName.setText(supplier.getSupName());
        txtAddress.setText(supplier.getAddress());
        jCBCollaborating.setSelected(supplier.isCollaborating());

    }//GEN-LAST:event_tblSupplierMouseClicked

    private void tblItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItemMouseClicked
        addNewItem = false;
        int pos = tblItem.getSelectedRow();
        Item item = itemModel.getItems().get(pos);
        txtItemCode.setText(item.getItemCode());
        txtItemCode.setEditable(false);
        txtItemName.setText(item.getItemName());
        int index = suppliers.find(item.getSupplier().getSupCode());
        cbSuppliers.setSelectedIndex(index);
        txtUnit.setText("" + item.getUnit());
        txtPrice.setText("" + item.getPrice());
        jCBItem.setSelected(item.isSupplying());
   
    }//GEN-LAST:event_tblItemMouseClicked

    private void btnDeleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteItemActionPerformed
        int pos = tblItem.getSelectedRow();
        String itemCode = txtItemCode.getText();
        if (itemCode.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Select Item you want to delete");
            return;
        }
        String sql = "Delete From Items where itemcode ='" + itemCode + "'";
        JOptionPane.showMessageDialog(this, sql);
        String msg = "The item " + itemCode + " has been deleted from DB!";
        try {
            int n = dBAccess.executeUpdate(sql);
            if (n > 0) {
                JOptionPane.showMessageDialog(this, msg);
                itemModel.getItems().removeElementAt(pos);
                tblItem.updateUI();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }//GEN-LAST:event_btnDeleteItemActionPerformed

    private void btnDeleteSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSupActionPerformed
        int pos = tblSupplier.getSelectedRow();
        String supCode = txtSupCode.getText();
        if (supCode.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Select Supplier you want to delete");
            return;
        }
        String sql = "Delete From Suppliers where supcode ='" + supCode + "'";
        JOptionPane.showMessageDialog(this, sql);
        String msg = "The supplier " + supCode + " has been deleted from DB!";
        try {
            int n = dBAccess.executeUpdate(sql);
            if (n > 0) {
                JOptionPane.showMessageDialog(this, msg);
                supplierModel.getSuppliers().removeElementAt(pos);
                tblSupplier.updateUI();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }



       
    }//GEN-LAST:event_btnDeleteSupActionPerformed

    private void btnAddNewItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewItemActionPerformed
        addNewItem = true;
        txtItemCode.setText("");
        txtItemCode.setEditable(true);
        txtItemCode.requestFocus(); 
        txtItemName.setText("");
        cbSuppliers.setSelectedIndex(0);
        txtUnit.setText("");
        txtPrice.setText("");
        jCBItem.setSelected(false);
        txtItemCode.setEnabled(true);
        txtItemName.setEnabled(true);
        txtUnit.setEnabled(true);
        txtPrice.setEnabled(true);

       


    }//GEN-LAST:event_btnAddNewItemActionPerformed

    private void btnAddNewSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewSupActionPerformed
        addNewSupplier = true;
        txtSupCode.setText("");
        txtSupCode.setEditable(true);
        txtSupCode.requestFocus();
        txtSupName.setText("");
        txtAddress.setText("");
        jCBCollaborating.setSelected(false);
        txtAddress.setEnabled(true);
        txtSupCode.setEnabled(true);
        txtSupName.setEnabled(true);
        
    }//GEN-LAST:event_btnAddNewSupActionPerformed

    private void txtSupCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSupCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSupCodeActionPerformed

    private void txtPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyTyped
        // TODO add your handling code here:       
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPriceKeyTyped

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ManageItems;
    private javax.swing.JPanel ManageSuppliers;
    private javax.swing.JButton btnAddNewItem;
    private javax.swing.JButton btnAddNewSup;
    private javax.swing.JButton btnDeleteItem;
    private javax.swing.JButton btnDeleteSup;
    private javax.swing.JButton btnSaveItem;
    private javax.swing.JButton btnSaveSup;
    private javax.swing.JComboBox<String> cbSuppliers;
    private javax.swing.JCheckBox jCBCollaborating;
    private javax.swing.JCheckBox jCBItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblItem;
    private javax.swing.JTable tblSupplier;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtItemCode;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSupCode;
    private javax.swing.JTextField txtSupName;
    private javax.swing.JTextField txtUnit;
    // End of variables declaration//GEN-END:variables
}
