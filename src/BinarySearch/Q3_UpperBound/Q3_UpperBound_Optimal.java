package BinarySearch.Q3_UpperBound;

public class Q3_UpperBound_Optimal
{
    public static int upperBound(int arr[], int x)
    {
       int start=0;
       int end = arr.length-1;
       int ans= arr.length;
       while(start<=end)
       {
           int mid= (start+end)/2;
           if(arr[mid]>x)
           {
               ans= mid;
               end= mid-1;
           }
           else {
               start= mid+1;
           }
       }
        return ans;
    }
    public static void main(String[] args) {
//        int arr[]= {1,2,2,3};
        int arr[]= {3,5,8,9,15,19};
//        int ans = lowerBound(arr,2);
        int ans = upperBound(arr,9);
        System.out.println(ans);
    }
}
