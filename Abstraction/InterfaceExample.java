package Abstraction;

interface Shape
{
    double getArea();
    double getPerimeter();
}


class Circle implements Shape 
{
    double radius;

    public Circle(double radius) 
    {
        this.radius = radius;
    }

    public double getArea() 
    {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() 
    {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape 
{
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) 
    {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea()
    {
        return length * breadth;
    }

    public double getPerimeter() 
    {
        return 2 * (length + breadth);
    }
}

public class InterfaceExample{
    public static void main(String[] args) 
    {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(3, 4);


        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
    }
}
