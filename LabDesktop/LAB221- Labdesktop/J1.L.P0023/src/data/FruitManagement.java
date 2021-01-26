/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import java.util.Hashtable;
import util.Validation;

/**
 *
 * @author Admin
 */
public class FruitManagement {

    ArrayList<Fruit> fruitList = new ArrayList<>();
    Hashtable<String, ArrayList<Fruit>> orderList = new Hashtable<>();

    public FruitManagement() {
    }

    public ArrayList<Fruit> getFruitList() {
        return fruitList;
    }

    public void setFruitList(ArrayList<Fruit> fruitList) {
        this.fruitList = fruitList;
    }

    public Hashtable<String, ArrayList<Fruit>> getOderList() {
        return orderList;
    }

    public void setOderList(Hashtable<String, ArrayList<Fruit>> oderList) {
        this.orderList = oderList;
    }

    public void creatFruit() {
        String id, fruitName, origin;
        double price;
        int quantity;
        String cont = "Y";
        do {
            id = Validation.getString("Enter ID: ", "ID can not empty");
            if (findIndexFruit(id) != -1) {
                System.out.println("This fruit has already created");
            } else {
                fruitName = Validation.getString("Enter fruit name: ", "Fruit name can not empty: ");
                price = Validation.getDouble("Enter fruit price: ", "Fruit price must large 0 (price > 0)");
                quantity = Validation.getInt("Enter fruit quantity: ", "Fruit quantity must large 0 (quantity > 0)");
                origin = Validation.getString("Enter fruit origin: ", "fruit origin can not empty");
                fruitList.add(new Fruit(id, fruitName, price, quantity, origin));
                cont = Validation.getString("Do you want to continue (Y/N)?: ", "Enter again Y or N: ", "[Y||y||N||n]");
            }
        } while (cont.equalsIgnoreCase("Y"));
    }

    public void shoppingForCustomer() {
        String cont = "N";
        if (fruitList.isEmpty()) {
            System.out.println("Fruit list is empty.");
            return;
        }
        ArrayList<Fruit> fruitListOder = new ArrayList<>();

        do {
            if (fruitList.isEmpty()) {
                System.out.println("Fruit list is empty");
                return;
            }
            System.out.println("--------List of fruit----------");
            displayAllFruitForShopping();
            int item = Validation.getInt("Select item you want to buy: ", "Input a number "
                    + "from 1 to " + fruitList.size(), 1, fruitList.size());
            System.out.println("You select: " + fruitList.get(item - 1).getFruitName());
            int quantitybuy = Validation.getInt("Enter quantity : ", "Quatity can not empty or equal 0");
            int i = fruitList.get(item - 1).checkQuatity(quantitybuy);
            if (i == -1) {
                System.out.println("Fruits does not have enough quantity to buy");
                continue;
            } 
            else {
                fruitListOder.add(new Fruit(fruitList.get(item - 1).getId(), fruitList.get(item - 1).getFruitName(),
                        fruitList.get(item - 1).getPrice(), quantitybuy, fruitList.get(item - 1).getOrigin()));
            }
            cont = Validation.getString("Do you want to order now (Y/N): ", "Y for yes, N for no", "[Y||y||N||n]");
            // neu con 1 item thi cho tinh tien luon
            if (cont.equalsIgnoreCase("N")) {
                if (fruitList.size() == 1 && fruitList.get(0).getQuantity() == 0) {
                    System.out.println("Fruit list doesn't have any think, So this is your order");
                    displayAfterOder(fruitListOder);
                    String name;
                    name = Validation.getString("Enter your name: ", "Your name can not empty");
                    orderList.put(name, fruitListOder);
                    System.out.println("Order successfully");
                    removeFruitList();
                    return;
                } else {
                    removeFruitList();
                    continue;
                }
            }
            if (cont.equalsIgnoreCase("Y")) {
                displayAfterOder(fruitListOder);
                String name;
                name = Validation.getString("Enter your name: ", "Your name can not empty");
                orderList.put(name, fruitListOder);
                System.out.println("Order successfully");
                removeFruitList();
                return;
            }
            removeFruitList();
        } while (cont.equalsIgnoreCase("N"));
    }

    public void viewOrder() {
        if (orderList.isEmpty()) {
            System.out.println("List order is empty");
            return;
        }
        double total = 0;
        for (String name : orderList.keySet()) {
            System.out.println("Customer: " + name);
            System.out.println("|Product    |Quantity|Price     |Amount    |");
            ArrayList<Fruit> list = orderList.get(name);
            for (Fruit fruit : list) {
                int quantity = fruit.getQuantity();
                fruit.showAfterOder(quantity);
                total += fruit.amount(quantity);
            }
            System.out.println("Total: " + total);
            total = 0;
        }
    }

    public int findIndexFruit(String id) {
        if (fruitList.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < fruitList.size(); i++) {
            if (fruitList.get(i).getId().equalsIgnoreCase(id)) {
                return i;
            }
        }
        return -1;
    }

    public void displayAfterOder(ArrayList<Fruit> list) {
        double total = 0;
        System.out.println("|Product    |Quantity|Price     |Amount    |");
        for (Fruit fruit : list) {
            int quantity = fruit.getQuantity();
            fruit.showAfterOder(quantity);
            total += fruit.amount(quantity);
        }
        System.out.println("Total: " + total);
    }

    public void displayAllFruits() {
        if (fruitList.isEmpty()) {
            System.out.println("Fruit list is empty");
            return;
        }
        System.out.printf("\n");
        System.out.println("----------FRUIT LIST-----------");
        for (Fruit fruit : fruitList) {
            System.out.println(fruit.getFruitName());
        }
    }

    public void displayAllFruitForShopping() {
        if (fruitList.isEmpty()) {
            System.out.println("Fruit list is empty");
            return;
        }
        int i = 1;
        System.out.println("|Item |Fruit name  |Total quantity |Origin    |Price     |");
        for (Fruit fruit : fruitList) {
            fruit.showForShopping(i);
            i++;
        }
    }

    public void removeFruitList() {
        for (int i = 0; i < fruitList.size(); i++) {
            if (fruitList.get(i).getQuantity() == 0) {
                fruitList.remove(i);
            }
        }
    }
}
