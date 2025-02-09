//here we used two loops so Time Complexity=O(N) + O(N)= O(N) but we used two linear traversals
//Space Complexity=O(1) because no extra array or space is used
package Arrays.Easy.Q2_SecondLargestElement;

public class Q2_SecondLargestElement_Better
{
    public static int findSecondLargest(int arr[])
    {
        if(arr.length==0 || arr.length==1)
        {
            return -1;
        }
        int large=Integer.MIN_VALUE;
        int secondLarge=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            large=Math.max(large,arr[i]);
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>secondLarge && arr[i]!=large)
            {
                secondLarge=arr[i];
            }
        }
        return secondLarge;
    }

    public static int findSecondSmallest(int arr[])
    {
        if(arr.length==0 || arr.length==1)
        {
            return -1;
        }
        int small=Integer.MAX_VALUE;
        int secondSmall=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            small=Math.min(small,arr[i]);
        }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<secondSmall && arr[i]!=small)
            {
                secondSmall=arr[i];
            }
        }
        return secondSmall;
    }
    public static void main(String[] args)
    {
       int arr[]={1,0,4,3,6,8};
       System.out.println(findSecondLargest(arr));
       System.out.println(findSecondSmallest(arr));

    }
}
