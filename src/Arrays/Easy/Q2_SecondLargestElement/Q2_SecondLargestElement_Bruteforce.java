//Time complexity = O(logN) for sorting + O(N) for loop i.e. O(NlogN)
//space complexity = O(1)
package Arrays.Easy.Q2_SecondLargestElement;

import java.util.Arrays;

public class Q2_SecondLargestElement_Bruteforce
{
    public static int findSecondLargest(int arr[])
    {
        if(arr.length==0 || arr.length==1)
        {
            return -1;
        }
        Arrays.sort(arr);
        int secondLargest=0;
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]!=arr[arr.length-1])
            {
                secondLargest=arr[i];
                break;
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int arr[]={4,10,3,1,9,10};
        System.out.println(findSecondLargest(arr)) ;
    }
}
