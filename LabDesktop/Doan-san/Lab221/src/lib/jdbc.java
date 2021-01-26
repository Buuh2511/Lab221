/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DoanNC
 */
public class jdbc {

    public static Connection OpenConnection(String driver, String url) {
        try {
            Class.forName(driver);
            Connection c = DriverManager.getConnection(url);
            return c;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
