package BinarySearch.Q18_FindMinimumDivisor;

public class Q17_FindMinimumDivisor_Optimal
{
    public static int checkDivisor(int nums[],int divisor)
    {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=Math.ceil((double)nums[i]/(double)divisor);
        }
        return sum;
    }

    public static int smallestDivisor(int[] nums, int threshold) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            max= Math.max(max,nums[i]);
        }
        int s= 1;
        int e= max;
        while(s<=e)
        {
            int mid= s+ (e-s)/2;
            if(checkDivisor(nums,mid)<=threshold)
            {
                e=mid-1;
            }
            else
            {
                s= mid+1;
            }

        }
        if(s>max)
        {
            return -1;
        }
        return s;
    }
    public static void main(String[] args) {
        int arr[]= {1,2,5,9};
        int theshold= 6;
        int ans = smallestDivisor(arr,theshold);
        System.out.println(ans);
    }
}
