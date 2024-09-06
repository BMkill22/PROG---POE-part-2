/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tic.tac.toe;

/**
 *
 * @author kefil
 */
public class TicTacToe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ThePlayer player1 = new ThePlayer("Player 1", 'x');
        ThePlayer player2 = new ThePlayer("Player 2", '0');
        
        TheGame game = new TheGame(player1, player2);
        game.startGame();
        
    }
    
}
