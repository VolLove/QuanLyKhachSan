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
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class LoginController {

    private Connection connection = DAO.getCon();
    private PreparedStatement preparedStatement = null;
    private Statement statement = null;
    private ResultSet resultSet = null;

    public boolean login(String user, String pass) throws SQLException {
        try {
            String string = "SELECT * FROM `user` WHERE `_UserName` = " + user + " AND `_PassWord` = " + pass;
            preparedStatement = connection.prepareStatement(string);
            resultSet = preparedStatement.executeQuery();
            return true;
        } catch (SQLException e) {
            return false;
        } finally {
            connection.close();
        }
    }
}
