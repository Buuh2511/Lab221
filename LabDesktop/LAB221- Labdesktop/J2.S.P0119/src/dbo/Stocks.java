/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbo;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Stocks extends Vector<Stock>{

    public Stocks() {
        super();
    }
  public void loadFromDB(StocksDBAccess dbObj){
      int stockID;
        String stockName, address, note;
        int dateavailable;
        String sql ="SELECT stockID, stockName, address, dateavailable, note FROM FU_DB";
        try {
          ResultSet rs = dbObj.executeQuery(sql);
            while (rs.next()) {
                stockID = rs.getInt(1);
                stockName = rs.getString(2);
                address = rs.getString(3);
                dateavailable = rs.getInt(4);
                note = rs.getString(5);
                Stock stock = new Stock(stockID, stockName, address, dateavailable, note);
                this.add(stock);
            }
            rs.close();
      } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
      }
  }
}
