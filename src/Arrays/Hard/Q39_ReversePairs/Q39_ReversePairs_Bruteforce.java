package Arrays.Hard.Q39_ReversePairs;

public class Q39_ReversePairs_Bruteforce
{
    public static int reversePairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]>2*nums[j])
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]= {4, 1, 2, 3, 1};
        int ans =reversePairs(arr);
        System.out.println(ans);
    }
}
