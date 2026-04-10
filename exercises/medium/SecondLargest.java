// Exercise: Second Largest Number
// Level: Medium

public class SecondLargest {

    public static void main(String[] args) {

        int[] arr = {10, 20, 5, 40, 30};

        int largest = arr[0];
        int second = arr[0];

        for (int num : arr) {

            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num > second && num != largest) {
                second = num;
            }
        }

        System.out.println("Second largest: " + second);
    }
}