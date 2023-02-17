package Abstraction;

abstract class Pen 
{

    abstract void write();
    public void makeUse()
    {
        System.out.println("Used to write");
    }
}


class BallpointPen extends Pen 
{

    void write() 
    {
        System.out.println("Writing with ballpoint pen.");
    }
}


class FountainPen extends Pen 
{

    void write() 
    {
        System.out.println("Writing with fountain pen.");
    }
}


public class AbstractionExample 
{
    public static void main(String[] args)
    {
        Pen ballpointPen = new BallpointPen();
        Pen fountainPen = new FountainPen();

        ballpointPen.write();
        fountainPen.write();
    }
}
