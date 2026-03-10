/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package armathgeddon;

import javax.swing.JOptionPane;

/**
 *
 * @author natha
 */
public class Armathgeddon {
    
    public static void main(String[] args) {
    
// -- Question 1 --~
        int square = Integer.parseInt(JOptionPane.showInputDialog(null, "Type the number you want to square root."));
        
//        double squareRooted = Double.parseDouble(square);
//        squareRooted = Math.sqrt(squareRooted);
//        double squareRooted = Double.parseDouble(square);
        double squareRooted = Math.sqrt(square);
        System.out.println("The square root of " + square + " is " + squareRooted + ".");
        
        // - Cube Root -
        
        double cubeRooted = Math.cbrt(square);
        System.out.println("The cube root of " + square + " is " + cubeRooted + ".");
        
        
// -- Question 2 --
        System.out.println("The pin code for your new bank card is ");
        System.out.print((int) (Math.random() * 10) + 0);
        System.out.print((int) (Math.random() * 10) + 0);
        System.out.print((int) (Math.random() * 10) + 0);
        System.out.print((int) (Math.random() * 10) + 0);
        System.out.print(".");        
        
        // -- How to use Math.Random --     
        // Math.random() * range ) + starting value
        
    }
    
}
