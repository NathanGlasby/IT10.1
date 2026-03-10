/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ivegotthepower;
import javax.swing.*;

/**
 *
 * @author natha
 */
public class IveGotThePower {

    public static void main(String[] args) {
        
        String numberInput = JOptionPane.showInputDialog("Enter a number:");
        double number = Double.parseDouble(numberInput);

        String powerInput = JOptionPane.showInputDialog("Enter a power:");
        double power = Double.parseDouble(powerInput);

        double result = Math.pow(number, power);

        JOptionPane.showMessageDialog(
                null,
                number + " to power of " + power + " is " + result + "."
      
        );
    }
    
}
