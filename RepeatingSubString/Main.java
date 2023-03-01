package SubString;

import java.util.Scanner;

class Main2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String sentence = sc.nextLine().toLowerCase();

        String[] array = sentence.split(" ");
        RepeatingSubstring subString = new RepeatingSubstring();
        subString.findRepeatingSubstring(array);

        }
}


