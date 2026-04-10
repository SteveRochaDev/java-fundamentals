// Exercise: Palindrome String
// Level: Medium

public class PalindromeString {

    public static void main(String[] args) {

        String text = "madam";
        boolean isPalindrome = true;

        for (int i = 0; i < text.length() / 2; i++) {

            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}