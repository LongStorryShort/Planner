/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planner;

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
public class CaptureStudyProgressTest {
    
    public CaptureStudyProgressTest() {
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
     * Test of setTimeContribution method, of class CaptureStudyProgress.
     */
    @Test
    public void testSetTimeContribution() {
        System.out.println("setTimeContribution");
        int TimeContribution = 0;
        CaptureStudyProgress instance = null;
        instance.setTimeContribution(TimeContribution);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaskName method, of class CaptureStudyProgress.
     */
    @Test
    public void testSetTaskName() {
        System.out.println("setTaskName");
        StudyTask TaskName = null;
        CaptureStudyProgress instance = null;
        instance.setTaskName(TaskName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeSpent method, of class CaptureStudyProgress.
     */
    @Test
    public void testSetTimeSpent() {
        System.out.println("setTimeSpent");
        int TimeSpent = 0;
        CaptureStudyProgress instance = null;
        instance.setTimeSpent(TimeSpent);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNotes method, of class CaptureStudyProgress.
     */
    @Test
    public void testSetNotes() {
        System.out.println("setNotes");
        String Notes = "";
        CaptureStudyProgress instance = null;
        instance.setNotes(Notes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeContribution method, of class CaptureStudyProgress.
     */
    @Test
    public void testGetTimeContribution() {
        System.out.println("getTimeContribution");
        CaptureStudyProgress instance = null;
        int expResult = 0;
        int result = instance.getTimeContribution();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskName method, of class CaptureStudyProgress.
     */
    @Test
    public void testGetTaskName() {
        System.out.println("getTaskName");
        CaptureStudyProgress instance = null;
        StudyTask expResult = null;
        StudyTask result = instance.getTaskName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeSpent method, of class CaptureStudyProgress.
     */
    @Test
    public void testGetTimeSpent() {
        System.out.println("getTimeSpent");
        CaptureStudyProgress instance = null;
        int expResult = 0;
        int result = instance.getTimeSpent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNotes method, of class CaptureStudyProgress.
     */
    @Test
    public void testGetNotes() {
        System.out.println("getNotes");
        CaptureStudyProgress instance = null;
        String expResult = "";
        String result = instance.getNotes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeLeft method, of class CaptureStudyProgress.
     */
    @Test
    public void testGetTimeLeft() {
        System.out.println("getTimeLeft");
        CaptureStudyProgress instance = null;
        int expResult = 0;
        int result = instance.getTimeLeft();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
