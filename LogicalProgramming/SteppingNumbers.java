package SteppingNumber;

public class SteppingNumbers {
    public void printSteppingNumber( int startingNumber, int endingNumber)
    {
        boolean output = false;

            for (int i = startingNumber; i <= endingNumber; i++) {

                int temp = i;
                int lastNumber = temp % 10;
                while (temp != 0) {
                    int digit1, digit2;
                    digit1 = temp % 10;
                    digit2 = (temp % 100) / 10;
                    if ((digit1 - digit2) == 1 || digit1 - digit2 == -1) {
                        temp = temp / 10;

                    } else {
                        break;
                    }
                }
                if (temp / 10 == 0 & (lastNumber - temp) == 1 || temp - lastNumber == 1) {
                    System.out.println(i);
                    output = true;
                }
            }

            if (!output) {
                System.out.println("There is no stepping numbers in the given range!");
            }
        }
    }

