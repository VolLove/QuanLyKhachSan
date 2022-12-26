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
import model.EmployeeModel;

/**
 *
 * @author Admin
 */
public class EmployeeController {

    private Connection connection = DAO.getCon();
    private PreparedStatement preparedStatement = null;
    private Statement statement = null;
    private ResultSet resultSet = null;
    private ArrayList<EmployeeModel> emloyeeModels = new ArrayList<>();

    public ArrayList<EmployeeModel> getEmployeeTable() {
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM `employee`");
            resultSet = preparedStatement.executeQuery();
            emloyeeModels = new ArrayList<>();
            while (resultSet.next()) {
                String id = resultSet.getString("_ID");
                String name = resultSet.getString("_Name");
                String gender = resultSet.getString("_Gender");
                String identi = resultSet.getString("_Identi");
                String address = resultSet.getString("_Address");
                String birthDate = resultSet.getString("_DayOfBirth");
                String numberPhone = resultSet.getString("_NumPhone");
                EmployeeModel emloyeeModel = new EmployeeModel(id, name, gender, identi, address, birthDate, numberPhone);
                emloyeeModels.add(emloyeeModel);
            }
        } catch (SQLException e) {
        }
        return emloyeeModels;
    }

    public boolean insertEmployee(EmployeeModel employeeModel) {
        try {
            statement = connection.createStatement();
            String string = "INSERT INTO `employee`(`_ID`, `_Name`, `_Identi`, `_Gender`, `_Address`, `_DayOfBirth`, `_NumPhone`) VALUES ("
                    + "'" + employeeModel.getId() + "',"
                    + "'" + employeeModel.getName() + "',"
                    + "'" + employeeModel.getIdenti() + "',"
                    + "'" + employeeModel.getGender() + "',"
                    + "'" + employeeModel.getAddress() + "',"
                    + "'" + employeeModel.getBirthDate() + "',"
                    + "'" + employeeModel.getNumberPhone() + "')";
            statement.executeUpdate(string);
            return statement != null;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean updateEmployee(EmployeeModel employeeModel) {
        try {
            statement = connection.createStatement();
            String string = "UPDATE `employee` SET "
                    + "`_Name`='" + employeeModel.getName()
                    + "',`_Identi`='" + employeeModel.getIdenti()
                    + "',`_Gender`='" + employeeModel.getGender()
                    + "',`_Address`='" + employeeModel.getAddress()
                    + "',`_DayOfBirth`='" + employeeModel.getBirthDate()
                    + "',`_NumPhone`='" + employeeModel.getNumberPhone()
                    + "' WHERE `_ID` = '" + employeeModel.getId() + "'";
            statement.executeUpdate(string);
            return statement != null;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean deletetEmployee(String id) {
        try {
            statement = connection.createStatement();
            String string = "DELETE FROM `employee` WHERE `_ID` = '" + id + "'";
            statement.execute(string);
            System.out.println(string);

            return statement != null;
        } catch (SQLException e) {
            return false;
        }
    }

    public ArrayList<EmployeeModel> sortByName() {
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM `employee` ORDER BY `_Name` ASC");
            resultSet = preparedStatement.executeQuery();
            emloyeeModels = new ArrayList<>();
            while (resultSet.next()) {
                String id = resultSet.getString("_ID");
                String name = resultSet.getString("_Name");
                String gender = resultSet.getString("_Gender");
                String identi = resultSet.getString("_Identi");
                String address = resultSet.getString("_Address");
                String birthDate = resultSet.getString("_DayOfBirth");
                String numberPhone = resultSet.getString("_NumPhone");
                EmployeeModel emloyeeModel = new EmployeeModel(id, name, gender, identi, address, birthDate, numberPhone);
                emloyeeModels.add(emloyeeModel);
            }
        } catch (SQLException e) {
        }
        return emloyeeModels;
    }
    
    public ArrayList<EmployeeModel> sortByID() {
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM `employee` ORDER BY `_ID` ASC, `_Name` ASC");
            resultSet = preparedStatement.executeQuery();
            emloyeeModels = new ArrayList<>();
            while (resultSet.next()) {
                String id = resultSet.getString("_ID");
                String name = resultSet.getString("_Name");
                String gender = resultSet.getString("_Gender");
                String identi = resultSet.getString("_Identi");
                String address = resultSet.getString("_Address");
                String birthDate = resultSet.getString("_DayOfBirth");
                String numberPhone = resultSet.getString("_NumPhone");
                EmployeeModel emloyeeModel = new EmployeeModel(id, name, gender, identi, address, birthDate, numberPhone);
                emloyeeModels.add(emloyeeModel);
            }
        } catch (SQLException e) {
        }
        return emloyeeModels;
    }

    public ArrayList<EmployeeModel> getListEmloyee() {
        return emloyeeModels;
    }

    public EmployeeModel getEmloyeeIndex(int index) {

        return emloyeeModels.get(index);
    }

    public EmployeeModel getEmloyeeByID(String id) {

        for (EmployeeModel emloyeeModel : emloyeeModels) {
            if (emloyeeModel.getId().compareTo(id) == 0) {
                return emloyeeModel;
            }
        }
        return null;
    }

    public boolean canId(String id) {
        for (EmployeeModel emloyeeModel : emloyeeModels) {
            if (emloyeeModel.getId().compareTo(id) == 0) {
                return false;
            }
        }
        return true;
    }

}
