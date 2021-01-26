/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package done.s.p0005;

/**
 *
 * @author DoanNC
 */
public class Store {

    private int num;
    private boolean isAvailable;

    public Store() {
    }

    public Store(int num, boolean isAvailable) {
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
