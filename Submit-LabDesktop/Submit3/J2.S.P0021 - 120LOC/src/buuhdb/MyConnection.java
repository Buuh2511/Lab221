/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buuhdb;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Buu Huynh
 */
public class MyConnection {

    public static Connection getMyConnection() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con = DriverManager.getConnection("jdbc://sqlserver://localhost:1433;databasename=FU_DB", "sa", "123");
        return con;
    }
}
