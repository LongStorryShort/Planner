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
public class ExamInfoTest {
    
    public ExamInfoTest() {
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
     * Test of insertExamData method, of class ExamInfo.
     */
    @Test
    public void testInsertExamData() throws Exception {
        System.out.println("insertExamData");
        int examID = 0;
        String examDate = "";
        int examWeight = 0;
        int examLength = 0;
        String moduleID = "";
        ExamInfo instance = new ExamInfo();
        instance.insertExamData(examID, examDate, examWeight, examLength, moduleID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectExamTable method, of class ExamInfo.
     */
    @Test
    public void testSelectExamTable() throws Exception {
        System.out.println("selectExamTable");
        ExamInfo instance = new ExamInfo();
        DefaultListModel expResult = null;
        DefaultListModel result = instance.selectExamTable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectExamData method, of class ExamInfo.
     */
    @Test
    public void testSelectExamData() throws Exception {
        System.out.println("selectExamData");
        JList list = null;
        JList list2 = null;
        ExamInfo instance = new ExamInfo();
        DefaultListModel expResult = null;
        DefaultListModel result = instance.selectExamData(list, list2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExamDate method, of class ExamInfo.
     */
    @Test
    public void testGetExamDate() {
        System.out.println("getExamDate");
        ExamInfo instance = new ExamInfo();
        String expResult = "";
        String result = instance.getExamDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setExamDate method, of class ExamInfo.
     */
    @Test
    public void testSetExamDate() {
        System.out.println("setExamDate");
        String examDate = "";
        ExamInfo instance = new ExamInfo();
        instance.setExamDate(examDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLength method, of class ExamInfo.
     */
    @Test
    public void testGetLength() {
        System.out.println("getLength");
        ExamInfo instance = new ExamInfo();
        int expResult = 0;
        int result = instance.getLength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLength method, of class ExamInfo.
     */
    @Test
    public void testSetLength() {
        System.out.println("setLength");
        int length = 0;
        ExamInfo instance = new ExamInfo();
        instance.setLength(length);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMarkValue method, of class ExamInfo.
     */
    @Test
    public void testGetMarkValue() {
        System.out.println("getMarkValue");
        ExamInfo instance = new ExamInfo();
        int expResult = 0;
        int result = instance.getMarkValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMarkValue method, of class ExamInfo.
     */
    @Test
    public void testSetMarkValue() {
        System.out.println("setMarkValue");
        int markValue = 0;
        ExamInfo instance = new ExamInfo();
        instance.setMarkValue(markValue);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
