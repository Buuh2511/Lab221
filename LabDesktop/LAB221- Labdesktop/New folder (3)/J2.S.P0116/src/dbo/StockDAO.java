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
 * @author Admin
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

    public boolean insertTransactionToDB(ArrayList<Stock> stocks) throws SQLException {
        boolean result = false;
        String sql = "INSERT INTO tblStocks values(?,?,?,?,?)";

        try {
            conn = MyConnection.getMyConnection();
            conn.setAutoCommit(false);
            preStm = conn.prepareStatement(sql);
            for (Stock stock : stocks) {
                preStm.setInt(1, stock.getStockID());
                preStm.setString(2, stock.getStockName());
                preStm.setString(3, stock.getAddress());
                preStm.setString(4, stock.getDateAvailble());
                preStm.setString(5, stock.getNote());
                preStm.executeUpdate();
            }
            conn.commit();
            result = true; 
        } catch (SQLException e) {
            if (conn != null) {
                conn.rollback();
            }
        } finally {
            closeConnection();
        }
        return result; 
    }
   

    }

