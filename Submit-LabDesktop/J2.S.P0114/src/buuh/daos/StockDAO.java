/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buuh.daos;

import buuh.dtos.StockDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author Buu Huynh
 */
public class StockDAO {
    private Connection con;
    private PreparedStatement prm;
    private ResultSet rs;

    public StockDAO() {
    }
    
    private void closeConnection() throws Exception{
        if(rs != null) rs.close();
        if(prm != null) prm.close();
        if(con != null) con.close();
    }
    
    public boolean insertData() throws Exception{
        boolean check = false;
        try {
            String sql = "Insert Into Stocks(StockID, StockName, Address, DateAvilable, Note) VALUES (1, 'Stock one', 'adasdasdsada', '11/05/2010', '')";
            con = buuh.connections.MyConnection.getMyConnection();
            prm = con.prepareStatement(sql);
            prm.executeUpdate();
            check = true;
        } finally{
            closeConnection();
        }
        return check;
    }
    
    public void loadData() throws Exception{
        StockDTO dto = null;
        List<StockDTO> listStock = null;
        try {
            String sql = "Select StockID, StockName, Address, DateAvilable, Note From Stocks";
            con = buuh.connections.MyConnection.getMyConnection();
            prm = con.prepareStatement(sql);
            ///
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            closeConnection();
        }
    }
}
