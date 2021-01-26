/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import dtos.Stock;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import util.MyConnection;

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

    public boolean insertTransactionToDB(ArrayList<Stock> stocks) throws SQLException {
        boolean result = false;
        String sql = "INSERT INTO Stocks values(?,?,?,?,?)";

        try {
            conn = MyConnection.getMyConnection();
            conn.setAutoCommit(false);
            preStm = conn.prepareStatement(sql);
            for (Stock stock : stocks) {
                preStm.setInt(1, stock.getStockID());
                preStm.setString(2, stock.getTockName());
                preStm.setString(3, stock.getAddress());
                preStm.setString(4, stock.getDate());
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

    public void deleteAllDataInDB() {
        String sql = "DELETE FROM Stocks";
        try {
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }

    }

}