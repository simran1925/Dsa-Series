package BinarySearch.Q19_FindMinimumWeightToTransferInNDays;

public class Q18_FindMinimumWeightToTransferInNDays_Bruteforce
{
    public static int findForEachWeight(int arr[], int weight)
    {
        int totalDays=1;
        int sum =0;
        for(int i=0;i<arr.length;i++)
        {
            if(sum+arr[i]>weight)
            {
                totalDays++;
                sum=arr[i];
            }
            else {
                sum+=arr[i];
            }
        }
        return totalDays;
    }
    public static int findMinWeightToTransferInNDays(int arr[], int day)
    {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            max= Math.max(arr[i],max);
            sum+=arr[i];
        }
        for(int i=max;i<=sum;i++)
        {
            if(findForEachWeight(arr,i)<=day)
            {
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={5,4,5,2,3,4,5,6};
        int ans = findMinWeightToTransferInNDays(arr,5);
        System.out.println(ans);
    }
}
