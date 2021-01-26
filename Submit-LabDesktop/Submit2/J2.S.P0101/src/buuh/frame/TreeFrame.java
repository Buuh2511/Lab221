/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buuh.frame;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Buu Huynh
 */
public class TreeFrame extends javax.swing.JFrame {

    /**
     * Creates new form TreeFrame
     */
    DefaultTreeModel model;
    DefaultMutableTreeNode root;
    DefaultMutableTreeNode selectedNode;

    public TreeFrame() {
        initComponents();
        loadTree();
        setLocationRelativeTo(null);
    }

    private void loadTree() {
        //treeData.getModel().getRoot()
        model = (DefaultTreeModel) treeData.getModel();
        root = (DefaultMutableTreeNode) model.getRoot();
        root.setUserObject("This is root");
        treeData.add("Hello World", this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtAdd = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        treeData = new javax.swing.JTree();
        btnRemove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtAdd.setText("Add new Node here and press Enter");
        txtAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAddMouseClicked(evt);
            }
        });
        txtAdd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddKeyPressed(evt);
            }
        });

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("This is root");
        treeData.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        treeData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                treeDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(treeData);

        btnRemove.setText("Select Node and Click here to Remove from the tree");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtAdd)
            .addComponent(jScrollPane1)
            .addComponent(btnRemove, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemove)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void treeDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_treeDataMouseClicked
        // TODO add your handling code here:
        selectedNode = (DefaultMutableTreeNode) treeData.getLastSelectedPathComponent();
    }//GEN-LAST:event_treeDataMouseClicked

    private void txtAddKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && selectedNode != null) {
            selectedNode.add(new DefaultMutableTreeNode(txtAdd.getText()));
            model.reload(selectedNode);
        }
    }//GEN-LAST:event_txtAddKeyPressed

    private void txtAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAddMouseClicked
        // TODO add your handling code here:
        if (txtAdd.getText().equalsIgnoreCase("Add new Node here and press Enter")) {
            txtAdd.setText("");
        }
    }//GEN-LAST:event_txtAddMouseClicked

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        if (selectedNode == root) {
            JOptionPane.showMessageDialog(this, "Must have at least 1 node. Can't remove root");
            if (JOptionPane.showConfirmDialog(this, "Do u want to change this data?", "Change root", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                root.setUserObject(JOptionPane.showInputDialog("Input String"));
                model.reload();
            }

        } else if (selectedNode != null) {
            model.removeNodeFromParent(selectedNode);
            selectedNode = null;
            model.reload();
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

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
            java.util.logging.Logger.getLogger(TreeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TreeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TreeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TreeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TreeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRemove;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree treeData;
    private javax.swing.JTextField txtAdd;
    // End of variables declaration//GEN-END:variables
}
