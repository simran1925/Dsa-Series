package BinarySearch.Q24_FindMedianOfTwoSortedArrays;

public class Q24_FindMedianOfTwoSortedArrays_Bruteforce
{
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums[]= new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j])
            {
                nums[k++]=nums1[i++];
            }
            else
            {
                nums[k++]= nums2[j++];
            }
        }
        while(i<nums1.length)
        {
            nums[k++]= nums1[i++];
        }
        while(j<nums2.length)
        {
            nums[k++]=nums2[j++];
        }
        int median= (nums1.length+nums2.length)/2;
        System.out.println();
        for(int l=0;l<nums.length;l++)
        {
            System.out.print(nums[l]+ " ");
        }
        System.out.println(median);
        if(nums.length%2==1)
        {
            System.out.println(nums[median]);
            return (double)nums[median] ;
        }

        return ((double) nums[median] + (double)nums[median- 1])/2.0;
    }

    public static void main(String[] args) {
        int arr1[]={1,3};
        int arr2[]={2};
        double ans = findMedianSortedArrays(arr1,arr2);
        System.out.println(ans);
    }
}
