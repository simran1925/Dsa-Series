package Arrays.Medium.Q20_BuyandSell;

public class Q20_BuyandSell_Better_MySolution
{
    public static int buyandSell(int arr[])
    {
        int max= 0,min=arr[0],minIndex=0,maxIndex=0,i;
        for( i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min= arr[i];
                minIndex=i;
            }
        }
        if(minIndex==arr.length-1)
        {
            return 0;
        }
        for(int j=minIndex+1;j<arr.length;j++)
        {
            if(arr[j]>max)
            {
                max=arr[j];
                maxIndex=j;
            }
        }
        return maxIndex+1;

    }

    public static void main(String[] args)
    {
//        int arr[]= {7,1,5,3,6,4};
        int arr[]= {7,6,4,3,1};
        int ans = buyandSell(arr);
        System.out.println("Item should be sold on day "+ans+ "th");
    }
}
