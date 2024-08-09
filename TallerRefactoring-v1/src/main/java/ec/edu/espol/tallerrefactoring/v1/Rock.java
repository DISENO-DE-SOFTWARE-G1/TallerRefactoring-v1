/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tallerrefactoring.v1;

/**
 *
 * @author angelozurita
 */
public class Rock implements Move  {

    @Override
    public boolean winTo(Move move) {
        return move instanceof Scissors;
    }

    @Override
    public String getName() {
         return "Rock"; 
    }
    
}
