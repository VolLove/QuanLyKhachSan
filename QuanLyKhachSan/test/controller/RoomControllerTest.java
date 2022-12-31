/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.RoomModel;
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
public class RoomControllerTest {
    
    public RoomControllerTest() {
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
     * Test of getRoomTable method, of class RoomController.
     */
    @Test
    public void testGetRoomTable() {
        System.out.println("getRoomTable");
        RoomController instance = new RoomController();
        ArrayList<RoomModel> expResult = null;
        ArrayList<RoomModel> result = instance.getRoomTable();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRoomByIndex method, of class RoomController.
     */
    @Test
    public void testGetRoomByIndex() {
        System.out.println("getRoomByIndex");
        int index = 0;
        RoomController instance = new RoomController();
        RoomModel expResult = null;
        RoomModel result = instance.getRoomByIndex(index);
        assertEquals(expResult, result);
    }

    /**
     * Test of getRoomByID method, of class RoomController.
     */
    @Test
    public void testGetRoomByID() {
        System.out.println("getRoomByID");
        String id = "";
        RoomController instance = new RoomController();
        RoomModel expResult = null;
        RoomModel result = instance.getRoomByID(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of insertRoom method, of class RoomController.
     */
    @Test
    public void testInsertRoom() {
        System.out.println("insertRoom");
        RoomModel roomModel = null;
        RoomController instance = new RoomController();
        boolean expResult = false;
        boolean result = instance.insertRoom(roomModel);
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteRoom method, of class RoomController.
     */
    @Test
    public void testDeleteRoom() {
        System.out.println("deleteRoom");
        String idRoom = "";
        RoomController instance = new RoomController();
        boolean expResult = false;
        boolean result = instance.deleteRoom(idRoom);
        assertEquals(expResult, result);
    }

    /**
     * Test of updateRoom method, of class RoomController.
     */
    @Test
    public void testUpdateRoom() {
        System.out.println("updateRoom");
        RoomModel roomModel = null;
        RoomController instance = new RoomController();
        boolean expResult = false;
        boolean result = instance.updateRoom(roomModel);
        assertEquals(expResult, result);
    }

    /**
     * Test of haveRoom method, of class RoomController.
     */
    @Test
    public void testHaveRoom() {
        System.out.println("haveRoom");
        String id = "";
        RoomController instance = new RoomController();
        boolean expResult = false;
        boolean result = instance.haveRoom(id);
        assertEquals(expResult, result);
    }
    
}
