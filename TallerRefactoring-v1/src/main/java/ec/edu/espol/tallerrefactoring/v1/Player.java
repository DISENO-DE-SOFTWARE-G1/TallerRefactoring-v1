package ec.edu.espol.tallerrefactoring.v1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author angelozurita
 */
public class Player {
    private int wins;

    public Player() {
        this.wins = 0;
    }

    public Move playerChoice() {
        Move[] choices = {new Rock(), new Paper(), new Scissors()};
        int c = (int) (Math.random() * choices.length);
        return choices[c];
    }

    public void incrementWins() {
        wins++;
    }

    public int getWins() {
        return wins;
    }
}

