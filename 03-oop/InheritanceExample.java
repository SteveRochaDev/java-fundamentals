// Topic: Inheritance
// Description: Demonstrates inheritance between classes

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class InheritanceExample {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.makeSound(); // inherited method
        dog.bark();
    }
}