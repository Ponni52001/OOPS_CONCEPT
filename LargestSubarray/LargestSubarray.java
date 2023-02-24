

public class LargestSubArray {
    public void findLargestSubarray(int array[],int lengthOfArray)
    {
        int zeros=0;
        int ones=0;
        for(int i=0;i< array.length;i++)
        {
            if (array[i] == 0)
            {
                zeros++;
            }
            else {
                ones++;
            }
        }

        System.out.println(zeros == ones ? "The Index of the Subarray starts from "+"0 to " + (array.length - 1) : (zeros == 0 || ones == 0 ? "No sub array found" : ""));

        for(int i=0;i<array.length;i++)
        {
            if(zeros>ones&&ones!=0)
            {
                if(array[i]==0)
                {
                    System.out.println("The Index of the Subarray starts from "+(i+1)+" to "+(array.length-1));
                    break;
                }
            }
            else if(ones>zeros&&zeros!=0)
            {
                if(array[i]==1)
                {
                    System.out.println("The Index of the Subarray starts from "+(i+1)+" to "+(array.length-1));
                    break;
                }
            }
        }


    }
}
