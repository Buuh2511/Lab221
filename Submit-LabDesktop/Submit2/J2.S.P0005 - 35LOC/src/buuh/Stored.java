/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buuh;

/**
 *
 * @author Buu Huynh
 */
public class Stored {
    private int num;
    private boolean isAvailable;

    public Stored() {
    }

    public Stored(int num, boolean isAvailable) {
        this.num = num;
        this.isAvailable = isAvailable;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
    
}
