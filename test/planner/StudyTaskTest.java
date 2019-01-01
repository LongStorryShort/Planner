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
public class StudyTaskTest {
    
    public StudyTaskTest() {
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
     * Test of selectcwStudyTaskTable method, of class StudyTask.
     */
    @Test
    public void testSelectcwStudyTaskTable() throws Exception {
        System.out.println("selectcwStudyTaskTable");
        StudyTask instance = new StudyTask();
        DefaultListModel expResult = null;
        DefaultListModel result = instance.selectcwStudyTaskTable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectCwStudyTaskData method, of class StudyTask.
     */
    @Test
    public void testSelectCwStudyTaskData() throws Exception {
        System.out.println("selectCwStudyTaskData");
        JList list = null;
        StudyTask instance = new StudyTask();
        DefaultListModel expResult = null;
        DefaultListModel result = instance.selectCwStudyTaskData(list);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectExamStudyTaskTable method, of class StudyTask.
     */
    @Test
    public void testSelectExamStudyTaskTable() throws Exception {
        System.out.println("selectExamStudyTaskTable");
        StudyTask instance = new StudyTask();
        DefaultListModel expResult = null;
        DefaultListModel result = instance.selectExamStudyTaskTable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectExamStudyTaskData method, of class StudyTask.
     */
    @Test
    public void testSelectExamStudyTaskData() throws Exception {
        System.out.println("selectExamStudyTaskData");
        JList list = null;
        StudyTask instance = new StudyTask();
        DefaultListModel expResult = null;
        DefaultListModel result = instance.selectExamStudyTaskData(list);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertCourseworkStudyTaskData method, of class StudyTask.
     */
    @Test
    public void testInsertCourseworkStudyTaskData() throws Exception {
        System.out.println("insertCourseworkStudyTaskData");
        int cwst_StudyTaskID = 0;
        String cwst_StudyTaskName = "";
        int cwst_studycwID = 0;
        String cwst_studyNote = "";
        int cwst_studyTimeSpent = 0;
        String cwst_StudyType = "";
        StudyTask instance = new StudyTask();
        instance.insertCourseworkStudyTaskData(cwst_StudyTaskID, cwst_StudyTaskName, cwst_studycwID, cwst_studyNote, cwst_studyTimeSpent, cwst_StudyType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertExamStudyTaskData method, of class StudyTask.
     */
    @Test
    public void testInsertExamStudyTaskData() throws Exception {
        System.out.println("insertExamStudyTaskData");
        int est_StudyTaskID = 0;
        String est_ActivityName = "";
        int est_examID = 0;
        String est_Note = "";
        int est_timeSpent = 0;
        String est_StudyType = "";
        StudyTask instance = new StudyTask();
        instance.insertExamStudyTaskData(est_StudyTaskID, est_ActivityName, est_examID, est_Note, est_timeSpent, est_StudyType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCourseworkStudyTaskData method, of class StudyTask.
     */
    @Test
    public void testUpdateCourseworkStudyTaskData() throws Exception {
        System.out.println("updateCourseworkStudyTaskData");
        int cwst_StudyTaskID = 0;
        int cwst_studyTimeSpent = 0;
        StudyTask instance = new StudyTask();
        instance.updateCourseworkStudyTaskData(cwst_StudyTaskID, cwst_studyTimeSpent);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateExamStudyTaskData method, of class StudyTask.
     */
    @Test
    public void testUpdateExamStudyTaskData() throws Exception {
        System.out.println("updateExamStudyTaskData");
        int exam_study_task_ID = 0;
        int exam_study_timeSpent = 0;
        StudyTask instance = new StudyTask();
        instance.updateExamStudyTaskData(exam_study_task_ID, exam_study_timeSpent);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
