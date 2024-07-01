/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package login_registraction;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kefil
 */
public class Login_RegistractionTest {
    
    public Login_RegistractionTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class Login_Registraction.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Login_Registraction.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of register method, of class Login_Registration.
     */
    @Test
    public void testRegister() {
        System.out.println("register");
        String username = "";
        String password = "";
        Login_Registraction instance = new Login_Registraction();
        boolean expResult = false;
        boolean result = instance.register(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class Login_Registration.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String username = "";
        String password = "";
        Login_Registraction instance = new Login_Registraction();
        boolean expResult = false;
        boolean result = instance.login(username, password);
        assertEquals(expResult, result);
     
    }
    
    @Test
    public void testTaskDescriptionLengthSuccess(){
        Task task = new Task ("Login Feature", "should create a login to authenticate the users","Edward Harrison", 8,"doing");
        assertEquals("Task is successfully captured", task.checkTaskDescription());
    }
    
    @Test
    public void testTaskDescriptionLengthFailure(){
        Task task = new Task ("Add the Task Feature", "create the Add Task to feature add task users with a long description that will be above 50 characters","Mike Smith", 5,"to do");
        assertEquals(" Enter the Task description that has less than 50 characters", task.captureTask());
    }
    
    @Test
    public void testTaskID(){
        Task task1 = new Task ("Login Feature", "should create a login to authenticate the users","Robyn Harrison", 8,"To Do");
         assertEquals(" AD:1:BYN", task1.getTaskID());
         
          Task task2 = new Task ("Add the Task Feature", "create the Add Task users","Mike Smith", 10,"doing"); 
          assertEquals("CR:0:IKE", task2.getTaskID());
           assertEquals("CR:1:ARD", task2.getTaskID());
            assertEquals("CR:2:THA", task2.getTaskID());
             assertEquals("CR:3:ND", task2.getTaskID());
    }
    
    @Test
    public void testTotalHoursAccumulated(){
        int[] durations = {10, 12, 55, 11, 1};
         assertEquals(18, Task.calculateTotalHours(durations));
    }
    
       @Test
    public void testTotalHoursAccumulatedAdditionalData(){
        int[] durations = {10, 12, 55, 11, 1};
         assertEquals(89, Task.calculateTotalHoursAdditionalData(durations));
    }

    /**
     * Test of showReport method, of class Login_Registraction.
     */
    @Test
    public void testShowReport() {
        System.out.println("showReport");
        Login_Registraction.showReport();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTask method, of class Login_Registraction.
     */
    @Test
    public void testAddTask() {
        System.out.println("addTask");
        Task task = null;
        Login_Registraction instance = new Login_Registraction();
        instance.addTask(task);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

