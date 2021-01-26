/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2.s.p0021;

import course.CourseDAO;
import course.CourseDTO;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;


/**
 *
 * @author admin
 */
public class ListCourse extends javax.swing.JDialog {

    /**
     * Creates new form ListCourse
     */
    public ListCourse() {
        initComponents();
        setLocationRelativeTo(null);
        displayList();
    }
    private void displayList() {
//        try {
//            
//            CourseDAO dao = new CourseDAO();
//            List<CourseDTO> courseList = dao.getAllCourses();
//            Collections.sort(courseList);
//            Vector<String> v = new Vector<>();
//            for (CourseDTO dto : courseList) {
//                v.add(dto.toString());
//            }
//            vlistCourse.setListData(v);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
try {
            CourseDAO dao= new CourseDAO();
            List<CourseDTO> list= dao.getAllCourses();
            Collections.sort(list);
            Vector<String> v=new Vector<>();
            for(CourseDTO dto: list){
                v.add(dto.toString());
        }
            vlistCourse.setListData(v);
} catch (Exception e) {
            e.printStackTrace();
        
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        vlistCourse = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("List of all Courses (order by Credit)");
        jLabel1.setPreferredSize(new java.awt.Dimension(286, 30));
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_START);

        vlistCourse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(vlistCourse);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> vlistCourse;
    // End of variables declaration//GEN-END:variables
}