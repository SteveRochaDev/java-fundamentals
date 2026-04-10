import java.util.Scanner;

// InputHandler.java
// Handles all user input

public class InputHandler {

    private Scanner scanner;

    public InputHandler() {
        scanner = new Scanner(System.in);
    }

    public int getGuess() {
        System.out.print("Enter your guess: ");
        return scanner.nextInt();
    }

    public char playAgain() {
        System.out.print("Play again? (y/n): ");
        return scanner.next().charAt(0);
    }

    public void close() {
        scanner.close();
    }
}