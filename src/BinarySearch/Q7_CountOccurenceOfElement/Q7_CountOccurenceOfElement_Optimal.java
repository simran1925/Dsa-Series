package BinarySearch.Q7_CountOccurenceOfElement;

public class Q7_CountOccurenceOfElement_Optimal
{
    public static int findFirstOccurence(int arr[], int target)
    {
        int s=0;
        int e= arr.length-1;
        int ans=-1;
        while(s<=e)
        {
            int mid = (s+e)/2;
            if(arr[mid]==target)
            {
                ans= mid;
                e= mid-1;
            }
            else if(arr[mid]<target)
            {
                s= mid+1;
            }
            else {
                e= mid-1;
            }
        }
        return ans;
    }
    public static int findLastOccurence(int arr[],int target)
    {
        int s=0;
        int e= arr.length-1;
        int ans=-1;
        while(s<=e)
        {
            int mid = (s+e)/2;
            if(arr[mid]==target)
            {
                ans= mid;
                s=mid+1;
            }
            else if(arr[mid]<target)
            {
                s= mid+1;
            }
            else {
                e= mid-1;
            }
        }
        return ans;
    }

    public static int findCountOccurence(int arr[], int target)
    {
       int firstOcc= findFirstOccurence(arr,target);
       int lastOcc= findLastOccurence(arr,target);
       if(firstOcc==-1)
       {
           return 0;
       }
       return lastOcc-firstOcc+1;
    }
    public static void main(String[] args) {
        int arr[]= {2, 2 , 3 , 3 , 3 , 3 , 4};
        int ans = findCountOccurence(arr,3);
        System.out.println(ans);
    }
}
