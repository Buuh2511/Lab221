/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author dhtha
 */
public class StockDAO {

    private Connection conn;
    private PreparedStatement preStm;
    private ResultSet rs;

    public StockDAO() {
    }

    public void closeConnection() {
        try {
            if (rs != null) {
                rs.close();
            }
            if (preStm != null) {
                preStm.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
        }
    }

    public boolean insertBatchToDB(ArrayList<Stock> stocks) throws SQLException {
        boolean result = false;
        String sql = "INSERT INTO Stocks values(?,?,?,?,?)";
        try {
            conn = DBUtil.getMyConnection();
            preStm = conn.prepareStatement(sql);
          //  conn.setAutoCommit(false);
            for (Stock stock : stocks) {
                preStm.setInt(1, stock.getStockID());
                preStm.setString(2, stock.getTockName());
                preStm.setString(3, stock.getAddress());
                preStm.setString(4, stock.getDate().toString());
                preStm.setDate(4, stock.getDate());
                preStm.setString(5, stock.getNote());
                preStm.addBatch();
            }
            preStm.executeBatch();
          //  conn.commit();
            preStm.clearBatch();
            result = true;
        } catch (SQLException e) {
            result = false;
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return result;
    }

    
    

}
