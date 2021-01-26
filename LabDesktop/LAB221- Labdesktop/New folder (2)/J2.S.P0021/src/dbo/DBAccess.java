/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class DBAccess {
Connection con = null;
    Statement sta = null;

    public DBAccess() {
    }
    public void connectDB(String driver, String url) {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url);
            sta = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public ResultSet executeQuery(String selectsql){
        if(con == null) return null;
        try {
            return (sta.executeQuery(selectsql));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    public int executeUpdate(String updatesql){
      if(con == null) return 0;
        try {
            return (sta.executeUpdate(updatesql));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } return  0;
        }
}