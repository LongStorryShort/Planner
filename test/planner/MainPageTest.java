/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planner;

import java.util.ArrayList;
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
public class MainPageTest {
    
    public MainPageTest() {
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
     * Test of main method, of class MainPage.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MainPage.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSemesterInfo method, of class MainPage.
     */
    @Test
    public void testGetSemesterInfo() throws Exception {
        System.out.println("getSemesterInfo");
        String semesterName = "";
        MainPage instance = new MainPage();
        ArrayList<Semester> expResult = null;
        ArrayList<Semester> result = instance.getSemesterInfo(semesterName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
