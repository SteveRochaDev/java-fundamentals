// Topic: File Reading
// Description: Demonstrates reading text from a file

import java.io.File;
import java.util.Scanner;

public class ReadFileExample {

    public static void main(String[] args) {

        try {
            File file = new File("example.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();

        } catch (Exception e) {
            System.out.println("An error occurred while reading the file.");
        }
    }
}