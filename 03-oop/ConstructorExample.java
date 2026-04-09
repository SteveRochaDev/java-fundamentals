// Topic: Constructors
// Description: Demonstrates constructor usage in Java

class Car {
    String brand;
    int year;

    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void showInfo() {
        System.out.println(brand + " - " + year);
    }
}

public class ConstructorExample {

    public static void main(String[] args) {

        Car car = new Car("Toyota", 2020);
        car.showInfo();
    }
}