package NewCount;


import java.util.Scanner;

 class printLargestSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int sizeOfArray = sc.nextInt();
        int array[] = new int[sizeOfArray];
        int zero = 0;
        int one = 0;
        System.out.println("Enter the values:");
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = sc.nextInt();
            if (array[i] == 0)
            {
                zero++;
            }
            else
            {
                one++;
            }
        }
        LargestSubarray subArray=new LargestSubarray();
        subArray.printLargestSubarray(array,zero,one,sizeOfArray);

    }
}
