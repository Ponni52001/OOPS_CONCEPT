import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1:");
        int number1 = sc.nextInt();

        System.out.println("Enter number 2:");
        int number2 = sc.nextInt();

        System.out.println("Enter the value of y:");
        int y = sc.nextInt();

        TrapSequence trapSequence= new TrapSequence();
        trapSequence.printTrapSequence(number1,number2,y);
    }
}
