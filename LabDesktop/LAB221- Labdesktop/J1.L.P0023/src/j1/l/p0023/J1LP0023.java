/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.l.p0023;

import data.FruitManagement;
import util.Menu;

/**
 *
 * @author Admin
 */
public class J1LP0023 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FruitManagement fmng = new FruitManagement();
        int choice;
        do
        {
            Menu.showMenu();
            choice = Menu.getUserChoice();
            switch(choice) {
                case 1:
                    fmng.creatFruit();
                    fmng.displayAllFruits();
                    
                    break;
                case 2:
                    fmng.viewOrder();
                    break;
                case 3:
                    fmng.shoppingForCustomer();
                    break;
                default:
                    break;
            }
        }while(choice != 4);
    }   
}
