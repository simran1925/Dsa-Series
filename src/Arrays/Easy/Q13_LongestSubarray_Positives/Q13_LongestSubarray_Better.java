package Arrays.Easy.Q13_LongestSubarray_Positives;

import java.util.HashMap;
import java.util.Map;

public class Q13_LongestSubarray_Better
{
    public static int longSubarray(int arr[],int target)
    {
        int maxLen=0;
        long sum=0;
        Map<Long,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            sum= sum+ arr[i];
            if(sum==target)
            {
                maxLen= Math.max(maxLen,i+1);
            }
            long rem= sum-target;

            if(map.containsKey(rem))
            {
                int len= i-map.get(rem);
                maxLen= Math.max(maxLen,len);
            }
             if(!map.containsKey(sum))
            {
                map.put(sum,i);
            }
        }
        return maxLen;
    }
    public static void main(String[] args)
    {
        int arr[]= {2,3,7,1,9};
        int k=10;
        int maxLen=longSubarray(arr,k);
        System.out.println(maxLen);
    }

}
