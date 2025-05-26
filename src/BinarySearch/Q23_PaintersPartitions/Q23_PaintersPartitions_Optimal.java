package BinarySearch.Q23_PaintersPartitions;

public class Q23_PaintersPartitions_Optimal
{
    public static int doPartitions(int arr[],int painter)
    {
        int totalPartitions=1;
        int studentSum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]+ studentSum<=painter)
            {
                studentSum+=arr[i];
            }
            else {
                studentSum=arr[i];
                totalPartitions++;
            }
        }
        return totalPartitions;
    }
    public static int findPartitions(int arr[], int k)
    {
        int max= Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            max=Math.max(max,arr[i]);
            sum+=arr[i];
        }
        int s=max;
        int e = sum;
       while (s<=e)
       {
           int mid= s+(e-s)/2;
           if(doPartitions(arr,mid)>k)
           {
               s=mid+1;
           }
           else {
               e=mid-1;
           }
       }
       return s;
    }
    public static void main(String[] args) {
        int arr[]= {10, 20, 30, 40};
        int k=2;
        int ans = findPartitions(arr,k);
        System.out.println(ans);
    }
}
