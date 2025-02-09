package Arrays.Easy.Q13_LongestSubarray_Positives;

public class Q13_LongestSubarray_Bruteforce_Using_Two_loops
{
    public static int longSubarray(int arr[],int target)
    {
        int maxLen=0;
        for(int i=0;i<arr.length;i++)
        {
            int j;
            int sum=0;
            for(j=i;j<arr.length;j++ )
            {
                sum= sum+arr[j];
                if(sum==target)
                {
                    maxLen=Math.max(maxLen,j-i+1);
                }
            }

        }
        return maxLen;
    }
    public static void main(String[] args)
    {
        int arr[]= {2,3,7,1,9};
        int k=1;
        int maxLen=longSubarray(arr,k);
        System.out.println(maxLen);
    }
}
