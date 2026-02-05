/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datatypes;

/**
 *
 * @author natha
 */
public class MichaelJordan {

    String sneakers = "Michael Jordan \"Dynasty Collection\"";
    int price = 8000000;
    double weight = 1.8;
    boolean rare = true;
    char grade = 'A';

    public static void main(String[] args) {
        // NOTE: Mr. Boon did NOT teach this. Creating an object with "new" so we can
        // use the fields above (sneakers, price, etc.) from inside main.
        MichaelJordan mj = new MichaelJordan();
        System.out.println("Sneakers: " + mj.sneakers + "\nPrice: R" + mj.price + "\nWeight: " + mj.weight + "kg" + "\nRare: " + mj.rare + "\nSecond hand quality: " + mj.grade);
    }
}
