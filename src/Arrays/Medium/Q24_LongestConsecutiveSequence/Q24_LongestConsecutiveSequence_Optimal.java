package Arrays.Medium.Q24_LongestConsecutiveSequence;

import java.util.Arrays;

public class Q24_LongestConsecutiveSequence_Optimal {
    //MY OPTIMAL SOLUTION
    public static int findLongestConsecutiveSequence(int nums[]) {
        if(nums.length==0)
        {
            return 0;
        }
        Arrays.sort(nums);
        int maxConsecutiveSequence=0;
        int count=0;
        int i;

        for( i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                continue;
            }
            else if(nums[i+1]-nums[i]==1)
            {
                count++;
            }

            else
            {
                count++;
                maxConsecutiveSequence=Math.max(maxConsecutiveSequence,count);
                count=0;
            }
        }
        count++;
        maxConsecutiveSequence=Math.max(maxConsecutiveSequence,count);
        return maxConsecutiveSequence;
    }

    public static void main(String[] args) {
        int arr[]= {3, 8, 5, 7, 6};
//        3 5 6 7 8
        int ans=findLongestConsecutiveSequence(arr);
        System.out.println(ans);

    }
}
