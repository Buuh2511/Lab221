/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datnp.daos;

import datnp.db.MyConnection;
import datnp.dtos.SupplierDTO;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dnn84
 */
public class SupplierDAO implements Serializable {

    Connection conn;
    PreparedStatement preStm;
    ResultSet rs;

    private void closeConnection() {
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
    public SupplierDTO getSupByCode(String Code) {
        SupplierDTO sup = new SupplierDTO();
        try {
            String sql = "Select supCode, supName, address, collaborating From tblSuppliers Where supCode = ?";
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, Code);
            rs = preStm.executeQuery();
            if(rs.next()) {
                sup.setSupCode(rs.getString("supCode"));
                sup.setSupName(rs.getNString("supName"));
                sup.setAddress(rs.getNString("address"));
                sup.setCollaborating(rs.getBoolean("collaborating"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return sup;
    }

    public List<SupplierDTO> getAllSup() {
        List<SupplierDTO> list = new ArrayList<SupplierDTO>();
        try {
            String sql = "Select supCode, supName, address, collaborating From tblSuppliers";
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            rs = preStm.executeQuery();
            while (rs.next()) {
                SupplierDTO sup = new SupplierDTO();
                sup.setSupCode(rs.getString("supCode"));
                sup.setSupName(rs.getNString("supName"));
                sup.setAddress(rs.getNString("address"));
                sup.setCollaborating(rs.getBoolean("collaborating"));
                list.add(sup);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return list;
    }

    public boolean addSup(SupplierDTO sup) {
        boolean result = false;
        try {
            String sql = "Insert Into tblSuppliers(supCode, supName, address, collaborating)"
                    + "Values(?, ?, ?, ?)";
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, sup.getSupCode());
            preStm.setString(2, sup.getSupName());
            preStm.setString(3, sup.getAddress());
            preStm.setBoolean(4, sup.isCollaborating());
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

    public boolean deleteSup(String supCode){
        boolean result = false;
        try {
            String sql = "Delete From tblSuppliers Where supCode = ?";
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, supCode);
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

    public boolean updateSup(SupplierDTO sup) {
        boolean result = false;
        try {
            String sql = "Update tblSuppliers set supCode = ?, supName = ?, address = ?, collaborating = ? Where supCode = ?";
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, sup.getSupCode());
            preStm.setString(2, sup.getSupName());
            preStm.setString(3, sup.getAddress());
            preStm.setBoolean(4, sup.isCollaborating());
            preStm.setString(5, sup.getSupCode());
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
