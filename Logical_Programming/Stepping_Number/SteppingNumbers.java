

public class SteppingNumbers {
    public void findAndPrintSteppingNumbers(int startingNumber, int endingNumber, boolean output)
    {
            for (int i = startingNumber; i <= endingNumber; i++)
            {
                int temp = i;
                int lastDigit = temp % 10;
                while (temp >=10)
                {
                    int digit1, digit2;
                    digit1 = temp % 10;
                    digit2 = (temp % 100) / 10;
                    if ((digit1 - digit2) == 1 || digit2 - digit1 == 1)
                    {
                        temp = temp / 10;
                    }
                    else
                    {
                        break;
                    }
                }
                if (lastDigit - temp == 1 || temp - lastDigit == 1) {
                    System.out.println(i);
                    output = true;
                }
            }

            if (!output) 
            {
                System.out.println("There is no stepping numbers in the given range!");
            }
        }
    }

