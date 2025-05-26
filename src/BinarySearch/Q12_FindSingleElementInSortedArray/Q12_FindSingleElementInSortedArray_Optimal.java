package BinarySearch.Q12_FindSingleElementInSortedArray;

public class Q12_FindSingleElementInSortedArray_Optimal
{
    public static int singleNonDuplicate(int[] nums)
    {
        int n= nums.length;
        if(n==1)
        {
            return nums[0];
        }
        if(nums[0]!=nums[1])
        {
            return nums[0];
        }
        if(nums[n-1]!=nums[n-2])
        {
            return nums[n-1];
        }

        int s= 1;
        int e = nums.length-2;
        while(s<=e)
        {
            int mid = (s+e)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1])
            {
                return nums[mid];
            }
            if((mid%2==1 && nums[mid-1]==nums[mid]) || (mid%2==0 && nums[mid]==nums[mid+1]))
            {
                //eleminate the left part the element will be in right section
                s= mid+1;
            }
            else
            {
                e=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,1,2,3,3,4,4,5,5};
        int ans = singleNonDuplicate(arr);
        System.out.println(ans);
    }
}
