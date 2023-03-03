

import java.util.Scanner;

public class PrintByOccurrence 
{

    public static void  printBalloonsByFirstOccurence(char[] balloons,int balloonArraySize)
    {
        for(int i=0;i<balloonArraySize;i++)
        {
            if(balloons[i]!=1)
            {
                int counter = 1;

                for (int j = i + 1; j < balloonArraySize; j++) {
                    if (balloons[i] == balloons[j]) {
                        counter++;
                        balloons[j] = 1;
                    }

                }
                while (counter > 0) {
                    System.out.print(balloons[i]+" ");
                    counter--;
                }
            }
        }
    }




}
