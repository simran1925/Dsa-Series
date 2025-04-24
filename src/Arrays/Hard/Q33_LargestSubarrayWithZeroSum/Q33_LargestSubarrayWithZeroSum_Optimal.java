package Arrays.Hard.Q33_LargestSubarrayWithZeroSum;

import java.util.HashMap;

public class Q33_LargestSubarrayWithZeroSum_Optimal
{
    public static int largestSubArrayWithZeroSum(int arr[], int target)
    {
        int maxLen=0,sum=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(target==sum)
            {
                maxLen=Math.max(maxLen,i+1);
            }
            int rem= sum-target;
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
    public static void main(String[] args) {
        int target=0;
        int arr[]= {9, -3, 3, -1, 6, -5};
        int ans = largestSubArrayWithZeroSum(arr,target);
        System.out.println(ans);
    }
}
