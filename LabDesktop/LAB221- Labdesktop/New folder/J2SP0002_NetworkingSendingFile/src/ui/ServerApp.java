/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import dtos.FileInfor;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author dhtha
 */
public class ServerApp extends javax.swing.JFrame implements Runnable {

    /**
     * Creates new form J2SP0002
     */
    private ServerSocket srvSocket = null;
    private Socket socket = null;
    private BufferedReader br = null;
    private Thread t;
    private ObjectInputStream ois;
    private FileInfor fileInfor;
    private final int PORT = 9999;

    public ServerApp() {
        initComponents();
        txtMessage.setEditable(false);
        setTitle("Server App");
        setResizable(false);
    }

    private void startServer() {
        try {
            srvSocket = new ServerSocket(PORT);
            socket = srvSocket.accept();
            btnStart.setText("Starting...");
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (socket != null) {
            try {
                br = new BufferedReader(new InputStreamReader(socket.getInputStream()));;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Network Error!", "Message", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
        }

        t = new Thread(this);
        t.start();
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
        txtFilePath = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMessage = new javax.swing.JTextArea();
        btnStart = new javax.swing.JButton();
        tbnChooseFile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("File Path");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Message");

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtMessage.setColumns(20);
        txtMessage.setRows(5);
        jScrollPane1.setViewportView(txtMessage);

        btnStart.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        tbnChooseFile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbnChooseFile.setText("Choose Path");
        tbnChooseFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnChooseFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tbnChooseFile)))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbnChooseFile))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        // TODO add your handling code here:
        startServer();
        btnStart.setEnabled(false);
    }//GEN-LAST:event_btnStartActionPerformed

    private boolean isPath() {
        File f = new File(txtFilePath.getText().trim());
        if (f.isAbsolute()) {
            return true;
        }
        JOptionPane.showMessageDialog(this, "Path not valid!");
        return false;
    }
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if (!isPath()) {
            return;
        }
        File f = new File(txtFilePath.getText().trim());
        try {
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f));
            bos.write(fileInfor.getDataBytes());
            bos.flush();
            bos.close();
            JOptionPane.showMessageDialog(this, "File " + fileInfor.getFileName() + " has been saved!");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }

    }//GEN-LAST:event_btnSaveActionPerformed


    private void tbnChooseFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnChooseFileActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        try {
            fc.setSelectedFile(new File(fileInfor.getFileName()));
            fc.setCurrentDirectory(new File("."));
            fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            fc.showSaveDialog(this);
            if (fc.getSelectedFile() != null) {
                txtFilePath.setText(fc.getSelectedFile().getAbsolutePath() + "\\" + fileInfor.getFileName());
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_tbnChooseFileActionPerformed

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
            java.util.logging.Logger.getLogger(ServerApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServerApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServerApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServerApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServerApp().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton tbnChooseFile;
    private javax.swing.JTextField txtFilePath;
    private javax.swing.JTextArea txtMessage;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while (true) {
            if (socket != null) {
                String line = "";
                try {
                    if ((line = br.readLine()) != null) {
                        if ("&FSendFile".equals(line)) {
                            ois = new ObjectInputStream(socket.getInputStream());
                            FileInfor fileInfor = (FileInfor) ois.readObject();
                            if (fileInfor != null) {
                                this.fileInfor = fileInfor;
                            }
                            
                            txtMessage.append("Received file " + fileInfor.getFileName() + "\n");
                        }
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {

                }
            }
        }
    }

}
