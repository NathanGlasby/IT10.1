/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fullcircle;
import javax.swing.*;

/**
 *
 * @author natha
 */
public class FullCircle {

    public static void main(String[] args) {
        
       String radiusInput = JOptionPane.showInputDialog("Enter the radius:");
        double radius = Double.parseDouble(radiusInput);

        double area = Math.PI * Math.pow(radius, 2);

        JOptionPane.showMessageDialog(
                null,
                "The surface area of the circle with radius " 
                + radius + " is " + area + "."
        ); 
        
        
    }
    
}
