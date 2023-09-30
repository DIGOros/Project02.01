import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variables of different types
        int numInt = 5;
        double numDouble = 3.14;
        char charVar = 'A';
        boolean isJavaFun = true;
        String greeting = "Hello, World!";

        // Operations with numbers
        double sum = numInt + numDouble;
        int difference = numInt - (int) numDouble; // Type casting
        double product = numInt * numDouble;
        double division = numInt / numDouble;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Division: " + division);

        // String operations
        String fullName = "John" + " " + "Doe";
        System.out.println("Full Name: " + fullName);

        // Input/Output operations
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Your age is: " + age);

        // Different comment types
        // This is a single-line comment

        /*
        This is a
        multi-line comment
        */

        scanner.close(); // Close the scanner to prevent resource leak
    }
}
