/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package done.s.p0005;

import java.util.ArrayList;

/**
 *
 * @author DoanNC
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Store> lst = new ArrayList<>();
        new Producer(lst).start();
    }
}
