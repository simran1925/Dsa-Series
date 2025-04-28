package Arrays.Hard.Q40_LargestSubArrayProduct;

public class Q40_LargestSubArrayProduct_Bruteforce
{
    public static int maxProduct(int[] nums) {

        int maxProd=1;
        for(int i=0;i<nums.length-1;i++)     //nums.length-1;
        {
            for(int j=i+1;j<nums.length;j++)  //j=i+1
            {
                int prod=1;
                for(int k=i;k<=j;k++)
                {
                    prod*=nums[k];
                }
                maxProd=Math.max(maxProd,prod);
            }
        }
        return maxProd;
    }
    public static void main(String[] args) {
        int arr[]= {1, 2, -3, 0, -4, -5};
        int ans = maxProduct(arr);
        System.out.println(ans);
    }
}
