import java.util.Scanner;

class TrapSequence 
{

   public void printTrapSequence(int number1, int number2, int y) {

       for(int x=number1;x<=number2;x++)
       {
           if(y<3)
           {
               y=3;
           }

           if(x==y || x%y==0 || y%x==0 || (!isSingleDigit(x)&&isEqualToSumOfDigits(x,y))) {
               System.out.println(x);;
               y+=2;
           }
           else{
               y--;
           }
       }

   }

   public  boolean isEqualToSumOfDigits(int x, int y)
   {

       int sum = digitSum(x);
       boolean output = sum == y || sum % y == 0 || y % sum == 0;
       if(isSingleDigit(x))
       {
           if(output){
               return true;
           }else{
               return false;
           }
       }
       if(output){
           return true;
       }

       return isEqualToSumOfDigits(sum,y);
   }

   public  int digitSum(int temp)
   {
       int sum=0;
       while(temp>0){
           int lastDigit = temp%10;
           sum+=lastDigit;
           temp/=10;
       }

       return sum;
   }

   public  boolean isSingleDigit(int x)
   {
       return x>=0 && x<10; // CHECKS IF IT IS A SINGLE DIGIT
   }
}
