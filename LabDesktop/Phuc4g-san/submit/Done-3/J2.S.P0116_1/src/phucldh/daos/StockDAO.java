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
import java.util.ArrayList;
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

    public void Insert(ArrayList<StockDTO> list) {
        try {
            conn = DBAccess.makeConnection();
            if (conn != null) {
                String sql = "INSERT INTO Stocks_Transaction(stockID, stockName, address, dateAvailable, note) "
                        + "VALUES (?,?,?,?,?)";
                conn.setAutoCommit(false);
                for (int i = 0; i < list.size(); i++) {
                    pst = conn.prepareStatement(sql);
                    pst.setInt(1, list.get(i).getStockID());
                    pst.setString(2, list.get(i).getStockName());
                    pst.setString(3, list.get(i).getAddress());
                    pst.setDate(4, list.get(i).getDateAvailable());
                    pst.setString(5, list.get(i).getNote());
                    pst.executeUpdate();
                }

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
