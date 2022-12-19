/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DAO;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import model.BillModel;

/**
 *
 * @author Admin
 */
public class BillController {

    Connection connection = DAO.getCon();
    PreparedStatement pst;
    ResultSet resultSet = null;

    public static ResultSet GetTableBill() {
        Connection connection = DAO.getCon();
        PreparedStatement pst;
        ResultSet resultSet = null;
        try {
            pst = connection.prepareStatement("SELECT * FROM `bill`");
            resultSet = pst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        }
        return resultSet;
    }

    public static boolean deleteBill(String id) throws SQLException {
        Connection connection = DAO.getCon();
        Statement s = null;
        try {
            s = connection.createStatement();
            String string = ("DELETE FROM `bill` WHERE `_ID` = " + id);
            s.executeUpdate(string);
            if (s != null) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {

            return false;
        } finally {
            connection.close();
        }
    }

    public static boolean update(BillModel billModel) {
        Connection connection = DAO.getCon();
        Statement s = null;
        try {

        } catch (Exception e) {
        } finally {
        }
        return true;
    }

    public double total(Date dIn, Date dOut, String idRoom) {

        long tmp = Math.abs(dIn.getTime() - dOut.getTime());
        double d = (double) tmp / (1000 * 60 * 60);
        d = Math.floor(d*10)/10;
        double price = selectPriceRoom(idRoom);
        price = Math.floor(price*10)/10;
        double total = d*price;
        return total;
    }

    public double selectPriceRoom(String id) {
        double price = 0;

        try {
            pst = connection.prepareStatement("SELECT `_Price` FROM `room` where `_ID` = " + id);
            resultSet = pst.executeQuery();
            while (resultSet.next()) {
                price = resultSet.getDouble("_Price");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        }
        return price;
    }
}
