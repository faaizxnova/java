import java.util.Scanner;

public class sample {

    public static void main(String []a) {

        // Print a message
        System.out.println("Welcome to Java Programming!");
        

        // Create Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Display output
        System.out.println("Hello, " + name + "!");

        // Simple condition
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        // Loop example
        System.out.println("Counting from 1 to 5:");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i * i);
        }

        scanner.close();
    }
}