package BinarySearch.Q20_KthMissingElement;

public class Q19_KthMissingElement_Bruteforce
{
    public static int findKthPositive(int[] arr, int k) {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=k)
            {
                k++;
            }
            else
            {
                break;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int arr[]={2,3,4,7,11};
        int k=5;
        int ans = findKthPositive(arr,k);
        System.out.println(ans);
    }
}
