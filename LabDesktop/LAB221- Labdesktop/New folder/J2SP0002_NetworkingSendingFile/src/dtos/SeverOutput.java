/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.Socket;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author dhtha
 */
public class SeverOutput implements Runnable {

    BufferedReader br;
    JTextArea txtMessage;
    Socket socket;
    ObjectInputStream ois;
    FileInfor fileInfor;

    public SeverOutput(Socket socket, JTextArea txtMessage) {
        this.socket = socket;
        this.txtMessage = txtMessage;
        try {
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Network Error!", "Message", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                if (socket != null) {
                    ois = new ObjectInputStream(socket.getInputStream());
                    fileInfor = (FileInfor) ois.readObject();
                    if (fileInfor != null) {
                        showMessage(fileInfor);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    public void showMessage(FileInfor f) {
        byte[] dataBytes = f.getDataBytes();
        txtMessage.append(dataBytes.toString());

    }
}
