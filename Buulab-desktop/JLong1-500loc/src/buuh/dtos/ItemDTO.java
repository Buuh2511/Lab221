/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buuh.dtos;

/**
 *
 * @author Buu Huynh
 */
public class ItemDTO {
    private String itemCode, itemName, unit, supCode;
    private float price;
    private boolean supplying;

    public ItemDTO() {
    }

    public ItemDTO(String itemCode, String itemName, String unit, String supCode, float price, boolean supplying) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.unit = unit;
        this.supCode = supCode;
        this.price = price;
        this.supplying = supplying;
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

    public String getSupCode() {
        return supCode;
    }

    public void setSupCode(String supCode) {
        this.supCode = supCode;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isSupplying() {
        return supplying;
    }

    public void setSupplying(boolean supplying) {
        this.supplying = supplying;
    }
    
}
