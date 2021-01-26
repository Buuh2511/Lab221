/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buuh.daos;

import buu.dtos.CourseDTO;
import buuhdb.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Buu Huynh
 */
public class CourseDAO {
    private Connection con;
    private PreparedStatement prm;
    private ResultSet rs;
    
    private void closeConnection() throws SQLException {
        if(rs != null) rs.close();
        if(prm != null) rs.close();
        if(con != null) rs.close();
    }
    
    public CourseDTO deleteCourse(String code) throws SQLException{
        try {
            con = MyConnection.getMyConnection();
            if(con != null){
                String sql = "DELETE FROM Course WHERE Code = ?";
                prm = con.prepareStatement(sql);
                prm.setString(1, code);
                prm.executeUpdate();
            }
        } catch (Exception e) {
        }finally{
            closeConnection();
        }
        return null;
    }
    
    public void addCourse(CourseDTO dto) throws SQLException{
        try {
            con = MyConnection.getMyConnection();
            String sql = "INSERT INTO Course(code, name, credit) VALUES(?,?,?)";
            prm = con.prepareStatement(sql);
            prm.setString(1, dto.getCode());
            prm.setString(2, dto.getName());
            prm.setInt(3, dto.getCredit());
            prm.executeUpdate();
        } catch (Exception e) {
        }finally{
            closeConnection();
        }
    }
    
    public CourseDTO searcCourse(String code) throws SQLException{
        try {
            con = MyConnection.getMyConnection();
            String sql = "SELECT name, credit FROME Course WHERE code = ?";
            prm = con.prepareStatement(sql);
            prm.setString(1, code);
            rs = prm.executeQuery();
            while(rs.next()){
                String name = rs.getString("name");
                int credit = rs.getInt("credit");
                CourseDTO dto = new CourseDTO(code, name, credit);
                return dto;
            }
        } catch (Exception e) {
        }finally{
            closeConnection();
        }
        return null;
    }
    
    public List<CourseDTO> getAllCourse() throws SQLException{
        List<CourseDTO> result = null;
        try {
            con = MyConnection.getMyConnection();
            String sql = "SELECT code, name, credit FROME Course";
            prm = con.prepareStatement(sql);
            rs = prm.executeQuery();
            while(rs.next()){
                if(result == null){
                    result = new ArrayList<>();
                }
                String code = rs.getString("code");
                String name = rs.getString("name");
                int credit = rs.getInt("credit");
                CourseDTO dto = new CourseDTO(code, name, credit);
                result.add(dto);
            }
        } catch (Exception e) {
        }finally{
            closeConnection();
        }
        return result;
    }
}
