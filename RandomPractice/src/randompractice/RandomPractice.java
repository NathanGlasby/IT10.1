/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randompractice;

/**
 *
 * @author natha
 */
public class RandomPractice {

    public static void main(String[] args) {
        // 0.0 to 0.99...
        System.out.println(Math.random());

        // 1.0 to 9.99...
        System.out.println(Math.random() * 9 + 1);

        // 0 to 5
        System.out.println((int)(Math.random() * 6));

        // 1 to 10
        System.out.println((int)(Math.random() * 10) + 1);

        // 4 to 9
        System.out.println((int)(Math.random() * 6) + 4);

        // 0.0 to 50.99...
        System.out.println(Math.random() * 51);

        // -10 to -1
        System.out.println((int)(Math.random() * 10) - 10);

        // 1 to 3
        System.out.println((int)(Math.random() * 3) + 1);

        // 0 to 1
        System.out.println((int)(Math.random() * 2));

        // -1 to 1
        System.out.println((int)(Math.random() * 3) - 1);

        // 120 to 150
        System.out.println((int)(Math.random() * 31) + 120);

    }
    
}
