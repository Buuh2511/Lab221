/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import dao.EmployeeDAO;
import dto.EmployeeDTO;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.Check;

/**
 *
 * @author Buu Huynh
 */
public class MainForm extends javax.swing.JFrame {

    EmployeeDAO dao = new EmployeeDAO();
    Check ck = new Check();
    ArrayList<EmployeeDTO> list;
    Vector<String> header = new Vector<>();
    Vector data = new Vector();
    boolean check = true;
    boolean c2 = true;
    boolean checkFind = false;
    int pos = -1;

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        getData();
        header.add("EmpID");
        header.add("Fullname");
        header.add("Phone");
        header.add("Email");
        DefaultTableModel dtm;
        dtm = (DefaultTableModel) tblData.getModel();
        dtm.setDataVector(data, header);
        btnRemove.setEnabled(false);
        btnUpdate.setEnabled(false);

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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        btnGetEmp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtFullName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        txtDOB = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblData.getTableHeader().setReorderingAllowed(false);
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblData);

        btnGetEmp.setText("Get All Emp");
        btnGetEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetEmpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(btnGetEmp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(56, 56, 56)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGetEmp)
                .addGap(89, 89, 89))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(187, Short.MAX_VALUE)))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Emp Management");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Emp's Detail"));

        jLabel2.setText("EmpID");

        jLabel3.setText("Fullname");

        jLabel4.setText("Phone");

        jLabel5.setText("Email");

        jLabel6.setText("Address");

        jLabel7.setText("DOB");

        txtID.setText("e111");

        txtFullName.setText("huynh buu");

        txtPhone.setText("0765145458");

        txtEmail.setText("asd@gmail.com");

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        txtAddress.setText("Quan 11");
        jScrollPane1.setViewportView(txtAddress);

        txtDOB.setText("11/11/1999");

        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        jLabel8.setText("DOB format : mm/dd/yyyy");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnCreate)
                        .addGap(59, 59, 59)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnRemove))
                            .addComponent(btnFind, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtFullName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDOB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFind))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnUpdate)
                    .addComponent(btnRemove))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGetEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetEmpActionPerformed
        // TODO add your handling code here:
        if (list.isEmpty()) {
            JOptionPane.showMessageDialog(null, "List employee is empty");
        } else {
            data.removeAllElements();
            for (int i = 0; i < list.size(); i++) {
                String id = list.get(i).getEmpID();
                String fullName = list.get(i).getFullName();
                String phone = list.get(i).getPhone();
                String email = list.get(i).getEmail();
                Vector<String> v = new Vector<String>();
                v.add(id);
                v.add(fullName);
                v.add(phone);
                v.add(email);
                data.add(v);
                DefaultTableModel dtm;
                dtm = (DefaultTableModel) tblData.getModel();
                dtm.setDataVector(data, header);
            }
            txtID.setEditable(true);
            txtAddress.setText("");
            txtDOB.setText("");
            txtEmail.setText("");
            txtFullName.setText("");
            txtID.setText("");
            txtPhone.setText("");
            tblData.updateUI();
            checkFind = false;
        }
    }//GEN-LAST:event_btnGetEmpActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        boolean c3 = true;
        String error = "";
        String id = txtID.getText();
        String fullName = txtFullName.getText();
        String phone = txtPhone.getText();
        String email = txtEmail.getText();
        String address = txtAddress.getText();
        String dob = txtDOB.getText();
        if (!(id.trim().equals("") || fullName.trim().equals("") || phone.trim().equals("") || email.trim().equals("") || address.trim().equals("") || dob.trim().equals(""))) {
            if (ck.isValidDate(dob)) {
                String[] arr = dob.split("/");
                if (arr.length == 3) {
                    int d = Integer.parseInt(arr[1]);
                    int m = Integer.parseInt(arr[0]);
                    int y = Integer.parseInt(arr[2]);
                    if (d <= 31 && d >= 1 && m <= 12 && m >= 1) {
                        //--------------------------------------------
                        if (m == 2 && y % 4 == 0) {
                            if (d > 29) {
                                check = false;
                            }
                        } else if (m == 2 && y % 4 != 0) {
                            if (d >= 29) {
                                check = false;
                            }
                        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
                            if (d > 30) {
                                check = false;
                            }
                        } else {
                            check = true;
                        }
                        if (check && y < 2020) {
                            if (ck.isValidName(fullName) && fullName.length() <= 30
                                    && ck.isValidPhone(phone) && phone.length() <= 15
                                    && ck.isValidGmail(email) && email.length() <= 30
                                    && ck.isValidID(id) && id.length() <= 10 && address.length() <= 300) {
                                Date dob1 = new Date(y - 1900, m - 1, d);

                                EmployeeDTO emp = new EmployeeDTO(id, fullName, phone, email, address, dob1);
                                boolean c = dao.addEmp(emp);
                                if (c) {
                                    c2 = false;
                                    JOptionPane.showMessageDialog(null, "Create successful");
                                    Vector<String> v = new Vector<String>();
                                    v.add(id);
                                    v.add(fullName);
                                    v.add(phone);
                                    v.add(email);
                                    data.add(v);
                                    tblData.updateUI();
                                    txtAddress.setText("");
                                    txtDOB.setText("");
                                    txtEmail.setText("");
                                    txtFullName.setText("");
                                    txtID.setText("");
                                    txtPhone.setText("");
                                }
                            }

                        } else {
                            error += "Dob is invalid\n";
                            check = true;
                        }
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Invalid date ");
                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "Please enter all information, information must not be empty");
            c3 = false;
        }
        if (!ck.isValidID(id)) {
            error += "ID is invalid\n";
        }
        if (!ck.isValidName(fullName)) {
            error += "Name is invalid\n";
        }
        if (!ck.isValidPhone(phone)) {
            error += "Phone is invalid\n";
        }
        if (!ck.isValidGmail(email)) {
            error += "Email is invalid\n";
        }
        if (!ck.isValidDate(dob)) {
            error += "Dob is invalid\n";
        }
        if (!"".equals(error) && c3 == true) {
            JOptionPane.showMessageDialog(null, error);
        }

    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:'
        boolean c3 = true;
        String error = "";
        String id = txtID.getText();
        String name = txtFullName.getText();
        String address = txtAddress.getText();
        String phone = txtPhone.getText();
        String email = txtEmail.getText();
        String dob = txtDOB.getText();
        if (checkFind == true) {
            if (!(id.isEmpty() || name.isEmpty() || address.isEmpty() || phone.isEmpty() || email.isEmpty() || dob.isEmpty())) {
                if (ck.isValidDate(dob)) {
                    String arr[] = dob.split("/");
                    if (arr.length == 3) {
                        int d = Integer.parseInt(arr[1]);
                        int m = Integer.parseInt(arr[0]);
                        int y = Integer.parseInt(arr[2]);
                        if (d >= 1 && d <= 31 && m >= 1 && m <= 12) {
                            if (m == 2 && m % 4 == 0) {
                                if (d > 29) {
                                    check = false;
                                }
                            } else if (m == 2 && m % 4 != 0) {
                                if (d >= 29) {
                                    check = false;
                                }
                            } else if (m == 4 || m == 6 || m == 9 || m == 11) {
                                if (d > 30) {
                                    check = false;
                                }
                            } else {
                                check = true;
                            }
                            if (check && y < 2020) {
                                if (ck.isValidID(id) && ck.isValidName(name) && ck.isValidPhone(phone) && ck.isValidGmail(email) && ck.isValidDate(dob)) {
                                    Date date = new Date(y - 1900, m - 1, d);
                                    EmployeeDTO emp = list.get(pos);
                                    emp.setEmpID(id);
                                    emp.setFullName(name);
                                    emp.setAddress(address);
                                    emp.setPhone(phone);
                                    emp.setEmail(email);
                                    emp.setDOB(date);
                                    Vector v = (Vector) data.get(0);
                                    v.set(1, name);
                                    v.set(2, phone);
                                    v.set(3, email);
                                    tblData.updateUI();
                                    JOptionPane.showMessageDialog(this, "update success");
                                    clearText();
                                }
                            } else {
                                error += "Invalidate";
                                check = true;
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "invalid date");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "infor can not empty");
                c3 = false;
            }
            if (!ck.isValidID(id)) {
                error += "invalid id";
            }
            if (!ck.isValidName(name)) {
                error += "invalid name";
            }
            if (!ck.isValidPhone(phone)) {
                error += "isvalid phone";
            }
            if (!ck.isValidGmail(email)) {
                error += "invalid mail";
            }
            if (!ck.isValidDate(dob)) {
                error += "invalid date";
            }
            if (!"".equals(error) && c3 == true) {
                JOptionPane.showMessageDialog(this, error);
            }
        } else {
            int row = tblData.getSelectedRow();
            if (!(id.isEmpty() || name.isEmpty() || address.isEmpty() || phone.isEmpty() || email.isEmpty() || dob.isEmpty())) {
                if (ck.isValidDate(dob)) {
                    String arr[] = dob.split("/");
                    if (arr.length == 3) {
                        int d = Integer.parseInt(arr[1]);
                        int m = Integer.parseInt(arr[0]);
                        int y = Integer.parseInt(arr[2]);
                        if (d >= 1 && d <= 31 && m >= 1 && m <= 12) {
                            if (m == 2 && m % 4 == 0) {
                                if (d > 29) {
                                    check = false;
                                }
                            } else if (m == 2 && m % 4 != 0) {
                                if (d >= 29) {
                                    check = false;
                                }
                            } else if (m == 4 || m == 6 || m == 9 || m == 11) {
                                if (d > 30) {
                                    check = false;
                                }
                            } else {
                                check = true;
                            }
                            if (check && y < 2020) {
                                if (ck.isValidID(id) && ck.isValidName(name) && ck.isValidPhone(phone) && ck.isValidGmail(email) && ck.isValidDate(dob)) {
                                    Date date = new Date(y - 1900, m - 1, d);
                                    EmployeeDTO emp = list.get(row);
                                    emp.setEmpID(id);
                                    emp.setFullName(name);
                                    emp.setAddress(address);
                                    emp.setPhone(phone);
                                    emp.setEmail(email);
                                    emp.setDOB(date);
                                    Vector v = (Vector) data.get(row);
                                    v.set(1, name);
                                    v.set(2, phone);
                                    v.set(3, email);
                                    tblData.updateUI();
                                    JOptionPane.showMessageDialog(this, "update success");
                                    clearText();
                                }
                            } else {
                                error += "Invalidate";
                                check = true;
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "invalid date");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "infor can not empty");
                c3 = false;
            }
            if (!ck.isValidID(id)) {
                error += "invalid id";
            }
            if (!ck.isValidName(name)) {
                error += "invalid name";
            }
            if (!ck.isValidPhone(phone)) {
                error += "isvalid phone";
            }
            if (!ck.isValidGmail(email)) {
                error += "invalid mail";
            }
            if (!ck.isValidDate(dob)) {
                error += "invalid date";
            }
            if (!"".equals(error) && c3 == true) {
                JOptionPane.showMessageDialog(this, error);
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        // TODO add your handling code here:
        int row = tblData.getSelectedRow();
        if (checkFind == true) {
            EmployeeDTO emp = list.get(pos);
            txtID.setText(emp.getEmpID());
            txtFullName.setText(emp.getFullName());
            txtPhone.setText(emp.getPhone());
            txtEmail.setText(emp.getEmail());
            txtAddress.setText(emp.getAddress());
            Date d = emp.getDOB();
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
            String dob = sdf.format(d);
            txtDOB.setText(dob);
            txtID.setEditable(false);

        } else {
            EmployeeDTO emp = list.get(row);
            txtID.setText(emp.getEmpID());
            txtFullName.setText(emp.getFullName());
            txtPhone.setText(emp.getPhone());
            txtEmail.setText(emp.getEmail());
            txtAddress.setText(emp.getAddress());
            Date d = emp.getDOB();
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
            String dob = sdf.format(d);
            txtDOB.setText(dob);
            txtID.setEditable(false);
        }

        btnFind.setEnabled(false);
        btnCreate.setEnabled(false);
        btnRemove.setEnabled(true);
        btnUpdate.setEnabled(true);
    }//GEN-LAST:event_tblDataMouseClicked

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
//        String id = txtID.getText();
//
//        boolean c = dao.removeEmp(id);
//        if (c == true) {
//            JOptionPane.showMessageDialog(null, "Remove successfull");
//            if (checkFind == false) {
//                int row = tblData.getSelectedRow();
//                data.remove(row);
//            } else {
//                data.remove(0);
//            }
//            clearText();
//            tblData.updateUI();
//        } else {
//            if (list.isEmpty()) {
//                JOptionPane.showMessageDialog(null, "List is empty");
//            } else if (id.isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Please choose 1 row to remove");
//            }
//
//        }
        String id = txtID.getText();
        boolean remove = dao.removeEmp(id);
        if (remove == true) {
            JOptionPane.showMessageDialog(this, "remove success");
            if (checkFind == false) {
                int row = tblData.getSelectedRow();
                data.remove(row);
            } else {
                data.remove(0);
            }
            clearText();
            tblData.updateUI();
        } else {
            JOptionPane.showMessageDialog(this, "remove fail");
        }

        txtID.setEditable(true);
        btnFind.setEnabled(true);
        btnCreate.setEnabled(true);
        btnRemove.setEnabled(false);
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
//        String id = txtID.getText();

//        if (list.isEmpty()) {
//            JOptionPane.showMessageDialog(null, "List is empty");
//        } else {
//            pos = dao.findEmp(id);
//            if (pos < 0) {
//                JOptionPane.showMessageDialog(null, "Employee is not exist");
//                clearText();
//            } else {
//                txtID.setEditable(false);
//                EmployeeDTO emp = list.get(pos);
//                txtID.setText(emp.getEmpID());
//                txtFullName.setText(emp.getFullName());
//                txtPhone.setText(emp.getPhone());
//                txtAddress.setText(emp.getAddress());
//                txtEmail.setText(emp.getEmail());
//                Date d = emp.getDOB();
//                SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
//                String dob = sdf.format(d);
//                txtDOB.setText(dob);
//                data.removeAllElements();
//                Vector<String> v = new Vector();
//                v.add(emp.getEmpID());
//                v.add(emp.getFullName());
//                v.add(emp.getPhone());
//                v.add(emp.getEmail());
//                data.add(v);
//                tblData.updateUI();
//                checkFind = true;
//                btnCreate.setEnabled(false);
//                btnRemove.setEnabled(true);
//                btnUpdate.setEnabled(true);
//            }
//        }
        if (list.isEmpty()) {
            JOptionPane.showMessageDialog(this, "list empty");
        } else {
            String id = txtID.getText();
            pos = dao.findEmp(id);
            if (pos < 0) {
                JOptionPane.showMessageDialog(this, "not found");
            } else {
                EmployeeDTO emp = list.get(pos);
                Date date = emp.getDOB();
                SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
                String dob = sdf.format(date);
                txtDOB.setText(dob);
                data.removeAllElements();
                Vector<String> v = new Vector<>();
                v.add(emp.getEmpID());
                v.add(emp.getFullName());
                v.add(emp.getPhone());
                v.add(emp.getEmail());
                data.add(v);
                tblData.updateUI();
                checkFind = true;
            }

        }

    }//GEN-LAST:event_btnFindActionPerformed
    private void getData() {
        if (list == null) {
            list = new ArrayList<>();
        }
        list = dao.getEmp();
    }

    private void clearText() {
        txtID.setText("");
        txtAddress.setText("");
        txtDOB.setText("");
        txtEmail.setText("");
        txtFullName.setText("");
        txtPhone.setText("");
    }

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnGetEmp;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblData;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
