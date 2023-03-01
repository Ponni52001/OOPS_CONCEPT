package NewCount;

public class LargestSubarray {
    public void printLargestSubarray(int[] array,int zero,int one,int sizeOfArray)
    {
        int minimumInteger = 0;
        int minimumIntegerCount = 0;
        int maximumInteger = 0;
        int maximumIntegerCount = 0;
        if (zero == one) {
            System.out.println("0 to " + (sizeOfArray - 1));
            return;
        } else if (zero == 0 || one == 0) {
            System.out.println("No sub array found!");
            return;
        } else if (zero < one) {
            minimumInteger = 0;
            minimumIntegerCount = zero;
            maximumInteger = 1;
            maximumIntegerCount = one;

        } else {
            minimumInteger = 1;
            minimumIntegerCount = one;
            maximumInteger = 0;
            maximumIntegerCount = zero;
        }
        int start = 0;
        int end = 0;
        if (end == 0)
        {
            end = end + array.length - 1;
        }

        for (int i = 0; i < sizeOfArray; i++)
        {
            for (int j = sizeOfArray - 1; j >= 0; j--)
            {
                while (minimumIntegerCount != maximumIntegerCount && j != i)
                {
                    if (array[j] != minimumInteger)
                    {
                        j--;
                        end = j;
                        maximumIntegerCount--;
                    } else if (array[i] != minimumInteger) {
                        i++;
                        start = i;
                        maximumIntegerCount--;
                    }
                }
            }
        }
        System.out.println(start + " to " + end);


//        for (int i = start; i <= end; i++) {
//            System.out.print(array[i] + " ");
//        }

    }
}
