package Arrays.Easy.Q14_LongestSubarray_With_Sum_K_Positive_Negatives_both;

public class Q14_LongestSubarray_Positive_Negatives_Bruteforce_Two_Loops
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
        int arr[]= {-1,1,1};
        int k=1;
        int maxLen=longSubarray(arr,k);
        System.out.println(maxLen);
    }
}

