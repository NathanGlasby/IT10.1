/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nobodyputspythagorusinacorner;
import javax.swing.JOptionPane;

/**
 *
 * @author natha
 */
public class NobodyPutsPythagorusInACorner {

    public static void main(String[] args) {
        String sideAInput = JOptionPane.showInputDialog("Enter the length of side A:");
        double sideA = Double.parseDouble(sideAInput);

        String sideBInput = JOptionPane.showInputDialog("Enter the length of side B:");
        double sideB = Double.parseDouble(sideBInput);

        // Pythagoras: c = √(a² + b²)
        double hypotenuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));

        JOptionPane.showMessageDialog(
                null,
                "The length of the hypotenuse is " + hypotenuse + "."
        );
    }
    
}
