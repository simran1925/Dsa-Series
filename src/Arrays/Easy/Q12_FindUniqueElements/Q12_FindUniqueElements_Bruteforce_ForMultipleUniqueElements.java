package Arrays.Easy.Q12_FindUniqueElements;

import java.util.Arrays;

public class Q12_FindUniqueElements_Bruteforce_ForMultipleUniqueElements
{
    public static void findUnique(int arr[])
    {
        Arrays.sort(arr);
        int count=1,i;
        for( i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                count++;
            }
            if(arr[i]!=arr[i+1])
            {
                if(count==1)
                {
                    System.out.print(arr[i]+" ");
                }
                count=1;
            }
        }
        if(count==1)
        {
            System.out.print(arr[arr.length-1]);
        }
    }
    public static void main(String[] args) {
        int[] arr= {1,4,1,2,2,3,7,9};
        findUnique(arr);
    }
}
