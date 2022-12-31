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
import java.util.ArrayList;
import model.BillModel;

/**
 *
 * @author Admin
 */
public class BillController {

    Connection connection = DAO.getCon();
    PreparedStatement preparedStatement = null;
    Statement statement = null;
    ArrayList<BillModel> billModels = new ArrayList<>();

    /**
     *
     * @return
     */
    public ArrayList<BillModel> GetTableBill() {
        ResultSet resultSet;
        billModels = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM `bill`");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String id = resultSet.getString("_ID");
                String name = resultSet.getString("_Name");
                String idClient = resultSet.getString("_Identi");
                String idEmloyee = resultSet.getString("_IDEmloyee");
                String idRoom = resultSet.getString("_IDRoom");
                String timeIn = resultSet.getString("_TimeCheckIn");
                String timeOut = resultSet.getString("_TimeCheckOut");
                double pay = resultSet.getDouble("_Pay");
                int start = resultSet.getInt("_Start");
                BillModel billModel = new BillModel(id, idClient, name, idEmloyee, idRoom, timeIn, timeOut, pay, start);
                billModels.add(billModel);
            }

        } catch (SQLException e) {
        }
        return billModels;
    }

    public boolean deleteBill(String id) {
        if (haveID(id) == false) {
            return false;
        }
        try {
            statement = connection.createStatement();
            String string = ("DELETE FROM `bill` WHERE `_ID` = '" + id + "'");
            statement.executeUpdate(string);
            return statement != null;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean updateBill(BillModel billModel) {
        if (haveID(billModel.getId()) == false) {
            return false;
        }
        try {
            statement = connection.createStatement();

            String string = ("UPDATE `bill` SET "
                    + "`_Name`='" + billModel.getNameClient()
                    + "',`_Identi`='" + billModel.getIdClient()
                    + "',`_IDEmloyee`='" + billModel.getIdEmployee()
                    + "',`_IDRoom`='" + billModel.getIdRoom()
                    + "',`_TimeCheckIn`='" + billModel.getTimeCheckIn()
                    + "',`_TimeCheckOut`='" + billModel.getTimeCheckOut()
                    + "',`_Pay`='" + billModel.getPay()
                    + "',`_Start` = '" + billModel.getStart()
                    + "' WHERE `_ID` = '" + billModel.getId() + "'");
            statement.execute(string);
            return statement != null;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean insertBill(BillModel billModel) {
        try {
            statement = connection.createStatement();
            String string = ("INSERT INTO `bill`(`_ID`,`_Name`, `_Identi`,`_IDEmloyee`, `_IDRoom`, `_TimeCheckIn`,`_Start`) "
                    + "VALUES ('" + billModel.getId() + "','"
                    + billModel.getNameClient() + "','"
                    + billModel.getIdClient() + "','"
                    + billModel.getIdEmployee() + "','"
                    + billModel.getIdRoom() + "','"
                    + billModel.getTimeCheckIn() + "','"
                    + billModel.getStart() + "')");
            statement.executeUpdate(string);
            return statement != null;
        } catch (SQLException e) {
            return false;
        }
    }

    public BillModel getBill(int index) {
        return billModels.get(index);
    }

    public boolean haveID(String id) {
        for (BillModel billModel : billModels) {
            if (billModel.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public BillModel getBillByID(String id) {
        for (BillModel billModel : billModels) {
            if (billModel.getId().equals(id)) {
                return billModel;
            }
        }
        return new BillModel();
    }

    public boolean roomEmty(String roomID) {
        for (BillModel billModel : billModels) {
            if (billModel.getIdRoom().compareTo(roomID) == 0 && billModel.getStart() == 0) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<BillModel> sortByDate() {
        ResultSet resultSet;
        billModels = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM `bill` ORDER BY `_TimeCheckIn` DESC  ,`_Name` ASC");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String id = resultSet.getString("_ID");
                String name = resultSet.getString("_Name");
                String idClient = resultSet.getString("_Identi");
                String idEmloyee = resultSet.getString("_IDEmloyee");
                String idRoom = resultSet.getString("_IDRoom");
                String timeIn = resultSet.getString("_TimeCheckIn");
                String timeOut = resultSet.getString("_TimeCheckOut");
                double pay = resultSet.getDouble("_Pay");
                int start = resultSet.getInt("_Start");
                BillModel billModel = new BillModel(id, idClient, name, idEmloyee, idRoom, timeIn, timeOut, pay, start);
                billModels.add(billModel);
            }

        } catch (SQLException e) {
        }
        return billModels;
    }

    public ArrayList<BillModel> sortByName() {
        ResultSet resultSet;
        billModels = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM `bill` ORDER BY `_Name` ASC");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String id = resultSet.getString("_ID");
                String name = resultSet.getString("_Name");
                String idClient = resultSet.getString("_Identi");
                String idEmloyee = resultSet.getString("_IDEmloyee");
                String idRoom = resultSet.getString("_IDRoom");
                String timeIn = resultSet.getString("_TimeCheckIn");
                String timeOut = resultSet.getString("_TimeCheckOut");
                double pay = resultSet.getDouble("_Pay");
                int start = resultSet.getInt("_Start");
                BillModel billModel = new BillModel(id, idClient, name, idEmloyee, idRoom, timeIn, timeOut, pay, start);
                billModels.add(billModel);
            }

        } catch (SQLException e) {
        }
        return billModels;
    }

    public ArrayList<BillModel> sortByPay() {
        ResultSet resultSet;
        billModels = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM `bill` ORDER BY `_Pay` DESC ,`_Name` ASC");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String id = resultSet.getString("_ID");
                String name = resultSet.getString("_Name");
                String idClient = resultSet.getString("_Identi");
                String idEmloyee = resultSet.getString("_IDEmloyee");
                String idRoom = resultSet.getString("_IDRoom");
                String timeIn = resultSet.getString("_TimeCheckIn");
                String timeOut = resultSet.getString("_TimeCheckOut");
                double pay = resultSet.getDouble("_Pay");
                int start = resultSet.getInt("_Start");
                BillModel billModel = new BillModel(id, idClient, name, idEmloyee, idRoom, timeIn, timeOut, pay, start);
                billModels.add(billModel);
            }

        } catch (SQLException e) {
        }
        return billModels;
    }

    public boolean roomOrderEmty(BillModel bill) {
        for (BillModel billModel : billModels) {
            if (!billModel.getId().equals(bill.getId())) {
                if (billModel.getIdRoom().equals(bill.getIdRoom()) && billModel.getStart() == 0) {

                    return false;
                }
            }
        }
        return true;
    }

    public ArrayList<BillModel> searchByID(String ID) {
        ResultSet resultSet;
        billModels = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM `bill` where `_ID` = '" + ID + "'");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String id = resultSet.getString("_ID");
                String name = resultSet.getString("_Name");
                String idClient = resultSet.getString("_Identi");
                String idEmloyee = resultSet.getString("_IDEmloyee");
                String idRoom = resultSet.getString("_IDRoom");
                String timeIn = resultSet.getString("_TimeCheckIn");
                String timeOut = resultSet.getString("_TimeCheckOut");
                double pay = resultSet.getDouble("_Pay");
                int start = resultSet.getInt("_Start");
                BillModel billModel = new BillModel(id, idClient, name, idEmloyee, idRoom, timeIn, timeOut, pay, start);
                billModels.add(billModel);
            }

        } catch (SQLException e) {
        }
        return billModels;
    }
}
