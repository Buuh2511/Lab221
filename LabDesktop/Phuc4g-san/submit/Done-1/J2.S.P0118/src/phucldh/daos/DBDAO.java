/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phucldh.daos;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import phucldh.dtos.DBDTO;
import phucldh.utils.DBAccess;

/**
 *
 * @author DELL
 */
public class DBDAO {
    Connection conn = null;
    DatabaseMetaData metaData = null;
    ResultSet rs =null;
    ArrayList listingTableInDB = new ArrayList();
   
    public DBDTO getInfo() throws SQLException{
        DBDTO dbdto = null;
        
        try{
            conn = DBAccess.makeConnection();
           
          
            if(conn != null){
                metaData = conn.getMetaData();
                if(metaData != null){
                    String dbProductName = metaData.getDatabaseProductName(); System.out.println(dbProductName);
                    String dbProductVerson = metaData.getDatabaseProductVersion();
                    String dbDriverVerson = metaData.getDriverVersion();
                    rs = metaData.getTables(null, null, "%", null);
                    while(rs.next()){
                        listingTableInDB.add(rs.getString("TABLE_NAME"));
                    }
                    dbdto = new DBDTO(dbProductName, dbProductVerson, dbDriverVerson, listingTableInDB);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            closeConnection();
        }
        return dbdto;
        
    }
    private void closeConnection() throws SQLException {
        if (rs != null) {
            rs.close();
        }
        if (conn != null) {
            conn.close();
        }
    }
}
