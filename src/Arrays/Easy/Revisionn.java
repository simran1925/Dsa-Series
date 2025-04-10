package Arrays.Easy;

import java.util.*;

class Solution {
    public static ArrayList<Integer> moveZeroes(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int max=nums[nums.length-1];
        ans.add(max);
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]>max)
            {
                ans.add(nums[i]);
                max=nums[i];
            }
        }
        System.out.println(ans);

        return ans;
    }


    public static void main(String[] args) {
//        int arr1[] = {2, 1, -3, 4, -1, 2, 1, -5, 4};
        int arr[]={10, 22, 12, 3, 0, 6};
    moveZeroes(arr);

//        System.out.println(ans);
//        System.out.println(ans);
//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.print(arr[i]+ " ");
//        }
    }
}