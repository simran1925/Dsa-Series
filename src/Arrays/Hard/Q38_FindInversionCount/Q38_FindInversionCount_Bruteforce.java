package Arrays.Hard.Q38_FindInversionCount;

public class Q38_FindInversionCount_Bruteforce
{
    public static int findInversionCount(int arr[])
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j= i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]= {5, 4, 3, 2, 1};
        int ans= findInversionCount(arr);
        System.out.println(ans);
    }
}
