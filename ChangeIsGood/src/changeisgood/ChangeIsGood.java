/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package changeisgood;

import javax.swing.JOptionPane;

/**
 *
 * @author natha
 */
public class ChangeIsGood {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // String int doubble char boolean
        
        String st = "8";
        int i = 6;
        double d = 2.5;
        char ch = 'A';
        boolean b = true;
        
        // Changing to a string
        String a = "" + i;
               a = "" + d;
               a = "" + b;
               a = "" + ch;
     
        // Changing to an int
        int num = Integer.parseInt(st);
            num = (int) d; // narrowing conversion
            num = ch;
        System.out.println(num);
        
        // Changing to a double
        double dec = Double.parseDouble(st);
               dec = i; // widening conversion
               
        // Changing to a char
        char val = st.charAt(0);
             val = (char) i;
             val = (char) d;
             
        // Changing to a boolean
        boolean g = Boolean.parseBoolean(st);
        
        // Write code to ask the user if they are
        // exercising (true/false)
        // Store their answer as a boolean value
        
        boolean isExercising = Boolean.parseBoolean(JOptionPane.showInputDialog("Are you excercising? (true/false)"));
        System.out.println(isExercising);
    }
    
}
