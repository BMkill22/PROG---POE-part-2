/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login_registraction;
    import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author kefil
 */
public class MainClass {


    private static List<Task> tasks = new ArrayList<>();
    private static int totalHours = 0;
    private static Login_Registraction loginSystem = new Login_Registraction();

    public static void main(String[] args) {
        while (true) {
            String[] options = {"Register", "Login", "Quit"};
            int choice = JOptionPane.showOptionDialog(null, "Welcome to EasyKanban", "Main Menu", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0:
                    register();
                    break;
                case 1:
                    if (login()) {
                        runApp();
                    }
                    break;
                case 2:
                    System.exit(0);
            }
        }
    }

    private static void register() {
        String username = JOptionPane.showInputDialog("Enter a username:");
        if (username == null || username.isEmpty() || loginSystem.register(username, "dummy")) {
            JOptionPane.showMessageDialog(null, "Invalid username or username already exists. Please try again.");
            return;
        }
        String password = JOptionPane.showInputDialog("Enter a new password:");
        if (password == null || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Invalid password. Please try again.");
            return;
        }
        loginSystem.register(username, password);
        JOptionPane.showMessageDialog(null, "Registration successful. You can now log in.");
    }

    private static boolean login() {
            String username = JOptionPane.showInputDialog("Enter username:");
            String password = JOptionPane.showInputDialog("Enter password:");
            if (loginSystem.login(username, password)) {
                JOptionPane.showMessageDialog(null, "Login successful.");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid login. Please try again.");
            }
        return false;
    }

    private static void runApp() {
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");

        boolean running = true;
        while (running) {
            String menu = "Please choose an option:\n"
                        + "1) Add tasks\n"
                        + "2) Show report\n"
                        + "3) Quit";
            String choice = JOptionPane.showInputDialog(menu);
            if (choice == null) {
                continue;  // Handle cancel button and empty input
            }
            switch (choice) {
                case "1":
                    addTasks();
                    break;
                case "2":
                    showReport();
                    break;
                case "3":
                    running = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option. Please choose again.");
            }
        }
    }

    private static void addTasks() {
        String input = JOptionPane.showInputDialog("How many tasks would you like to add?");
        if (input == null || input.isEmpty()) {
            return;  // Handle cancel button and empty input
        }
        int numTasks;
        try {
            numTasks = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid number. Please try again.");
            return;
        }

        for (int i = 0; i < numTasks; i++) {
            String taskName = JOptionPane.showInputDialog("Enter task name:");
            if (taskName == null) {
                continue;
            }

            String taskDescription;
            while (true) {
                taskDescription = JOptionPane.showInputDialog("Enter task description (max 50 characters):");
                if (taskDescription == null) {
                    return;  // Handle cancel button
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
            int taskDuration;
            try {
                taskDuration = Integer.parseInt(durationInput);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid duration. Please try again.");
                continue;
            }

            String[] statuses = {"To Do", "Done", "Doing"};
            String taskStatus = (String) JOptionPane.showInputDialog(null, "Choose task status:", "Task Status", JOptionPane.QUESTION_MESSAGE, null, statuses, statuses[0]);
            if (taskStatus == null) {
                continue;
            }

            Task task = new Task(taskName, tasks.size(), taskDescription, developerDetails, taskDuration, taskStatus);
            tasks.add(task);
            totalHours += task.getTaskDuration();

            JOptionPane.showMessageDialog(null, "Task successfully captured\n" + task.printTaskDetails());
        }

        JOptionPane.showMessageDialog(null, "Total task duration across all tasks: " + totalHours + " hours");
    }

    private static void showReport() {
        JOptionPane.showMessageDialog(null, "Coming Soon");
    }
}

    

