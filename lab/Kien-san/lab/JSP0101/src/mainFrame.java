
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vu Quoc Hung
 */
public class mainFrame extends JFrame{
    private JButton btnAddNode, btnDeleteNode;
    private JTree tree;
    //S0101 - 60
    
    public mainFrame() {
        btnAddNode = new JButton("Add a new Node");
        btnDeleteNode = new JButton("Delete a node");
        
        JPanel mainPanel = (JPanel)this.getContentPane(); //để lấy đối tượng panel 
        mainPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        mainPanel.add(btnAddNode);
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Java Tree Example");
        DefaultMutableTreeNode resources = new DefaultMutableTreeNode("Resourses");
        DefaultMutableTreeNode tools = new DefaultMutableTreeNode("Tools");
        root.add(resources);
        root.add(tools);
        
        tree = new JTree(root);
        mainPanel.add(tree);
        DefaultTreeModel model = (DefaultTreeModel) tree.getModel();              
        mainPanel.add(btnDeleteNode);
        setSize(200, 500);
        
        btnAddNode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog(null, "Enter String: ");                
                DefaultMutableTreeNode child = new DefaultMutableTreeNode(input);
                DefaultMutableTreeNode parentNode = null;
                TreePath parentPath = tree.getSelectionPath();
                
                if (parentPath == null) {
                    parentNode = (DefaultMutableTreeNode) model.getRoot();
                    } else {
                        parentNode = (DefaultMutableTreeNode) (parentPath.getLastPathComponent());
                }
                
                
                parentNode.add(child);
                tree.updateUI();
            }
            
                
        });
        
        btnDeleteNode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TreePath parentPath = tree.getSelectionPath();
                DefaultMutableTreeNode deletedNode = null;
                
                if (parentPath == null) {
                    JOptionPane.showMessageDialog(null, "U NEED TO CHOOSE NODE");
                    } else {
                        deletedNode = (DefaultMutableTreeNode) (parentPath.getLastPathComponent());
                        DefaultMutableTreeNode parent = (DefaultMutableTreeNode)deletedNode.getParent();                
                        if(parent != null) {
                            model.removeNodeFromParent(deletedNode);
                        }
                }
            }
        });
    }
    
    public static void main(String[] args) {
        mainFrame mF = new mainFrame();
        mF.setVisible(true);
    }
}
