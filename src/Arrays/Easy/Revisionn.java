package Arrays.Easy;

class Solution {
    public static  boolean check(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                break;
            }
            j++;
        }
        System.out.println(j);
        if(j==nums.length)
        {
            return true;
        }
        int n=(nums.length-1)-j;

        for(int s=1;s<=n;s++)
        {
            int pos=nums[nums.length-1];
            for(int i=nums.length-1;i>=1;i--)
            {
                nums[i]=nums[i-1];
            }
            nums[0]=pos;
        }
        j=0;

        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {

                break;
            }
            j++;
        }
        if(j==nums.length)
        {
            return true;
        }
        System.out.println(j);
        return false;
    }

    public static void main(String[] args) {
        int arr[]= {3,4,5,1,2};
        boolean ans=check(arr);
        System.out.println(ans);
    }
}