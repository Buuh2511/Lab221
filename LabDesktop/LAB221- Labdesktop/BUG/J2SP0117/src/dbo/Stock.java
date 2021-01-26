/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbo;
/**
 *
 * @author Admin
 */
public class Stock {
    private int stockID;
    private String stockName;
    private String address;
    private String dateAvailble;
    private String note;

    public Stock() {
    }

    public Stock(int stockID, String stockName, String address, String dateAvailble, String note) {
        this.stockID = stockID;
        this.stockName = stockName;
        this.address = address;
        this.dateAvailble = dateAvailble;
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

    public String getDateAvailble() {
        return dateAvailble;
    }

    public void setDateAvailble(String dateAvailble) {
        this.dateAvailble = dateAvailble;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
@Override
    public String toString() {
        return "Stock{" + "stockID=" + stockID + ", stockName=" + stockName + ", address=" + address + ", dateAvailble=" + dateAvailble + ", note=" + note + '}';
    }
    
}
