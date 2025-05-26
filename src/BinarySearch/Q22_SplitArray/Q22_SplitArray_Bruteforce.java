package BinarySearch.Q22_SplitArray;

public class Q22_SplitArray_Bruteforce
{
    public static int countSplits(int nums[], int givenSplit)
    {
        int totalSplit =1;
        int subarraySum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(subarraySum+nums[i]<= givenSplit)
            {
                subarraySum+=nums[i];
            }
            else
            {
                totalSplit++;
                subarraySum=nums[i];
            }
        }
        return totalSplit;

    }
    public static int splitArray(int[] nums, int k) {
        int max= Integer.MIN_VALUE;
        int sum =0;
        for(int i=0;i<nums.length;i++)
        {
            max= Math.max(max, nums[i]);
            sum +=nums[i];
        }

        for(int i=max;i<=sum;i++)
        {
            if(countSplits(nums,i)==k)
            {
                return i;
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int arr[]= {7,2,5,10,8};
        int ans = splitArray(arr,2);
        System.out.println(ans);
    }
}
