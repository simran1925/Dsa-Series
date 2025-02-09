package Arrays.Medium.Q15_TwoSum;

import java.util.Arrays;

public class Q15_TwoSum_Optimal
{
    public static boolean twoSum(int arr[],int target)
    {
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        while(left<right)
        {
            int sum= arr[left]+ arr[right];
            if(sum==target)
            {
                return true;
            }
            else if(sum<target)
            {
                left++;
            }
            else {
                right--;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        int arr[]= {2,0,3,4};
        int target=4;
        boolean ans= twoSum(arr,target);
        System.out.println(ans);
    }
}


//Returning indexesss............................

//class Solution {
//    public int[] twoSum(int[] nums, int target)
//    {
//        Map<Integer,Integer> map = new HashMap<>();
//        for(int i=0;i<nums.length;i++)
//        {
//            int num = nums[i];
//            int remaining= target-num;
//
//            if(map.containsKey(remaining))
//            {
//                return new int[]{i,map.get(remaining)};
//            }
//
//            map.put(num,i);
//        }
//        return new int[]{-1,-1};
//    }
//}
