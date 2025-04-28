package Arrays.Hard.Q40_LargestSubArrayProduct;

public class Q40_LargestSubarrayProduct_Better
{
    public static int maxProduct(int[] nums) {

        int maxProd=nums[0];
        for(int i=0;i<nums.length-1;i++)
        {
            int prod=nums[i];
            for(int j=i+1;j<nums.length;j++)
            {
                maxProd= Math.max(maxProd,prod);  //comparsion
                prod*=nums[j];
            }
            maxProd= Math.max(maxProd,prod);   //2 times comparison
        }
        return maxProd;
    }
    public static void main(String[] args) {
        int arr[]= {1, 2, -3, 0, -4, -5};
        int ans = maxProduct(arr);
        System.out.println(ans);
    }
}
