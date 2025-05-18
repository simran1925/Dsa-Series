package BinarySearch.Q2_LowerBound;

public class Q2_LowerBound_Optimal
{
    public static int lowerBound(int arr[],int x)
    {
        int start = 0;
        int end= arr.length-1;
        int ans=-1;
        while(start<=end)
        {
            int mid= (start+end)/2;
            if(arr[mid]>=x)
            {
                ans=mid;
                end= mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]= {3,5,8,15,9};
        int ans = lowerBound(arr,9);
        System.out.println(ans);
    }
}
