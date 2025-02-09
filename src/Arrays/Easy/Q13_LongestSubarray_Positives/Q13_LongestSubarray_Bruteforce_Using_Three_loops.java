package Arrays.Easy.Q13_LongestSubarray_Positives;

public class Q13_LongestSubarray_Bruteforce_Using_Three_loops
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
