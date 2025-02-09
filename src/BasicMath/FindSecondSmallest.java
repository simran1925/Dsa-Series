package BasicMath;

public class FindSecondSmallest
{
    public static int findSecondSmallest(int[] arr)
    {
         int smallest = Integer.MAX_VALUE;
         int secondSmallest = Integer.MAX_VALUE;
         for(int i=0;i<arr.length;i++)
         {
             if(arr[i]<smallest)
             {
                 secondSmallest = smallest;
                 smallest = arr[i];
             }
             if(arr[i]<secondSmallest && arr[i]!=smallest)
             {
                 secondSmallest = arr[i];
             }

         }
         return secondSmallest;
    }
    public static void main(String[] args)
    {
        int arr[]={2,4,7,8,9,1,0};
        int secondSmallest = findSecondSmallest(arr);
        System.out.println(secondSmallest);
    }
}
