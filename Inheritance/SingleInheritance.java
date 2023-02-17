
class Person 
{
    
     String name;
     int age;

    public Person(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

    
    public void speak() 
    {
        System.out.println(name + " is speaking.");
    }

    public void walk() 
    {
        System.out.println(name + " is walking.");
    }
    
}


class Student extends Person 
{
    String collegeName;

    public Student(String name, int age, String schoolName) 
    {
        super(name, age);
        this.collegeName = schoolName;
    }

    public void study() 
    {
        System.out.println(name + " is studying at " + collegeName + ".");
    }


}


public class SingleInheritance 
{
    public static void main(String[] args) 
    {
        Student student = new Student("Ponni", 21, "St Joseph's College");
        student.speak();
        student.walk();
        student.study();
    }
}

