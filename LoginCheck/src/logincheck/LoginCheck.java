/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logincheck;

import javax.swing.JOptionPane;

/**
 *
 * @author natha
 */
public class LoginCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // -- Differents Parts of the Internet --
        // Surface Web
        // Deep Web (logged in parts of the internet)
        // Dark web (.onion links through Tor)
        
    // Data stored on the website database
        String username = "mboon";
        String password = "asecret";
        
    // User entered credntionals
        String enteredUsername = JOptionPane.showInputDialog("Enter username");
        String enteredPassword = JOptionPane.showInputDialog("Enter password");
        
    // Validation
        if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed incorrect username or password!");
        }
        
        
        
        
    }
    
}
