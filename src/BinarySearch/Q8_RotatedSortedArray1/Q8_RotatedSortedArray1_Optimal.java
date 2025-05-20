package BinarySearch.Q8_RotatedSortedArray1;

public class Q8_RotatedSortedArray1_Optimal
{
    public static int search(int[] nums, int target) {
        int start=0;
        int end = nums.length-1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(target==nums[mid])
            {
                return mid;
            }
            //if left part is sorted
            if(nums[start]<=nums[mid])
            {
                if(nums[start]<=target && target<=nums[mid])
                {
                    //element exists
                    end = mid-1;
                }
                else
                {
                    //element does not exists
                    start = mid+1;
                }
            }
            else
            {
                if(nums[mid]<=target && target<=nums[end])
                {
                    start = mid+1;
                }
                else
                {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int arr[]= {1,2,3,4,0,6,5};
        int ans = search(arr,0);
        System.out.println(ans);
    }
}
