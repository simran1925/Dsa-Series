//Time complexity= O(N) because only single iteration is used
//space complexity= O(1) because no extra space is used
package Arrays.Easy.Q2_SecondLargestElement;

public class   Q2_SecondLargestElement_Optimal
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
            if(arr[i]>large)
            {
                secondLarge=large;
                large=arr[i];
            }
            else if(arr[i]>secondLarge && arr[i]!=large)
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
            if(arr[i]<small)
            {
                secondSmall=small;
                small=arr[i];
            }
            else if(arr[i]<secondSmall && arr[i]!=small)
            {
                secondSmall=arr[i];
            }
        }
        return secondSmall;
    }
    public static void main(String[] args)
    {
        int arr[]={1};
        System.out.println(findSecondLargest(arr));
        System.out.println(findSecondSmallest(arr));
    }
}
