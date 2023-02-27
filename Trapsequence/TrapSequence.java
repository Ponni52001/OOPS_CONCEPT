package TrapSequence;

import java.util.Scanner;


public class TrapSequence
{
    public static int digitSum(int z) 
    {
        int temp = z;
        int sumOfDigits = 0;
        while (temp > 0)
        {
            int lastDigit = temp % 10;
            sumOfDigits = sumOfDigits + lastDigit;
            if(sumOfDigits>=10)
            {
                sumOfDigits=sumOfDigits%10+sumOfDigits/10;
            }
            temp /= 10;
        }
        return sumOfDigits;
    }
    public static void printTrapSequence(int number1,int number2,int y)
    {
        boolean output = false;
        for(int i=number1;i<=number2;i++)
        {
            int z=digitSum(i);

            if(y<3)
            {
                y=3;
                i--;
            }
            else if(i==y)
            {
                System.out.println(i);
                output=true;
                y=y+2;
            }

            else if(y%i==0||i%y==0)
            {
                System.out.println(i);
                output=true;
                y=y+2;
            }

            else if(z==y||(z%y==0||y%z==0)){
                System.out.println(i);
                output=true;
                y=y+2;
            }
            else
            {
                y=y-1;
            }

        }
        if(!output)
        {
            System.out.println("There is No Trap Sequence Found!");
        }

    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Enter the starting range:");
        int number1=sc.nextInt();
      
        System.out.println("Enter the ending range:");
        int number2= sc.nextInt();
      
        System.out.println("Enter the value of Y:");
        int y=sc.nextInt();
      
        System.out.println();
        printTrapSequence(number1,number2,y);

    }
}
