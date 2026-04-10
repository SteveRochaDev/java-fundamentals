// Exercise: Guess the Number (Simple)
// Level: Easy

public class GuessNumber {

    public static void main(String[] args) {

        int secretNumber = 7;
        int guess = 5;

        if (guess == secretNumber) {
            System.out.println("Correct guess!");
        } else {
            System.out.println("Wrong guess!");
        }
    }
}