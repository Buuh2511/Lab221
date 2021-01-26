/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phucldh.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import phucldh.dtos.StockDTO;
import phucldh.utils.DBAccess;

/**
 *
 * @author DELL
 */
public class StocksDAO {

    private Connection conn;
//    private Statement st;
    private PreparedStatement psm;
//
//    public void Insert(StockDTO dto) {
//        try {
//            conn = DBAccess.makeConnection();
//            if (conn != null) {
//                String sql = "INSERT INTO Stocks(stockID, stockName, address, dateAvailable, note) "
//                        + "VALUES (?,?,?,?,?)";
//
//                conn.setAutoCommit(false);
//                psm = conn.prepareStatement(sql);
//                psm.setInt(1, dto.getStockID());
//                psm.setString(2, dto.getStockName());
//                psm.setString(3, dto.getAddress());
//                psm.setDate(4, dto.getDateAvailable());
//                psm.setString(5, dto.getNote());
//                psm.addBatch();
//                psm.executeBatch();
//
//            }
//
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//            try {
//                conn.rollback();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        } finally {
//            try {
//                conn.commit();
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//            }
//            closeConnection();
//        }
//
//    }

    public void Insert(ArrayList<StockDTO> list) {
        try {
            conn = DBAccess.makeConnection();
            if (conn != null) {
                String sql = "INSERT INTO Stocks(stockID, stockName, address, dateAvailable, note) "
                        + "VALUES (?,?,?,?,?)";
                psm = conn.prepareStatement(sql);

                conn.setAutoCommit(false);
                for (int i = 0; i < list.size(); i++) {
                     psm = conn.prepareStatement(sql);
                psm.setInt(1, list.get(i).getStockID());
                psm.setString(2, list.get(i).getStockName());
                psm.setString(3, list.get(i).getAddress());
                psm.setDate(4, list.get(i).getDateAvailable());
                psm.setString(5, list.get(i).getNote());
                    psm.addBatch(sql);
                }
                psm.executeBatch();
                conn.commit();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }
    }

    private void closeConnection() {
        try {
            if (psm != null) {
                psm.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
