package BinarySearch.Q25_FindKthElementOfTwoSortedArrays;

public class Q25_FindKthElementOfTwoSortedArrays_Optimal
{
    public static int findKthElement(int arr1[], int arr2[],int k)
    {

        //Everything is same as median just two things are changed:
//        1. left value's calculation is different here
//        2. start and end value's calculation is different here
//        3. and returning method is different
        int n= arr1.length+arr2.length;
        int n1= arr1.length;
        int n2= arr2.length;
        if(n1>n2)
        {
            return findKthElement(arr2, arr1, k);
        }
        int left=k;
        int start= Math.max(0, k-n2);
        int end= Math.min(k,n1);

        while (start<=end)
        {
            int mid1= (start+end)/2;
            int mid2 = left-mid1;

            int l1 = mid1>0 ? arr1[mid1-1]: Integer.MIN_VALUE;
            int l2= mid2>0 ? arr2[mid2-1]: Integer.MIN_VALUE;
            int r1= mid1<n1 ? arr1[mid1]: Integer.MAX_VALUE;
            int r2= mid2<n2 ? arr2[mid2]: Integer.MAX_VALUE;
            if(l1<=r2 && l2<=r1)
            {
                return Math.max(l1,l2);
            }
            else if(l1>r2)
            {
                start= mid1+1;
            }
            else {
                end= mid1-1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr1[]={2,3,6,7,9};
        int arr2[]={1,4,8,10};
        int k=5;    //it has not given index
        int ans = findKthElement(arr1,arr2,k);
        System.out.println(ans);
    }
}
