// Topic: Input & Output
// Description: Demonstrates basic user input and console output in Java

import java.util.Scanner;

public class InputOutputExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Output result
        System.out.println("Hello, " + name + "!");

        scanner.close();
    }
}