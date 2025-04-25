package Arrays.Hard.Q34_CountSubArrayWithXorK;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q34_CountSubArrayWithXorK_Optimal
{
    //1st version - return the count of total subarrays with xor k
    public static int subarraysWithXorK(int nums[],int target)
    {
        int count=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        int xor=0;
        map.put(xor,1);
        for(int i=0;i<nums.length;i++)
        {
            xor=xor^nums[i];
            int x= xor^target;
            if(map.containsKey(x))
            {
                count+=map.get(x);
            }
                //or i can write the above line as below
//            count+=map.getOrDefault(x,0);
            if(map.containsKey(xor)){
                map.put(xor,map.get(xor)+1);
            }
            else {
                map.put(xor,1);
            }
            //2nd method to write the above line
//            map.put(xor,map.getOrDefault(xor,0)+1);
        }
        return count;
    }

    //2nd version of problem- return the largest subarray
    public static int LargestSubArrayLengthWithXorK(int nums[],int target)
    {
        int maxLen=0;
        int xor=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        map.put(xor,1);
        for(int i=0;i<nums.length;i++)
        {
            xor=xor^nums[i];
            if(xor==target)
            {
                maxLen= Math.max(maxLen,i+1);
            }
            int x= xor^target;
            if(map.containsKey(x))
            {
                int len= i-map.get(x);
                maxLen= Math.max(maxLen,len);
            }
            if(!map.containsKey(xor))
            {
                map.put(xor,i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] a = {4, 2, 2, 6, 4};
        int k = 6;
        int ans = subarraysWithXorK(a, k);
        //the sub-arrays with xor 6 are [4, 2], [4, 2, 2, 6, 4], [2, 2, 6], [6]
        //so ans = 4 (totoal number of subarrays)
        System.out.println(ans);

        //2nd version
        //the sub-arrays with xor 6 are [4, 2], [4, 2, 2, 6, 4], [2, 2, 6], [6]
        //above all of them the maximum length of subarray is [4,2,2,6,4] and its length is 5 so ans is 5
        int ans1 = LargestSubArrayLengthWithXorK(a, k);
        System.out.println(ans1);
    }
}
