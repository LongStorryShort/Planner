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
public class StudyMilestoneTest {
    
    public StudyMilestoneTest() {
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
     * Test of selectMilestoneTable1 method, of class StudyMilestone.
     */
    @Test
    public void testSelectMilestoneTable1() throws Exception {
        System.out.println("selectMilestoneTable1");
        StudyMilestone instance = new StudyMilestone();
        DefaultListModel expResult = null;
        DefaultListModel result = instance.selectMilestoneTable1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectMilestoneTable method, of class StudyMilestone.
     */
    @Test
    public void testSelectMilestoneTable() throws Exception {
        System.out.println("selectMilestoneTable");
        StudyMilestone instance = new StudyMilestone();
        DefaultListModel expResult = null;
        DefaultListModel result = instance.selectMilestoneTable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectStudyMilestoneData method, of class StudyMilestone.
     */
    @Test
    public void testSelectStudyMilestoneData() throws Exception {
        System.out.println("selectStudyMilestoneData");
        JList list = null;
        StudyMilestone instance = new StudyMilestone();
        DefaultListModel expResult = null;
        DefaultListModel result = instance.selectStudyMilestoneData(list);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertMilestoneData method, of class StudyMilestone.
     */
    @Test
    public void testInsertMilestoneData() throws Exception {
        System.out.println("insertMilestoneData");
        int milestoneID = 0;
        String milestoneName = "";
        String target = "";
        int progress = 0;
        StudyMilestone instance = new StudyMilestone();
        instance.insertMilestoneData(milestoneID, milestoneName, target, progress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateMilestoneData method, of class StudyMilestone.
     */
    @Test
    public void testUpdateMilestoneData() throws Exception {
        System.out.println("updateMilestoneData");
        int milestoneID = 0;
        int progress = 0;
        StudyMilestone instance = new StudyMilestone();
        instance.updateMilestoneData(milestoneID, progress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
