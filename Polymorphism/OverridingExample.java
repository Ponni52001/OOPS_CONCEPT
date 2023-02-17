package Polymorphism;

class Fruit
{
    public void eat()
    {
        System.out.println("Eating a fruit");
    }
}

class Mango extends Fruit
{
    @Override
    public void eat()
    {
        System.out.println("Eating a mango");
    }
}

class Apple extends Fruit
{
    @Override
    public void eat()
    {
        System.out.println("Eating an apple");
    }
}

public class OverridingExample
{
    public static void main(String[] args)
    {
        Fruit fruit = new Fruit();
        Fruit mango = new Mango();
        Fruit apple = new Apple();

        fruit.eat();
        mango.eat();
        apple.eat();
    }
}
