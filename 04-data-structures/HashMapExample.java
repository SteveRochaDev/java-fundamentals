// Topic: HashMap
// Description: Demonstrates key-value mapping using HashMap

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<String, Integer> ages = new HashMap<>();

        ages.put("Steve", 25);
        ages.put("John", 30);
        ages.put("Alice", 28);

        for (String key : ages.keySet()) {
            System.out.println(key + " is " + ages.get(key) + " years old.");
        }
    }
}