package J2.S.P0006;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

public class ListDemo extends javax.swing.JFrame {

    DefaultListModel<String> modelList;
    Picture image;

    public ListDemo() {
        initComponents();
        setSize(550, 400);
        setLocationRelativeTo(null);
        setTitle("ListDemo");
        setLocationRelativeTo(null);
        modelList = new DefaultListModel();
        loadModel();
        jListPictures.setModel(modelList);

        image = new Picture();
        jListPictures.setSelectedIndex(0);
        image.showImages(0, lbJList);

    }

    private void loadModel() {
        for (int i = 0; i < 6; i++) {
            modelList.addElement("Image " + (i + 1));
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListPictures = new javax.swing.JList<>();
        lbJList = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jListPictures.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Image 1", "Image 2", "Image 3", "Image 4", "Image 5", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListPictures.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListPicturesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListPictures);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(12, 23, 70, 130);

        lbJList.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbJList);
        lbJList.setBounds(190, 60, 340, 250);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jListPicturesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListPicturesValueChanged
        // TODO add your handling code here:
        int choice = jListPictures.getSelectedIndex();
        image.showImages(choice, lbJList);


    }//GEN-LAST:event_jListPicturesValueChanged

    /**  int choice = jListPictures.getSelectedIndex();
        image.showImages(choice, lbJList);
     * @param args the command line arguments
     *  public String[] getImage() {
        File file = new File(getClass().getResource("/images").getFile());
        String[] imageList = file.list();
        return imageList;
    }
    public void showImages(int index, JLabel lb) {
        String[] imageList = getImage();
        String imageName = imageList[index];
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/" + imageName));
        Image image = icon.getImage().getScaledInstance(lb.getHeight(), lb.getWidth(), Image.SCALE_SMOOTH);
        lb.setIcon(icon);
    }
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
            java.util.logging.Logger.getLogger(ListDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListDemo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> jListPictures;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbJList;
    // End of variables declaration//GEN-END:variables
}
