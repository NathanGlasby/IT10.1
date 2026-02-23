/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package glasby_nathan_javatest1;

import javax.swing.JOptionPane;

/**
 *
 * @author natha
 */
public class Glasby_Nathan_JavaTest1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    // Question 1 - Single Output Line
        System.out.println("====\n\t====\n\t\t====> \"This Guy!\" ('~')");
        
    System.out.println("");
        
    // Question 2 - Assign Variables
        String eggs = "Large Eggs";
        char grade = 'A';
        double weight = 0.65;
        int quantity = 12;
        boolean freeRange = false;
        
        System.out.println(eggs + ", grade: " + grade + " , quantity: " + quantity + ", weight: " + weight + " kgs.");
        System.out.println("Free range: " + freeRange);
        
    System.out.println("");
    
    // Question 3 - Ask User & Print Result
    
    // Question 3.1    
        String price = JOptionPane.showInputDialog(null, "What is the price of the item you're buying? Just input the numbers.");
        double priceDouble = Double.parseDouble(price);
    // Question 3.2
        String amount = JOptionPane.showInputDialog(null, "How many items are you buying? Just input the numbers.");
        int amountInt = Integer.parseInt(amount);
    // Question 3.3
        System.out.println("The total cost is: R" + priceDouble * amountInt);
    
    System.out.println("");    
        
    // Question 4 - Sweet Factory
        int sweets = 24560;
        int sweetsBag = 85;
        
        System.out.println(sweets + " sweets can produce a total of " + sweets / sweetsBag + " full bags of sweets");
        System.out.println("with " + sweets % sweetsBag + " sweets left over.");
        
    // INCOMPLETE - Question 5
    //String word = "enraged";
    //    System.out.println ("xx" + word.charAt(1) + word.charAt(2));
    //    System.out.println(word.charAt(4));
    }
    
}
