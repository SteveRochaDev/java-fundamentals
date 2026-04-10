// GuessingGame.java
// Main class - controls game flow

public class GuessingGame {

    public static void main(String[] args) {

        InputHandler input = new InputHandler();
        boolean play = true;

        while (play) {

            GameLogic game = new GameLogic();

            int guess = 0;
            int attempts = 0;

            System.out.println("=== Number Guessing Game ===");
            System.out.println("Guess a number between " + GameConfig.MIN + " and " + GameConfig.MAX);
            System.out.println("----------------------");

            // ✅ FIXED LOOP CONDITION
            while (!game.isCorrect(guess) && attempts < GameConfig.MAX_ATTEMPTS) {

                guess = input.getGuess();
                attempts++;

                String result = game.checkGuess(guess);
                System.out.println(result);

                System.out.println("----------------------");
            }

            // ✅ FIXED RESULT LOGIC
            if (game.isCorrect(guess)) {
                System.out.println("You won in " + attempts + " attempts!");
            } else {
                System.out.println("Game over! You've used all attempts.");
            }

            System.out.println("----------------------");

            char choice = input.playAgain();

            if (choice != 'y' && choice != 'Y') {
                play = false;
            }

            System.out.println("----------------------");
        }

        input.close();
        System.out.println("Goodbye!");
    }
}