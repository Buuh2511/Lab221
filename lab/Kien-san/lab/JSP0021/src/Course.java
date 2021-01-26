/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vu Quoc Hung
 */
public class Course {
    protected String code, name;
    protected int credit;

    public Course(String code, String name, int credit) {
        this.code = code;
        this.name = name;
        this.credit = credit;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
    
//    public String showProfile() {
//        System.out.printf("%6s|%-15s|%3d|\n", code, name, credit);
//        String s = ("%6s|%-15s|%3d|\n", code, name, credit);
//        return s;
//    }

    @Override
    public String toString() {
        return  code + " | " + name + " | " + credit;
    }
    
    
}
