package Polymorphism;
class Animal
{
    public void makeSound()
    {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal
{
    public void makeSound()
    {
        System.out.println("barking..");
    }
}
class Cat extends Animal
{
    public void makeSound() 
    {
        System.out.println("meowing...");
    }
}
public class OverridingExample
{
    public static void main(String[] args)
    {
        
        Animal dog = new Dog();
        dog.makeSound();
        Animal cat = new Cat();
        cat.makeSound();
        
    }
}
