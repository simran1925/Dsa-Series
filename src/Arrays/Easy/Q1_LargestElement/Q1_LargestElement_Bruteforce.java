package Arrays.Easy.Q1_LargestElement;

import java.util.Arrays;

public class Q1_LargestElement_Bruteforce
{
    public static int findLargest(int arr[])
    {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static void main(String[] args)
    {
        int arr[]={4,10,3,1,9};
        System.out.println(findLargest(arr) );
    }
}
