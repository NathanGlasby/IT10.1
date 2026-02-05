package datatypes;

/**
 * Demonstrates Java primitive and reference data types, variable assignment, and console output.
 */
public class DataTypes {
    public static void main(String[] args) {

        // --- Declaring and assigning variables (different data types) ---
        String name = "Marley";
        name = "John";  // Reassignment: the variable now holds "John", so that is what prints below
        int age = 26;
        double height = 6.5;
        boolean vaper = false;
        char symbol = 'W';

        // --- Printing each value on its own line ---
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + "ft");
        System.out.println("Smokes?: " + vaper);
        System.out.println("Symbol: " + symbol);

        System.out.println("   ");

        // --- Same info in one println using \n for newlines ---
        System.out.println("Name: " + name + "\nAge: " + age + "\nHeight: " + height + "\nVaper? " + vaper + "\nSymbol: " + symbol);
        
        System.out.println("   ");
        
        String sneakers = "Michael Jordan \"Dynasty Collection\"";
        int price = 8000000;
        double weight = 1.8;
        boolean rare = true;
        char grade = 'A';
        
        System.out.println("Sneakers: " + sneakers + "\nPrice: R" + price + "\nWeight: " + weight + "kg" + "\nRare: " + rare + "\nSecond hand quality: " + grade);
        

    }
}
