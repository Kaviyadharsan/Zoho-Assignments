package assignment4;
// Parent class
class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting");
    }

    public void stop() {
        System.out.println("Vehicle is stopping");
    }
}

// Subclass Car
class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting with a key");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping with brakes");
    }
}

// Subclass Bike
class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting with a kick");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping with hand brakes");
    }
}

// Main class to demonstrate polymorphism
public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        myCar.start();
        myCar.stop();

        myBike.start();
        myBike.stop();
    }
}

