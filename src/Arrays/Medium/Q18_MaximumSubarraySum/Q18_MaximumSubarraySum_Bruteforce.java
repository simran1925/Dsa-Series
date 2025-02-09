package Arrays.Medium.Q18_MaximumSubarraySum;

public class Q18_MaximumSubarraySum_Bruteforce
{
    public static long maximumSubarraySum(int arr[])
    {
        long maxi= Long.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=i;j<arr.length;j++) //start from 0 is waste of time it will result same pair
            {
                sum+=arr[j];
            }
            maxi= Math.max(maxi,sum);
        }
        return maxi;
    }
    public static void main(String[] args)
    {
        int arr[]= {1,3,2};
        long ans = maximumSubarraySum(arr);
        System.out.println(ans);
    }
}
