/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class RoomController {

    Connection connection = DAO.getCon();
    PreparedStatement pst;
    ResultSet resultSet = null;

    public ResultSet selectTable() {
        try {
            pst = connection.prepareStatement("SELECT * FROM `room`");
            resultSet = pst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        }
        return resultSet;
    }

}
