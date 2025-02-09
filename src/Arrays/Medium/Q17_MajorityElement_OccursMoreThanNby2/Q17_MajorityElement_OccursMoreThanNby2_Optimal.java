//Moore’s Voting Algorithm:
//time complexity: O(N) + O(N) = O(N)
//space complexity : O(1)

package Arrays.Medium.Q17_MajorityElement_OccursMoreThanNby2;

import java.util.Arrays;

public class Q17_MajorityElement_OccursMoreThanNby2_Optimal
{
    public static int findMajorityElement(int arr[])
    {
        //Applying Algo
        int count=0;
        int element=0;
        for(int i=0;i<arr.length;i++)
        {
            if(count==0)
            {
                count=1;
                element=arr[i];
            }
            else if(arr[i]==element)
            {
                count++;
            }
            else {
                count--;
            }
        }

        //checking if the element getting is actually greater than N/2
        int count1=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==element)
            {
                count1++;
            }
        }
        if(count1>arr.length/2)
        {
            return element;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]= {2,2,1,1,1,2,2,3,3,3,3,3,3,3,3,3};
        int ans= findMajorityElement(arr);
        System.out.println(ans);
    }
}
