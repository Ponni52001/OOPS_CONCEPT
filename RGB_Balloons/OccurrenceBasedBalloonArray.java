package RGBBalloons;

public class OccurrenceBasedBalloonArray {
    public void printByOccurrence(char[] array, int blue, int green, int red) {

        System.out.println("The occurrence Based Array is:");
        for (int i = 0; i < 3; i++) {
            int count = 0;
            char balloonColour = array[i];
            if (balloonColour == 'R')
                count = red;
            else if (balloonColour == 'G')
                count = green;
            else {
                count = blue;
            }
            while (count > 0) {
                System.out.print(balloonColour + " ");
                count--;
            }

        }
    }
}
