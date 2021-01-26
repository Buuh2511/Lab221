/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab221_j2sp0105;

import java.time.LocalDate;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class CheckForm extends javax.swing.JFrame {

    /**
     * Creates new form checkForm
     */
    public CheckForm() {
        initComponents();
    }

    public boolean checkName() {
        String name = txtName.getText().trim();
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Name must not null");
            txtName.requestFocus();
            return false;
        }
        if (name.length() > 30) {
            JOptionPane.showMessageDialog(null, "Name must not lenght than 30");
            txtName.requestFocus();
            return false;
        }
        return true;
    }

    public boolean checkCode() {
        String code = txtCode.getText().trim();
        if (code.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Code must not null");
            txtCode.requestFocus();
            return false;
        }
        if (code.length() > 10) {
            JOptionPane.showMessageDialog(null, "Code must not lenght than 10");
            txtCode.requestFocus();
            return false;
        }
        for (int i = 0; i < code.length(); i++) {
            if ((code.charAt(i) + "").matches("\\@") || (code.charAt(i) + "").matches("\\#") || (code.charAt(i) + "").matches("\\$")) {
                JOptionPane.showMessageDialog(null, "Code must not contain special ( $ @ # )");
                txtCode.requestFocus();
                return false;
            }
        }
        return true;
    }

    public boolean checkDate() {
//        String date = txtBirth.getText().trim();
//        if (date.isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Date must not null");
//            txtBirth.requestFocus();
//            return false;
//        }
//        if (date.matches("^[0-9]{2}/[0-9]{2}/[0-9]{4}$")) {
//            StringTokenizer stk = new StringTokenizer(date, "/");
//            int day = Integer.parseInt(stk.nextToken());
//            int month = Integer.parseInt(stk.nextToken());
//            int year = Integer.parseInt(stk.nextToken());
//            try {
//                LocalDate.of(year, month, day);
//                return true;
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, "Date input date is unvalid");
//                txtBirth.requestFocus();
//                return false;
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "Format dd/mm/yyyy");
//            txtBirth.requestFocus();
//            return false;
//        }
String date = txtBirth.getText().trim();
if(date.isEmpty()){
    JOptionPane.showMessageDialog(null, "date empty");
    txtBirth.requestFocus();
    return false;
}
if(date.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}$")){
    StringTokenizer stk = new StringTokenizer(date, "/");
    int day = Integer.parseInt(stk.nextToken());
    int month = Integer.parseInt(stk.nextToken());
    int year = Integer.parseInt(stk.nextToken());
    try {
        LocalDate.of(year, month, day);
        return true;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "unvaid date");
        txtBirth.requestFocus();
        return false;
    } 
}else{
    JOptionPane.showMessageDialog(null, "error fotmat day");
    txtBirth.requestFocus();
    return false;
}
    }

    public boolean checkPhone() {
//        String phone = txtPhone.getText().trim();
//        if (phone.isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Phone must not null");
//            txtPhone.requestFocus();
//            return false;
//        }
//
//        if (phone.length() > 15) {
//            JOptionPane.showMessageDialog(null, "Phone must not lenght than 15");
//            txtPhone.requestFocus();
//            return false;
//        }
//        for (int i = 0; i < phone.length(); i++) {
//            if(!(phone.charAt(i) + "").matches("[0-9]")){
//                JOptionPane.showMessageDialog(null, "Phone contain character 0 -9 ");
//                txtPhone.requestFocus();
//                return false;
//            }
//        }
//        return true;
String phone = txtPhone.getText().trim();
if(phone.isEmpty()){
    JOptionPane.showMessageDialog(null, "phone empty");
            txtPhone.requestFocus();
            return false; 
}
if(phone.length() > 15){
    JOptionPane.showMessageDialog(null, "cant than 15");
            txtPhone.requestFocus();
            return false; 
}
for(int i=0;i< phone.length();i++){
    if(!(phone.charAt(i)+ "").matches("[0-9]")){
        JOptionPane.showMessageDialog(null, "contain 0-9");
            txtPhone.requestFocus();
            return false; 
    }
}
return true;
    }
    
    public boolean checkEmail(){
//            String mail = txtEmail.getText().trim();
//            int check = 0;
//        if (mail.isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Email must not null");
//            txtEmail.requestFocus();
//            return false;
//        }
//
//        if (mail.length() > 30) {
//            JOptionPane.showMessageDialog(null, "Email must not lenght than 30");
//            txtEmail.requestFocus();
//            return false;
//        }
//        for (int i = 0; i < mail.length(); i++) {
//            if(!(mail.charAt(i) + "").matches("\\@")){
//               check = 1;
//            }
//        }
//        if(check != 1){
//            JOptionPane.showMessageDialog(null, "Email have contain character @ ");
//                txtEmail.requestFocus();
//                return false;
//        }
//        
//        for (int i = 0; i < mail.length(); i++) {
//            if ((mail.charAt(i) + "").matches("\\!") || (mail.charAt(i) + "").matches("\\#") || (mail.charAt(i) + "").equals("\\$")) {
//                JOptionPane.showMessageDialog(null, "Mail must not contain special ( $ ! # )");
//                txtEmail.requestFocus();
//                return false;
//            }
//        }
//        
//       if(!mail.matches("^[a-zA-Z][^\\!\\#\\$]*\\@([\\w]+\\.)[\\w]+")){
//            JOptionPane.showMessageDialog(null, "Email wrong fomat");
//            txtEmail.requestFocus();
//            return false;
//        }
//        return true;
   String email = txtEmail.getText().trim();
   int check =0;
   if(email.isEmpty()){
       JOptionPane.showMessageDialog(null, "email empty");
       txtCode.requestFocus();
       return false;
   }
   if(email.length() > 30){
       JOptionPane.showMessageDialog(null, "cant than 30");
       txtEmail.requestFocus();
       return false;
   }
   for(int i=0;i <email.length();i++){
       if(!(email.charAt(i) +"").matches("\\@")){
           check =1;
       }
   }
   if(check !=1){
       JOptionPane.showMessageDialog(null, "must contain @");
       txtEmail.requestFocus();
       return false;
   }
   for(int i=0;i<email.length();i++){
       if((email.charAt(i) +"").matches("\\!") || (email.charAt(i) +"").matches("\\#") || (email.charAt(i) +"").matches("\\$")){
           JOptionPane.showMessageDialog(null, "cant contain !#$");
           txtEmail.requestFocus();
           return false;
       }
   }

   if(!email.matches("^[a-zA-Z][^\\!\\#\\$]*\\@([\\w]+\\.)[\\w]+")){
       JOptionPane.showMessageDialog(null, "error format");
       txtEmail.requestFocus();
       return false;
   }
   return true;
           }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtBirth = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnCheck = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Student code");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Student name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("BirthDay");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Phone Number");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Email");

        btnCheck.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCheck.setText("Check");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCode)
                    .addComponent(txtName)
                    .addComponent(txtBirth)
                    .addComponent(txtPhone)
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(394, 394, 394))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPhone)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        if(checkCode() && checkName() && checkDate() && checkPhone() && checkEmail()){
            JOptionPane.showMessageDialog(null, "valid");
        }
    }//GEN-LAST:event_btnCheckActionPerformed

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
            java.util.logging.Logger.getLogger(CheckForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtBirth;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
