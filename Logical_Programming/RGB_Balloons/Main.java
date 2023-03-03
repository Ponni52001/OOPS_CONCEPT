
import java.util.Scanner;

public class Main 
{
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
        PrintByOccurrence.printBalloonsByFirstOccurence(balloons,balloonArraySize);

    }
}
