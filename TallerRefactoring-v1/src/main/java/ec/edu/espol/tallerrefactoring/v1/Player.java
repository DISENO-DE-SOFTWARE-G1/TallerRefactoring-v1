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
    private String name;

    public Player(String name) {
        this.name = name;
        this.wins = 0;
    }

    public String getName() {
        return name;
    }

    public String playChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        int c = (int) (Math.random() * 3);
        return choices[c];
    }

    public void incrementWins() {
        wins++;
    }

    public int getWins() {
        return wins;
    }
}

