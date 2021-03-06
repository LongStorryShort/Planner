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
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTextArea;

/**
 *
 * @author Baokang
 */
public class Coursework {

    private String courseworkName; //name of coursework
    private String deadline; //deadline date 
    private int markValue; // mark value i.e. 40% of module

    /**
     *
     */
    public Coursework() {

    }

    /**
     *
     * @param cw_ID coursework ID Number
     * @param cw_Name name of the coursework
     * @param cw_Weight weight give to the coursework
     * @param cw_Deadline deadline of the coursework
     * @param moduleID module ID 
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public void insertCourseworkData(int cw_ID, String cw_Name,
            int cw_Weight, String cw_Deadline, String moduleID) throws SQLException, ClassNotFoundException {

        Connection c = null;
        Statement stmt = null;

        Class.forName("org.sqlite.JDBC");
        c = DriverManager.getConnection("jdbc:sqlite:planner.db");
        c.setAutoCommit(false);
        System.out.println("Opened database successfully");
        stmt = c.createStatement();
        String sql = "";
        sql = "INSERT INTO COURSEWORK(COURSEWORK_ID, COURSEWORK_NAME, COURSEWORK_WEIGHT, COURSEWORK_DEADLINE, MODULE_ID)"
                + "VALUES(" + cw_ID + ",'" + cw_Name + "'," + cw_Weight + ",'" + cw_Deadline + "','" + moduleID + "');";
        System.out.println(sql);
        stmt.executeUpdate(sql);
        stmt.close();
        c.commit();
        c.close();
    }

    /**
     *
     * @return returns our Default list model
     * @throws SQLException throws exception if SQL is wrong
     * @throws ClassNotFoundException throws exception if class is not found
     */
    public DefaultListModel selectCourseworkData1() throws SQLException, ClassNotFoundException {

        Connection c = null;
        Statement stmt = null;
        DefaultListModel DLM = new DefaultListModel();
        // testing 
//        JTextArea tArea = new JTextArea();
        Class.forName("org.sqlite.JDBC");
        c = DriverManager.getConnection("jdbc:sqlite:planner.db");
        c.setAutoCommit(false);
        System.out.println("Opened database successfully");

        stmt = c.createStatement();

        ResultSet rs = stmt.executeQuery("SELECT * FROM COURSEWORK");

        while (rs.next()) {
            int id = rs.getInt("COURSEWORK_ID");
            String cwname = rs.getString("COURSEWORK_NAME");
            int cwWeight = rs.getInt("COURSEWORK_WEIGHT");
            int cwDeadline = rs.getInt("COURSEWORK_DEADLINE");
            String Module_ID = rs.getString("Module_ID");

            System.out.println("ID = " + id);
            System.out.println("NAME = " + cwname);
            System.out.println("Weight = " + cwWeight);
            System.out.println("Deadline = " + cwDeadline);
            System.out.println("ModuleID = " + Module_ID);
            System.out.println();

            DLM.addElement(id);
        }
        rs.close();
        stmt.close();
        c.commit();
        c.close();
        return DLM;
    }

    /**
     *
     * @param list A JList used for module
     * @param list2 a JList used for semester
     * @return returns the DLM containing information relating to coursework
     * @throws SQLException throws exception if the SQL is wrong
     * @throws ClassNotFoundException throws exception if class can't be found
     */
    public DefaultListModel selectCourseworkData(JList list, JList list2) throws SQLException, ClassNotFoundException {
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

        ResultSet rs = stmt.executeQuery("SELECT SEMESTER.SEMESTER_NAME, MODULE.MODULE_NAME, MODULE.MODULE_ID, COURSEWORK.COURSEWORK_ID, COURSEWORK.COURSEWORK_NAME, COURSEWORK.COURSEWORK_WEIGHT, COURSEWORK.COURSEWORK_DEADLINE "
                + "FROM COURSEWORK, MODULE, SEMESTER"
                + " WHERE MODULE.MODULE_NAME ='" + temp + "' "
                + "AND SEMESTER.SEMESTER_NAME = '" + temp2 + "'"
                + " AND SEMESTER.SEMESTER_ID = MODULE.SEMESTER_ID"
                + " AND MODULE.MODULE_ID = COURSEWORK.MODULE_ID;");

        while (rs.next()) {
            String id = rs.getString("COURSEWORK_ID");
            String modName = rs.getString("MODULE_NAME");
            String cwName = rs.getString("COURSEWORK_NAME");
            int cwWeight = rs.getInt("COURSEWORK_WEIGHT");
            String cwDeadline = rs.getString("COURSEWORK_DEADLINE");

            // testing
//            System.out.println("ID = " + id);
            System.out.println("NAME = " + cwName);
            System.out.println("Weight = " + cwWeight);
            System.out.println("Deadline = " + cwDeadline);
            System.out.println();

            DLM.addElement("Module Name: " + modName);
            DLM.addElement(" | Coursework ID: " + id);
            DLM.addElement(" | NAME:" + cwName);
            DLM.addElement(" | Weight: " + cwWeight);
            DLM.addElement( " | Deadline: " + cwDeadline);
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
     * @return returns coursework name
     */
    public String getCourseworkName() {
        return courseworkName;
    }

    /**
     *
     * @param courseworkName sets the coursework name
     */
    public void setCourseworkName(String courseworkName) {
        this.courseworkName = courseworkName;
    }

    /**
     *
     * @return returns the coursework deadline 
     */
    public String getDeadline() {
        return deadline;
    }

    /**
     *
     * @param deadline sets the coursework deadline
     */
    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    /**
     *
     * @return returns weighting of coursework
     */
    public int getMarkValue() {
        return markValue;
    }

    /**
     *
     * @param markValue sets weighting of coursework
     */
    public void setMarkValue(int markValue) {
        this.markValue = markValue;
    }

}
