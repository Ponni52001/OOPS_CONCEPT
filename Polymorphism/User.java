
class Calculator 
{
    public int subtract(int a, int b) 
    {
        return a - b;
    }

    public double subtract(double a, double b) 
    {
        return a - b;
    }

    public int subtract(int a, int b, int c) 
    {
        return a - b - c;
    }
    
}

public class OverLoadingExample
{
    public static void main(String[] args) 
    {
        Calculator calculator = new Calculator();

        System.out.println(calculator.subtract(2, 1));
        System.out.println(calculator.subtract(5.5, 3.7));
        System.out.println(calculator.subtract(9, 3, 1));
    }
}
