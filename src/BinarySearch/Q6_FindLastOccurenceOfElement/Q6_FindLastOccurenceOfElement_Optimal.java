package BinarySearch.Q6_FindLastOccurenceOfElement;

public class Q6_FindLastOccurenceOfElement_Optimal
{
    public static int firstOccurence(int nums[], int target)
    {
        int start = 0;
        int end = nums.length-1;
        int ans =-1;

        while(start<=end)
        {
            int mid = (start+end)/2;
            if(nums[mid]==target)
            {
                ans= mid;
                end = mid-1;
            }
            else if(nums[mid]>target)
            {
                end = mid-1;
            }
            else
            {
                start= mid+1;
            }
        }
        return ans;
    }
    public static int findLastOccurence(int nums[], int target)
    {
        int start = 0;
        int end = nums.length-1;
        int ans =-1;

        while(start<=end)
        {
            int mid = (start+end)/2;
            if(nums[mid]==target)
            {
                ans= mid;
                start= mid+1;
            }
            else if(nums[mid]>target)
            {
                end= mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return ans;

    }
    public static int[] searchRange(int[] nums, int target) {
        return new int[]{firstOccurence(nums,target),findLastOccurence(nums,target) };
    }

    public static void main(String[] args)
    {
        int arr[]= {1,2,3,3,4,5,5};
        int ans[]= searchRange(arr,5);
        System.out.println(ans[0]+ " "+ ans[1]);
    }
}
