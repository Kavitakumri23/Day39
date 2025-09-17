package Inheritance;
// Parent class
class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

// Child class
class Car extends Vehicle {
    int seats;

    Car(String brand, int speed, int seats) {
        super(brand, speed);  // call parent constructor
        this.seats = seats;
    }

    void displayCarInfo() {
        super.displayInfo(); //parent method
        System.out.println("Seats: " + seats);
    }
}

public class Single2 {
    public static void main(String[] args) {
        Car car1 = new Car("Tesla", 250, 5);
        car1.displayCarInfo();
    }
}


