package BinarySearch.Q9_RotatedSortedArray2;

//The elements in this array can be duplicates also
public class Q9_RotatedSortedArray2_Optimal
{
    public static boolean search(int[] nums, int target) {
        int start =0;
        int end  = nums.length-1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(target==nums[mid])
            {
                return true;
            }

//Edge case
            if(nums[start]==nums[mid] && nums[mid]==nums[end])
            {
                start= start+1;
                end = end-1;
                continue;
            }

            if(nums[start]<=nums[mid])
            {
                if(nums[start]<=target && target<=nums[mid])
                {
                    end = mid-1;
                }
                else
                {
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
        return false;
    }

    public static void main(String[] args) {

        int arr[]={1,0,1,1,1};
        boolean ans = search(arr,0);
        System.out.println(ans);
    }
}
