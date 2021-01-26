/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2.s.p0021;

import java.util.ArrayList;

/**
 *
 * @author kim ngân
 */
public class Course extends ArrayList<Course> implements Comparable<Course>{
  
    private String code;
    private String name;
    private int credit;

    public Course() {
    }

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
   @Override
    public int compareTo(Course o) {
        if (o.getCredit() < this.credit) {
            return 1;
        } else if (o.getCredit() == this.credit) {
            return 0;
        } else {
            return -1;
        }
    
}
}
