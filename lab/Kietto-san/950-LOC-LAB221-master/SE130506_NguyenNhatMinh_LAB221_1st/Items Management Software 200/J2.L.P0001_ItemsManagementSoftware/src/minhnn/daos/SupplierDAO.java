package minhnn.daos;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import minhnn.dtos.SupplierDTO;
import minhnn.utils.DBUtils;

/**
 *
 * @author FPT M7
 */
public class SupplierDAO implements Serializable{
    private Connection con = null;
    private PreparedStatement preStm = null;
    private ResultSet rs = null;
    
    private void closeConnection() throws Exception{
        if (rs!=null){
            rs.close();
        }
        if (preStm!=null){
            preStm.close();
        }
        if (con!=null){
            con.close();
        }  
    }
    
    
    public List<SupplierDTO> loadAllSupplier() throws Exception{
        List<SupplierDTO> list = null;
        
        SupplierDTO dto = null;
        
        try {
            String sql = "SELECT supCode, supName, address, colloborating FROM Suppliers";
            con = DBUtils.getMyConnection();
            preStm = con.prepareStatement(sql);
            rs = preStm.executeQuery();
            list = new ArrayList<>();
            while (rs.next()){
                String supCode = rs.getString("supCode");
                String supName = rs.getString("supName");
                String address = rs.getString("address");
                boolean colloborating = rs.getBoolean("colloborating");
                dto = new SupplierDTO(supCode, supName, address, colloborating);
                list.add(dto);
            }
        } finally {
            closeConnection();
        }
        return list;
    }
    
    public SupplierDTO findBySupCode(String supCode) throws Exception{
        SupplierDTO dto = null;
        
        try {
            String sql = "SELECT supName, address, colloborating FROM Suppliers WHERE supCode = ?";
            con = DBUtils.getMyConnection();
            preStm = con.prepareStatement(sql);
            preStm.setString(1, supCode);
            rs = preStm.executeQuery();
            if (rs.next()){
                String supName = rs.getString("supName");
                String address = rs.getString("address");
                boolean colloborating = rs.getBoolean("colloborating");
                dto = new SupplierDTO(supCode, supName, address, colloborating);
            }
        } finally {
            closeConnection();
        }
        return dto;
    }
    
    public boolean insert(SupplierDTO dto) throws Exception {
        boolean check = false;
        
        try {
            String sql = "INSERT INTO Suppliers(supCode, supName, address, colloborating) VALUES(?,?,?,?)";
            con = DBUtils.getMyConnection();
            preStm = con.prepareStatement(sql);
            preStm.setString(1, dto.getSupCode());
            preStm.setString(2, dto.getSupName());
            preStm.setString(3, dto.getAddress());
            preStm.setBoolean(4, dto.isColloborating());
            check = preStm.executeUpdate() > 0;
        } finally {
          closeConnection();
        }
        return check;
    }
    
    public boolean update(SupplierDTO dto) throws Exception{
       boolean check = false;
        try {
            String sql = "UPDATE Suppliers SET supName = ?, address = ?, colloborating = ? WHERE supCode = ?";
            con = DBUtils.getMyConnection();
            preStm = con.prepareStatement(sql);
            preStm.setString(1, dto.getSupName());
            preStm.setString(2, dto.getAddress());
            preStm.setBoolean(3, dto.isColloborating());
            preStm.setString(4, dto.getSupCode());
            check = preStm.executeUpdate() > 0;
        } finally {
            closeConnection();
        }
       return check;
    }
    
     public boolean delete(String supCode) throws Exception{
        boolean check = false;
        
        try {
            String sql = "DELETE FROM Suppliers WHERE supCode = ?";
            con = DBUtils.getMyConnection();
            preStm = con.prepareStatement(sql);
            preStm.setString(1, supCode);
            check = preStm.executeUpdate() > 0;
        } finally {
            closeConnection();
        }
        return check;
    }
     
}
