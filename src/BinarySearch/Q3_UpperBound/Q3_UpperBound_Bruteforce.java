package BinarySearch.Q3_UpperBound;

public class Q3_UpperBound_Bruteforce
{
    public static int upperBound(int arr[], int x)
    {
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]>x)
           {
               return i;
           }
       }
        return -1;
    }
    public static void main(String[] args) {
//        int arr[]= {1,2,2,3};
        int arr[]= {3,5,8,9,15,19};
//        int ans = lowerBound(arr,2);
        int ans = upperBound(arr,9);
        System.out.println(ans);
    }
}
