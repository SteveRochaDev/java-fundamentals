// Topic: Classes & Objects
// Description: Demonstrates basic class creation and object usage

class Person {
    String name;
    int age;

    void introduce() {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }
}

public class ClassObjectExample {

    public static void main(String[] args) {

        Person person = new Person();
        person.name = "Steve";
        person.age = 25;

        person.introduce();
    }
}