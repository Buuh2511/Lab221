/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author SE130485
 */
public class StockDTO {
    private int stockID;
    private String stockName;
    private String address;
    private Timestamp dateAvailble;
    private String note;

    public StockDTO() {
    }

    public StockDTO(int stockID, String stockName, String address, Timestamp dateAvailble) {
        this.stockID = stockID;
        this.stockName = stockName;
        this.address = address;
        this.dateAvailble = dateAvailble;
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

    public Timestamp getDateAvailble() {
        return dateAvailble;
    }

    public void setDateAvailble(Timestamp dateAvailble) {
        this.dateAvailble = dateAvailble;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    
    
    public StockDTO(int stockID, String stockName, String address, Timestamp dateAvailble, String note) {
        this.stockID = stockID;
        this.stockName = stockName;
        this.address = address;
        this.dateAvailble = dateAvailble;
        this.note = note;
    }
    
    
    
    
}
