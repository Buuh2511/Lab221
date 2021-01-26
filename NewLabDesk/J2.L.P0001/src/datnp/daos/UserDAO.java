/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datnp.daos;

import datnp.db.MyConnection;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author dnn84
 */
public class UserDAO implements Serializable{
    private Connection conn;
    private PreparedStatement preStm;
    private ResultSet rs;
    private void closeConnection() throws Exception{
        if(rs != null){
            rs.close();
        }
        if(preStm != null){
            preStm.close();
        }
        if(conn != null){
            conn.close();
        }
    }
    public boolean checkLogin(String username, String password) throws Exception{
        boolean result = false;
        try{
            String sql = "Select fullName From tblUsers Where fullName = ? and password = ?";
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, username);
            preStm.setString(2, password);
            rs = preStm.executeQuery();
            
            if(rs.next()){
                result = true;
            }
        }finally{
            closeConnection();
        }
        return result;
    }
}
