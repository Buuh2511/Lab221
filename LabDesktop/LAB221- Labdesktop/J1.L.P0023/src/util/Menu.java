/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Admin
 */
public class Menu {
    public static void showMenu() {
        System.out.println("========== FRUIT SHOP SYSTEM ===========");
        System.out.println("1. Create fruit");
        System.out.println("2. View orders");
        System.out.println("3. Shopping (for buyer)");
        System.out.println("4. Exit");
        System.out.println("(Please choose 1 to createproduct, 2 to view order, 3 for shopping, 4 to Exit program).");
    }
    
    public static int getUserChoice() {
        return Validation.getInt("Enter your choice: ", "Enter 1..4", 1, 4);
    }
}
