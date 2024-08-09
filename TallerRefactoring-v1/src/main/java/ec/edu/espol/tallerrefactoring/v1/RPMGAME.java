/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tallerrefactoring.v1;

/**
 *
 * @author angelozurita
 */
public class RPMGAME {
    
   
    private static void determineWinnerRound(Move p1Choice, Move p2Choice, Player p1, Player p2) {
        if (p1Choice.winTo(p2Choice)) {
            p1.incrementWins();
            System.out.println("Player 1 wins");
        } else if (p2Choice.winTo(p1Choice)) {
            p2.incrementWins();
            System.out.println("Player 2 wins");
        } else {
            System.out.println("It's a draw!");
        }
    }

    
    private static void determineWinnerGame(boolean gameWon, Player p1, Player p2) {
        boolean finishedGame  = p1.getWins() >= 3 || p2.getWins() >= 3 ; 
        if (finishedGame) {
            gameWon = true;
            System.out.println("GAME WON");
        }
    }
    
    private static void roundGame(Player p1, Player p2){
        Move p1Choice = p1.playerChoice();
        System.out.println("Player 1: " + p1Choice.getName() + "\t Player 1 Total Wins: " + p1.getWins());

        Move p2Choice = p2.playerChoice();
        System.out.println("Player 2: " + p2Choice.getName() + "\t Player 2 Total Wins: " + p2.getWins());

       determineWinnerRound(p1Choice, p2Choice, p1, p2);
    }
    
    public static void main(String[] args) {
        Player p1 = new Player();
        Player p2 = new Player();
        boolean gameWon = false;
        int roundsPlayed = 0;
        int draws = 0;
        
        do {
            System.out.println("****** Round: " + (roundsPlayed + 1) + " ******");
            System.out.println("Number of Draws: " + draws + "\n");

            roundGame(p1,p2);
            roundsPlayed++;
            determineWinnerGame(gameWon,p1,p2);
            
        } while (!gameWon);
    }
}
