/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planner;

import javax.swing.DefaultListModel;
import javax.swing.JList;
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
public class CourseworkTest {
    
    public CourseworkTest() {
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
     * Test of insertCourseworkData method, of class Coursework.
     */
    @Test
    public void testInsertCourseworkData() throws Exception {
        System.out.println("insertCourseworkData");
        int cw_ID = 0;
        String cw_Name = "";
        int cw_Weight = 0;
        String cw_Deadline = "";
        String moduleID = "";
        Coursework instance = new Coursework();
        instance.insertCourseworkData(cw_ID, cw_Name, cw_Weight, cw_Deadline, moduleID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectCourseworkData1 method, of class Coursework.
     */
    @Test
    public void testSelectCourseworkData1() throws Exception {
        System.out.println("selectCourseworkData1");
        Coursework instance = new Coursework();
        DefaultListModel expResult = null;
        DefaultListModel result = instance.selectCourseworkData1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectCourseworkData method, of class Coursework.
     */
    @Test
    public void testSelectCourseworkData() throws Exception {
        System.out.println("selectCourseworkData");
        JList list = null;
        JList list2 = null;
        Coursework instance = new Coursework();
        DefaultListModel expResult = null;
        DefaultListModel result = instance.selectCourseworkData(list, list2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCourseworkName method, of class Coursework.
     */
    @Test
    public void testGetCourseworkName() {
        System.out.println("getCourseworkName");
        Coursework instance = new Coursework();
        String expResult = "";
        String result = instance.getCourseworkName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCourseworkName method, of class Coursework.
     */
    @Test
    public void testSetCourseworkName() {
        System.out.println("setCourseworkName");
        String courseworkName = "";
        Coursework instance = new Coursework();
        instance.setCourseworkName(courseworkName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeadline method, of class Coursework.
     */
    @Test
    public void testGetDeadline() {
        System.out.println("getDeadline");
        Coursework instance = new Coursework();
        String expResult = "";
        String result = instance.getDeadline();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDeadline method, of class Coursework.
     */
    @Test
    public void testSetDeadline() {
        System.out.println("setDeadline");
        String deadline = "";
        Coursework instance = new Coursework();
        instance.setDeadline(deadline);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMarkValue method, of class Coursework.
     */
    @Test
    public void testGetMarkValue() {
        System.out.println("getMarkValue");
        Coursework instance = new Coursework();
        int expResult = 0;
        int result = instance.getMarkValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMarkValue method, of class Coursework.
     */
    @Test
    public void testSetMarkValue() {
        System.out.println("setMarkValue");
        int markValue = 0;
        Coursework instance = new Coursework();
        instance.setMarkValue(markValue);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
