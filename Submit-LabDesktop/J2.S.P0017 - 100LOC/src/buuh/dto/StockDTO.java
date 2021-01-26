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
    private int id;
    private String name, dateAavilable, address, note;

    public StockDTO() {
    }

    public StockDTO(int id, String name, String dateAavilable, String address, String note) {
        this.id = id;
        this.name = name;
        this.dateAavilable = dateAavilable;
        this.address = address;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateAavilable() {
        return dateAavilable;
    }

    public void setDateAavilable(String dateAavilable) {
        this.dateAavilable = dateAavilable;
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
    
    
}
