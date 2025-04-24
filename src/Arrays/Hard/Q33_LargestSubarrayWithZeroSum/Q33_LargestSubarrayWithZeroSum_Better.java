package Arrays.Hard.Q33_LargestSubarrayWithZeroSum;

public class Q33_LargestSubarrayWithZeroSum_Better
{
    public static int largestSubArrayWithZeroSum(int arr[], int target)
    {
        int maxLen=0;
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=i;j<arr.length;j++)
            {
                sum+=arr[j];
                if(target==sum)
                {
                    maxLen= Math.max(maxLen,j-i+1);
                }
            }
        }
        return  maxLen;
    }

    public static void main(String[] args) {
        int target=0;
        int arr[]= {9, -3, 3, -1, 6, -5};
        int ans = largestSubArrayWithZeroSum(arr,target);
        System.out.println(ans);
    }
}
