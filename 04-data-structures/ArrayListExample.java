// Topic: ArrayList
// Description: Demonstrates dynamic lists using ArrayList

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Steve");
        names.add("John");
        names.add("Alice");

        for (String name : names) {
            System.out.println(name);
        }
    }
}