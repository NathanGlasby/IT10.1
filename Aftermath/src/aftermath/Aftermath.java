// Surprise Maths Test - 04/03/26

package aftermath;

import javax.swing.JOptionPane;

public class Aftermath {

    public static void main(String[] args) {
        String radiusInput = JOptionPane.showInputDialog("Enter the radius of a circle:");
        // double radius = Double.parseDouble(radiusInput);

        // Extension activity: random integer radius between 2 and 9 (inclusive).
        double randomRadius = (int) (Math.random() * 8) + 2;

        double surfaceArea = Math.PI * Math.pow(randomRadius, 2);
        surfaceArea = Math.round(surfaceArea * 100.0) / 100.0;

        JOptionPane.showMessageDialog(
                null,
                "The surface area of circle with a radius of "
                        + randomRadius + " is " + surfaceArea + "."
        );
    }

}
