package Arrays.Medium.Q28_SubarraySumCount;

public class Q28_SubarraySumCount_Bruteforce
{
    public static int subarraySum(int arr[],int target)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum+=arr[k];
                }
                if(target==sum)
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3};
//        int arr[]= {3, 1, 2, 4};
//        int ans= subarraySum(arr,6);
        int ans= subarraySum(arr,3);
        System.out.println(ans);
    }
}
