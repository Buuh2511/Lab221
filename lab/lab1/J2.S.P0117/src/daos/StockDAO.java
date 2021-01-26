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
//        boolean check = false;
//        try {
//            String sql = "Insert into Stocks(StockID,StockName,Address,DateAvailable,Note) values(?,?,?,?,?)";
//           conn = MyConnection.getMyConnection();
//            conn.setAutoCommit(false);
//            stm = conn.prepareStatement(sql);
//            for (StockDTO dto : stocks) {
//                stm.setInt(1, dto.getStockID());
//                stm.setString(2, dto.getStockName());
//                stm.setString(3, dto.getAddress());
//                stm.setString(4, dto.getDateAvailable());
//                stm.setString(5, dto.getNote());
//                stm.addBatch();
//            }
//            stm.executeBatch();
//            conn.commit();
//            stm.clearBatch();
//            check = true;
//        } catch (SQLException e) {
//            check = false;
//            e.printStackTrace();
//        } finally {
//            closeConnection();
//        }
//        return check;
boolean check=false;
        try {
            String sql="Insert into Stocks values(?,?,?,?,?)";
            conn=MyConnection.getMyConnection();
            conn.setAutoCommit(false);
            stm=conn.prepareStatement(sql);
            for(StockDTO stock: stocks){
                stm.setInt(1, stock.getStockID());
                stm.setString(2, stock.getStockName());
                stm.setString(3, stock.getAddress());
                stm.setString(4, stock.getDateAvailable());
                stm.setString(5, stock.getNote());
                stm.addBatch();
            }
            stm.executeBatch();
            conn.commit();
            stm.clearBatch();
            check=true;
        } catch (Exception e) {
            check=false;
        }finally{
            closeConnection();
        }
return check;
    }
}
