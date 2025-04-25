package Arrays.Hard.Q34_CountSubArrayWithXorK;

import java.util.ArrayList;
import java.util.List;

public class Q34_CountSubArrayWithXorK_Bruteforce
{
    //1st version - return the count of total subarrays with xor k
    public static int subarraysWithXorK(int nums[],int target)
    {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                int xor=0;
                for(int k=i;k<=j;k++)
                {
                    xor=xor^nums[k];
                }
                if (xor == target) {
                    count++;
                }
            }
        }
        return count;
    }

//2nd version of problem- return the largest subarray
    public static int LargestSubArrayWithXorK(int nums[],int target)
    {
        int maxLen=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                int xor=0;
                for(int k=i;k<=j;k++)
                {
                    xor=xor^nums[k];
                }
                if (xor == target) {
                    maxLen= Math.max(maxLen,j-i+1);
                }
            }
        }
        return maxLen;
    }

    //3rd version of problem - return all the subarrays with xor k
    public static List<List<Integer>> printSubArrayWithXorK(int nums[], int target)
    {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                int xor=0;
                List<Integer> temp= new ArrayList<>();
                for(int k=i;k<=j;k++)
                {
                    temp.add(nums[k]);
                    xor=xor^nums[k];
                }
                if (xor == target) {
                    ans.add(temp);
                }
            }
        }
        return ans;
    }

    //4th version of problem - return largest the subarray with xor k
    public static List<List<Integer>> printLargestSubArrayWithXorK(int nums[], int target)
    {
        List<List<Integer>> ans = new ArrayList<>();
        int maxLen=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                int xor=0;
                List<Integer> temp= new ArrayList<>();
                for(int k=i;k<=j;k++)
                {
                    temp.add(nums[k]);
                    xor=xor^nums[k];
                }
                if (xor == target) {
                    maxLen= Math.max(maxLen,j-i+1);
                    if(maxLen==temp.size())
                    {
                        ans.clear();
                        ans.add(temp);
                    }
                }
            }
        }
        return ans;
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
        int ans1 = LargestSubArrayWithXorK(a, k);
        System.out.println(ans1);

        //3rd verion
        List<List<Integer>> ans2= printSubArrayWithXorK(a,k);
        System.out.println(ans2);

        //4th version
        List<List<Integer>> ans3= printLargestSubArrayWithXorK(a,k);
        System.out.println(ans3);
    }
}
