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
import java.sql.Statement;
import java.util.ArrayList;
import model.RoomModel;

/**
 *
 * @author Admin
 */
public class RoomController {

    private Connection connection = DAO.getCon();
    private PreparedStatement pst;
    private Statement statement;
    private ResultSet resultSet = null;
    private ArrayList<RoomModel> roomModels = new ArrayList<>();

    public ArrayList<RoomModel> getRoomTable() {
        try {
            roomModels = new ArrayList<>();
            pst = connection.prepareStatement("SELECT * FROM `room`");
            resultSet = pst.executeQuery();
            while (resultSet.next()) {
                String roomID = resultSet.getString("_ID");
                String roomName = resultSet.getString("_Name");
                double roomPrice = resultSet.getDouble("_Price");
                RoomModel roomModel = new RoomModel(roomID, roomName, roomPrice);
                roomModels.add(roomModel);
            }
        } catch (SQLException e) {
        }
        return roomModels;
    }

    public RoomModel getRoomByIndex(int index) {
        return roomModels.get(index);
    }

    public RoomModel getRoomByID(String id) {
        for (RoomModel roomModel : roomModels) {
            if (roomModel.getIdRoom().compareTo(id) == 0) {
                return roomModel;
            }
        }
        return null;
    }

    public boolean insertRoom(RoomModel roomModel) {
        try {
            statement = connection.createStatement();
            String string = "INSERT INTO `room`(`_ID`, `_Name`, `_Price`) VALUES ("
                    + "'" + roomModel.getIdRoom() + "',"
                    + "'" + roomModel.getNameRoom() + "',"
                    + "'" + roomModel.getPrice() + "'"
                    + ")";
            statement.execute(string);
            return statement != null;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean deleteRoom(String idRoom) {
        if (haveRoom(idRoom) == false) {
            return false;
        }
        try {

            statement = connection.createStatement();
            String string = "DELETE FROM `room` WHERE `_ID` = '" + idRoom + "'";
            statement.execute(string);
            return statement != null;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean updateRoom(RoomModel roomModel) {
        if (haveRoom(roomModel.getIdRoom()) == false) {
            return false;
        }
        try {
            statement = connection.createStatement();
            String string = "UPDATE `room` SET "
                    + "`_Name`='" + roomModel.getNameRoom() + "',"
                    + "`_Price`=' " + roomModel.getPrice() + "'"
                    + " WHERE `_ID` = '" + roomModel.getIdRoom() + "'";
            statement.execute(string);
            return statement != null;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean haveRoom(String id) {
        for (RoomModel roomModel : roomModels) {
            if (roomModel.getIdRoom().equals(id)) {
                return true;
            }
        }
        return false;
    }
}
