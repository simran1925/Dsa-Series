package BinarySearch.Q20_AggressiveCows;

public class Q20_AggressiveCows_Bruteforce
{
    public static boolean isMinDistancePossible(int arr[], int distance, int cow)
    {
        int lastCow= arr[0];
        int countCows=1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]-lastCow>=distance)
            {
                countCows++;
                lastCow=arr[i];
            }
            if(countCows>=cow)
            {
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
        for(int i=min;i<=max;i++)
        {
            if(isMinDistancePossible(stalls,i,k)==true)
            {
                continue;
            }
            else {
                return i-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       int arr[]={0, 3, 4, 7, 10, 9};
       int k=4;
       int ans = findMaxOfMinDistance(arr,k);
        System.out.println(ans);
    }
}
