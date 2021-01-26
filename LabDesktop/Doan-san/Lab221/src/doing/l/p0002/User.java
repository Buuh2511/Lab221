/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doing.l.p0002;

import java.util.Vector;

/**
 *
 * @author DoanNC
 */
public class User {

    //Data field
    private String UserID;
    private String UserName;
    private String Role;
    private String Salary;
    private String Password;

    //Constructor
    public User(String UserID, String UserName, String Role, String Salary, String Password) {
        this.UserID = UserID;
        this.UserName = UserName;
        this.Role = Role;
        this.Salary = Salary;
        this.Password = Password;
    }

    public User(Vector v) {
        this.UserID = (String) v.get(0);
        this.UserName = (String) v.get(1);
        this.Role = (String) v.get(2);
        this.Salary = (String) v.get(3);
        this.Password = (String) v.get(4);
    }

    public User() {
    }

    //Getter and Setter
    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String Salary) {
        this.Salary = Salary;
    }

    //Other methods
    public Vector toVector() {
        Vector v = new Vector();
        v.add(this.UserID);
        v.add(this.UserName);
        v.add(this.Role);
        v.add(this.Salary);
        v.add(this.Password);
        return v;
    }
}
