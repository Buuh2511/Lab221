package minhnn.dtos;

import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author FPT M7
 */
public class SupplierDTO implements Serializable{
    String supCode = "", supName = "", address = "";
    boolean colloborating = false;
    
    public SupplierDTO(){
        
    }
    
    public SupplierDTO(String supCode,String supName, String address, boolean colloborating){
        this.supCode = supCode;
        this.supName = supName;
        this.address = address;
        this.colloborating = colloborating;
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
    public String toString(){
        return supCode + " - " + supName;
    }
    
    public Vector toVector(){
        Vector v = new Vector();
        
        v.add(supCode);
        v.add(supName);
        v.add(address);
           
        return v;
    }
    
    
}
