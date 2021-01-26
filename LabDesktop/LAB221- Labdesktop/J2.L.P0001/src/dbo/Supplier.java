/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbo;

/**
 *
 * @author Admin
 */
public class Supplier {
    
    private String supCode = "";
    private String supName = "";
    private String address = "";
    private boolean colloborating = true;
    
    public Supplier() {
        
    }
    
    public Supplier(String supCode, String supName, String address, boolean colloborating) {
        setSupCode(supCode);
        setSupName(supName);
        setAddress(address);
        setColloborating(colloborating);
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

    public boolean isColloborating() {
        return colloborating;
    }

    public void setColloborating(boolean colloborating) {
        this.colloborating = colloborating;
    }

    @Override
    public String toString() {
       return supCode + "-" + supName;
    }
}
