package Arrays.Easy.Q14_LongestSubarray_With_Sum_K_Positive_Negatives_both;

public class Q14_LongestSubarray_Positive_Negatives_Bruteforce_Three_Loops
{
    public static int longSubarray(int arr[],int target)
    {
        int maxlen=0;
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum+=arr[k];
                }
                if(sum==target)
                {
                    maxlen=Math.max(maxlen,j-i+1);
                }
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

