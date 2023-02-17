package Polymorphism;

class Fruit {
    public void eat() {
        System.out.println("Eating a fruit");
    }
}

class Mango extends Fruit {
    @Override
    public void eat() {
        System.out.println("Eating a mango");
    }
}

class Apple extends Fruit {
    @Override
    public void eat() {
        System.out.println("Eating an apple");
    }
}

public class OverridingExample{
    public static void main(String[] args) {
        Fruit fruit1 = new Fruit();
        Fruit fruit2 = new Mango();
        Fruit fruit3 = new Apple();

        fruit1.eat();
        fruit2.eat();
        fruit3.eat();
    }
}
