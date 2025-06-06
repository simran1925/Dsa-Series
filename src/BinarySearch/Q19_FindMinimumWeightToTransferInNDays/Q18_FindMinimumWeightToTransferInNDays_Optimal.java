package BinarySearch.Q19_FindMinimumWeightToTransferInNDays;

public class Q18_FindMinimumWeightToTransferInNDays_Optimal
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
        int s=max;
        int e= sum;

        while(s<=e)
        {
            int mid= s+ (e-s)/2;
            if(findForEachWeight(arr,mid)<=day)
            {
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }


        }
        if(s>sum)
        {
            return -1;
        }
        return s;
    }
    public static void main(String[] args) {
        int arr[]={5,4,5,2,3,4,5,6};
        int ans = findMinWeightToTransferInNDays(arr,5);
        System.out.println(ans);
    }
}
