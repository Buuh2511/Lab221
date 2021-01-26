/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buuh.dao;

import buuh.connection.MyConnection;
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

    Connection con;
    PreparedStatement stm;
    ResultSet rs;

    public void closeConnection() throws Exception {
        if (rs != null) {
            rs.close();
        }
        if (stm != null) {
            stm.close();
        }
        if (con != null) {
            con.close();
        }
    }
    
    public boolean insertByPreparedStatment(ArrayList<StockDTO> stocks) throws Exception{
        boolean result = false;
        String sql = "Insert into Stocks (StockID, StockName, Address, DateAvailable) values(?,?,?,?)";
        try {
            con = MyConnection.getMyconnection();
            stm = con.prepareStatement(sql);
            for (StockDTO stock : stocks) {
                stm.setInt(1, stock.getStockID());
                stm.setString(2, stock.getStockName());
                stm.setString(3, stock.getAddress());
                stm.setString(4, stock.getDate());
                //stm.setString(5, stock.getNote());
                stm.executeUpdate();
            }
            result = true;
        } catch (SQLException e) {
            result = false;
        } finally {
            closeConnection();
        }
        return result;
    }

}
