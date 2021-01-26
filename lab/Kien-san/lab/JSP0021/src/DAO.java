
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Vector;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vu Quoc Hung
 */
public class DAO {
    public static List<Course> getAllCourses() {
        Connection cn = null;
        List<Course> list = new Vector();
        try {
            cn = (Connection) MyDB.makeConnection();
            if(cn!=null) {
                String sql="select ccode,cname,ccredit\n";
                        sql += "from Courses";
                PreparedStatement pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                while(rs.next()) {
                    String code = rs.getString("ccode");
                    String name = rs.getString("cname");
                    int credit = rs.getInt("ccredit");
                    Course c = new Course(code, name, credit);
                    list.add(c);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(cn!=null) cn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return list;
    }
    
    public static Course getCourse(String courseCode) {
        Course c = null;
        Connection cn = null;       
        try {
            cn = (Connection) MyDB.makeConnection();
            if(cn!=null) {
                String sql="select ccode,cname,ccredit\n";
                        sql += "from Courses where ccode=?";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, courseCode);
                ResultSet rs = pst.executeQuery();
                if(rs.next()) {
                    String code = rs.getString("ccode");
                    String name = rs.getString("cname");
                    int credit = rs.getInt("ccredit");
                    c = new Course(code, name, credit);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(cn!=null) cn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return c;
    }
    
    public static int insertCourse(String code, String name, int credit) {
        Connection cn = null;
        int result = 0;
        
        try {
            cn = MyDB.makeConnection();
            if(cn != null) {
                String sql = "insert Courses\n" +
                            "values (?, ?, ?)";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, code);
                pst.setString(2, name);
                pst.setInt(3, credit);
                result = pst.executeUpdate(); 
                //trả về 1 khi insert thành công
                //0 khi fail
            }
        } catch (Exception e) {
                e.printStackTrace();
        }
            
        return result;                
        }  
    
}

