/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import ulti.DBUtils;

/**
 *
 * @author kim ngân
 */
public class DBDAO {

    Connection conn = null;
    DatabaseMetaData meta = null;

    public DBDAO() throws ClassNotFoundException {
        try {
            conn = DBUtils.getConnection();

        } catch (SQLException e) {
        }
    }

    public DatabaseMetaData getMeta() {
        try {
            if (conn != null) {
                //get metadata từ connection
                meta = conn.getMetaData();
            }
        } catch (SQLException e) {
        }
        return meta;
    }

    public void closeConnection() throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }

    public List getListTable() throws SQLException {
        List listTable = new ArrayList();
        PreparedStatement stm = null;
        ResultSet rs = null;
        if (conn != null) {
            //lấy toàn bộ các bancs
            String sql = "SELECT  TABLE_NAME FROM  INFORMATION_SCHEMA.TABLES;";
            stm = conn.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                listTable.add(rs.getString("TABLE_NAME"));

            }
        }
        return listTable;
    }

}
