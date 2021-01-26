/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buuh;


import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Buu Huynh
 */
public class Producer extends Thread{
    ArrayList<Stored> list;

    public Producer(ArrayList<Stored> list) {
        this.list = list;
    }
    
    @Override
    public void run(){
        int count = 0;
        while(count < 5){
            try {
                count++;
                int tmp = randomInt();
                System.out.println("Adding new whole number : " +tmp);
                list.add(new Stored(tmp, true));
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        new Consumer(list).start();
    }
    
    private int randomInt(){
        int min = 1;
        int max = 100;
        Random r = new Random();
        return r.nextInt(max - min + 1) + min;
    }
}
