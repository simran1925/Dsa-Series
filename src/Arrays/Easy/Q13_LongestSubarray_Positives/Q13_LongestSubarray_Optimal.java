package Arrays.Easy.Q13_LongestSubarray_Positives;

public class Q13_LongestSubarray_Optimal
{
    public static int longSubarray(int arr[],int target)
    {
        int left=0,right=0;
        int sum=arr[0], maxlen=0;
        while(right<arr.length)
        {
            while(left<=right && sum>target)
            {
                sum = sum - arr[left];
                left++;
            }

            if(target==sum)
            {
                maxlen= Math.max(maxlen,right-left+1);
            }

            right++;

            if(right<arr.length)
            {
                sum= sum+ arr[right];
            }
        }
        return maxlen;
    }
    public static void main(String[] args)
    {
        int arr[]= {2,3,5,1,9};
        int k=10;
        int maxLen=longSubarray(arr,k);
        System.out.println(maxLen);
    }
}
