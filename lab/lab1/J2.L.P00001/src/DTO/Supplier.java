/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author admin
 */
public class Supplier {

    private String supCode = "";
    private String supName = "";
    private String Address = "";
    private boolean collaborating = false;

    public Supplier() {
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
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public boolean isCollaborating() {
        return collaborating;
    }

    public void setCollaborating(boolean collaborating) {
        this.collaborating = collaborating;
    }

    public Supplier(String supCode, String supName, String address, boolean collaborating) {
        setAddress(address);
        setCollaborating(collaborating);
        setSupCode(supCode);
        setSupName(supName);
    }

    @Override
    public String toString() {
        return supCode + "-" + supName;
    }

}
