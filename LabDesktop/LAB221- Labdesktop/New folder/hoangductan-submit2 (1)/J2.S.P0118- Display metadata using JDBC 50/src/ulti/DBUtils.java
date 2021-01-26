/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulti;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SE130485
 */
public class DBUtils {

    private static final String url = "jdbc:sqlserver://localhost;databaseName=FU_DB;";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection conn = null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        conn = DriverManager.getConnection(url, "sa", "123456");
        return conn;

    }
    
//     public DatabaseMetaData getMeta() {
//        try {
//            if (conn != null) {
//                //get metadata từ connection
//                meta = conn.getMetaData();
//            }
//        } catch (SQLException e) {
//        }
//        return meta;
//    }

   

}
