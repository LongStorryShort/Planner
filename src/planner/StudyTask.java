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
public class StudyTask {
//    private int studyTaskID;

    private String studyTaskName;
    private String note;
    private String timeSpent;
    private String studyType;

    /**
     *
     */
    public StudyTask() {

    }

    /**
     *
     * @return DLM containing coursework study task information
     * @throws SQLException throws exception if error in SQL 
     * @throws ClassNotFoundException throws exception if class not found
     */
    public DefaultListModel selectcwStudyTaskTable() throws SQLException, ClassNotFoundException {
        Connection c = null;
        Statement stmt = null;
        DefaultListModel DLM = new DefaultListModel();
        Class.forName("org.sqlite.JDBC");
        c = DriverManager.getConnection("jdbc:sqlite:planner.db");
        c.setAutoCommit(false);
        System.out.println("Opened database successfully");

        stmt = c.createStatement();

        ResultSet rs = stmt.executeQuery("SELECT * FROM COURSEWORK_STUDY_TASK;");
        while (rs.next()) {
            String cw_Study_Task_ID = rs.getString("COURSEWORK_STUDY_TASK_ID");
            String cw_Study_Task_Name = rs.getString("STUDY_TASK_NAME");
            String cw_study_cw_ID = rs.getString("COURSEWORK_ID");
            String cw_study_note = rs.getString("NOTE");
            int cw_study_Time_Spent = rs.getInt("TIME_SPENT");
            String cw_study_study_type = rs.getString("STUDY_TYPE");

            System.out.println("Study Task ID = " + cw_Study_Task_ID);
            System.out.println("Task Name = " + cw_Study_Task_Name);
            System.out.println("Coursework ID = " + cw_study_cw_ID);
            System.out.println("Note = " + cw_study_note);
            System.out.println("Time Spent = " + cw_study_Time_Spent);
            System.out.println("Study Type = " + cw_study_study_type);
            System.out.println();

            DLM.addElement("Study Task ID = " + cw_Study_Task_ID );
            DLM.addElement(" | Task Name =  " + cw_Study_Task_Name);
            DLM.addElement(" | Coursework ID:" + cw_study_cw_ID );
            DLM.addElement(" | Time Spent: " + cw_study_Time_Spent);
            DLM.addElement(" | Study Type: " + cw_study_study_type);
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
     * @param list JList containing Coursework task ID
     * @return DML containing information about that Coursework Task
     * @throws SQLException throws exception if error in SQL 
     * @throws ClassNotFoundException throws exception if class not found
     */
    public DefaultListModel selectCwStudyTaskData(JList list) throws SQLException, ClassNotFoundException {
        int temp = (int) list.getSelectedValue();
        Connection c = null;
        Statement stmt = null;
        DefaultListModel DLM = new DefaultListModel();
//        JTextArea tArea = new JTextArea();
        Class.forName("org.sqlite.JDBC");
        c = DriverManager.getConnection("jdbc:sqlite:planner.db");
        c.setAutoCommit(false);
        System.out.println("Opened database successfully");
        System.out.println("temp=" + temp);
        stmt = c.createStatement();

        ResultSet rs = stmt.executeQuery("SELECT COURSEWORK_STUDY_TASK.COURSEWORK_STUDY_TASK_ID , "
                + "COURSEWORK_STUDY_TASK.STUDY_TASK_NAME , "
                + "COURSEWORK.COURSEWORK_ID , "
                + "COURSEWORK_STUDY_TASK.NOTE , "
                + "COURSEWORK_STUDY_TASK.TIME_SPENT , "
                + "COURSEWORK_STUDY_TASK.STUDY_TYPE  "
                + "FROM COURSEWORK_STUDY_TASK, COURSEWORK"
                + " WHERE COURSEWORK_STUDY_TASK.COURSEWORK_ID ='" + temp + "'"
                + " AND COURSEWORK.COURSEWORK_ID  = COURSEWORK_STUDY_TASK.COURSEWORK_ID;");

        while (rs.next()) {
            String cw_Study_Task_ID = rs.getString("COURSEWORK_STUDY_TASK_ID");
            String cw_Study_Task_Name = rs.getString("STUDY_TASK_NAME");
            String cw_study_cw_ID = rs.getString("COURSEWORK_ID");
            String cw_study_note = rs.getString("NOTE");
            int cw_study_Time_Spent = rs.getInt("TIME_SPENT");
            String cw_study_study_type = rs.getString("STUDY_TYPE");

            System.out.println("Study Task ID = " + cw_Study_Task_ID);
            System.out.println("Task Name = " + cw_Study_Task_Name);
            System.out.println("Coursework ID = " + cw_study_cw_ID);
            System.out.println("Note = " + cw_study_note);
            System.out.println("Time Spent = " + cw_study_Time_Spent);
            System.out.println("Study Type = " + cw_study_study_type);
            System.out.println();

            DLM.addElement("Study Task ID = " + cw_Study_Task_ID);
            DLM.addElement("| Task Name =  " + cw_Study_Task_Name);
            DLM.addElement("| Coursework ID =  " + cw_study_cw_ID);
            DLM.addElement("| Time Spent =  " + cw_study_Time_Spent);
            DLM.addElement("| Study Type =  " + cw_study_study_type);
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
     * @return DLM containing information about Coursework Study Task
     * @throws SQLException throws exception if error in SQL 
     * @throws ClassNotFoundException throws exception if class not found
     */
    public DefaultListModel selectExamStudyTaskTable() throws SQLException, ClassNotFoundException {
        Connection c = null;
        Statement stmt = null;
        DefaultListModel DLM = new DefaultListModel();
        Class.forName("org.sqlite.JDBC");
        c = DriverManager.getConnection("jdbc:sqlite:planner.db");
        c.setAutoCommit(false);
        System.out.println("Opened database successfully");

        stmt = c.createStatement();

        ResultSet rs = stmt.executeQuery("SELECT * FROM COURSEWORK_STUDY_TASK;");
        while (rs.next()) {
            String cw_Study_Task_ID = rs.getString("COURSEWORK_STUDY_TASK_ID");
            String cw_Study_Task_Name = rs.getString("STUDY_TASK_NAME");
            String cw_study_cw_ID = rs.getString("COURSEWORK_ID");
            String cw_study_note = rs.getString("NOTE");
            int cw_study_Time_Spent = rs.getInt("TIME_SPENT");
            String cw_study_study_type = rs.getString("STUDY_TYPE");

            System.out.println("Study Task ID = " + cw_Study_Task_ID);
            System.out.println("Task Name = " + cw_Study_Task_Name);
            System.out.println("Coursework ID = " + cw_study_cw_ID);
            System.out.println("Note = " + cw_study_note);
            System.out.println("Time Spent = " + cw_study_Time_Spent);
            System.out.println("Study Type = " + cw_study_study_type);
            System.out.println();

            DLM.addElement("Study Task ID: " + cw_Study_Task_ID);
            DLM.addElement("Task Name: " + cw_Study_Task_Name);
            DLM.addElement("Coursework ID: " + cw_study_cw_ID);
            DLM.addElement("Time Spent: " + cw_study_Time_Spent);
            DLM.addElement("Study Type: " + cw_study_study_type);
        }
        rs.close();
        stmt.close();
        c.commit();
        c.close();
        return DLM;
    }

    /**
     *
     * @param list JList containing exam study task ID
     * @return DLM containing information about that exam study task
     * @throws SQLException throws exception if error in SQL 
     * @throws ClassNotFoundException throws exception if class not found
     */
    public DefaultListModel selectExamStudyTaskData(JList list) throws SQLException, ClassNotFoundException {
        int temp = (int) list.getSelectedValue();
        Connection c = null;
        Statement stmt = null;
        DefaultListModel DLM = new DefaultListModel();
//        JTextArea tArea = new JTextArea();
        Class.forName("org.sqlite.JDBC");
        c = DriverManager.getConnection("jdbc:sqlite:planner.db");
        c.setAutoCommit(false);
        System.out.println("Opened database successfully");
        System.out.println("temp=" + temp);
        stmt = c.createStatement();

        ResultSet rs = stmt.executeQuery("SELECT EXAM_STUDY_TASK.EXAM_STUDY_TASK_ID , "
                + "EXAM_STUDY_TASK.STUDY_TASK_NAME , "
                + "EXAM.EXAM_ID , "
                + "EXAM_STUDY_TASK.NOTE , "
                + "EXAM_STUDY_TASK.TIME_SPENT , "
                + "EXAM_STUDY_TASK.STUDY_TYPE  "
                + "FROM EXAM_STUDY_TASK, EXAM"
                + " WHERE EXAM_STUDY_TASK.EXAM_STUDY_TASK_ID =" + temp + ""
                + " AND EXAM.EXAM_ID = EXAM_STUDY_TASK.EXAM_ID;");

        while (rs.next()) {
            int exam_study_task_ID = rs.getInt("EXAM_STUDY_TASK_ID");
            String exam_study_act_name = rs.getString("STUDY_TASK_NAME");
            int exam_study_examID = rs.getInt("EXAM_ID");
            String exam_study_Note = rs.getString("NOTE");
            int exam_study_timeSpent = rs.getInt("TIME_SPENT");
            String exam_study_studyType = rs.getString("STUDY_TYPE");

            System.out.println("Study Task ID = " + exam_study_task_ID);
            System.out.println("Task Name = " + exam_study_act_name);
            System.out.println("Coursework ID = " + exam_study_examID);
            System.out.println("Note = " + exam_study_Note);
            System.out.println("Time Spent = " + exam_study_timeSpent);
            System.out.println("Study Type = " + exam_study_studyType);
            System.out.println();

            DLM.addElement("Study Task ID: " + exam_study_task_ID);
            DLM.addElement("Task Name: " + exam_study_act_name);
            DLM.addElement("Coursework Study Task ID: " + exam_study_examID);
            DLM.addElement("Note: " + exam_study_Note);
            DLM.addElement("Time Spent: " + exam_study_timeSpent);
            DLM.addElement("Study Type: " + exam_study_studyType);
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
     * @param cwst_StudyTaskID coursework study task ID number
     * @param cwst_StudyTaskName name of coursework study task
     * @param cwst_studycwID coursework it is linked to 
     * @param cwst_studyNote a note about what the task is 
     * @param cwst_studyTimeSpent time spent on task in minutes
     * @param cwst_StudyType what type of studying you are doing
     * @throws SQLException throws exception if error in SQL 
     * @throws ClassNotFoundException throws exception if class not found
     */
    public void insertCourseworkStudyTaskData(int cwst_StudyTaskID, String cwst_StudyTaskName,
            int cwst_studycwID, String cwst_studyNote, int cwst_studyTimeSpent, String cwst_StudyType) throws SQLException, ClassNotFoundException {

        Connection c = null;
        Statement stmt = null;

        Class.forName("org.sqlite.JDBC");
        c = DriverManager.getConnection("jdbc:sqlite:planner.db");
        c.setAutoCommit(false);
        System.out.println("Opened database successfully");
        stmt = c.createStatement();
        String sql = "";
        sql = "INSERT INTO COURSEWORK_STUDY_TASK(COURSEWORK_STUDY_TASK_ID , STUDY_TASK_NAME, COURSEWORK_ID, NOTE, TIME_SPENT, STUDY_TYPE)"
                + "VALUES(" + cwst_StudyTaskID + ",'" + cwst_StudyTaskName + "'," + cwst_studycwID + ",'" + cwst_studyNote + "'," + cwst_studyTimeSpent + ",'" + cwst_StudyType + "');";
//        System.out.println(sql);
        stmt.executeUpdate(sql);
        stmt.close();
        c.commit();
        c.close();
    }

    /**
     *
     * @param est_StudyTaskID exam study task ID number
     * @param est_ActivityName name of exam study task
     * @param est_examID exam it is linked to 
     * @param est_Note a note about what the task is 
     * @param est_timeSpent time spent on task in minutes
     * @param est_StudyType what type of studying you are doing
     * @throws SQLException throws exception if error in SQL 
     * @throws ClassNotFoundException throws exception if class not found
     */
    public void insertExamStudyTaskData(int est_StudyTaskID, String est_ActivityName,
            int est_examID, String est_Note, int est_timeSpent, String est_StudyType) throws SQLException, ClassNotFoundException {

        Connection c = null;
        Statement stmt = null;

        Class.forName("org.sqlite.JDBC");
        c = DriverManager.getConnection("jdbc:sqlite:planner.db");
        c.setAutoCommit(false);
        System.out.println("Opened database successfully");
        stmt = c.createStatement();
        String sql = "";
        sql = "INSERT INTO EXAM_STUDY_TASK(EXAM_STUDY_TASK_ID , STUDY_TASK_NAME, EXAM_ID, NOTE, TIME_SPENT, STUDY_TYPE)"
                + "VALUES(" + est_StudyTaskID + ",'" + est_ActivityName + "'," + est_examID + ",'" + est_Note + "'," + est_timeSpent + ",'" + est_StudyType + "');";
//        System.out.println(sql);
        stmt.executeUpdate(sql);
        stmt.close();
        c.commit();
        c.close();
    }

    /**
     *
     * @param cwst_StudyTaskID coursework study task ID number
     * @param cwst_studyTimeSpent time spent on task
     * @throws SQLException throws exception if error in SQL 
     * @throws ClassNotFoundException throws exception if class not found
     */
    public void updateCourseworkStudyTaskData(int cwst_StudyTaskID, int cwst_studyTimeSpent) throws ClassNotFoundException, SQLException {
        Connection c = null;
        Statement stmt = null;

        Class.forName("org.sqlite.JDBC");
        c = DriverManager.getConnection("jdbc:sqlite:planner.db");
        c.setAutoCommit(false);
        System.out.println("Opened database successfully");
        stmt = c.createStatement();
        String sql = "";
        sql = "UPDATE COURSEWORK_STUDY_TASK "
                + "SET TIME_SPENT = " + cwst_studyTimeSpent
                + " WHERE COURSEWORK_STUDY_TASK_ID = " + cwst_StudyTaskID + ";";
        stmt.executeUpdate(sql);
        stmt.close();
        c.commit();
        c.close();
    }
    
    /**
     *
     * @param exam_study_task_ID exam study task ID number
     * @param exam_study_timeSpent time spent on task
     * @throws SQLException throws exception if error in SQL 
     * @throws ClassNotFoundException throws exception if class not found
     */
    public void updateExamStudyTaskData(int exam_study_task_ID, int exam_study_timeSpent) throws ClassNotFoundException, SQLException {
        Connection c = null;
        Statement stmt = null;

        Class.forName("org.sqlite.JDBC");
        c = DriverManager.getConnection("jdbc:sqlite:planner.db");
        c.setAutoCommit(false);
        System.out.println("Opened database successfully");
        stmt = c.createStatement();
        String sql = "";
        sql = "UPDATE EXAM_STUDY_TASK "
                + "SET TIME_SPENT = " + exam_study_timeSpent
                + " WHERE EXAM_STUDY_TASK_ID = " + exam_study_task_ID + ";";
        stmt.executeUpdate(sql);
        stmt.close();
        c.commit();
        c.close();
    }
}
