/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planner;

import java.sql.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ronan
 */
public class PlannerTest {
    
    public PlannerTest() {
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
     * Test of main method, of class Planner.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        Planner.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of connectDB method, of class Planner.
     */
    @Test
    public void testConnectDB() {
        System.out.println("connectDB");
        Connection expResult = null;
        Connection result = Planner.connectDB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createTables method, of class Planner.
     */
    @Test
    public void testCreateTables() throws Exception {
        System.out.println("createTables");
        Connection c = null;
        Planner.createTables(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertData method, of class Planner.
     */
    @Test
    public void testInsertData() throws Exception {
        System.out.println("insertData");
        Connection c = null;
        Planner.insertData(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectData method, of class Planner.
     */
    @Test
    public void testSelectData() throws Exception {
        System.out.println("selectData");
        Connection c = null;
        Planner.selectData(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dropTable method, of class Planner.
     */
    @Test
    public void testDropTable() throws Exception {
        System.out.println("dropTable");
        Connection c = null;
        Planner.dropTable(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
