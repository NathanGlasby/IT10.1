/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package glasby_nathan_term1_v2;

import javax.swing.JOptionPane;

/**
 *
 * @author natha
 */
public class Glasby_Nathan_Term1_v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    // Question 1
        System.out.println("What kind of computer \"sings\" the best?\n\t... A Dell \\o/");
        
    System.out.println("");
        
    // Question 2
        String Item = "8GB DDR5 Ram Module";
        // System.out.println(Item);
        
        int quantity = 2;
        // System.out.println(quantity);
        
        double price = 1125.99;
        // System.out.println(price);
        
        char currency = 'R';
        // System.out.println(currency);
        
        boolean inStock = true;
        // System.out.println(inStock);
        
        double totalPrice = price * quantity;        
        
        System.out.println(quantity + " x " + Item + " at " + currency + " " + price + " each.");
        System.out.println("Total: " + currency + " " + totalPrice);
        System.out.println("In stock: " + inStock);
    
    System.out.println("");
        
    // Question 3.1 - ask user for age
        String inputAge = JOptionPane.showInputDialog(null,
                "Please enter your age:");
        
        int age = Integer.parseInt(inputAge);
                
    // Question 3.2 - calculate birth year
        int currentYear = 2026;
        int birthYear = currentYear - age;
    
        JOptionPane.showMessageDialog(null,
                "You were most likely born in " + birthYear + ".");
        
        
    // Question 3.3 - calculate minutes lived
        int minutesLived = age * 365 * 24 * 60;
        
        JOptionPane.showMessageDialog(null,
                "You have lived for " + minutesLived + " minutes.");
     
    System.out.println("");
        
    // Question 4 - theme park ride
        int ticketHolders = 86;
        int rideCapacity = 25;
        
        int fullRides = ticketHolders / rideCapacity;
        int remainingPeople = ticketHolders % rideCapacity;
        
        System.out.println(fullRides + " rides will be full and "
            + remainingPeople + " people will be on the last ride if "
            + ticketHolders + " ticket holders are in the queue.");
    
    System.out.println("");  
        
    // Bonus Question - charAt
    //               0123456789    
    String player = "LeBron James";
    System.out.println(player.charAt(8));           // a
    
    // print 'season'
    System.out.println("" + player.charAt(11)       // s
            + player.charAt(10)                     // e   
            + player.charAt(8)                      // a  
            + player.charAt(11)                     // s
            + player.charAt(4)                      // o
            + player.charAt(5)                      // n
    );
    }
    
}
