package BinarySearch.Q11_FindHowManyTimesArrayRotated;

public class Q11_FindHowManyTimesArrayRotated_Better
{
    public static int findRotatedTimes(int nums[])
    {
        int s=0;
        int e=nums.length-1;
        int index=0;
        int ans = Integer.MAX_VALUE;
        while(s<=e)
        {
            int mid = (s+e)/2;
            if(nums[s]<=nums[mid])
            {
                if(nums[s]<ans)
                {
                    index=s;
                    ans=nums[s];
                }
                s= mid+1;
            }
            else {
                if(nums[mid]<ans)
                {
                    index=mid;
                    ans=nums[mid];
                }
                e=mid-1;
            }
        }
        return index;

    }
    public static void main(String[] args) {
        int arr[]= {3,4,5,1,2};
        int ans = findRotatedTimes(arr);
        System.out.println(ans);
    }
}
