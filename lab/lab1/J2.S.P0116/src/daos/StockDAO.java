/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import dtos.StockDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import util.MyConnection;

/**
 *
 * @author admin
 */
public class StockDAO {

    private Connection conn;
    private PreparedStatement stm;
    private ResultSet rs;

    public StockDAO() {
    }

    public void closeConnection() {
        try {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
        }
    }

    public boolean insertTransactionToDB(ArrayList<StockDTO> stocks) throws SQLException, ClassNotFoundException {
//        boolean result = false;
//        String sql = "Insert into Stocks(StockID,StockName,Address,DateAvailable,Note) values(?,?,?,?,?)";
//        try {
//            conn = MyConnection.getMyConnection();
//            conn.setAutoCommit(false);
//            stm = conn.prepareStatement(sql);
//            for (StockDTO stock : stocks) {
//                stm.setInt(1, stock.getStockID());
//                stm.setString(2, stock.getStockName());
//                stm.setString(3, stock.getAddress());
//                stm.setString(4, stock.getDate());
//                stm.setString(5, stock.getNote());
//                stm.executeUpdate();
//            }
//            conn.commit();
//            result = true;
//        } catch (SQLException e) {
//            if (conn != null) {
//                conn.rollback();
//            }
//        } finally {
//            closeConnection();
//        }
//        return result;

        boolean check = false;
        String sql = "Insert into Stocks value(?,?,?,?,?)";
        try {
            conn = MyConnection.getMyConnection();
            conn.setAutoCommit(false);
            stm = conn.prepareStatement(sql);
            for (StockDTO stock : stocks) {
                stm.setInt(1, stock.getStockID());
                stm.setString(2, stock.getStockName());
                stm.setString(3, stock.getAddress());
                stm.setString(4, stock.getDate());
                stm.setString(5, stock.getNote());
                stm.executeUpdate();
            }
            conn.commit();
            check = true;
        } catch (Exception e) {
            if (conn != null) {
                conn.rollback();
            }
        } finally {
            closeConnection();
        }return check;
    }

}
