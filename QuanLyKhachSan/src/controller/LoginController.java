/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import DAO.DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class LoginController {

    private Connection connection = DAO.getCon();
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public boolean login(String user, String pass) {
        try {
            String string = "SELECT * FROM `user` WHERE `_UserName` = " + user + " AND `_PassWord` = " + pass;
            preparedStatement = connection.prepareStatement(string);
            resultSet = preparedStatement.executeQuery();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
}
