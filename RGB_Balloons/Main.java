package RGBBalloons;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of balloons:");
        int n = sc.nextInt();

        char[] balloons= new char[n];
        LinkedHashSet<Character> nonDuplicateSet=new LinkedHashSet<>();
        int blue=0;
        int green=0;
        int red=0;

        for(int i=0;i<n;i++)
        {
            char balLoonColour=sc.next().charAt(0);
            if(balLoonColour == 'B'||balLoonColour=='R'||balLoonColour=='G')
            {
                 balloons[i] = balLoonColour;
                 nonDuplicateSet.add(balLoonColour);
                 if(balLoonColour=='B')
                 {
                    blue++;
                 }
                 else if(balLoonColour=='G')
                 {
                    green++;
                 }
                 else
                 {
                    red++;
                 }
            }
            else {
                System.out.println("Invalid balloon colour");
                break;
            }

        }
        char[] array= new char[3];
        int index=0;
        for(char c:nonDuplicateSet)
        {
            array[index++]=c;
        }
        OccurrenceBasedBalloonArray balloonArray = new OccurrenceBasedBalloonArray();
        balloonArray.printByOccurrence(array,blue,green,red);


    }
}
