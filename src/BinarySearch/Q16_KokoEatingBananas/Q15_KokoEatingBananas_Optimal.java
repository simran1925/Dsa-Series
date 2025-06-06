package BinarySearch.Q16_KokoEatingBananas;

public class Q15_KokoEatingBananas_Optimal
{
    public static int findEatingHourly(int arr[], int hourly)
    {
        int totalHours=0;
        for(int i=0;i<arr.length;i++)
        {
            totalHours+=(int)Math.ceil((double)arr[i]/(double)hourly);
        }
        return totalHours;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++)
        {
            max= Math.max(max,piles[i]);
        }
        int s=1;
        int e= max;
        while (s<=e)
        {
            int mid = (s+e)/2;
            if(findEatingHourly(piles,mid)<=h)
            {
                e=mid-1;
            }
            else {
                s=mid+1;
            }
        }
        return s;


    }
    public static void main(String[] args) {
        int arr[]={3,6,7,11};
        int ans= minEatingSpeed(arr,8);
        System.out.println(ans);
    }
}
