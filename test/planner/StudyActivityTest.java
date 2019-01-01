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
public class StudyActivityTest {
    
    public StudyActivityTest() {
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
     * Test of selectCwkStudyActivityData method, of class StudyActivity.
     */
    @Test
    public void testSelectCwkStudyActivityData() throws Exception {
        System.out.println("selectCwkStudyActivityData");
        JList list = null;
        StudyActivity instance = new StudyActivity();
        DefaultListModel expResult = null;
        DefaultListModel result = instance.selectCwkStudyActivityData(list);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectExamStudyActivityData method, of class StudyActivity.
     */
    @Test
    public void testSelectExamStudyActivityData() throws Exception {
        System.out.println("selectExamStudyActivityData");
        JList list = null;
        StudyActivity instance = new StudyActivity();
        DefaultListModel expResult = null;
        DefaultListModel result = instance.selectExamStudyActivityData(list);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectCourseworkStudyActivityData2 method, of class StudyActivity.
     */
    @Test
    public void testSelectCourseworkStudyActivityData2() throws Exception {
        System.out.println("selectCourseworkStudyActivityData2");
        StudyActivity instance = new StudyActivity();
        DefaultListModel expResult = null;
        DefaultListModel result = instance.selectCourseworkStudyActivityData2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectExamStudyActivityData2 method, of class StudyActivity.
     */
    @Test
    public void testSelectExamStudyActivityData2() throws Exception {
        System.out.println("selectExamStudyActivityData2");
        StudyActivity instance = new StudyActivity();
        DefaultListModel expResult = null;
        DefaultListModel result = instance.selectExamStudyActivityData2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertCwStudyActivityData method, of class StudyActivity.
     */
    @Test
    public void testInsertCwStudyActivityData() throws Exception {
        System.out.println("insertCwStudyActivityData");
        int activityID = 0;
        String activityName = "";
        int cwStudyID = 0;
        int progress = 0;
        String note = "";
        int timeSpent = 0;
        StudyActivity instance = new StudyActivity();
        instance.insertCwStudyActivityData(activityID, activityName, cwStudyID, progress, note, timeSpent);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertExamStudyActivityData method, of class StudyActivity.
     */
    @Test
    public void testInsertExamStudyActivityData() throws Exception {
        System.out.println("insertExamStudyActivityData");
        int activityID = 0;
        String activityName = "";
        int examStudyID = 0;
        int progress = 0;
        String note = "";
        int timeSpent = 0;
        StudyActivity instance = new StudyActivity();
        instance.insertExamStudyActivityData(activityID, activityName, examStudyID, progress, note, timeSpent);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCourseworkActivityData method, of class StudyActivity.
     */
    @Test
    public void testUpdateCourseworkActivityData() throws Exception {
        System.out.println("updateCourseworkActivityData");
        int cw_study_act_ID = 0;
        int cw_study_act_timeSpent = 0;
        String cw_study_act_progress = "";
        StudyActivity instance = new StudyActivity();
        instance.updateCourseworkActivityData(cw_study_act_ID, cw_study_act_timeSpent, cw_study_act_progress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateExamActivityData method, of class StudyActivity.
     */
    @Test
    public void testUpdateExamActivityData() throws Exception {
        System.out.println("updateExamActivityData");
        int exam_study_actID = 0;
        int exam_study_actTimeSpent = 0;
        String exam_study_act_progress = "";
        StudyActivity instance = new StudyActivity();
        instance.updateExamActivityData(exam_study_actID, exam_study_actTimeSpent, exam_study_act_progress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
