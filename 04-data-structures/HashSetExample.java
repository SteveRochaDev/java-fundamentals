// Topic: HashSet
// Description: Demonstrates unique collection using HashSet

import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();

        names.add("Steve");
        names.add("John");
        names.add("Steve"); // duplicate ignored

        for (String name : names) {
            System.out.println(name);
        }
    }
}