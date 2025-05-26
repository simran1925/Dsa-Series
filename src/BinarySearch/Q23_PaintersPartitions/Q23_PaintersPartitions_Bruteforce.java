package BinarySearch.Q23_PaintersPartitions;

public class Q23_PaintersPartitions_Bruteforce
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

        for(int i=max;i<=sum;i++)
        {
            if(doPartitions(arr,i)==k)
            {
                return i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]= {10, 20, 30, 40};
        int k=2;
        int ans = findPartitions(arr,k);
        System.out.println(ans);
    }
}
