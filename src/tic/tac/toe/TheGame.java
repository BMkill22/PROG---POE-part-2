/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tic.tac.toe;
import java.util.Scanner;

/**
 *
 * @author kefil
 */
class TheGame {
    private BoardGame board;
    private ThePlayer player1, player2;
    
    //Constructor initializes the game
    public TheGame(ThePlayer player1, ThePlayer player2){
        this.player1 = player1;
        this.player2 = player2;
        board = new BoardGame();
    }
    
    //The method to start the game
    public void startGame(){
        ThePlayer currentPlayer = player1;
        Scanner scanner = new Scanner(System.in);
        while (true){
            board.printBoard();
            System.out.println(currentPlayer.getName() + " it's your turn. Enter row and colum (0-2): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            
            if (board.makeMove(row, col, currentPlayer.getSymbol())){
                if (board.checkWinner(currentPlayer.getSymbol())){
                    board.printBoard();
                    System.out.println(currentPlayer.getName() + " Wins!");
                    break;
                }
                if (board.isFull()){
                    board.printBoard();
                    System.out.println(currentPlayer.getName() + " Its a draw!");
                    break;
                }
                else{
                    System.out.println("Invalid move. Try againg");
                }
            }
            scanner.close();
        }
    }
    
}
