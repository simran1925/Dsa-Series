package BinarySearch.Q13_PeakElement;

public class Q13_PeakElement_Optimal
{
    public static int findPeakElement(int[] nums) {
        if(nums.length==1)
        {
            return 0;
        }
        if(nums[0]>nums[1])
        {
            return 0;
        }
        if(nums[nums.length-1]>nums[nums.length-2])
        {
            return nums.length-1;
        }
        int s=1;
        int e=nums.length-2;

        while(s<=e)
        {
            int mid=(s+e)/2;
            if(nums[mid]> nums[mid-1] && nums[mid]>nums[mid+1])
            {
                return mid;
            }

            if(nums[mid]> nums[mid-1])
            {
                s= mid+1;
            }
            else
            {
                e= mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]= {1,2,3,1};
        int ans = findPeakElement(nums);
        System.out.println(ans);
    }
}
