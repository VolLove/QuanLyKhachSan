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
    private Statement statement ;
    private ResultSet resultSet = null;
    private ArrayList<RoomModel> roomModels = new ArrayList<>();

    public ResultSet getRoomTable() {
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
        return resultSet;
    }

    public ArrayList<RoomModel> getListRoom() {
        getRoomTable();
        return roomModels;
    }

    public RoomModel getRoomByIndex(int index) {
      return roomModels.get(index);
    }
    public RoomModel getRoomByID(String id){
        for (RoomModel roomModel : roomModels) {
            if (roomModel.getIdRoom().compareTo(id)==0) {
                return roomModel;
            }
        }
        return null;
    }
 
}
