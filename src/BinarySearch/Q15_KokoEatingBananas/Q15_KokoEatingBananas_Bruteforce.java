package BinarySearch.Q15_KokoEatingBananas;

public class Q15_KokoEatingBananas_Bruteforce
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

        for(int i=1;i<=max;i++)
        {
            int ans=findEatingHourly(piles,i);
            if(ans<=h)
            {
                return i;
            }
        }
        return max;

    }
    public static void main(String[] args) {
        int arr[]={3,6,7,11};
int ans= minEatingSpeed(arr,8);
        System.out.println(ans);
    }
}
