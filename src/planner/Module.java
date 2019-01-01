package planner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//hold
/**
 *
 * @author Baokang
 */
public class Module {

    private String moduleID;//CMP-1023
    private String moduleName; //E.G. Programming 2
//    private String semester; //A, B , Y
    private ArrayList<Coursework> coursework = new ArrayList<>();
    private ArrayList<ExamInfo> examInfo = new ArrayList<>();
//    private String courseworkName;
//    private Date courseworkDeadline;
//    private int courseworkMarkValue;
//    private Date examDate;
//    private int examMarkValue;

    Module() {

    }

    /**
     *
     * @param moduleID module ID
     * @param moduleName name of module
     * @param semesterID semester ID number
     * @throws SQLException throws exception if SQL is wrong
     * @throws ClassNotFoundException throws exception if class cannot be found
     */
    public void insertModuleData(String moduleID, String moduleName, int semesterID) throws SQLException, ClassNotFoundException {
        Connection c = null;
        Statement stmt = null;

        Class.forName("org.sqlite.JDBC");
        c = DriverManager.getConnection("jdbc:sqlite:planner.db");
        c.setAutoCommit(false);
        System.out.println("Opened database successfully");
        stmt = c.createStatement();
        String sql = "";
        sql = "INSERT INTO MODULE(MODULE_ID, MODULE_NAME, SEMESTER_ID)"
                + "VALUES('" + moduleID + "','" + moduleName + "'," + semesterID + ");";
        //testing
//        System.out.println(sql);
        stmt.executeUpdate(sql);
        stmt.close();
        c.commit();
        c.close();
    }

    /**
     *
     * @return gets module ID
     */
    public String getModuleID() {
        return moduleID;
    }

    /**
     *
     * @param moduleID sets module ID
     */
    public void setModuleID(String moduleID) {
        this.moduleID = moduleID;
    }

    /**
     *
     * @return gets module name
     */
    public String getModuleName() {
        return moduleName;
    }

    /**
     *
     * @param moduleName sets module name
     */
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    /**
     *
     * @param coursework add coursework to module
     */
    public void addCoursework(Coursework coursework) {
        this.coursework.add(coursework);
    }

    /**
     *
     * @param exam adds exam to module
     */
    public void addExam(ExamInfo exam) {
        this.examInfo.add(exam);
    }

    /**
     *
     * @param list Jlist for semester
     * @return return the DML containing module information
     * @throws SQLException throws exception if sql has error 
     * @throws ClassNotFoundException throws exception if class cannot be found
     */
    public DefaultListModel selectModuleTable(JList list) throws SQLException, ClassNotFoundException {
        String temp = (String)list.getSelectedValue();
        Connection c = null;
        Statement stmt = null;
        DefaultListModel DLM = new DefaultListModel();
        Class.forName("org.sqlite.JDBC");
        c = DriverManager.getConnection("jdbc:sqlite:planner.db");
        c.setAutoCommit(false);
        System.out.println("Opened database successfully");
        System.out.println("temp="+temp);
        stmt = c.createStatement();

        ResultSet rs = stmt.executeQuery("SELECT MODULE.MODULE_ID, MODULE.MODULE_NAME, SEMESTER.SEMESTER_NAME FROM MODULE, SEMESTER"
                + " WHERE SEMESTER_NAME = '"+temp+"'"
                + "AND MODULE.SEMESTER_ID = SEMESTER.SEMESTER_ID;");
        while (rs.next()) {
            String id= rs.getString("MODULE_ID");
            String name = rs.getString("MODULE_NAME");

            System.out.println("ID = " + id);
            System.out.println("NAME = " + name);
            System.out.println();

            DLM.addElement(name);
        }
        rs.close();
        stmt.close();
        c.commit();
        c.close();
        return DLM;
    }
    
    /**
     *
     * @return return DLM containing upcoming coursework deadline
     * @throws ClassNotFoundException throws exception if class cannot be found
     * @throws SQLException throws exception if SQL error
     */
    public DefaultListModel selectUpcoming() throws ClassNotFoundException, SQLException {
        //testing
//        String temp = (String) list.getSelectedValue();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.now();
        System.out.println(dtf.format(localDate));
        //testing
//        System.out.println(localDate);
        Connection c = null;
        Statement stmt = null;
        DefaultListModel DLM = new DefaultListModel();
        Class.forName("org.sqlite.JDBC");
        c = DriverManager.getConnection("jdbc:sqlite:planner.db");
        c.setAutoCommit(false);
        System.out.println("Opened database successfully");
        //testing
//        System.out.println("temp=" + temp);
        stmt = c.createStatement();
        //testing
//        stmt.executeUpdate("DELETE FROM COURSEWORK;");
        System.out.println("SELECT * FROM COURSEWORK WHERE COURSEWORK_DEADLINE BETWEEN '" + "2010-05-15" + "' AND '" + "2017-05-22" + "';");
        ResultSet rs = stmt.executeQuery("select * from COURSEWORK where COURSEWORK_DEADLINE between'" + dtf.format(localDate) + "'and '" + "2020-05-15" + "';");
        //testing
//        System.out.println("hello");
        while (rs.next()) {
            int coursework_ID = rs.getInt("COURSEWORK_ID");
            String coursework_Name = rs.getString("COURSEWORK_NAME");
            String coursework_Deadline = rs.getString("COURSEWORK_DEADLINE");

            DLM.addElement("Coursework: " + coursework_ID);
            DLM.addElement(" | Coursework: " + coursework_Name);
            DLM.addElement(" | Deadline: " + coursework_Deadline);
            DLM.addElement("-------------------------------------");
        }
        rs.close();
        stmt.close();
        c.commit();
        c.close();
        return DLM;
    }
        
    /**
     *
     * @return return DLM containing passed coursework deadlines
     * @throws ClassNotFoundException throws exception if class cannot be found
     * @throws SQLException throws exception if SQL error
     */
    public DefaultListModel selectPassed() throws ClassNotFoundException, SQLException {
//        String temp = (String) list.getSelectedValue();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.now();
        System.out.println(dtf.format(localDate));
//        System.out.println(localDate);
        Connection c = null;
        Statement stmt = null;
        DefaultListModel DLM = new DefaultListModel();
        Class.forName("org.sqlite.JDBC");
        c = DriverManager.getConnection("jdbc:sqlite:planner.db");
        c.setAutoCommit(false);
        System.out.println("Opened database successfully");
//        System.out.println("temp=" + temp);
        stmt = c.createStatement();
//        stmt.executeUpdate("DELETE FROM COURSEWORK;");
        System.out.println("SELECT * FROM COURSEWORK WHERE COURSEWORK_DEADLINE BETWEEN '" + "2010-05-15" + "' AND '" + "2017-05-22" + "';");
        ResultSet rs = stmt.executeQuery("select * from COURSEWORK where COURSEWORK_DEADLINE between'" + "2000-05-15" + "'and '" + dtf.format(localDate) + "';");
//        System.out.println("hello");
        while (rs.next()) {
            int coursework_ID = rs.getInt("COURSEWORK_ID");
            String coursework_Name = rs.getString("COURSEWORK_NAME");
            String coursework_Deadline = rs.getString("COURSEWORK_DEADLINE");

            DLM.addElement("Coursework ID: " + coursework_ID);
            DLM.addElement("Coursework Name: " + coursework_Name);
            DLM.addElement("Deadline: " + coursework_Deadline);
            DLM.addElement("-------------------------------------");
        }
        rs.close();
        stmt.close();
        c.commit();
        c.close();
        return DLM;
    }
}
