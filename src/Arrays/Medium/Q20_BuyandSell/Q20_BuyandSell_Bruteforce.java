//Time complexity : O(N) + O(N) = O(N)
//space complexity : O(1)
package Arrays.Medium.Q20_BuyandSell;

public class Q20_BuyandSell_Bruteforce
{
    public static int buyandSell(int arr[])
    {
        int maxPro=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>arr[i])
                {
                    maxPro= Math.max(maxPro,arr[j]-arr[i]);
                }
            }
        }
        return maxPro;
    }

    public static void main(String[] args)
    {
//        int arr[]= {7,1,5,3,6,4};
        int arr[]= {7,6,4,3,1};
        int ans = buyandSell(arr);
        System.out.println("Item should be sold on day "+ans+ "th");
    }
}
