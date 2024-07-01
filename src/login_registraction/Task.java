/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login_registraction;


    public class Task {

//This is for the unit tests 
    static short calculateTotalHours(int[] durations) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    static short calculateTotalHoursAdditionalData(int[] durations) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
//This are the different types of tasks that the user will be able to add
        private String taskName;
        private int taskNumber;
        private String taskDescription;
        private String developerDetails;
        private int taskDuration;
        private String taskID;
        private String taskStatus;
    Object getTaskID;

    public Task(String taskName, String taskDescription, int taskNumber, String developerDetails) {
        this.taskName = taskName;
        this.taskNumber = taskNumber;
        this.taskDescription = taskDescription;
        this.developerDetails = developerDetails;
        this.taskDuration = taskDuration;
        this.taskStatus = taskStatus;
        this.taskID = createTaskID();
    }

    Task(String login_Feature, String should_create_a_login_to_authenticate_the, String robyn_Harrison, int i, String to_Do) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

//The limit of chararcters that they can add
    public boolean checkTaskDescription() {
        return this.taskDescription.length() <= 50;
    }

//This creates the id of the tasks
    public String createTaskID() {
        String taskInitials = taskName.substring(0, 2).toUpperCase();
        String developerInitials = developerDetails.substring(developerDetails.length() - 3).toUpperCase();
        return taskInitials + ":" + taskNumber + ":" + developerInitials;
    }

//It prints all of the tasks and the information that the added
    public String printTaskDetails() {
        return "Task Status: " + taskStatus + "\n"
             + "Developer Details: " + developerDetails + "\n"
             + "Task Number: " + taskNumber + "\n"
             + "Task Name: " + taskName + "\n"
             + "Task Description: " + taskDescription + "\n"
             + "Task ID: " + taskID + "\n"
             + "Task Duration: " + taskDuration + " hours";
    }
     

    public int getTaskDuration() {
        return taskDuration;
    }

    Object captureTask() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getTaskID() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}

    

