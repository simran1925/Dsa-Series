package Arrays.Hard.Q40_LargestSubArrayProduct;

public class Q40_LargestSubArrayProduct_Optimal
{
    public static int maxProduct(int[] nums) {

        int maxProd=Integer.MIN_VALUE;
        int pre=1,suff=1;
        for(int i=0;i<nums.length;i++)
        {
            if(pre==0)
            {
                pre=1;
            }
            if(suff==0)
            {
                suff=1;
            }
            pre*=nums[i];
            suff*=nums[nums.length-i-1];
            maxProd=Math.max(maxProd,Math.max(suff,pre));
        }
        return maxProd;

    }
    public static void main(String[] args) {
        int arr[]= {1, 2, -3, 0, -4, -5};
        int ans = maxProduct(arr);
        System.out.println(ans);
    }
}
