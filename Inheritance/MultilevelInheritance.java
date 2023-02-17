package Inheritance;

class Animal
{
    
     String animalName;
     int animalAge;
    
    public Animal(String name, int age) 
    {
        this.animalName = name;
        this.animalAge = age;
    }
    
    public void eat()
    {
        System.out.println(animalName+" is Eating");
    }
    
    public void details()
    {
        System.out.println("I am "+animalName+" and my age is "+animalAge);
    }
    
}

class Dog extends Animal 
{
    public Dog(String animalName, int animalAge) 
    {
        super(animalName, animalAge);
    }
    
    void bark()
    {
        System.out.println(animalName+" is barking");
    }
    
    public void details()
    {
        super.details();
    }

}
class BabyDog extends Dog
{
    public BabyDog(String animalName,int animalAge)
    {
        super(animalName,animalAge);
    }
    
    void weep()
    {
        System.out.println(animalName+" is weeping");
    }
    
    public void details()
    {
        super.details();
    }

}

class MultiLevelInheritance
{
    public static void main(String args[])
    {
        Dog dog = new Dog("Charlie", 3);
        dog.bark();
        dog.eat();
        dog.details();
        
        
        BabyDog babyDog = new BabyDog("Puppy",1);
        babyDog.weep();
        babyDog.eat();
        babyDog.details();

    }
}
