/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Admin
 */
public class Fruit {
    private String id;
    private String fruitName;
    private double price;
    private int quantity;
    private String origin;

    public Fruit(String id, String fruitName, double price, int quantity, String origin) {
        this.id = id;
        this.fruitName = fruitName;
        this.price = price;
        this.quantity = quantity;
        this.origin = origin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
    
    public double amount(int quatityOder) {
        return price*quatityOder;
    }
    public int checkQuatity(int quantityBuy) {
        if(quantity < quantityBuy) {
            return -1;
        }
        else {
            return quantity = quantity - quantityBuy;
        }
    }
    
    public void showForShopping(int item) {
        System.out.printf("|%-5d|%-12s|%-15d|%-10s|%-10.2f|\n", item, fruitName, quantity,origin, price);
    }
    
    public void showAfterOder(int quantityOder) {
        System.out.printf("|%-11s|%-8d|%-10.2f|%-10.2f|\n", fruitName, quantity, price, amount(quantityOder));
    }
}
