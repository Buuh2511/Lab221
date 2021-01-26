/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

/**
 *
 * @author dhtha
 */
public class Stock {

    private int stockID;
    private String tockName;
    private String address;
    private String date;
    private String note;

    public Stock() {

    }

    public Stock(int stockID, String tockName, String address, String date, String note) {
        this.stockID = stockID;
        this.tockName = tockName;
        this.address = address;
        this.date = date;
        this.note = note;
    }

    public int getStockID() {
        return stockID;
    }

    public void setStockID(int stockID) {
        this.stockID = stockID;
    }

    public String getTockName() {
        return tockName;
    }

    public void setTockName(String tockName) {
        this.tockName = tockName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Stock{" + "stockID=" + stockID + ", tockName=" + tockName + ", address=" + address + ", date=" + date + ", note=" + note + '}';
    }
    

}
