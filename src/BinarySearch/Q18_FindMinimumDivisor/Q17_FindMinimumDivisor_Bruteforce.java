package BinarySearch.Q18_FindMinimumDivisor;

public class Q17_FindMinimumDivisor_Bruteforce
{
    public static int checkDivisor(int nums[],int divisor)
    {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            System.out.println("ceil"+(int)Math.ceil(nums[i]/divisor));
            sum+=(int)Math.ceil((double) nums[i]/(double) divisor);
        }
        return sum;
    }

    public static int smallestDivisor(int[] nums, int threshold) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            max= Math.max(max,nums[i]);
        }
        for(int i=1;i<=max;i++)
        {
            if(checkDivisor(nums,i)<=threshold)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
      int arr[]= {1,2,5,9};
      int theshold= 6;
      int ans = smallestDivisor(arr,theshold);
        System.out.println(ans);
    }
}
