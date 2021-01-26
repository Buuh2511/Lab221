package dbo;


    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Admin
 */
public class Stock {
    private int stockID;
    private String stockName;
    private String address;
    private int dateAvailable;
    private String note;

    public Stock() {
    }

    public Stock(int stockID, String stockName, String address, int dateAvailable, String note) {
        this.stockID = stockID;
        this.stockName = stockName;
        this.address = address;
        this.dateAvailable = dateAvailable;
        this.note = note;
    }

    public int getStockID() {
        return stockID;
    }

    public void setStockID(int stockID) {
        this.stockID = stockID;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDateAvailable() {
        return dateAvailable;
    }

    public void setDateAvailable(int dateAvailable) {
        this.dateAvailable = dateAvailable;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}