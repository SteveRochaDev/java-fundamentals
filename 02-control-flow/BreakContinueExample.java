// Topic: Break & Continue
// Description: Demonstrates loop control using break and continue

public class BreakContinueExample {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                continue; // skip 5
            }

            if (i == 8) {
                break; // stop loop
            }

            System.out.println("Value: " + i);
        }
    }
}