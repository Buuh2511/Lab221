/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phucldh.dtos;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class DBDTO {
    private String dbProductName;
    private String dbProductVerson;
    private String driverVerson;
    ArrayList<String> listTableinDB;

    public DBDTO(String dbProductName, String dbProductVerson, String driverVerson, ArrayList<String> listTableinDB) {
        this.dbProductName = dbProductName;
        this.dbProductVerson = dbProductVerson;
        this.driverVerson = driverVerson;
        this.listTableinDB = listTableinDB;
    }

    public DBDTO() {
    }

    public String getDbProductName() {
        return dbProductName;
    }

    public void setDbProductName(String dbProductName) {
        this.dbProductName = dbProductName;
    }

    public String getDbProductVerson() {
        return dbProductVerson;
    }

    public void setDbProductVerson(String dbProductVerson) {
        this.dbProductVerson = dbProductVerson;
    }

    public String getDriverVerson() {
        return driverVerson;
    }

    public void setDriverVerson(String driverVerson) {
        this.driverVerson = driverVerson;
    }

    public ArrayList<String> getListTableinDB() {
        return listTableinDB;
    }

    public void setListTableinDB(ArrayList<String> listTableinDB) {
        this.listTableinDB = listTableinDB;
    }
    
    
}
