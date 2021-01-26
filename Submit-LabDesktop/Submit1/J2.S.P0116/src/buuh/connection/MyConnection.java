/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buuh.connection;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Buu Huynh
 */
public class MyConnection implements Serializable {

    public static Connection getMyConnection() throws Exception, ClassNotFoundException {
        Connection con = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=FU_DB", "sa", "123");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;

    }
}
