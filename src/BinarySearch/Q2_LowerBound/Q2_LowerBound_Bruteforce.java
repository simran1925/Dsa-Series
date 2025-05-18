package BinarySearch.Q2_LowerBound;

public class Q2_LowerBound_Bruteforce
{
    public static int lowerBound(int arr[],int x)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=x)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]= {3,5,8,15,9};
        int ans = lowerBound(arr,9);
        System.out.println(ans);
    }
}
