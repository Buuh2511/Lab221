/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buuh.dao;

import buuh.db.MyConnection;
import buuh.dto.StockDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Buu Huynh
 */
public class StockDAO {
    private Connection con;
    private PreparedStatement prm;
    private ResultSet rs;
    
    private void closeConnection(){
        try {
            if(rs != null) prm.close();
            if(prm != null) prm.close();
            if(con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public boolean insertToDB(ArrayList<StockDTO> list){
        try {
            con = MyConnection.getMyConnection();
            if(con != null){
                String sql = "INSERT INTO Stocks VALUES(?,?,?,?,?)";
                prm = con.prepareStatement(sql);
                con.setAutoCommit(false);
                for (StockDTO dto : list) {
                    prm.setInt(1, dto.getId());
                    prm.setString(2, dto.getName());
                    prm.setString(3, dto.getAddress());
                    prm.setString(4, dto.getDateAavilable());
                    prm.setString(5, dto.getNote());
                    prm.addBatch(sql);
                }
                prm.executeBatch();
                con.commit();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            closeConnection();
        }
        return false;
    }
}
