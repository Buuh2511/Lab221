/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buuh.daos;

import buuh.db.MyConnection;
import buuh.dtos.ItemDTO;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Buu Huynh
 */
public class ItemDAO implements Serializable {

    Connection conn;
    PreparedStatement preStm;
    ResultSet rs;

    public void closeConnection() {
        try {
            if (conn != null) {
                conn.close();
            }
            if (preStm != null) {
                preStm.close();
            }
            if (rs != null) {
                rs.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<ItemDTO> getAllItemBySupCode(String code) {
        List<ItemDTO> list = new ArrayList<ItemDTO>();
        try {
            String sql = "Select itemCode, itemName, unit, price, supplying, supCode From tblItems where supCode = ?";
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, code);
            rs = preStm.executeQuery();
            while (rs.next()) {
                ItemDTO item = new ItemDTO();
                item.setItemCode(rs.getString("itemCode"));
                item.setItemName(rs.getString("itemName"));
                item.setUnit(rs.getString("unit"));
                item.setPrice(rs.getFloat("price"));
                item.setSupplying(rs.getBoolean("supplying"));
                item.setSupCode(rs.getString("supCode"));
                list.add(item);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return list;
    }

    public List<ItemDTO> getAllItem() {
        List<ItemDTO> list = new ArrayList<ItemDTO>();
        try {
            String sql = "Select itemCode, itemName, unit, price, supplying, supCode From tblItems";
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            rs = preStm.executeQuery();
            while (rs.next()) {
                ItemDTO item = new ItemDTO();
                item.setItemCode(rs.getString("itemCode"));
                item.setItemName(rs.getString("itemName"));
                item.setUnit(rs.getString("unit"));
                item.setPrice(rs.getFloat("price"));
                item.setSupplying(rs.getBoolean("supplying"));
                item.setSupCode(rs.getString("supCode"));
                list.add(item);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return list;
    }

    public boolean addItem(ItemDTO item) {
        boolean result = false;
        try {
            String sql = "Insert Into tblItems(itemCode ,itemName, unit, price, supplying, supCode)"
                    + "values(?,?,?,?,?,?)";
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, item.getItemCode());
            preStm.setString(2, item.getItemName());
            preStm.setString(3, item.getUnit());
            preStm.setFloat(4, item.getPrice());
            preStm.setBoolean(5, item.isSupplying());
            preStm.setString(6, item.getSupCode());
            int rs = preStm.executeUpdate();
            if (rs > 0) {
                result = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return result;
    }

    public boolean saveItem(ItemDTO item) {
        boolean result = false;
        try {
            String sql = "Update tblItems set itemName = ?, unit = ?, price = ?, supplying = ?, supCode = ? where itemCode = ?";
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, item.getItemName());
            preStm.setString(2, item.getUnit());
            preStm.setFloat(3, item.getPrice());
            preStm.setBoolean(4, item.isSupplying());
            preStm.setString(5, item.getSupCode());
            preStm.setString(6, item.getItemCode());
            int rs = preStm.executeUpdate();
            if (rs > 0) {
                result = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return result;
    }

    public boolean deleteItem(String itemCode) {
        boolean result = false;
        try {
            String sql = "Delete From tblItems where itemCode = ?";
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, itemCode);
            int rs = preStm.executeUpdate();
            if (rs > 0) {
                result = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return result;
    }
}
