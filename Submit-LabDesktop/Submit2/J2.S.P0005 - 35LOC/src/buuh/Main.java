/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buuh;

import java.util.ArrayList;

/**
 *
 * @author Buu Huynh
 */
public class Main {
    public static void main(String[] args){
        ArrayList<Stored> list = new ArrayList<>();
        new Producer(list).start();
    }
}
