package BinarySearch.Q20_AggressiveCows;

public class Q20_AggressiveCows_Optimal
{
    public static boolean isMinDistancePossible(int arr[], int distance, int cow)
    {
        int totalCows=1;
        int lastCow=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]-lastCow>=distance)
            {
                totalCows++;
                lastCow=arr[i];
            }
            if (totalCows >= cow) {
                return true;
            }
        }
        return false;
    }
    public static int findMaxOfMinDistance(int stalls[], int k)
    {
        int min=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<stalls.length;i++)
        {
            max= Math.max(max,stalls[i]);
        }
        int start=min;
        int end= max;
        while(start<=end)
        {
            int mid = start+ (end-start)/2;
            if(isMinDistancePossible(stalls,mid,k)==true)
            {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return end;

    }
    public static void main(String[] args) {
        int arr[]={0, 3, 4, 7, 10, 9};
        int k=4;
        int ans = findMaxOfMinDistance(arr,k);
        System.out.println(ans);
    }
}
