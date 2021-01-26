/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Vu Quoc Hung
 */
public class MyDB {
    
    public static Connection makeConnection() {
        Connection cn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=FU_DB";
            cn = DriverManager.getConnection(url, "sa", "123456"); //pass
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cn;
    }
    
    
}
