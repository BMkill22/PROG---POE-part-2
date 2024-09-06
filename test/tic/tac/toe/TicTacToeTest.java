/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package tic.tac.toe;

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
public class TicTacToeTest {
    
    public TicTacToeTest() {
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
    
    @Test
    public void testMakeMove(){
        BoardGame board = new BoardGame();
        assertTrue(board.makeMove(0, 0, 'x'));
        assertFalse(board.makeMove(0, 0, '0'));   
    }
    
    @Test
     public void testCheckWinner(){
        BoardGame board = new BoardGame();
        board.makeMove(0, 1, 'x');
        board.makeMove(0, 1, 'x');
        board.makeMove(0, 2, 'x');
        assertTrue(board.makeMove(0, 0, 'x'));
        assertFalse(board.makeMove(0, 0, '0'));   
     }
     
     @Test
     public void testIsFull(){
         BoardGame board = new BoardGame();
         for (int i = 0; i < 3; i++){
             for (int x = 0; x < 3; x++){
                 board.makeMove(i, x, 'x');   
             }
         }
         assertTrue(board.isFull());
     }
     
    

    /**
     * Test of main method, of class TicTacToe.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TicTacToe.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
