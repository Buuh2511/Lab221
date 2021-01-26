/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

import db.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class CourseDAO {

    private Connection con;
    private PreparedStatement stm;
    private ResultSet rs;

    private void closeConnection() throws SQLException {
        if (rs != null) {
            rs.close();
        }
        if (stm != null) {
            stm.close();
        }
        if (con != null) {
            con.close();
        }
    }

    public CourseDTO delete(String code) throws SQLException {
        try {
            con = DBUtils.getConnection();
            if (con != null) {
                String sql = "DELETE FROM Course WHERE Code=?";
                stm = con.prepareStatement(sql);
                stm.setString(1, code);
                stm.executeUpdate();
            }
        } catch (Exception e) {
        } finally {
            closeConnection();
        }
        return null;
    }

    public void addCourse(CourseDTO dto) throws ClassNotFoundException, SQLException {
//        Connection con = null;
//        PreparedStatement stm = null;
//        try {
//            con = DBUtils.getConnection();
//            if (con != null) {
//                String sql = "Insert into Course(code, name,credit)" + "values(?,?,?)";
//                stm = con.prepareStatement(sql);
//                stm.setString(1, dto.getCode());
//                stm.setString(2, dto.getName());
//                stm.setInt(3, dto.getCredit());
//                stm.executeUpdate();          
//            }
//        }catch(Exception e){            
//        }finally {
//            closeConnection();
//        }
        Connection con = null;
        PreparedStatement stm = null;
        try {
         con=DBUtils.getConnection();
         String sql="Insert into Course(code,name,credit)"+"values(?,?,?)";
         stm=con.prepareStatement(sql);
         stm.setString(1, dto.getCode());
         stm.setString(2, dto.getName());
         stm.setInt(3, dto.getCredit());
         stm.executeUpdate();
        } catch (Exception e) {
        } finally {
            closeConnection();
        }

    }

    public CourseDTO searchCourse(String code) throws ClassNotFoundException, SQLException {
//        Connection con = null;
//        PreparedStatement stm = null;
//        ResultSet rs = null;
//        try {
//            con = DBUtils.getConnection();
//            if (con != null) {
//                String sql = "Select name, credit from Course where code = ?";
//                stm = con.prepareStatement(sql);
//                stm.setString(1, code);
//                rs = stm.executeQuery();
//                if (rs.next()) {
//                    String name = rs.getString("name");
//                    int credit = rs.getInt("credit");
//                    CourseDTO dto = new CourseDTO(code, name, credit);
//                    return dto;
//                }
//            }
//        }catch(Exception e){            
//        } finally {
//            closeConnection();
//        } 
//        return null;
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
     try{
     con= DBUtils.getConnection();
     String sql="Select name,credit from Course where code=?";
     stm= con.prepareStatement(sql);
     stm.setString(1, code);
     rs=stm.executeQuery();
     while(rs.next()){
         String name=rs.getString("name");
         int credit=rs.getInt("credit");
         CourseDTO dto=new CourseDTO(code, name, credit);
         return dto;
        }} catch (Exception e) {
        } finally {
            closeConnection();
        }
        return null;
    }

    public List<CourseDTO> getAllCourses() throws ClassNotFoundException, SQLException {
//        Connection con = null;
//        PreparedStatement stm = null;
//        ResultSet rs = null;
//        List<CourseDTO> result = null;
//        try {
//            con = DBUtils.getConnection();
//            if (con != null) {
//                String sql = "Select code, name, credit from Course";
//                stm = con.prepareStatement(sql);
//                rs = stm.executeQuery();
//                while (rs.next()) {
//                    if (result == null) {
//                        result = new ArrayList<>();
//                    }
//                    String code = rs.getString("code");
//                    String name = rs.getString("name");
//                    int credit = rs.getInt("credit");
//                    CourseDTO dto = new CourseDTO(code, name, credit);
//                    result.add(dto);
//                }
//            }
//        }catch(Exception e){            
//        } finally {
//            closeConnection();
//        }
//        return result;
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        List<CourseDTO> result = null;
        try {
       con=DBUtils.getConnection();
       String sql="Select code,name,credit from Course";
       stm=con.prepareStatement(sql);
       rs=stm.executeQuery();
       while(rs.next()){
           if(result==null){
               result=new ArrayList<>();
           }
           String code =rs.getString("code");
           String name =rs.getString("name");
           int credit =rs.getInt("credit");
           CourseDTO dto =new CourseDTO(code, name, credit);
           result.add(dto);
          }
        } catch (Exception e) {
        } finally {
            closeConnection();
        }
        return result;
    }

}
