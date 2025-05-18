package BinarySearch.Q1_BinarySearch;

public class Q1_BinarySearch_Iterative
{
    public static int search(int[] nums, int target)
    {
        int low=0;
        int high= nums.length-1;


        while(low<=high)
        {
            int mid = (low+ high)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]<target)
            {
                low= mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]= {1,3,4,7,9};
        int ans = search(arr,4);
        System.out.println(ans);
    }
}
