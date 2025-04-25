package Arrays.Hard.Q36_MergeTwoSortedArrays;

import java.util.Arrays;

public class Q36_MergeTwoSortedArrays_Optimal
{
    //    if in question there is this line it means we have to merge the array into first array :--
//    The final sorted array should not be returned by the function, but instead be
//    stored inside the array nums1. To accommodate this, nums1 has a length of m + n,
//    where the first m elements denote the elements that should be merged, and the last
//    n elements are set to 0 and should be ignored. nums2 has a length of n.

    //for this the solution is the below
    public static void merge(int[] nums1, int m, int[] nums2, int n)
    {
        int i=m-1;
        int j=n-1;
        int k=(m+n)-1;
        while(i>=0 && j>=0)
        {
            if(nums1[i]>nums2[j])
            {
                nums1[k--]=nums1[i--];
            }
            else
            {
                nums1[k--]=nums2[j--];
            }
        }

        //if any element of nums2 is left
        while(j>=0)
        {
            nums1[k--]=nums2[j--];
        }
    }

    //2nd version
//    but if we want to separate the arrays after being merged and sort them
//    then we can use below method:--
    public static void mergeSecondMethod(int[] arr1, int m, int[] arr2, int n)
    {
        // Declare 2 pointers:
        int left = n - 1;
        int right = 0;

        // Swap the elements until arr1[left] is
        // smaller than arr2[right]:
        while (left >= 0 && right < m) {
            if (arr1[left] > arr2[right]) {
                int temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            } else {
                break;
            }
        }

        // Sort arr1[] and arr2[] individually:
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void main(String[] args) {

//        ans for first version
        int[] arr1 = {1, 4, 8, 10,0,0,0};    //three zeroes means extra space so that after merging we can use this array to return elements
        int[] arr2 = {2, 3, 9};
        int n = 4, m = 3;
        merge(arr1,n,arr2,m);
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();

        //ans for second version
        int[] nums1 = {1, 4, 8, 10};
        int[] nums2 = {2, 3, 9};
        int arr1length = 4, arr2length = 3;
        mergeSecondMethod(nums1, arr1length,nums2, arr2length);
        System.out.println("The merged arrays are:");
        System.out.print("nums1[] = ");
        for (int i = 0; i < arr1length; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.print("\nnums2[] = ");
        for (int i = 0; i < arr2length; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
    }
}
