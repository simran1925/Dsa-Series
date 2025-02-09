//kadane's algo
package Arrays.Medium.Q18_MaximumSubarraySum;

public class Q18_MaximumSubarraySum_Optimal
{
    public static long maximumSubarraySum(int arr[])
    {
        long maxi= Long.MIN_VALUE;
        int sum=0;
       for(int i=0;i<arr.length;i++)
       {
           sum+=arr[i];
           if(sum>maxi)
           {
               maxi= sum;
           }
           if(sum<0)
           {
               sum=0;
           }

           // To consider the sum of the empty subarray
           // uncomment the following check:

           //if (maxi < 0) maxi = 0;
       }
       return maxi;
    }
    public static void main(String[] args)
    {
        int arr[]= {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        long ans = maximumSubarraySum(arr);
        System.out.println(ans);
    }
}
