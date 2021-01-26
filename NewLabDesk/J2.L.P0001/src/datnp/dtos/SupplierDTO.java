/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datnp.dtos;

/**
 *
 * @author dnn84
 */
public class SupplierDTO {
    private String supCode, supName, address;
    private boolean collaborating;

    public SupplierDTO() {
    }

    public SupplierDTO(String supCode, String supName, String address, boolean collaborating) {
        this.supCode = supCode;
        this.supName = supName;
        this.address = address;
        this.collaborating = collaborating;
    }

    public String getSupCode() {
        return supCode;
    }

    public void setSupCode(String supCode) {
        this.supCode = supCode;
    }

    public String getSupName() {
        return supName;
    }

    public void setSupName(String supName) {
        this.supName = supName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isCollaborating() {
        return collaborating;
    }

    public void setCollaborating(boolean collaborating) {
        this.collaborating = collaborating;
    }
    public String toString(){
        return supCode+"-"+supName; 
    } 
}

