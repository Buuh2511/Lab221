/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phucldh.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import phucldh.dtos.StockDTO;
import phucldh.utils.DBAccess;

/**
 *
 * @author DELL
 */
public class StockDAO {

    private Connection conn;
    private PreparedStatement pst;
//    private ResultSet rs;

    public void Insert(StockDTO dto) {
        try {
            conn = DBAccess.makeConnection();
            if (conn != null) {
                String sql = "INSERT INTO Stocks_Transaction(stockID, stockName, address, dateAvailable, note) "
                        + "VALUES (?,?,?,?,?)";
                conn.setAutoCommit(false);

                pst = conn.prepareStatement(sql);
                pst.setInt(1, dto.getStockID());
                pst.setString(2, dto.getStockName());
                pst.setString(3, dto.getAddress());
                pst.setDate(4, dto.getDateAvailable());
                pst.setString(5, dto.getNote());
                pst.executeUpdate();

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            try {
                System.out.println("rollback");
                conn.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } finally {
            try {
                conn.commit();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            closeConnection();
        }

    }

    private void closeConnection() {
        try {
            if (pst != null) {
                pst.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
