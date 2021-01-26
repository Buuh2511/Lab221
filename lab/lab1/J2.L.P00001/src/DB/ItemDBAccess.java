/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import DB.DBAccess;

/**
 *
 * @author admin
 */
public class ItemDBAccess extends DBAccess {
final String driver= "com.microsoft.sqlserver.jdbc.SQLServerDriver";
final String url="jdbc:sqlserver://localhost\\SQLPRESS:1433;databaseName=ItemDB;user=sa;password=12346789";
   
    public ItemDBAccess(){
        super();
        connectDB(driver, url);
    }
}
