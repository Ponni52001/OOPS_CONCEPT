package SteppingNumber;

import java.util.Scanner;


public class Main {

    public static boolean printSingleDigitSteppingNumber(int startingNumber)
    {
        boolean output = false;
        while (startingNumber <= 9 & startingNumber >= 0)
        {
            System.out.println(startingNumber);
            output = true;
            startingNumber++;

        }
        return output;
    }
        public static void main (String[]args)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the Starting number:");
            int startingNumber = input.nextInt();
            System.out.println("Enter the Ending number:");
            int endingNumber = input.nextInt();


            if (startingNumber > endingNumber) {
                int temp;
                temp=startingNumber;
                startingNumber=endingNumber;
                endingNumber=temp;
            }
            System.out.println();
            boolean output=printSingleDigitSteppingNumber(startingNumber);


            SteppingNumbers steppingNumbers = new SteppingNumbers();
            steppingNumbers.findAndPrintSteppingNumbers(startingNumber, endingNumber,output);


        }
    }
