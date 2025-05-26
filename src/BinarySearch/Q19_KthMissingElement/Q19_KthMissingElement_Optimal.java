package BinarySearch.Q19_KthMissingElement;

public class Q19_KthMissingElement_Optimal
{
    public static int findKthPositive(int[] arr, int k) {
        int s=0;
        int e= arr.length-1;
        while(s<=e){
            int mid = (s+e)/2;
            int missing = arr[mid]-(mid+1);
            if(missing<k)
            {
                s=mid+1;
            }
            else
            {
                e=mid-1;
            }
        }
        return k+e+1;
    }

    public static void main(String[] args) {
        int arr[]={2,3,4,7,11};
        int k=5;
        int ans = findKthPositive(arr,k);
        System.out.println(ans);
    }
}
