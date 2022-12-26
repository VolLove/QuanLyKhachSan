 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class RoomModel {
    private String idRoom;
    private String nameRoom;
    private double total;

    public RoomModel() {
    }

    public RoomModel(String idRoom, String nameRoom, double total) {
        this.idRoom = idRoom;
        this.nameRoom = nameRoom;
        this.total = total;
    }

    public String getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(String idRoom) {
        this.idRoom = idRoom;
    }

    public String getNameRoom() {
        return nameRoom;
    }

    public void setNameRoom(String nameRoom) {
        this.nameRoom = nameRoom;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "RoomModel{" + "idRoom=" + idRoom + ", nameRoom=" + nameRoom + ", total=" + total + '}';
    }

   
}
