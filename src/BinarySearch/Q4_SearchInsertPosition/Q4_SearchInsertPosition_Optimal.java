package BinarySearch.Q4_SearchInsertPosition;

public class Q4_SearchInsertPosition_Optimal
{
    public static int searchInsert(int[] nums, int target) {
        int start=0;
        int end = nums.length-1;
        int ans=nums.length;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(nums[mid]>=target)
            {
                ans= mid;
                end= mid-1;
            }
            else
            {
                start= mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]= {1,2,5,6};
        int ans = searchInsert(arr,7);
        System.out.println(ans);
    }
}
