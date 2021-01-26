/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package done.s.p0005;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author DoanNC
 */
public class Consumer extends Thread {

    ArrayList<Store> lst;

    public Consumer(ArrayList<Store> lst) {
        this.lst = lst;
    }

    @Override
    public void run() {
        int count = 0;
        int[] changed = new int[3];
        int t;
        while (count < 3) {
            try {
                count++;
                Store tmp;
                do {
                    t = randomValue(lst.size() - 1);
                    tmp = lst.get(t);
                } while (!tmp.isIsAvailable());
                System.out.println("Deleting whole number: " + tmp.getNum());
                tmp.setIsAvailable(false);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        new Producer(lst).start();
    }

    private int randomValue(int max) {
        int min = 0;
        Random r = new Random();
        return r.nextInt(max - min + 1) + min;
    }
}
