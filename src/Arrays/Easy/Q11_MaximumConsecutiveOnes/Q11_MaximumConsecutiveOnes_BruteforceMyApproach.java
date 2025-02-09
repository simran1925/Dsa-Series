package Arrays.Easy.Q11_MaximumConsecutiveOnes;

public class Q11_MaximumConsecutiveOnes_BruteforceMyApproach
{
    public static int maximumConsecutiveOnes(int arr[])
    {
        int max=0;
        int count=0;

        if(arr.length==0 || arr.length==1)
        {
            return 0;
        }
        for(int i=0;i<arr.length-1;i++)
        {

            if((arr[i] ==1 && arr[i+1]==1))
            {
                count++;
            }
            if(arr[i]!=arr[i+1])
            {
                max= Math.max(max,count);
                count=1;
            }
        }
        return Math.max(max,count);
    }
    public static void main(String[] args)
    {
        int arr[]={1};
       int ans= maximumConsecutiveOnes(arr);
        System.out.println(ans);
    }
}
