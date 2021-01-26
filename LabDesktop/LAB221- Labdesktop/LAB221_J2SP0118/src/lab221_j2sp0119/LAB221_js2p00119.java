package lab221_j2sp0119;


import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS
 */
public class LAB221_js2p00119 {

    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // 2. Creat connetion
            String url = "jdbc:sqlserver://localhost:1433;databaseName=fu";
            // 3. Open Connection
            Connection con = DriverManager.getConnection(url, "sa", "123456");
//        return con;
            DatabaseMetaData dmd = con.getMetaData();
            ResultSet rs = dmd.getTables(null, null, null, new String[]{"TABLE"});
            System.out.println("	Database product name: " + dmd.getDatabaseProductName());
            System.out.println("        Database product vesion: " + dmd.getDatabaseProductVersion());
            System.out.println("        Database driver version: " + dmd.getDriverVersion());
            System.out.println("        Listing tables in the database: ");
            int i = 1;
            while (rs.next()) {
                System.out.println((i++) + ".\t" + rs.getString("TABLE_NAME"));

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
