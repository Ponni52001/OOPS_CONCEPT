package EqualZeroOne;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int lengthOfArray = sc.nextInt();
        int array[] = new int[lengthOfArray];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<array.length;i++)
        {
            int num=sc.nextInt();

            if (num == 0 || num == 1) {
                array[i] = num;
            }
            else {
                System.out.println("You are not entering 0's or 1's");
                break;
            }
        }
        LargestSubArray subArray = new LargestSubArray();
        subArray.findLargestSubarray(array,lengthOfArray);

    }
}
