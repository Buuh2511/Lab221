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
public class Item {
    private String itemCode = "";
    private String itemName = "";
    private String unit = "";
    private Supplier supplier = null;
    private int price = 0;
    private boolean supplying = false;
     public Item() {
        
    }
     public Item(String itemCode, String itemName, Supplier supplier, String unit, int price, boolean supplying) {
        setItemCode(itemCode);
        setItemName(itemName);
        setSupplier(supplier);
        setUnit(unit);
        setPrice(price);
        setSupplying(supplying);
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
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
    
    
    
}
