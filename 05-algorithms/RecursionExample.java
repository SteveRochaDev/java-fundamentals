// Topic: Recursion
// Description: Demonstrates a simple recursive function

public class RecursionExample {

    public static void main(String[] args) {
        printNumbers(5);
    }

    public static void printNumbers(int n) {

        if (n == 0) {
            return;
        }

        System.out.println(n);
        printNumbers(n - 1);
    }
}