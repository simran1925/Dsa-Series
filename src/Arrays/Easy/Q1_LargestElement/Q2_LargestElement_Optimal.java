package Arrays.Easy.Q1_LargestElement;

public class Q2_LargestElement_Optimal
{

    public static int findLargest(int arr[])
    {
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={4,10,3,1,9};
        System.out.println(findLargest(arr) );
    }
}
