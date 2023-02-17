package Polymorphism;

//override
class Animal {
    public void makeSound() {
        System.out.println("Animal makes sound");
    }
}
  class Dog extends Animal{
        public void makeSound()
        {
            System.out.println("lol loll");
        }
    }
    class Cat extends Animal{
        public void makeSound()
        {
            System.out.println("meow meow");
            super.makeSound();
        }
    }
    public class OverRidingExample{
        public static void main(String[] args)
        {
            Animal dog = new Dog();
            dog.makeSound();


        }
    }

