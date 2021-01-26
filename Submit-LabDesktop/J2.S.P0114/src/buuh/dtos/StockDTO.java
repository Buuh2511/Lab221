/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buuh.dtos;

import java.util.Vector;

/**
 *
 * @author Buu Huynh
 */
public class StockDTO {
    String name, address, note, date;
    int stockID;

    public StockDTO() {
    }

    public StockDTO(String name, String address, String note, String date, int stockID) {
        this.name = name;
        this.address = address;
        this.note = note;
        this.date = date;
        this.stockID = stockID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getStockID() {
        return stockID;
    }

    public void setStockID(int stockID) {
        this.stockID = stockID;
    }
    
    public Vector toVector(){
        Vector v = new Vector();
        v.add(stockID);
        v.add(name);
        v.add(address);
        v.add(date);
        v.add(note);
        return v;
    }
}
