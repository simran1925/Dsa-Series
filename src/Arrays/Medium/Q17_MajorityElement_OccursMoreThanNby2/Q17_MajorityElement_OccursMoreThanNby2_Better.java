//Time complexity : O(N*logN)+ O(N)
package Arrays.Medium.Q17_MajorityElement_OccursMoreThanNby2;

import java.util.Arrays;

public class Q17_MajorityElement_OccursMoreThanNby2_Better
{
    public static int findMajorityElement(int arr[])
    {
        Arrays.sort(arr);
        int elementCount=1,i;
        int maxCount=0;
        int maxElement=-1;   //return -1 if no any majority element found
        for(i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                elementCount++;
            }
            if(arr[i]!=arr[i+1])
            {
                if(elementCount>(arr.length/2))
                {
                    if(elementCount>maxCount)
                    {
                        maxElement=arr[i];
                    }
                }
                elementCount=1;
            }
        }
        if(elementCount>(arr.length/2))
        {
            if(elementCount>maxCount)
            {
                maxElement=arr[i];
            }
        }
        return maxElement;
    }
    public static void main(String[] args) {
        int arr[]= {2,2,1,1,1,2,2,3,3,3,3,3,3,3,3,3};
        int ans= findMajorityElement(arr);
        System.out.println(ans);
    }
}
