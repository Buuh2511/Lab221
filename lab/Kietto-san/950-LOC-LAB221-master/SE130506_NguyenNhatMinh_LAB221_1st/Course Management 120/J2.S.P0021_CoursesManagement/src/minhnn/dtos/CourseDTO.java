
package minhnn.dtos;

import java.io.Serializable;

/**
 *
 * @author FPT M7
 */
public class CourseDTO implements Serializable{
    private String code, name;
    private int credit;
    
    
    public CourseDTO(){}
    
    public CourseDTO(String code, String name, int credit) {
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
   
}
