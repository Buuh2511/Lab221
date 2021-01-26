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

    int stockID;
    String stockName;
    String address;
    String dateAvailable;
    String Note;

    public StockDTO() {
    }

    public StockDTO(int stockID, String stockName, String address, String dateAvailable, String Note) {
        this.stockID = stockID;
        this.stockName = stockName;
        this.address = address;
        this.dateAvailable = dateAvailable;
        this.Note = Note;
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

    public String getDateAvailable() {
        return dateAvailable;
    }

    public void setDateAvailable(String dateAvailable) {
        this.dateAvailable = dateAvailable;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String Note) {
        this.Note = Note;
    }

}
