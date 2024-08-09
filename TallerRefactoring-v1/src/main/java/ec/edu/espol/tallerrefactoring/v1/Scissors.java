/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tallerrefactoring.v1;

/**
 *
 * @author angelozurita
 */
public class Scissors implements Move  {

    @Override
    public boolean winTo(Move move) {
        return move instanceof Paper;
    }

    @Override
    public String getName() {
        return "Scissors" ; 
    }
    
}
