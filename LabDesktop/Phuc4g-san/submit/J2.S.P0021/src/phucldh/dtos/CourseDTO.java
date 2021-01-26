/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phucldh.dtos;

/**
 *
 * @author DELL
 */
public class CourseDTO {
    private String code;
    private String name;
    private int price;

    public CourseDTO(String code, String name, int price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public CourseDTO() {
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}
