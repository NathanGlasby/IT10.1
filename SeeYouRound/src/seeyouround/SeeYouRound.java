/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seeyouround;
import javax.swing.*;

/**
 *
 * @author natha    
 */
public class SeeYouRound {

    public static void main(String[] args) {
        System.out.println(Math.round(1));
        System.out.println(Math.round(1.2));
        System.out.println(Math.round(1.5));
        System.out.println(Math.round(1.49));
        
        // ===== Rounding to a certain amount of decimal places =====
        
        String costInput = JOptionPane.showInputDialog("Enter the cost price:");
        double costPrice = Double.parseDouble(costInput);

        // Add 15% VAT
        double salesPrice = costPrice * 1.15;

        // Round to 2 decimal places
        salesPrice = salesPrice * 100;
        salesPrice = Math.round(salesPrice);
        salesPrice = salesPrice / 100.0;

        JOptionPane.showMessageDialog(
                null,
                "The sales price is R " + salesPrice
        );
    }
    
}
