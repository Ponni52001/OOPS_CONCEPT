package SteppingNumber;

public class SingleDigitNumber 
{
    int number;
    public void isSingleDigit(int startingNumber) 
    {
        while (startingNumber <= 9 & startingNumber >= 0) 
        {
            System.out.println(startingNumber);
            startingNumber++;
        }
        number=startingNumber;
    }

}
