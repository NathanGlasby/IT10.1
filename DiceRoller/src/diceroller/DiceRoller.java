/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diceroller;

/**
 *
 * @author natha
 */
public class DiceRoller {

    public static void main(String[] args) {
        int die1 = (int)(Math.random() * 6) + 1;
        int die2 = (int)(Math.random() * 6) + 1;

        int total = die1 + die2;

        System.out.println("First die rolled a " + die1 + ".");
        System.out.println("Second die rolled a " + die2 + ".");
        System.out.println("Total roll is " + total + ".");
 
    }
    
}
