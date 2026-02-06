/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package userinput_;

import javax.swing.JOptionPane;

/**
 *
 * @author natha
 */
public class UserInput_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String name = JOptionPane.showInputDialog("Enter your name");
        System.out.println("Hello " + name + "!");

        String date = JOptionPane.showInputDialog("Enter the date");
        String time = JOptionPane.showInputDialog("Enter the time");
        String venue = JOptionPane.showInputDialog("Enter the venue");
        System.out.println("Welcome " + name + ", your booking date is confirmed for: " + date + ", at " + time + ". The location of the venue is: " + venue + "");

    }

}


