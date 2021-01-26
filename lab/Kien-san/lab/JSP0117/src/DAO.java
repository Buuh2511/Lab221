/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.util.Vector;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Vu Quoc Hung
 */
public class DAO {       
    
    public static void insertStocks(Vector<Vector> data) {
        Connection cn = null;
        try {
            cn = MyDB.makeConnection();
            if(cn!= null) {
                //cn.setAutoCommit(false);
                String sql =" insert Stocks values(?,?,?,?)";
                PreparedStatement pst = cn.prepareStatement(sql);
                for (Vector<String> row : data) {
                    pst.setInt(1, Integer.parseInt("" + row.get(0)));
                    pst.setString(2, row.get(1));
                    pst.setString(3, row.get(2));
                    pst.setDate(4, java.sql.Date.valueOf(row.get(3)));
                    //The method java.sql.Date.valueOf(java.lang.String) 
                    //received a string representing a date in the format yyyy-[m]m-[d]d.
                    pst.addBatch();
                }
//                cn.commit();
//                cn.setAutoCommit(true);  
                pst.executeBatch();
                pst.clearBatch();
            }
        } catch (Exception e) {
            e.printStackTrace();
            
//            try {
//                cn.rollback();
//            } catch (Exception ex) {
//                ex.printStackTrace();
//            }
        } 
        finally {
            try { 
                                
                if(cn!=null) {
                    cn.close();
                }
                               
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

