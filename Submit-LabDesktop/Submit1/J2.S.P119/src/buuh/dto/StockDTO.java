/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buuh.dto;

/**
 *
 * @author Buu Huynh
 */
public class StockDTO {
    private int stockID;
    private String StockName;
    private String address;
    private String date;
    private String note;

    public StockDTO() {
    }

    public StockDTO(int stockID, String StockName, String address, String date, String note) {
        this.stockID = stockID;
        this.StockName = StockName;
        this.address = address;
        this.date = date;
        this.note = note;
    }

    public StockDTO(int stockID, String StockName, String address, String date) {
        this.stockID = stockID;
        this.StockName = StockName;
        this.address = address;
        this.date = date;
    }
    
    
    
    public int getStockID() {
        return stockID;
    }

    public void setStockID(int stockID) {
        this.stockID = stockID;
    }

    public String getStockName() {
        return StockName;
    }

    public void setStockName(String StockName) {
        this.StockName = StockName;
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
