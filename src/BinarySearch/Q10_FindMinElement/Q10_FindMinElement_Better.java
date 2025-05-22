package BinarySearch.Q10_FindMinElement;

public class Q10_FindMinElement_Better
{
    public static int findMin(int[] nums) {
        int s= 0;
        int e = nums.length-1;
        int ans = Integer.MAX_VALUE;
        while(s<=e)
        {
            int mid = (s+e)/2;
            //will use below condition in optimal approach
            
//            if(nums[s]<=nums[e])
//            {
//                ans = Math.min(nums[s],ans);
//            }
            if(nums[s]<=nums[mid])
            {
                ans = Math.min(ans,nums[s]);
                s= mid+1;
            }
            else
            {
                ans = Math.min(ans,nums[mid]);
                e = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]= {4,5,6,7,0,1,2};
        int ans = findMin(arr);
        System.out.println(ans);
    }
}
