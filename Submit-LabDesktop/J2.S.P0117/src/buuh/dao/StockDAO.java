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
import java.util.ArrayList;

/**
 *
 * @author Buu Huynh
 */
public class StockDAO {

    Connection conn = null;
    PreparedStatement stm = null;
    ResultSet rs = null;

    public void closeConnection() throws Exception {
        if (rs != null) {
            rs.close();
        }
        if (stm != null) {
            stm.close();
        }
        if (conn != null) {
            conn.close();
        }
    }

    public boolean insertBatchUpdate(ArrayList<StockDTO> stocks) throws Exception {
        boolean result = false;
        try {
            String sql = "Insert into Stocks(StockID,StockName,Address,DateAvailable,Note) values(?,?,?,?,?)";
            conn = MyConnection.getMyConnection();
            stm = conn.prepareStatement(sql);
            conn.setAutoCommit(false);
            for (StockDTO stock : stocks) {
                stm.setInt(1, stock.getStockID());
                stm.setString(2, stock.getStockName());
                stm.setString(3, stock.getAddress());
                stm.setString(4, stock.getDateAvailable());
                stm.setString(5, stock.getNote());
                stm.addBatch();
            }
            stm.executeBatch();
            conn.commit();
            //stm.clearBatch();
            result = true;
        } catch (Exception e) {
            conn.rollback();
        } finally {
            closeConnection();
        }
        return result;
    }
}
