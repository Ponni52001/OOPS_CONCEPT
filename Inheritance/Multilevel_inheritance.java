package Inheritance;

class Animal1 {
    void eat()
    {
        System.out.println("eating");
    }
}
class Dog1 extends Animal1 {
    void bark()
    {
        System.out.println("barking");
    }
}
class Babydog extends Animal1
{
    void weep()
    {
        System.out.println("Crying");
    }
}
class Multilevel_inheritance{
    public static void main(String args[])
    {
        Dog1 d=new Dog1();
        d.bark();
        Babydog b = new Babydog();
        b.weep();
        b.eat();

    }
}

