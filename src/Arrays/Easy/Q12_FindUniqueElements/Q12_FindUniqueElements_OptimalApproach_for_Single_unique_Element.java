package Arrays.Easy.Q12_FindUniqueElements;

public class Q12_FindUniqueElements_OptimalApproach_for_Single_unique_Element
{
    public static int findUnique(int arr[])
    {
        int xor=0;
        for(int i=0;i<arr.length;i++)
        {
            xor= xor^arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int[] arr= {1,4,5,1,2,2};
        int ans= findUnique(arr);
        System.out.println(ans);
    }
}
