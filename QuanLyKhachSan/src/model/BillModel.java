/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author Admin
 */
public class BillModel {

    private String id;
    private String idClient;
    private String nameClient;
    private String idEmployee;
    private String idRoom;
    private String timeCheckIn;
    private String timeCheckOut = "2000-01-01 00:00:00";
    private double pay = 0;
    private int start = 0;

    public BillModel() {
    }

    public BillModel(BillModel billModel) {
        this.id = billModel.getId();
        this.idClient = billModel.getIdClient();
        this.nameClient = billModel.getNameClient();
        this.idEmployee = billModel.getIdEmployee();
        this.idRoom = billModel.getIdRoom();
        this.timeCheckIn = billModel.getTimeCheckIn();
        this.timeCheckOut = billModel.getTimeCheckOut();
        this.pay = billModel.getPay();
        this.start = billModel.getStart();
    }

    public BillModel(String id, String idClient, String nameClient, String idEmployee, String idRoom, String timeCheckIn, String timeCheckOut, double pay) {
        this.id = id;
        this.idClient = idClient;
        this.nameClient = nameClient;
        this.idEmployee = idEmployee;
        this.idRoom = idRoom;
        this.timeCheckIn = timeCheckIn;
        if (!"".equals(timeCheckOut)) {
            this.timeCheckOut = timeCheckOut;
        }
        this.pay = pay;
    }

    public BillModel(String id, String idClient, String nameClient, String idEmployee, String idRoom, String timeCheckIn, String timeCheckOut, double pay, int start) {
        this.id = id;
        this.idClient = idClient;
        this.nameClient = nameClient;
        this.idEmployee = idEmployee;
        this.idRoom = idRoom;
        this.timeCheckIn = timeCheckIn;
        if (!"".equals(timeCheckOut)) {
            this.timeCheckOut = timeCheckOut;
        }
        this.pay = pay;
        this.start = start;
    }

    public BillModel(String id, String idClient, String nameClient, String idEmployee, String idRoom, String timeCheckIn) {
        this.id = id;
        this.idClient = idClient;
        this.nameClient = nameClient;
        this.idEmployee = idEmployee;
        this.idRoom = idRoom;
        this.timeCheckIn = timeCheckIn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(String idRoom) {
        this.idRoom = idRoom;
    }

    public String getTimeCheckIn() {
        return timeCheckIn;
    }

    public void setTimeCheckIn(String timeCheckIn) {
        this.timeCheckIn = timeCheckIn;
    }

    public String getTimeCheckOut() {
        return timeCheckOut;
    }

    public void setTimeCheckOut(String timeCheckOut) {
        this.timeCheckOut = timeCheckOut;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    @Override
    public String toString() {
        return "BillModel{" + "id=" + id + ", idClient=" + idClient + ", nameClient=" + nameClient + ", idEmployee=" + idEmployee + ", idRoom=" + idRoom + ", timeCheckIn=" + timeCheckIn + ", timeCheckOut=" + timeCheckOut + ", pay=" + pay + ", start=" + start + '}';
    }
    
}
