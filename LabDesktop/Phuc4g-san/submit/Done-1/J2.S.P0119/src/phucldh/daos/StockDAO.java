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
import javax.swing.JOptionPane;
import phucldh.dtos.StockDTO;
import phucldh.utils.DBAccess;

/**
 *
 * @author DELL
 */
public class StockDAO {

    private Connection conn;
    private PreparedStatement ps;
//    private ResultSet rs;

    public void Insert(StockDTO dto) throws SQLException {
        try {
            conn = DBAccess.makeConnection();
            if (conn != null) {
                String sql = "INSERT INTO Stocks(stockID, stockName, address, dateAvailable, note) "
                        + "VALUES (?,?,?,?,?)";
                conn.setAutoCommit(false);
                ps = conn.prepareStatement(sql);
                ps.setInt(1, dto.getStockID());
                ps.setString(2, dto.getStockName());
                ps.setString(3, dto.getAddress());
                ps.setDate(4, dto.getDateAvailable());
                ps.setString(5, dto.getNote());
                ps.executeUpdate();
                conn.commit();
            }

        } finally {
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        }

    }

}
