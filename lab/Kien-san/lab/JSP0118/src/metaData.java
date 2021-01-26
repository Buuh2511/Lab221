/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author Vu Quoc Hung
 */
public class metaData { //JSP0118
    static Connection cn = null;
    static DatabaseMetaData data = null;
    
    static {
        try {
            cn =(Connection)MyDB.makeConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            data = cn.getMetaData();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void printMetaData() throws SQLException {
        System.out.println("Database Product Name: " + data.getDatabaseProductName());
        System.out.println("Database Product Version: " + data.getDatabaseProductVersion());
        
        System.out.println("Database Driver Name: " + data.getDriverName());
        System.out.println("Database Driver Version: " + data.getDriverVersion());
        
    }
    
    public static ArrayList getTable() throws SQLException {
        String table[] = {"TABLE"};
        ArrayList tableFromDatabase = new ArrayList();
        // receive the Type of the object in a String array.
        ResultSet rs = data.getTables(null, null, null, table);
        while (rs.next()) {
            tableFromDatabase.add(rs.getString("TABLE_NAME"));
        }
        return tableFromDatabase;
    }
    
    public static void main(String[] args) {
        try {
            printMetaData();
            ArrayList table = getTable();
            for (Object object : table) {
                System.out.println(object);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
