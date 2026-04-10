// Exercise: Armstrong Number
// Level: Medium

public class ArmstrongNumber {

    public static void main(String[] args) {

        int number = 153;
        int original = number;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }

        if (sum == original) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}