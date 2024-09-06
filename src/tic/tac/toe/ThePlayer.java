/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tic.tac.toe;

/**
 *
 * @author kefil
 */
class ThePlayer {
    private String name;
    private char symbol;
    
//To make the initialisation for the player with the name and symbol
    public ThePlayer(String name,char symbol){
      this.name = name;
      this.symbol = symbol;
    }
    
    public String getName(){
        return name;
    }
    
    public char getSymbol(){
        return symbol;
    }        
}
