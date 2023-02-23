package SteppingNumber;

import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Starting number:");
        int startingNumber=sc.nextInt();
        System.out.println("Enter the Ending number:");
        int endingNumber = sc.nextInt();

        if(startingNumber>endingNumber)
        {
            System.out.println("Sorry you have entered a wrong range!!!");
        }

        SingleDigitNumber task1 = new SingleDigitNumber();
        task1.isSingleDigit(startingNumber);
        startingNumber=task1.number;

        SteppingNumbers numbers = new SteppingNumbers();
        numbers.printSteppingNumber(startingNumber,endingNumber);



    }
}
