/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2.s.p0021;

import dbo.Course;
import dbo.CourseDBAccess;
import dbo.Courses;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class ListCourse extends javax.swing.JFrame {

    /**
     * Creates new form ListCourse
     */
    CourseDBAccess dBAccess=null;
    Courses courses;
   
    ArrayList<Course> lst = new ArrayList<>();

    public ListCourse() {
        initComponents();
        dBAccess = new CourseDBAccess();
        courses = new Courses();
       courses.loadFromDB(dBAccess);
        txtData.setEditable(false);
        loadData();
        addClosingEvent();
    }

    void addClosingEvent() {
        JFrame tmp = this;
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e); //To change body of generated methods, choose Tools | Templates.
                tmp.dispose();
                CourseManagement cm = new CourseManagement();
                cm.setVisible(true);
            }
        });
    }

    void loadData() {
//        String tmp = "";
//        try {
//            String sql="SELECT code, name, credit From Courses";
//             ResultSet rs = dBAccess.executeQuery(sql);
//            while (rs.next()) {
//                lst.add(new Course(rs.getString("code"), rs.getString("Name"), rs.getInt("Credit")));
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, e);
//        }
//        Collections.sort(lst, (Course o1, Course o2) -> {
//            if (o1.getCredit() > o2.getCredit()) {
//                return 1;
//            } else if (o1.getCredit() < o2.getCredit()) {
//                return -1;
//            } else {
//                return 0;
//            }
//        });
//        for (Course x : lst) {
//            tmp += x.toString() + "\n";
//        }
//        txtData.setFont(new Font("monospaced", Font.PLAIN, 14));
//        txtData.setText(tmp);
String tmp ="";
        try {
            String sql ="SELECT code, name, credit from Courses";
            ResultSet rs = dBAccess.executeQuery(sql);
            while(rs.next()){
                lst.add(new Course(rs.getString("code"), rs.getString("name"), rs.getInt("credit")));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        Collections.sort(lst, (Course o1, Course o2) ->{
            if(o1.getCredit() > o2.getCredit()){
                return 1;
            }
           else if(o1.getCredit() < o2.getCredit()){
                return -1;
            } else{
                return 0;
            }
        });
        for(Course x : lst){
            tmp +=x.toString() +"\n";
        }
        txtData.setText(tmp);
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
        txtData = new javax.swing.JTextArea();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        txtData.setColumns(20);
        txtData.setRows(5);
        jScrollPane1.setViewportView(txtData);

        lblTitle.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("List of all courses (Order by Credit)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ListCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new ListCourse().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txtData;
    // End of variables declaration//GEN-END:variables
}
