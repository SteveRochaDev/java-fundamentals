import java.util.Random;

// GameLogic.java
// Handles game logic (number generation + checking guesses)

public class GameLogic {

    private int secretNumber;

    public GameLogic() {
        Random random = new Random();

        this.secretNumber = random.nextInt(GameConfig.MAX - GameConfig.MIN + 1)
                + GameConfig.MIN;
    }

    public String checkGuess(int guess) {

        if (guess < secretNumber) {
            return "Too low";
        } else if (guess > secretNumber) {
            return "Too high";
        } else {
            return "Correct";
        }
    }

    // ✅ FIX: proper win check
    public boolean isCorrect(int guess) {
        return guess == secretNumber;
    }
}