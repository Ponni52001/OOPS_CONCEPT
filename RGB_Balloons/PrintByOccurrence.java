

import java.util.Scanner;

public class PrintByOccurrence {

    public static void  printBalloonsByFirstOccurence(char[] balloons,int balloonArraySize)
    {
        for(int i=0;i<balloonArraySize;i++)
        {
            if(balloons[i]!=1)
            {
                int count = 1;

                for (int j = i + 1; j < balloonArraySize; j++) {
                    if (balloons[i] == balloons[j]) {
                        count++;
                        balloons[j] = 1;
                    }

                }
                while (count > 0) {
                    System.out.print(balloons[i]+" ");
                    count--;
                }
            }
        }
    }



    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the balloon array:");
        int balloonArraySize=input.nextInt();
        char[] balloons = new char[balloonArraySize];
        for(int i=0;i<balloonArraySize;i++)
        {
            balloons[i]=input.next().charAt(0);
        }
        printBalloonsByFirstOccurence(balloons,balloonArraySize);

    }
}
