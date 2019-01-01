/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author Baokang
 */
public class ExamInfo {
//    private Module module;

    private String examDate; //date of the exam
    private int length;//exam time length(120min)
    private int markValue;//eg: 40%

    /**
     *
     */
    public ExamInfo() {
    }

    /**
     *
     * @param examID Exam ID number
     * @param examDate Date of exam
     * @param examWeight Weight of exam in the module
     * @param examLength length of the exam in minutes
     * @param moduleID module ID
     * @throws SQLException throws exception if SQL wrong
     * @throws ClassNotFoundException throws exception if class can't be found
     */
    public void insertExamData(int examID, String examDate, int examWeight, int examLength, String moduleID) throws SQLException, ClassNotFoundException {
        Connection c = null;
        Statement stmt = null;

        Class.forName("org.sqlite.JDBC");
        c = DriverManager.getConnection("jdbc:sqlite:planner.db");
        c.setAutoCommit(false);
        System.out.println("Opened database successfully");
        stmt = c.createStatement();
        String sql = "";
        sql = "INSERT INTO EXAM(EXAM_ID, EXAM_DATE, EXAM_WEIGHT, EXAM_LENGTH, MODULE_ID)"
                + "VALUES(" + examID + ",'" + examDate + "'," + examWeight + "," + examLength + ",'" + moduleID + "');";
        //testing
//        System.out.println(sql);
        stmt.executeUpdate(sql);
        stmt.close();
        c.commit();
        c.close();
    }

    /**
     *
     * @return return list contains details of the exam
     * @throws SQLException throws exception if SQL is wrong 
     * @throws ClassNotFoundException throws exception if class can't be found
     */
    public DefaultListModel selectExamTable() throws SQLException, ClassNotFoundException {
        Connection c = null;
        Statement stmt = null;
        DefaultListModel DLM = new DefaultListModel();
        //testing
//        JTextArea tArea = new JTextArea();
        Class.forName("org.sqlite.JDBC");
        c = DriverManager.getConnection("jdbc:sqlite:planner.db");
        c.setAutoCommit(false);
        System.out.println("Opened database successfully");

        stmt = c.createStatement();

        ResultSet rs = stmt.executeQuery("SELECT * FROM EXAM");

        while (rs.next()) {
            String ID = rs.getString("EXAM_ID");
            String examDate1 = rs.getString("EXAM_DATE");
            int examWeight = rs.getInt("EXAM_WEIGHT");
            String examLength = rs.getString("EXAM_LENGTH");
            String modID = rs.getString("Module_ID");

            //testing
//            System.out.println("ID = " + id);
            System.out.println("NAME = " + examDate1);
            System.out.println("Weight = " + examWeight);
            System.out.println("Deadline = " + examLength);
            System.out.println("Module ID = " + modID);
            System.out.println();

            DLM.addElement(ID);
        }
        rs.close();
        stmt.close();
        c.commit();
        c.close();
        return DLM;
    }
    
    /**
     *
     * @param list JList to store the module 
     * @param list2 Jlist to store the semester
     * @return returns the DLM for exam information
     * @throws SQLException throws exception if the SQL is wrong
     * @throws ClassNotFoundException throws exception if class cannot be found
     */
    public DefaultListModel selectExamData(JList list, JList list2) throws SQLException, ClassNotFoundException {
        String temp = (String) list.getSelectedValue();//module
        String temp2 = (String) list2.getSelectedValue();//semester
        Connection c = null;
        Statement stmt = null;
        DefaultListModel DLM = new DefaultListModel();
        //testing
//        JTextArea tArea = new JTextArea();
        Class.forName("org.sqlite.JDBC");
        c = DriverManager.getConnection("jdbc:sqlite:planner.db");
        c.setAutoCommit(false);
        System.out.println("Opened database successfully");
        System.out.println("temp=" + temp);
        stmt = c.createStatement();

        ResultSet rs = stmt.executeQuery("SELECT MODULE.MODULE_NAME, MODULE.MODULE_ID, EXAM.EXAM_DATE, EXAM.EXAM_WEIGHT, EXAM.EXAM_LENGTH "
                + "FROM EXAM, MODULE, SEMESTER"
                + " WHERE MODULE.MODULE_NAME ='" + temp + "'"
                + "AND SEMESTER.SEMESTER_NAME = '" + temp2 + "'"
                + " AND SEMESTER.SEMESTER_ID = MODULE.SEMESTER_ID"
                + " AND MODULE.MODULE_ID = EXAM.MODULE_ID;");

        while (rs.next()) {
            //testing
//            String id = rs.getString("Module_ID");
            String modName = rs.getString("MODULE_NAME");
            String examDate1 = rs.getString("EXAM_DATE");
            int examWeight = rs.getInt("EXAM_WEIGHT");
            String examLength = rs.getString("EXAM_LENGTH");

            //testing
//            System.out.println("ID = " + id);
            System.out.println("NAME = " + examDate1);
            System.out.println("Weight = " + examWeight);
            System.out.println("Deadline = " + examLength);
            System.out.println();

            DLM.addElement("Module Name: " + modName );
            DLM.addElement("| Date:" + examDate1);
            DLM.addElement("| Weight: " + examWeight);
            DLM.addElement("| Exam Length: " + examLength);
            DLM.addElement("------------------------------------------------");
        }
        rs.close();
        stmt.close();
        c.commit();
        c.close();
        return DLM;
    }

    /**
     *
     * @return returns date of exam
     */
    public String getExamDate() {
        return examDate;
    }

    /**
     *
     * @param examDate sets date of exam
     */
    public void setExamDate(String examDate) {
        this.examDate = examDate;
    }

    /**
     *
     * @return returns length of exam in minutes
     */
    public int getLength() {
        return length;
    }

    /**
     *
     * @param length sets length of exam in minutes
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     *
     * @return returns weighting of exam
     */
    public int getMarkValue() {
        return markValue;
    }

    /**
     *
     * @param markValue sets weighting of exam
     */
    public void setMarkValue(int markValue) {
        this.markValue = markValue;
    }

}
