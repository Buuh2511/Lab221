package minhnn.daos;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import minhnn.db.DBUtils;
import minhnn.dtos.CourseDTO;

/**
 *
 * @author FPT M7
 */
public class CourseDAO implements Serializable {

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

    public boolean insert(CourseDTO dto) throws Exception {
        boolean check = false;

        try {
            String sql = "INSERT INTO Courses(courseCode, courseName, Credit) VALUES(?,?,?)";
            con = DBUtils.getMyConnection();
            preStm = con.prepareStatement(sql);
            preStm.setString(1, dto.getCode());
            preStm.setString(2, dto.getName());
            preStm.setInt(3, dto.getCredit());
            check = preStm.executeUpdate() > 0;
        } finally {
            closeConnection();
        }
        return check;
    }

    public CourseDTO findByPrimaryKey(String courseCode) throws Exception {
        CourseDTO dto = null;

        try {
            String sql = "SELECT courseName, Credit FROM Courses WHERE courseCode =?";
            con = DBUtils.getMyConnection();
            preStm = con.prepareStatement(sql);
            preStm.setString(1, courseCode);
            rs = preStm.executeQuery();
            if (rs.next()) {
                String courseName = rs.getString("courseName");
                int credit = rs.getInt("Credit");
                dto = new CourseDTO(courseCode, courseName, credit);
            }
        } finally {
            closeConnection();
        }
        return dto;
    }

    public List<CourseDTO> loadAllCourseOrderByCredit() throws Exception {
        List<CourseDTO> list = null;

        CourseDTO dto = null;

        try {
            String sql = "SELECT courseCode, courseName, Credit FROM Courses ORDER BY Credit ASC";
            con = DBUtils.getMyConnection();
            preStm = con.prepareStatement(sql);
            rs = preStm.executeQuery();
            list = new ArrayList<>();
            while (rs.next()) {
                String courseCode = rs.getString("courseCode");
                String courseName = rs.getString("courseName");
                int credit = rs.getInt("Credit");
                dto = new CourseDTO(courseCode, courseName, credit);
                list.add(dto);
            }
        } finally {
            closeConnection();
        }
        return list;
    }

}
