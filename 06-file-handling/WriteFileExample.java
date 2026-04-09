// Topic: File Writing
// Description: Demonstrates writing text to a file

import java.io.FileWriter;

public class WriteFileExample {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("example.txt");

            writer.write("Hello, Java File Handling!\n");
            writer.write("This is a second line.");

            writer.close();

            System.out.println("File written successfully.");

        } catch (Exception e) {
            System.out.println("An error occurred while writing the file.");
        }
    }
}