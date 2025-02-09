package Arrays.Easy.Q11_MaximumConsecutiveOnes;

public class Q11_MaximumConsecutiveOnes_Optimal
{
    public static int maximumConsecutiveOnes(int arr[])
    {
        int count=0;
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                count++;
            }
            else
            {
                count=0;
            }
            max= Math.max(count,max);
        }
        return max;
    }
    public static void main(String[] args)
    {
        int arr[]={0};
        int ans= maximumConsecutiveOnes(arr);
        System.out.println(ans);
    }
}
