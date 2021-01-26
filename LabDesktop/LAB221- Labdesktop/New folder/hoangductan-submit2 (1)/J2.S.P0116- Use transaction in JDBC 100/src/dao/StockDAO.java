/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.StockDTO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Vector;
import ulti.DBUtils;

/**
 *
 * @author SE130485
 */
public class StockDAO {

    public Vector<StockDTO> getDataDemo() throws SQLException {
        Vector<StockDTO> list = new Vector<>();
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT StockID, StockName, Address, DateAvailable, Note FROM DemoData";
                stm = conn.prepareStatement(sql);
                rs = stm.executeQuery();
                while (rs.next()) {
                    int stockID = rs.getInt("StockID");
                    String stockName = rs.getString("StockName");
                    String address = rs.getString("Address");
                    Timestamp dateAvailble = rs.getTimestamp("DateAvailable");
                    String note = rs.getString("Note");
                    StockDTO temp = new StockDTO();

                    temp.setStockID(stockID);

                    if (stockName != null) {
                        temp.setStockName(stockName);
                    }

                    if (stockName != null) {
                        temp.setAddress(stockName);
                    }

                    if (address != null) {
                        temp.setAddress(address);
                    }
                    if (dateAvailble != null) {
                        temp.setDateAvailble(dateAvailble);
                    }
                    if (note != null) {
                        temp.setAddress(note);
                    }

                    list.add(temp);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
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
// conn.setAutoCommit(false);boolean result = false;
//                savePoint = conn.setSavepoint();  conn.commit();
        //        result = true;
//   if (conn != null) {
//                conn.rollback(savePoint);
//            }
        return list;
    }

    public boolean inserDataTrans(ArrayList<StockDTO> list) throws SQLException {
      boolean result = false;
      Connection conn = null;
      PreparedStatement stm = null;
      Savepoint savepoint = null;
        try {
               conn = DBUtils.getConnection();
               conn.setAutoCommit(false);
               savepoint = conn.setSavepoint();
            if (conn != null) {
                String sql = "INSERT INTO Stocks (StockID, StockName, Address, DateAvailable, Note) VALUES ( ?, ?, ?, ?, ?)";
                stm = conn.prepareStatement(sql);
                for (StockDTO dto : list) {
                    int stockID = dto.getStockID();
                    String stockName = dto.getStockName();
                    String address = dto.getAddress();
                    Timestamp dateAvailble = dto.getDateAvailble();
                    String note = dto.getNote();
                    stm.setInt(1, stockID);
                    stm.setString(2, stockName);
                    stm.setString(3, address);
                    stm.setTimestamp(4, dateAvailble);
                    stm.setString(5, note);
                    stm.executeUpdate();
                }

                conn.commit();
                result = true;
            }
        } catch (ClassNotFoundException | SQLException e) {
            if (conn != null) {
                 e.printStackTrace();
                 conn.rollback(savepoint);
            }
       
        } finally {
            if (stm != null) {
                stm.close();
            }
            
            if (conn != null) {
                conn.close();
            }
        }
        return result;
    }

}
