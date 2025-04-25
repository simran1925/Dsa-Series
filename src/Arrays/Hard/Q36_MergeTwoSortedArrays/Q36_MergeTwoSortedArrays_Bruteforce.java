package Arrays.Hard.Q36_MergeTwoSortedArrays;

public class Q36_MergeTwoSortedArrays_Bruteforce
{
//    if in question there is this line it means we have to merge the array into first array :--
//    The final sorted array should not be returned by the function, but instead be
//    stored inside the array nums1. To accommodate this, nums1 has a length of m + n,
//    where the first m elements denote the elements that should be merged, and the last
//    n elements are set to 0 and should be ignored. nums2 has a length of n.

    //for this the solution is the below
    public static void merge(int[] nums1, int m, int[] nums2, int n)
    {
        int merged[]= new int[n+m];
        int i=0,j=0,x=0;
        while(i<m && j<n)
        {
            if(nums1[i]<=nums2[j])
            {
                merged[x]=nums1[i];
                i++;
                x++;
            }
            else
            {
                merged[x]=nums2[j];
                j++;
                x++;
            }
        }

        while(i<m)
        {
            merged[x]= nums1[i];
            i++;
            x++;
        }
        while(j<n)
        {
            merged[x]= nums2[j];
            j++;
            x++;
        }

        for(int index=0;index<merged.length;index++)
        {
            nums1[index]=merged[index];

            //  else
            //  {
            //     nums2[index-m]=merged[index];
            //  }
        }

    }

    //2nd version
//    but if we want to separate the arrays after being merged and sort them
//    then we can use below method:--
    public static void mergeSecondMethod(int[] nums1, int m, int[] nums2, int n)
    {
        int merged[]= new int[n+m];
        int i=0,j=0,x=0;
        while(i<m && j<n)
        {
            if(nums1[i]<=nums2[j])
            {
                merged[x]=nums1[i];
                i++;
                x++;
            }
            else
            {
                merged[x]=nums2[j];
                j++;
                x++;
            }
        }

        while(i<m)
        {
            merged[x]= nums1[i];
            i++;
            x++;
        }
        while(j<n)
        {
            merged[x]= nums2[j];
            j++;
            x++;
        }

        for(int index=0;index<merged.length;index++)
        {
            if(index<m)
            {
                nums1[index]=merged[index];
            }
              else
              {
                 nums2[index-m]=merged[index];
              }
        }

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
