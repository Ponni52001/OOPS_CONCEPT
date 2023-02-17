package Inheritance;

class Vehicle
{
    public String brand;

    public Vehicle(String brand) 
    {
        this.brand = brand;

    }

    public void start()
    {
        System.out.println(brand  + " is starting");
    }

    public void stop()
    {
        System.out.println(brand + " is stopping");
    }

}


class Car extends Vehicle 
{
    public Car(String brand) 
    {
        super(brand);
    }

    public void drive() 
    {
        System.out.println(brand  + " is driving on the road.");
    }
}


class Motorcycle extends Vehicle 
{
    public Motorcycle(String brand) 
    {
        super(brand);
    }

    public void ride() 
    {
        System.out.println(brand + " is riding");
    }
    
}



public class HierarchicalInheritance 
{
    public static void main(String[] args) 
    {
        Car car = new Car("Toyota");
        car.start();
        car.drive();
        car.stop();

        Motorcycle motorcycle = new Motorcycle("Royal Enfield");
        motorcycle.start();
        motorcycle.ride();
        motorcycle.stop();
    }
}
