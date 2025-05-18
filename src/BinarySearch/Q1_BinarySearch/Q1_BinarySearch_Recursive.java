package BinarySearch.Q1_BinarySearch;

public class Q1_BinarySearch_Recursive
{
    public static int search(int[] nums, int target)
    {
        return binarySearch(nums,0,nums.length-1,target);
    }
    public static int binarySearch(int nums[],int start,int end,int target)
    {
        if(start>end)
        {
            return -1;
        }
        int mid= (start+end)/2;
        if(target==nums[mid])
        {
            return mid;
        }
        else if(target>nums[mid])
        {
            return binarySearch(nums,mid+1,end,target);
        }
        else
        {
            return binarySearch(nums,start,mid-1,target);
        }
    }

    public static void main(String[] args) {
        int arr[]= {1,3,4,7,9};
        int ans = search(arr,4);
        System.out.println(ans);
    }

}
