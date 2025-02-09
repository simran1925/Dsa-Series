package Arrays.Medium.Q20_BuyandSell;

public class Q20_BuyandSell_Optimal
{
    public static int buyandSell(int arr[])
    {
        int maxPro= 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            minPrice= Math.min(minPrice,arr[i]);
            maxPro= Math.max(maxPro,arr[i]-minPrice);
        }
        return maxPro;
    }

    public static void main(String[] args)
    {
        int arr[]= {7,1,5,3,6,4};
//        int arr[]= {7,6,4,3,1};
        int ans = buyandSell(arr);
        System.out.println("Item should be sold on day "+ans+ "th");
    }
}
