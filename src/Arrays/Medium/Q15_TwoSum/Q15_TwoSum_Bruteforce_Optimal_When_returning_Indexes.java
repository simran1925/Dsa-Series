package Arrays.Medium.Q15_TwoSum;

public class Q15_TwoSum_Bruteforce_Optimal_When_returning_Indexes
{
    public static boolean twoSum(int arr[],int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+ arr[j]==target)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        int arr[]= {2,9,3,4};
        int target=4;
        boolean ans= twoSum(arr,target);
        System.out.println(ans);
    }
}
