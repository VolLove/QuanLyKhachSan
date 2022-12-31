/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.EmployeeModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class EmployeeControllerTest {
    
    public EmployeeControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getEmployeeTable method, of class EmployeeController.
     */
    @Test
    public void testGetEmployeeTable() {
        System.out.println("getEmployeeTable");
        EmployeeController instance = new EmployeeController();
        ArrayList<EmployeeModel> expResult = null;
        ArrayList<EmployeeModel> result = instance.getEmployeeTable();
        assertEquals(expResult, result);
    }

    /**
     * Test of insertEmployee method, of class EmployeeController.
     */
    @Test
    public void testInsertEmployee() {
        System.out.println("insertEmployee");
        EmployeeModel employeeModel = null;
        EmployeeController instance = new EmployeeController();
        boolean expResult = false;
        boolean result = instance.insertEmployee(employeeModel);
        assertEquals(expResult, result);
    }

    /**
     * Test of updateEmployee method, of class EmployeeController.
     */
    @Test
    public void testUpdateEmployee() {
        System.out.println("updateEmployee");
        EmployeeModel employeeModel = null;
        EmployeeController instance = new EmployeeController();
        boolean expResult = false;
        boolean result = instance.updateEmployee(employeeModel);
        assertEquals(expResult, result);
    }

    /**
     * Test of deletetEmployee method, of class EmployeeController.
     */
    @Test
    public void testDeletetEmployee() {
        System.out.println("deletetEmployee");
        String id = "";
        EmployeeController instance = new EmployeeController();
        boolean expResult = false;
        boolean result = instance.deletetEmployee(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of sortByName method, of class EmployeeController.
     */
    @Test
    public void testSortByName() {
        System.out.println("sortByName");
        EmployeeController instance = new EmployeeController();
        ArrayList<EmployeeModel> expResult = null;
        ArrayList<EmployeeModel> result = instance.sortByName();
        assertEquals(expResult, result);
    }

    /**
     * Test of sortByID method, of class EmployeeController.
     */
    @Test
    public void testSortByID() {
        System.out.println("sortByID");
        EmployeeController instance = new EmployeeController();
        ArrayList<EmployeeModel> expResult = null;
        ArrayList<EmployeeModel> result = instance.sortByID();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListEmloyee method, of class EmployeeController.
     */
    @Test
    public void testGetListEmloyee() {
        System.out.println("getListEmloyee");
        EmployeeController instance = new EmployeeController();
        ArrayList<EmployeeModel> expResult = null;
        ArrayList<EmployeeModel> result = instance.getListEmloyee();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEmloyeeIndex method, of class EmployeeController.
     */
    @Test
    public void testGetEmloyeeIndex() {
        System.out.println("getEmloyeeIndex");
        int index = 0;
        EmployeeController instance = new EmployeeController();
        EmployeeModel expResult = null;
        EmployeeModel result = instance.getEmloyeeIndex(index);
        assertEquals(expResult, result);
    }

    /**
     * Test of getEmloyeeByID method, of class EmployeeController.
     */
    @Test
    public void testGetEmloyeeByID() {
        System.out.println("getEmloyeeByID");
        String id = "";
        EmployeeController instance = new EmployeeController();
        EmployeeModel expResult = null;
        EmployeeModel result = instance.getEmloyeeByID(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of canId method, of class EmployeeController.
     */
    @Test
    public void testCanId() {
        System.out.println("canId");
        String id = "";
        EmployeeController instance = new EmployeeController();
        boolean expResult = false;
        boolean result = instance.canId(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of searchByName method, of class EmployeeController.
     */
    @Test
    public void testSearchByName() {
        System.out.println("searchByName");
        String Name = "";
        EmployeeController instance = new EmployeeController();
        ArrayList<EmployeeModel> expResult = null;
        ArrayList<EmployeeModel> result = instance.searchByName(Name);
        assertEquals(expResult, result);
    }
    
}
