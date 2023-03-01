package TrapSequence;

import java.util.Scanner;

public class TrapSequence {
    public static int digitSum(int i,int y)
    {

        int temp = i;
        int sumOfDigits = 0;
        while (temp > 0) {
            int lastDigit = temp % 10;
            sumOfDigits = sumOfDigits + lastDigit;
            temp /= 10;
        }

        if((sumOfDigits>=0&&sumOfDigits<=9)&&(sumOfDigits==y||sumOfDigits%y==0||y%sumOfDigits==0))
        {
                System.out.println(i);
                y = y + 2;

                return y;
            }

        else if((sumOfDigits>=0&&sumOfDigits<=9))
        {
            return y;
        }
        else if(sumOfDigits==y||sumOfDigits%y==0|y%sumOfDigits==0)
        {
            System.out.println(i);
            y=y+2;
            return y;
        }
        else
        {
             y=digitSum(sumOfDigits,y);
        }
       return y;
    }

    public static void printTrapSequence(int n1,int n2,int y)
    {
        int updatedY=0;
        for(int i=n1;i<=n2;i++)
        {

            if(y<3)
            {
                y=3;
                i--;
            }
            else if(i==y||i%y==0||y%i==0)
            {
                System.out.println("hiii"+i);
                y=y+2;
            }
            else if(i>9)
            {
                updatedY=digitSum(i,y);
                if(updatedY==y)
            {
                y=y-1;
            }
            else if(updatedY!=y){
                y=updatedY;
            }
            }


        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1:");
        //int n1=sc.nextInt();
        int n1=8725;
        System.out.println("Enter number 2:");
        //int n2=sc.nextInt();
        int n2=9000;
        System.out.println("Enter the value of y:");
        //int y =sc.nextInt();
        int y=22;
        printTrapSequence(n1,n2,y);

    }
}
