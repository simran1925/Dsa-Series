package Arrays.Easy.Q14_LongestSubarray_With_Sum_K_Positive_Negatives_both;

import java.util.HashMap;
import java.util.Map;

public class Q14_LongestSubarray_Positive_Negatives_Optimal_UsingHashing
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

            long rem = sum-target;

            if(map.containsKey(rem))
            {
                int len= i- map.get(rem);
                maxLen= Math.max(len,maxLen);
            }
            else if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return maxLen;

    }
    public static void main(String[] args)
    {
        int arr[]= {-1,1,1};
        int k=1;
        int maxLen=longSubarray(arr,k);
        System.out.println(maxLen);
    }
}
