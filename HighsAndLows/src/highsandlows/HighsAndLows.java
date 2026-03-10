/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package highsandlows;
import javax.swing.*;

/**
 *
 * @author natha
 */
public class HighsAndLows {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String firstInput = JOptionPane.showInputDialog("Enter the first number:");
        double num1 = Double.parseDouble(firstInput);

        String secondInput = JOptionPane.showInputDialog("Enter the second number:");
        double num2 = Double.parseDouble(secondInput);

        double highest = Math.max(num1, num2);
        double lowest = Math.min(num1, num2);

        JOptionPane.showMessageDialog(
                null,
                highest + " is the highest number and " 
                + lowest + " is the lowest number."
        );
    }
}