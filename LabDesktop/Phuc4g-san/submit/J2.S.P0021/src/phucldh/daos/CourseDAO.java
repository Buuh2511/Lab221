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
import java.util.Vector;
import phucldh.dtos.CourseDTO;
import phucldh.utils.DBAccess;

/**
 *
 * @author DELL
 */
public class CourseDAO {

    private Connection conn = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;

    public Vector<CourseDTO> getListCourse() {
        Vector<CourseDTO> list = new Vector<>();
        try {
            conn = DBAccess.makeConnection();
            if (conn != null) {
                String sql = "SELECT code, name, price FROM CoursesManagement";
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                while (rs.next()) {              
                        String code = rs.getString("code");
                        String name = rs.getString("name");
                        int price = Integer.parseInt(rs.getString("price"));
                        list.add(new CourseDTO(code, name, price));               
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return list;
    }
  
    
    public void insertCourse (CourseDTO dto){
        
        try {
            conn = DBAccess.makeConnection();
            if(conn != null){
                String sql = "INSERT INTO CoursesManagement(code ,name, price) VALUES (?,?,?)";
                pst = conn.prepareStatement(sql);
                pst.setString(1, dto.getCode());
                pst.setString(2, dto.getName());
                pst.setInt(3, dto.getPrice());
                pst.executeUpdate();
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            closeConnection();
        }
        
    }

    private void closeConnection() {
        try {
            if (rs != null) {
                rs.close();
            }
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
