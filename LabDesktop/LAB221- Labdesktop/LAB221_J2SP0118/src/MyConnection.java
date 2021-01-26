
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.naming.NamingException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS
 */
public class MyConnection implements Serializable {

    public static Connection makeConnection() throws SQLException, NamingException, ClassNotFoundException {
        //1. Load driver
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        // 2. Creat connetion
        String url = "jdbc:sqlserver://localhost:1433;databaseName=FU_DB";
        // 3. Open Connection
        Connection con = DriverManager.getConnection(url, "sa", "123456");
        return con;
    }
    
}
