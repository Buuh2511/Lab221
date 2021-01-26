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
public class Consumer extends Thread{
    ArrayList<Stored> list;

    public Consumer(ArrayList<Stored> list) {
        this.list = list;
    }
    
    @Override
    public void run(){
        int count = 0;
        int t;
        while(count < 3){
            try {
                count++;
                Stored tmp;
                do{
                    t = randomValue(list.size() - 1);
                    tmp = list.get(t);
                }while(!tmp.isIsAvailable());
                System.out.println("Deleting whole number : " +tmp.getNum());
                tmp.setIsAvailable(false);
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        new Producer(list).start();
    }
    
    private int randomValue(int max){
        int min = 0;
        Random r = new Random();
        return r.nextInt(max - min + 1) + min;
    }
}
