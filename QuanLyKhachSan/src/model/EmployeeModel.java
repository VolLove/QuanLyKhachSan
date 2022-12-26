/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author Admin
 */
public class EmployeeModel {

    private String id;
    private String name;
    private String gender;
    private String identi;
    private String address;
    private String birthDate;
    private String numberPhone;

    public EmployeeModel() {
    }

    public EmployeeModel(String id, String name, String gender, String identi, String address, String birthDate, String numberPhone) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.identi = identi;
        this.address = address;
        this.birthDate = birthDate;

        this.numberPhone = numberPhone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdenti() {
        return identi;
    }

    public void setIdenti(String identi) {
        this.identi = identi;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    @Override
    public String toString() {
        return "EmloyeeModel{" + "id=" + id + ", name=" + name + ", gender=" + gender + ", identi=" + identi + ", address=" + address + ", birthDate=" + birthDate + ", numberPhone=" + numberPhone + '}';
    }

}
