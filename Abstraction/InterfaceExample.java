package Abstraction;

public interface Vehicle {
    public void start();
    public void stop();
}
class Car implements Vehicle {
    public void start() {
        System.out.println("starting car engine");
    }
    public void stop() {
        System.out.println("stopping car engine");
    }
    public void accelerate()
    {
        System.out.println("Accelerating");
    }
}

class Truck implements Vehicle {
    public void start() {
        System.out.println("starting truck engine");
    }
    public void stop() {
        System.out.println("stopping truck engine");
    }
}
class InterfaceExample {
    public static void main(String[] args) {
    Vehicle car = new Car();
        car.start();
        car.stop();

    }
}

