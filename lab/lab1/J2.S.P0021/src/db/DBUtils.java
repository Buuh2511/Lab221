/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtils {
    
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
//        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//        String url = "jdbc:sqlserver://localhost\\SQLPRESS:1433;databaseName=DB21";
//        Connection con = DriverManager.getConnection(url, "sa", "12346789");
//        return con;
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
String sql="jdbc:sqlserver://localhost\\SQLPRESS:1433;databaseName=DB21";
Connection con=DriverManager.getConnection(sql,"sa","12346789");
return con;
}}
