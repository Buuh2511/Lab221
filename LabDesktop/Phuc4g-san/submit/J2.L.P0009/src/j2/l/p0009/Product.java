/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2.l.p0009;

/**
 *
 * @author DELL
 */
public class Product {

    private String catalory;
    private String productID;
    private String productName;
    private int quantity;
    private int price;

    public Product(String catalory, String productID, String productName, int quantity, int price) {
        this.catalory = catalory;
        this.productID = productID;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public Product() {
    }

    public String getCatalory() {
        return catalory;
    }

    public void setCatalory(String catalory) {
        this.catalory = catalory;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}
