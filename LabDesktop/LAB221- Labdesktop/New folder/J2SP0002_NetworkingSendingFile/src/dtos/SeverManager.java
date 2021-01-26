/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author dhtha
 */
public class SeverManager {

    String IP = "127.0.0.1";
    private static int PORT = 9999;

    public SeverManager() {

    }

    public Socket getServerSocket() {
        Socket socket = null;
        try {
            ServerSocket srvSocket = new ServerSocket(PORT);
            socket = srvSocket.accept();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return socket;
    }

    public Socket getClientSocket() {
        Socket socket = null;
        try {
            socket = new Socket(IP, PORT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return socket;
    }

}
