package BinarySearch.Q4_SearchInsertPosition;

public class Q4_SearchInsertPosition_Bruteforce
{
    public static int searchInsert(int[] nums, int target) {
        int ans=nums.length;
       for(int i=0;i<nums.length;i++)
       {
           if(nums[i]>=target)
           {
               ans=i;
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
