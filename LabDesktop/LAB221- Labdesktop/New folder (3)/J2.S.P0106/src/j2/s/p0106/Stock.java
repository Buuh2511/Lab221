/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2.s.p0106;

/**
 *
 * @author Admin
 */
public class Stock {
   private String stockID;
   private String stockName;
   private String address;
   private String date;
   private String note;

    public Stock() {
    }

    public Stock(String stockID, String stockName, String address, String date, String note) {
        this.stockID = stockID;
        this.stockName = stockName;
        this.address = address;
        this.date = date;
        this.note = note;
    }

    public String getStockID() {
        return stockID;
    }

    public void setStockID(String stockID) {
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

}
