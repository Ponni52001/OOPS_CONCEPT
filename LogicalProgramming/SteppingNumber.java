package SteppingNumber;

import java.util.Scanner;


public class SteppingNumber 
{
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
        while(startingNumber<=10 & startingNumber>=0)
        {
            System.out.println(startingNumber);
            startingNumber++;
        }
        boolean output=false;
        for(int i=startingNumber;i<=endingNumber;i++)
        {

            int temp=i;
            int lastNumber=temp%10;
          
            while(temp!=0)
            {
               int digit1,digit2;
               digit1=temp%10;
               digit2=(temp%100)/10;
               if((digit1-digit2)==1||digit1-digit2==-1)
               {
                   temp=temp/10;
               }
               else{
                   break;
               }
            }
          
            if(temp/10==0 & (lastNumber-temp)==1||temp-lastNumber==1)
            {
                System.out.println(i);
                output = true;
            }
          
        }
       
        if(!output)
        {
            System.out.println("There is no stepping numbers in the given range!");
        }
    }
}
