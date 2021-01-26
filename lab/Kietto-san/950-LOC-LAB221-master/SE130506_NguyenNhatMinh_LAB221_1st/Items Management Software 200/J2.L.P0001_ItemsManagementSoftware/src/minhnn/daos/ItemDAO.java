package minhnn.daos;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import minhnn.dtos.ItemDTO;
import minhnn.dtos.SupplierDTO;
import minhnn.utils.DBUtils;

/**
 *
 * @author FPT M7
 */
public class ItemDAO implements Serializable {

    private Connection con = null;
    private PreparedStatement preStm = null;
    private ResultSet rs = null;

    private void closeConnection() throws Exception {
            if (rs != null) {
                rs.close();
            }
            if (preStm != null) {
                preStm.close();
            }
            if (con != null) {
                con.close();
            } 
    }

    public List<ItemDTO> loadAllItem() throws Exception {
        List<ItemDTO> list = null;

        ItemDTO dto = null;

        try {
            String sql = "SELECT itemCode, itemName, supCode, unit, price, supplying FROM Items";
            con = DBUtils.getMyConnection();
            preStm = con.prepareStatement(sql);
            rs = preStm.executeQuery();
            list = new ArrayList<>();
            while (rs.next()) {
                String itemCode = rs.getString("itemCode");
                String itemName = rs.getString("itemName");
                String supCode = rs.getString("supCode");
                String unit = rs.getString("unit");
                int price = rs.getInt("price");
                boolean supplying = rs.getBoolean("supplying");
                dto = new ItemDTO(itemCode, itemName, supCode, unit, price, supplying);
                list.add(dto);
            }
        } finally {
            closeConnection();
        }
        return list;
    }

    public ItemDTO findByItemCode(String itemCode) throws Exception {
        ItemDTO dto = null;

        try {
            String sql = "SELECT itemName, supCode, unit, price, supplying FROM Items WHERE itemCode = ?";
            con = DBUtils.getMyConnection();
            preStm = con.prepareStatement(sql);
            preStm.setString(1, itemCode);
            rs = preStm.executeQuery();
            if (rs.next()) {
                String itemName = rs.getString("itemName");
                String supCode = rs.getString("supCode");
                String unit = rs.getString("unit");
                int price = rs.getInt("price");
                boolean supplying = rs.getBoolean("supplying");
                dto = new ItemDTO(itemCode, itemName, supCode, unit, price, supplying);
            }
        } finally {
            closeConnection();
        }
        return dto;
    }

    public boolean checkSupplier(String supCode) throws Exception {
        boolean check = false;

        try {
            String sql = "SELECT itemCode FROM Items WHERE supCode = ?";
            con = DBUtils.getMyConnection();
            preStm = con.prepareStatement(sql);
            preStm.setString(1, supCode);
            rs = preStm.executeQuery();
            if (rs.next()) {
                check = true;
            }
        } finally {
            closeConnection();
        }
        return check;
    }

    public boolean insert(ItemDTO dto) throws Exception {
        boolean check = false;

        try {
            String sql = "INSERT INTO Items(itemCode, itemName, supCode, unit, price, supplying) VALUES(?,?,?,?,?,?)";
            con = DBUtils.getMyConnection();
            preStm = con.prepareStatement(sql);
            preStm.setString(1, dto.getItemCode());
            preStm.setString(2, dto.getItemName());
            preStm.setString(3, dto.getSupCode());
            preStm.setString(4, dto.getUnit());
            preStm.setInt(5, dto.getPrice());
            preStm.setBoolean(6, dto.isSupplying());
            check = preStm.executeUpdate() > 0;
        } finally {
            closeConnection();
        }
        return check;
    }

    public boolean update(ItemDTO dto) throws Exception {
        boolean check = false;
        try {
            String sql = "UPDATE Items SET itemName = ?, supCode = ?, unit = ?, price = ?, supplying = ? WHERE itemCode = ?";
            con = DBUtils.getMyConnection();
            preStm = con.prepareStatement(sql);
            preStm.setString(1, dto.getItemName());
            preStm.setString(2, dto.getSupCode());
            preStm.setString(3, dto.getUnit());
            preStm.setInt(4, dto.getPrice());
            preStm.setBoolean(5, dto.isSupplying());
            preStm.setString(6, dto.getItemCode());
            check = preStm.executeUpdate() > 0;
        } finally {
            closeConnection();
        }
        return check;
    }

    public boolean delete(String itemCode) throws Exception {
        boolean check = false;

        try {
            String sql = "DELETE FROM Items WHERE itemCode = ?";
            con = DBUtils.getMyConnection();
            preStm = con.prepareStatement(sql);
            preStm.setString(1, itemCode);
            check = preStm.executeUpdate() > 0;
        } finally {
            closeConnection();
        }
        return check;
    }
}
