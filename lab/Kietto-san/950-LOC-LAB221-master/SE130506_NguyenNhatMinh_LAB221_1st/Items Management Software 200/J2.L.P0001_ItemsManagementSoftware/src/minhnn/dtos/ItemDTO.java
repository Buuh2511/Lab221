package minhnn.dtos;

import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author FPT M7
 */
public class ItemDTO implements Serializable {

    String itemCode = "", itemName = "", supCode = "";
    SupplierDTO supplier = null;
    String unit = "";
    int price = 0;
    boolean supplying = false;

    public ItemDTO() {
    }
    
    public ItemDTO(String itemCode, String itemName, String supCode, String unit, int price, boolean supplying) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.supCode = supCode;
        this.unit = unit;
        this.price = price;
        this.supplying = supplying;
    }

    public String getSupCode() {
        return supCode;
    }

    public void setSupCode(String supCode) {
        this.supCode = supCode;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public SupplierDTO getSupplier() {
        return supplier;
    }

    public void setSupplier(SupplierDTO supplier) {
        this.supplier = supplier;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isSupplying() {
        return supplying;
    }

    public void setSupplying(boolean supplying) {
        this.supplying = supplying;
    }

    
    
    public Vector toVector(SupplierDTO supplier){
        Vector v = new Vector();
        
        v.add(itemCode);
        v.add(itemName);
        v.add(supplier.toString());
        v.add(unit);
        v.add(price);
        v.add(supplying);
        
//        if (supplying == true){
//        v.add("true");
//        } else {
//            v.add("false");
//        }
        
        return v;
    }
}
