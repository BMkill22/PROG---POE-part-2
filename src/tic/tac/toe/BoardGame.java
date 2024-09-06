/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tic.tac.toe;

/**
 *
 * @author kefil
 */
public class BoardGame {
    private char[][] board;
    private final int SIZE = 3; // 3x3 board
    
    //Constructor initializes the board
    public BoardGame(){
        board = new char[SIZE][SIZE];
        for (int i = 0; i <SIZE; i++){
            for (int x = 0; x <SIZE; x++){
                board[i][x]= '-';
            }
        }
    }
    
    //The method is to print the current state of the board
    public void printBoard(){
        for (int i = 0; i < SIZE; i++){
            for (int x = 0; x <SIZE; x++){
                System.out.println(board[i][x] + " ");
            }
            System.out.println();
        }
    }
            
    //The method is to make a move on the board game
    public boolean makeMove(int row, int col, char symbol){
        if (row >= 0 && row < SIZE && col >= 0 && col<SIZE && board[row][col] == '-'){
            board[row][col] = symbol;
            return true;
    }
    return false;
    }
    
    //The method id to chech for a winner
    public boolean checkWinner(char symbol){
        //To check rows and colums
        for (int i = 0; i < SIZE; i++){
            if ((board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol)||
                (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol))
                return true;
        
    }
    //Check diagonals
    if((board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol)||
       (board[0][2] == symbol && board[1][1] == symbol && board[2][1] == symbol)){
        return true;
    }
       return false;
    }
    
    public boolean isFull(){
        for (int i = 0; i <SIZE; i++){
            for(int x = 0; x<SIZE; x++){
                if (board[i][x] == '-'){
                    return false;
                }
            }
        }
        return true;
    }
}
            
    

