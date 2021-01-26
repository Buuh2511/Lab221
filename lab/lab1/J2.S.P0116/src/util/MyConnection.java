/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class MyConnection implements Serializable {

    public static Connection getMyConnection() throws ClassNotFoundException {
//        Connection conn = null;
//        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=FU_DB", "sa", "12346789");
//        } catch ( SQLException e) {
//            e.printStackTrace();
//        }
//        return conn;
        Connection conn=null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=FU_DB","sa","12346789");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
