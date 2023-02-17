package Abstraction;

abstract class Animal {

    public abstract void makeSound();

    public void eat()
    {
        System.out.println("Animals are eating");
    }
}


class Dog extends Animal{
    public void makeSound() {
        System.out.println("lol lol");
    }



    public void sleep()
    {
        System.out.println("sleeping.....");
    }


}
class AbstractionExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.sleep();
        dog.eat();

    }
}
