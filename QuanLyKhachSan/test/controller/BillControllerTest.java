/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.BillModel;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Admin
 */
public class BillControllerTest {
    /**
     * Test of GetTableBill method, of class BillController.
     */
    @Test
    public void testGetTableBill() {
        BillController instance = new BillController();
        ArrayList<BillModel> expResult = null;
        ArrayList<BillModel> result = instance.GetTableBill();
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteBill method, of class BillController.
     */
    @Test
    public void testDeleteBill() {
        String id = "";
        BillController instance = new BillController();
        boolean expResult = false;
        boolean result = instance.deleteBill(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of updateBill method, of class BillController.
     */
    @Test
    public void testUpdateBill() {
        BillModel billModel = new BillModel();
        BillController instance = new BillController();
        boolean expResult = false;
        boolean result = instance.updateBill(billModel);
        assertEquals(expResult, result);
    }

    /**
     * Test of insertBill method, of class BillController.
     */
    @Test
    public void testInsertBill() {
        BillModel billModel = new BillModel();
        BillController instance = new BillController();
        boolean expResult = false;
        boolean result = instance.insertBill(billModel);
        assertEquals(expResult, result);
    }

    /**
     * Test of getBill method, of class BillController.
     */
    @Test
    public void testGetBill() {
        int index = 0;
        BillController instance = new BillController();
        BillModel expResult = null;
        BillModel result = instance.getBill(index);
        assertEquals(expResult, result);
    }

    /**
     * Test of getBillByID method, of class BillController.
     */
    @Test
    public void testGetBillByID() {
        String id = "";
        BillController instance = new BillController();
        BillModel expResult = null;
        BillModel result = instance.getBillByID(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of roomEmty method, of class BillController.
     */
    @Test
    public void testRoomEmty() {
        String roomID = "";
        BillController instance = new BillController();
        boolean expResult = false;
        boolean result = instance.roomEmty(roomID);
        assertEquals(expResult, result);
    }

    /**
     * Test of sortByDate method, of class BillController.
     */
    @Test
    public void testSortByDate() {
        BillController instance = new BillController();
        ArrayList<BillModel> expResult = null;
        ArrayList<BillModel> result = instance.sortByDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of sortByName method, of class BillController.
     */
    @Test
    public void testSortByName() {
        BillController instance = new BillController();
        ArrayList<BillModel> expResult = null;
        ArrayList<BillModel> result = instance.sortByName();
        assertEquals(expResult, result);
        // TODO review the generated test code and
    }

    /**
     * Test of sortByPay method, of class BillController.
     */
    @Test
    public void testSortByPay() {
        BillController instance = new BillController();
        ArrayList<BillModel> expResult = null;
        ArrayList<BillModel> result = instance.sortByPay();
        assertEquals(expResult, result);
    }

    /**
     * Test of roomOrderEmty method, of class BillController.
     */
    @Test
    public void testRoomOrderEmty() {
        BillModel bill = new BillModel();
        BillController instance = new BillController();
        boolean expResult = false;
        boolean result = instance.roomOrderEmty(bill);
        assertEquals(expResult, result);
    }

    /**
     * Test of searchByID method, of class BillController.
     */
    @Test
    public void testSearchByID() {
        String ID = "";
        BillController instance = new BillController();
        ArrayList<BillModel> expResult = null;
        ArrayList<BillModel> result = instance.searchByID(ID);
        assertEquals(expResult, result);
    }
    
}
