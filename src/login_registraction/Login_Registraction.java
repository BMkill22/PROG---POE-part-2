/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package login_registraction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import java.util.Arrays;
/**
 *
 * @author kefil
 */
public class Login_Registraction {
 
    private static List<String> passwords = new ArrayList<>();
    private static List<String> usernames = new ArrayList<>();
    private static List<Task> tasks = new ArrayList<>();
    private static List<String> developer = new ArrayList<>();
    private static List<String> taskID =new ArrayList<>();
    private static List<Integer> taskDuration = new ArrayList<>();
    private static List<String> taskName = new ArrayList<>();
    private static List<String> taskStatuses = new ArrayList<>();
    private static List<Login_Registraction> logins = new ArrayList<>();
    private static int totalHours = 0;
    private static Login_Registraction loginSystem = new Login_Registraction();
   

    public static void main(String[] args) {
         boolean run = true;
         
        while (true) {
// This displays the options the user should choose
        String choose = JOptionPane.showInputDialog(null, "Option 1) Register " + "\nOption 2) Login " + "\nOption 3) Quit","Login information", JOptionPane.QUESTION_MESSAGE);
    
//This will re-display the menu if the user cancels
        if (choose == null){
            continue;
        }
        if (choose.equals("1")){
           register();
        }
        else if (choose.equals("2")){
            login();
        }
        else if (choose.equalsIgnoreCase("3")){
            run = false;
        }    
            else{    
            JOptionPane.showMessageDialog(null, "option is invalid. choose between 1,2 and 3");
        }}
    }

// User has to register first before they can login
    private static void register(){
        String name = JOptionPane.showInputDialog("Enter your name:");
        if (name == null || name.isEmpty() || loginSystem.register(name, "dummy")) {    
        }
        String surname = JOptionPane.showInputDialog("Enter your surname:");
        if (surname == null || surname.isEmpty() || loginSystem.register(surname, "dummy")) {
        }
        String username;
        while (true) {
//This haas conditions that the user will have to have in the username
            username = JOptionPane.showInputDialog("Enter a username (5 characters with underscore):");
            if (username != null && username.length() == 5 && username.contains("_")) {
                if (usernames.contains(username)) {
                    JOptionPane.showMessageDialog(null, "Username already taken. Please choose another one.");
                } else {
                    break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username. It must be exactly 5 characters long and include an underscore.");
            }
        }
        String password = JOptionPane.showInputDialog("Enter your password(7 Characters, a captial letter and a special character):");
        
        if (password == null || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Incorrect password. Please try again.");
            return;
        }
        loginSystem.register(username, password);
        JOptionPane.showMessageDialog(null, "Registration was successful.");
    }

//This is the code of the login 
    private static boolean login() {
            String username = JOptionPane.showInputDialog("Enter username:");
            String password = JOptionPane.showInputDialog("Enter password:");
            if (loginSystem.login(username, password)) {
                JOptionPane.showMessageDialog(null, "Login successful.");
                JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");

    boolean run = true;
    while (run) {
// This displays the options the user should choose from
        String choose = JOptionPane.showInputDialog(null, "Option 1) Add task " + "\nOption 2) Show report " + "\nOption 3) View all tasks done" + "\nOption 4) Longest task " 
                                                        + "\nOption 5) Search for task by name" + "\nOption 6) Search for task by developer name " + "\nOption 7) Delete a task " + "\nOption 8) Quit","Login information", JOptionPane.QUESTION_MESSAGE);
    
//This will re-display the menu if the user cancels
        if (choose == null){
            continue;
        }
        if (choose.equals("1")){
           addTasks();
        }
        else if (choose.equals("2")){
            showReport();
        }
           else if (choose.equals("3")){
            ViewAllTasksDone();
        }
              else if (choose.equals("4")){
            ShowLongestTask();
        }
                 else if (choose.equals("5")){
            SearchTaskName();
        }
                    else if (choose.equals("6")){
            SearchDeveloperName();
        }
                       else if (choose.equals("7")){
            DeleteTask();
        }
                    
        else if (choose.equalsIgnoreCase("8")){
            run = false;
        }    
            else{    
            JOptionPane.showMessageDialog(null, "option is incorrect. choose between 1,2,3,4,5,6,7,8");
        }}
                
            } else {
                JOptionPane.showMessageDialog(null, "Invalid login. Please try again.");
            }
        return false;
        
        }    

// Handle will cancel button and an empty input
//All of this are the codes of what the user should enter for different types of tasks    
    private static void addTasks() {
        String input = JOptionPane.showInputDialog("How many tasks would you like to add?");
        if (input == null || input.isEmpty()) {
            return;  
        }
        int numTasks;
        try {
            numTasks = Integer.parseInt(input);
        } catch (NumberFormatException e) 
        {
            JOptionPane.showMessageDialog(null, "Invalid number. Please try again.");
            return;
        }

        for (int i = 0; i < numTasks; i++) {
            String taskNames = JOptionPane.showInputDialog("Enter task name:");
            if (taskNames == null) {
            continue;   
            }  

            String taskDescription;
            while (true) {
                taskDescription = JOptionPane.showInputDialog("Enter task description (max 50 characters):");
                if (taskDescription == null) {
                    return;  
                }
                if (taskDescription.length() > 50) {
                    JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters");
                } else {
                    break;
                }
            }

            String developerDetails = JOptionPane.showInputDialog("Enter developer details (First and Last name):");
            if (developerDetails == null) {
            continue;   
            }

            String durationInput = JOptionPane.showInputDialog("Enter task duration in hours:");
            if (durationInput == null) {
            continue;    
            }
            int taskDurations = 0;
            try {
                taskDurations = Integer.parseInt(durationInput);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid duration. Please try again.");
              
            }

//The options is what is he going to do 
            String[] statuses = {"To Do", "Done", "Doing"};
            String taskStatus = (String) JOptionPane.showInputDialog(null, "Choose task status:", "Task Status", JOptionPane.QUESTION_MESSAGE, null, statuses, statuses[0]);
            if (taskStatus == null) {
            continue;  
            }
        
        developer.add(developerDetails);
        taskName.add(taskNames);
        taskDuration.add(taskDurations);
        taskID.add(durationInput);
        taskStatuses.add(durationInput);
        
//This is the import of the Task class
            Task task = new Task(taskNames, tasks.size(), taskDescription, developerDetails, taskDurations, taskStatus);
            tasks.add(task);
            totalHours += task.getTaskDuration();

            JOptionPane.showMessageDialog(null, "Task successfully captured\n" + task.printTaskDetails());
    
            JOptionPane.showMessageDialog(null, "Total task duration across all tasks: " + totalHours + " hours");      
    }
    }

//This lone of code shows all of the task that have be done    
      private static void ViewAllTasksDone() {
          StringBuilder result = new StringBuilder("Tasks with status that are done:\n ");
          for (int x = 0; x <taskStatuses.size();x++){
              if (taskStatuses.get(x).equalsIgnoreCase("Done")){
                  result.append("Developer: ").append(developer.get(x)).append("Task names: ").append(taskName.get(x)).append("Task Durations: ")
                          .append(taskDuration.get(x)).append("hours:\n");
              }
          }
          JOptionPane.showMessageDialog(null, result.toString());
      }

//This code will show only the longest task in terms of the hours taken
    private static void ShowLongestTask(){
        if (taskDuration.isEmpty()){
            JOptionPane.showMessageDialog(null, " No tasks were found! ");
            return;
        }
        
        int maxIndex = 0;
        for (int x = 1;x < taskDuration.size();x++){
            if (taskDuration.get(x) > taskDuration.get(maxIndex)){
             maxIndex = x;   
            }
        }
        String result = "Developer: " + developer.get(maxIndex) + ",Task Duration: " + taskDuration.get(maxIndex) + "hours";
        JOptionPane.showMessageDialog(null, result);

    }

//This will let you search for the task by its name only
    private static void SearchTaskName(){
        String taskNames = JOptionPane.showInputDialog("Enter task name to search it: ");
        int index = taskName.indexOf(taskNames);
        if (index !=1){
            String result = "The task name: " + taskName.get(index) + "Developers: " + developer.get(index) + "The task status: " + taskStatuses.get(index);
            JOptionPane.showMessageDialog(null, result);
        }
        else {
            JOptionPane.showMessageDialog(null, "Task was not found");
        }
    }
 
//This this will search for the developer task name only
    private static void SearchDeveloperName(){
        String developers = JOptionPane.showInputDialog("Enter developer name to search it: ");
        StringBuilder result = new StringBuilder("Tasks for developer " + developer + ":\n");
        for (int x = 0;x < developer.size(); x++){
            if (developer.get(x).equalsIgnoreCase(developers)){
                result.append("Task name: ").append(taskName.get(x)).append(", Task status: ").append(taskStatuses.get(x)).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, result.toString()); 
    }

//This will delete that task that you do not want 
//You will only delete by entering the name of the task    
    private static void   DeleteTask(){
        String taskNames = JOptionPane.showInputDialog("Enter task name to delete it: "); 
        for(int x = 0;x <taskName.size(); x++){
            if(taskName.get(x).equalsIgnoreCase(taskNames)){
            developer.remove(x);
            taskName.remove(x);
            taskID.remove(x);
            taskDuration.remove(x);
            taskStatuses.remove(x);
        JOptionPane.showMessageDialog(null, "Task was deleted successfully.");
        return;
            }
            JOptionPane.showMessageDialog(null, "Task was not found.");
        }
    }

//This line of code will show the whole report of the tasks
    private static void showReport() {
        StringBuilder result = new StringBuilder("Full report of the captured tasks:\n" );
        for (int x = 0; x< taskName.size(); x++){
            result.append("Developer: ").append(developer.get(x)).append(", Task Name: ").append(taskName.get(x)).append(", Task ID: ").append(taskID.get(x))
                  .append(", Task duration: ").append(taskDuration.get(x)).append("hours, Task Status: ").append(taskStatuses.get(x)).append("\n");
        }
        JOptionPane.showMessageDialog(null, result.toString());
    }

//This is the register and the logins 
    private Map<String, String> users = new HashMap<>();

    public boolean register(String username, String password) {
     
        if (username == null || username.isEmpty() || users.containsKey(username)) {
            return false;
        }
        if (password == null || password.isEmpty()) {
            return false;
        }
        users.put(username, password);
        return true;
    }

    public boolean login(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    
    
    }
}

    
    
    
   
    

