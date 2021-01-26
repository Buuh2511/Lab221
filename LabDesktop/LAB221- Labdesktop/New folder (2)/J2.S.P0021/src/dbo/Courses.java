/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbo;

import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Courses extends Vector<Course> {

    public Courses() {
        super();
    }
  public void loadFromDB(CourseDBAccess dbObj){
        String code, name;
        int credit;
        String sql ="SELECT code, name, credit FROM Courses";
        try {
          ResultSet rs = dbObj.executeQuery(sql);
            while (rs.next()) {
                code = rs.getString(1);
                name = rs.getString(2);
                credit = rs.getInt(3);
                Course course = new Course(code, name, credit);
                this.add(course);
            }
            rs.close();
      } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
      }
  }
}
