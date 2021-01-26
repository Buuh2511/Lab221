/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phucldh.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class DBAccess {

    static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static String url = "jdbc:sqlserver://localhost:1433;databaseName=FU_DB";
          

    public static Connection makeConnection() {
        try {
            Class.forName(driver);
            Connection c = DriverManager.getConnection(url,"sa","123456");
            return c;

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
//      public static Connection getConnection() throws ClassNotFoundException, SQLException {
//        Connection conn;
//        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//        String url = "jdbc:sqlserver://localhost:1433;databaseName=FU_DB";
//        conn = DriverManager.getConnection(url, "sa", "123456");
//        return conn;
//      }
      
}
