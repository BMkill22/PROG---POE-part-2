/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login_registraction;

//This are the different types of tasks that the user will be able to add
    public class Task {
        private String taskName;
        private int taskNumber;
        private String taskDescription;
        private String developerDetails;
        private int taskDuration;
        private String taskID;
        private String taskStatus;

    public Task(String taskName, int taskNumber, String taskDescription, String developerDetails, int taskDuration, String taskStatus) {
        this.taskName = taskName;
        this.taskNumber = taskNumber;
        this.taskDescription = taskDescription;
        this.developerDetails = developerDetails;
        this.taskDuration = taskDuration;
        this.taskStatus = taskStatus;
        this.taskID = createTaskID();
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
}

    

