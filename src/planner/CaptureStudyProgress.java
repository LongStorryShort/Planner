package planner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ronan
 */
public class CaptureStudyProgress {
    private enum Activity{programming , writing};
    private int TimeContribution;
    //needs to be able to be linked to a task not sure how to link it
    private StudyTask TaskName; // name of study task
    private int TimeSpent; // time spend on it (minutes)
    private String Notes; // note describing it 
 
    /**
     *
     * @param TimeContribution
     */
//    public void setTimeContribution(int TimeContribution) {
//        this.TimeContribution = TimeContribution;
//    }

    /**
     *
     * @param TaskName Name of the study Task
     */
    public void setTaskName(StudyTask TaskName) {
        this.TaskName = TaskName;
    }

    /**
     *
     * @param TimeSpent Time spent on task 
     */
    public void setTimeSpent(int TimeSpent) {
        this.TimeSpent = TimeSpent;
    }

    /**
     *
     * @param Notes Notes about the Study progress
     */
    public void setNotes(String Notes) {
        this.Notes = Notes;
    }

    /**
     *
     * @return
     */
//    public int getTimeContribution() {
//        return TimeContribution;
//    }

    /**
     *
     * @return returns the study task name
     */
    public StudyTask getTaskName() {
        return TaskName;
    }

    /**
     *
     * @return return the time spent on study
     */
    public int getTimeSpent() {
        return TimeSpent;
    }

    /**
     *
     * @return returns the notes about study progress
     */
    public String getNotes() {
        return Notes;
    }
    
    // needs to return the time left 

    /**
     *
     * @return
     */
//    public int getTimeLeft(){
//        return (this.TimeContribution - this.TimeSpent);
//    }

    /**
     *
     * @param TimeContribution
     * @param TaskName
     * @param TimeSpent
     * @param Notes
     */
    public CaptureStudyProgress(int TimeContribution, StudyTask TaskName, int TimeSpent, String Notes) {
        this.TimeContribution = TimeContribution;
        this.TaskName = TaskName;
        this.TimeSpent = TimeSpent;
        this.Notes = Notes;
    }

}