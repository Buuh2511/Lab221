/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai113;

/**
 *
 * @author ASUS
 */
public class BookDTO {
    String code, name, author, publisher;
    String year;
    boolean rent;

    public BookDTO(String code, String name, String author, String publisher, String year, boolean rent) {
        this.code = code;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.rent = rent;
    }

    public BookDTO() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public boolean isRent() {
        return rent;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
    
    
}
