/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package realaltitude;
import javax.swing.JOptionPane;

/**
 *
 * @author natha
 */
public class RealAltitude {

    public static void main(String[] args) {
        String altitudeInput = JOptionPane.showInputDialog("Enter the altitude reading:");
        double altitude = Double.parseDouble(altitudeInput);

        double realDistance = Math.abs(altitude);

        JOptionPane.showMessageDialog(
                null,
                "The real distance from sea level is " 
                + realDistance + " units."
        );

    }
    
}
