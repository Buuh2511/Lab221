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
public class Producer extends Thread {

    ArrayList<Store> lst;

    public Producer(ArrayList<Store> lst) {
        this.lst = lst;
    }

    @Override
    public void run() {
        int count = 0;
        while (count < 5) {
            try {
                count++;
                int tmp = randomInt();
                System.out.println("Adding new whole number: " + tmp);
                lst.add(new Store(tmp, true));
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        new Consumer(lst).start();
    }

    private int randomInt() {
        int min = 1;
        int max = 100;
        Random r = new Random();
        return r.nextInt(max - min + 1) + min;

    }
}
