package j2.s.p0021;

import java.util.Collections;
import javax.swing.JOptionPane;

public class CouserManagement extends javax.swing.JFrame {

    Course listData = new Course();

    public CouserManagement() {
        initComponents();
        AddCourse.setSize(400, 300);
        AddCourse.setLocationRelativeTo(null);
        SearchCourse.setSize(500, 300);
        SearchCourse.setLocationRelativeTo(null);
        ListCourse.setSize(400, 300);
        ListCourse.setLocationRelativeTo(null);
        setLocationRelativeTo(null);
        
    }

    public void showUserWindow(boolean add, boolean search, boolean display) {
        AddCourse.setVisible(add);
        SearchCourse.setVisible(search);
        ListCourse.setVisible(display);

    }

    public int checkCode(String code) {
        for (int i = 0; i < listData.size(); i++) {
            if (code.matches(listData.get(i).getCode())) {
                return i;

            }
        }
        return -1;
    }

    public boolean checkExistCode(String code) {
        if (code.isEmpty()) {
            return false;

        }
        return true;

    }

    public boolean checkName(String name) {
        if (name.isEmpty()) {
            return false;
        }
        return true;

    }

    public boolean checkCredit(String credit) throws NumberFormatException {
        try {
            if ((Integer.parseInt(credit)) <= 0) {
                return false;
            }
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public void display() {
        jTextArea1.setText("");
        for (Course course : listData) {
            jTextArea1.append(String.format("%-20s | %-30s | %-3d\n",
                    course.getCode(), course.getName(), course.getCredit()));
        }

    } 

    public void addNew(String code, String name, String credit) {
        try {
            if (checkCode(code) > -1 || !checkExistCode(code)) {
                JOptionPane.showMessageDialog(null, "Code is required or existed!!!!");
                return;

            }
            if (!checkName(name)) {
                JOptionPane.showMessageDialog(null, "Name is required!!!!");
                return;

            }
            if (!checkCredit(credit)) {
                JOptionPane.showMessageDialog(null, "Credit is required!!!!");
                return;

            }
            else{
            listData.add(new Course(code, name, Integer.parseInt(credit)));
            txtCode.setText("");
            txtName.setText("");
            txtCredit.setText("");
            Collections.sort(listData);
            display();
            JOptionPane.showMessageDialog(this, "add successful");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void search(String code) {
        int pos = 0;
        if (listData.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Empty list!!");
            return;

        }
        if (!checkExistCode(code)) {
            JOptionPane.showMessageDialog(null, "Code is required!!");

            return;

        }
        pos = checkCode(code);
        if (pos > -1) {
            txtSearchName.setText(listData.get(pos).getName());
            txtSearchCredit.setText(listData.get(pos).getCredit() + "");

        }else {
            JOptionPane.showMessageDialog(null, "This course is not existed!");

        
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ListCourse = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        AddCourse = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtCredit = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        SearchCourse = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        txtSearchCode = new javax.swing.JTextField();
        btnSearchCourse = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSearchName = new javax.swing.JTextField();
        txtSearchCredit = new javax.swing.JTextField();
        jFrame1 = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnShowAddWindow1 = new javax.swing.JButton();
        btnDisplay1 = new javax.swing.JButton();
        btnSearchWindow1 = new javax.swing.JButton();
        btnExit1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnShowAddWindow = new javax.swing.JButton();
        btnDisplay = new javax.swing.JButton();
        btnSearchWindow = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout ListCourseLayout = new javax.swing.GroupLayout(ListCourse.getContentPane());
        ListCourse.getContentPane().setLayout(ListCourseLayout);
        ListCourseLayout.setHorizontalGroup(
            ListCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ListCourseLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        ListCourseLayout.setVerticalGroup(
            ListCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ListCourseLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        AddCourse.getContentPane().setLayout(null);

        jLabel2.setText("Code:");
        AddCourse.getContentPane().add(jLabel2);
        jLabel2.setBounds(32, 28, 60, 30);

        jLabel3.setText("Name:");
        AddCourse.getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 90, 60, 30);

        jLabel4.setText("Credit:");
        AddCourse.getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 150, 60, 30);

        txtCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeActionPerformed(evt);
            }
        });
        AddCourse.getContentPane().add(txtCode);
        txtCode.setBounds(120, 20, 140, 30);

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        AddCourse.getContentPane().add(txtName);
        txtName.setBounds(120, 100, 220, 20);

        txtCredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreditActionPerformed(evt);
            }
        });
        AddCourse.getContentPane().add(txtCredit);
        txtCredit.setBounds(120, 160, 130, 20);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        AddCourse.getContentPane().add(btnAdd);
        btnAdd.setBounds(40, 240, 70, 23);

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        AddCourse.getContentPane().add(btnClear);
        btnClear.setBounds(240, 240, 90, 23);

        SearchCourse.getContentPane().setLayout(null);

        jLabel5.setText("Enter code:");
        SearchCourse.getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 27, 100, 30);

        txtSearchCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchCodeActionPerformed(evt);
            }
        });
        SearchCourse.getContentPane().add(txtSearchCode);
        txtSearchCode.setBounds(170, 30, 110, 20);

        btnSearchCourse.setText("Search");
        btnSearchCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchCourseActionPerformed(evt);
            }
        });
        SearchCourse.getContentPane().add(btnSearchCourse);
        btnSearchCourse.setBounds(340, 30, 110, 30);

        jLabel6.setText("Course name:");
        SearchCourse.getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 110, 100, 30);

        jLabel7.setText("Credit:");
        SearchCourse.getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 190, 80, 30);
        SearchCourse.getContentPane().add(txtSearchName);
        txtSearchName.setBounds(160, 117, 170, 30);
        SearchCourse.getContentPane().add(txtSearchCredit);
        txtSearchCredit.setBounds(160, 190, 170, 30);

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new java.awt.GridLayout(0, 1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setLabelFor(this);
        jLabel8.setText("Course Management");
        jPanel2.add(jLabel8);

        btnShowAddWindow1.setText("Add a new course");
        btnShowAddWindow1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAddWindow1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnShowAddWindow1);

        btnDisplay1.setText("Display All Course");
        btnDisplay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplay1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnDisplay1);

        btnSearchWindow1.setText("Search Course by Source Code");
        btnSearchWindow1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchWindow1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSearchWindow1);

        btnExit1.setText("Exit Application");
        btnExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnExit1);

        jFrame1.getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 500));
        jPanel1.setLayout(new java.awt.GridLayout(0, 1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setLabelFor(this);
        jLabel1.setText("Course Management");
        jPanel1.add(jLabel1);

        btnShowAddWindow.setText("Add a new course");
        btnShowAddWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAddWindowActionPerformed(evt);
            }
        });
        jPanel1.add(btnShowAddWindow);

        btnDisplay.setText("Display All Course");
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });
        jPanel1.add(btnDisplay);

        btnSearchWindow.setText("Search Course by Source Code");
        btnSearchWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchWindowActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearchWindow);

        btnExit.setText("Exit Application");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowAddWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAddWindowActionPerformed
        showUserWindow(true, false, false);
        

        // TODO add your handling code here:
    }//GEN-LAST:event_btnShowAddWindowActionPerformed

    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed
        showUserWindow(false, false, true);
    }//GEN-LAST:event_btnDisplayActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        addNew(txtCode.getText(), txtName.getText(), txtCredit.getText());

        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSearchWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchWindowActionPerformed
        showUserWindow( false,true, false);
    }//GEN-LAST:event_btnSearchWindowActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtCode.setText("");
        txtName.setText("");
        txtCredit.setText("");


        // TODO add your handling code here:
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSearchCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchCourseActionPerformed
        // TODO add your handling code here:S
        search(txtSearchCode.getText());
        
        
    }//GEN-LAST:event_btnSearchCourseActionPerformed

    private void txtCreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreditActionPerformed

    private void txtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeActionPerformed

    private void btnShowAddWindow1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAddWindow1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnShowAddWindow1ActionPerformed

    private void btnDisplay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplay1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDisplay1ActionPerformed

    private void btnSearchWindow1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchWindow1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchWindow1ActionPerformed

    private void btnExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExit1ActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtSearchCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchCodeActionPerformed

    /**
     * @param args the command line arguments
     *  public void search(String code) {
        int pos = 0;
        if (listData.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Empty list!!");
            return;

        }
        if (!checkExistCode(code)) {
            JOptionPane.showMessageDialog(null, "Code is required!!");

            return;

        }
        pos = checkCode(code);
        if (pos > -1) {
            txtSearchName.setText(listData.get(pos).getName());
            txtSearchCredit.setText(listData.get(pos).getCredit() + "");

        }else {
            JOptionPane.showMessageDialog(null, "This course is not existed!");

        
        }

    }
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
//        public void addNew(String code, String name, String credit) {
//        try {
//            if (checkCode(code) > -1 || !checkExistCode(code)) {
//                JOptionPane.showMessageDialog(null, "Code is required or existed!!!!");
//                return;
//
//            }
//            if (!checkName(name)) {
//                JOptionPane.showMessageDialog(null, "Name is required!!!!");
//                return;
//
//            }
//            if (!checkCredit(credit)) {
//                JOptionPane.showMessageDialog(null, "Credit is required!!!!");
//                return;
//
//            }
//            listData.add(new Course(code, name, Integer.parseInt(credit)));
//            txtCode.setText("");
//            txtName.setText("");
//            txtCredit.setText("");
//            Collections.sort(listData);
//            display();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
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
            java.util.logging.Logger.getLogger(CouserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CouserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CouserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CouserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
//         public void addNew(String code, String name, String credit) {
//        try {
//            if (checkCode(code) > -1 || !checkExistCode(code)) {
//                JOptionPane.showMessageDialog(null, "Code is required or existed!!!!");
//                return;
//
//            }
//            if (!checkName(name)) {
//                JOptionPane.showMessageDialog(null, "Name is required!!!!");
//                return;
//
//            }
//            if (!checkCredit(credit)) {
//                JOptionPane.showMessageDialog(null, "Credit is required!!!!");
//                return;
//
//            }
//            listData.add(new Course(code, name, Integer.parseInt(credit)));
//            txtCode.setText("");
//            txtName.setText("");
//            txtCredit.setText("");
//            Collections.sort(listData);
//            display();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    public void search(String code) {
//        int pos = 0;
//        if (listData.isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Empty list!!");
//            return;
//
//        }
//        if (!checkExistCode(code)) {
//            JOptionPane.showMessageDialog(null, "Code is required!!");
//
//            return;
//
//        }
//        pos = checkCode(code);
//        if (pos > -1) {
//            txtSearchName.setText(listData.get(pos).getName());
//            txtSearchCredit.setText(listData.get(pos).getCredit() + "");
//
//        }else {
//            JOptionPane.showMessageDialog(null, "This course is not existed!");
//
//        
//        }
//
//    }

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CouserManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog AddCourse;
    private javax.swing.JDialog ListCourse;
    private javax.swing.JDialog SearchCourse;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDisplay;
    private javax.swing.JButton btnDisplay1;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnExit1;
    private javax.swing.JButton btnSearchCourse;
    private javax.swing.JButton btnSearchWindow;
    private javax.swing.JButton btnSearchWindow1;
    private javax.swing.JButton btnShowAddWindow;
    private javax.swing.JButton btnShowAddWindow1;
    private javax.swing.JFrame jFrame1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtCredit;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearchCode;
    private javax.swing.JTextField txtSearchCredit;
    private javax.swing.JTextField txtSearchName;
    // End of variables declaration//GEN-END:variables
}
