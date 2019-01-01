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
public class ModuleTest {
    
    public ModuleTest() {
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
     * Test of insertModuleData method, of class Module.
     */
    @Test
    public void testInsertModuleData() throws Exception {
        System.out.println("insertModuleData");
        String moduleID = "";
        String moduleName = "";
        int semesterID = 0;
        Module instance = new Module();
        instance.insertModuleData(moduleID, moduleName, semesterID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModuleID method, of class Module.
     */
    @Test
    public void testGetModuleID() {
        System.out.println("getModuleID");
        Module instance = new Module();
        String expResult = "";
        String result = instance.getModuleID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModuleID method, of class Module.
     */
    @Test
    public void testSetModuleID() {
        System.out.println("setModuleID");
        String moduleID = "";
        Module instance = new Module();
        instance.setModuleID(moduleID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModuleName method, of class Module.
     */
    @Test
    public void testGetModuleName() {
        System.out.println("getModuleName");
        Module instance = new Module();
        String expResult = "";
        String result = instance.getModuleName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModuleName method, of class Module.
     */
    @Test
    public void testSetModuleName() {
        System.out.println("setModuleName");
        String moduleName = "";
        Module instance = new Module();
        instance.setModuleName(moduleName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCoursework method, of class Module.
     */
    @Test
    public void testAddCoursework() {
        System.out.println("addCoursework");
        Coursework coursework = null;
        Module instance = new Module();
        instance.addCoursework(coursework);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addExam method, of class Module.
     */
    @Test
    public void testAddExam() {
        System.out.println("addExam");
        ExamInfo exam = null;
        Module instance = new Module();
        instance.addExam(exam);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectModuleTable method, of class Module.
     */
    @Test
    public void testSelectModuleTable() throws Exception {
        System.out.println("selectModuleTable");
        JList list = null;
        Module instance = new Module();
        DefaultListModel expResult = null;
        DefaultListModel result = instance.selectModuleTable(list);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectUpcoming method, of class Module.
     */
    @Test
    public void testSelectUpcoming() throws Exception {
        System.out.println("selectUpcoming");
        Module instance = new Module();
        DefaultListModel expResult = null;
        DefaultListModel result = instance.selectUpcoming();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectPassed method, of class Module.
     */
    @Test
    public void testSelectPassed() throws Exception {
        System.out.println("selectPassed");
        Module instance = new Module();
        DefaultListModel expResult = null;
        DefaultListModel result = instance.selectPassed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
