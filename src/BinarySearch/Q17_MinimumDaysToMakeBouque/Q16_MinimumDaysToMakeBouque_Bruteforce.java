package BinarySearch.Q17_MinimumDaysToMakeBouque;

public class Q16_MinimumDaysToMakeBouque_Bruteforce
{
    public static int calculatePossibleFlowers(int arr[],int day,int m,int k)
    {
        if(m*k > arr.length)
        {
            return -1;
        }
        int totalBouque=0;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=day)
            {
                count++;
            }
            else
            {
                totalBouque+=count/k;
                count=0;
            }
        }
        totalBouque+=count/k;
        return totalBouque;
    }
    public static int minDays(int[] bloomDay, int m, int k) {
        int min= Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++)
        {
            min= Math.min(min,bloomDay[i]);
            max= Math.max(max,bloomDay[i]);
        }
        for(int i=min;i<=max;i++)
        {
            if(calculatePossibleFlowers(bloomDay,i,m,k)>=m)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]= {1,10,3,10,2};
        int k= 1;
        int m=3;
        int ans =  minDays(arr,m,k);
        System.out.println(ans);

    }
}
