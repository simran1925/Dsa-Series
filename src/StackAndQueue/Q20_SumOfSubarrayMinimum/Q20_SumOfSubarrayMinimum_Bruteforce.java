package StackAndQueue.Q20_SumOfSubarrayMinimum;

public class Q20_SumOfSubarrayMinimum_Bruteforce
{
    public static int sumSubarrayMins(int[] arr) {
        int mod= 1_000_000_007;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            int minElement= arr[i];
            for(int j=i;j<arr.length;j++)
            {
                minElement= Math.min(minElement,arr[j]);
                sum= (sum + minElement)%mod;  //keep in mind  - we are doing summation of all minimum elements of subarray
            }

        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]= {3,1,2,4};
        int ans= sumSubarrayMins(arr);
        System.out.println(ans);
    }
}
