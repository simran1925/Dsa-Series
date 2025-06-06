package BinarySearch.Q25_FindKthElementOfTwoSortedArrays;

public class Q25_FindKthElementOfTwoSortedArrays_Bruteforce
{
    public static int findKthElement(int arr1[], int arr2[],int l)
    {
        int n= arr1.length+arr2.length;
        int i=0,j=0,k=0;
        int arr3[]= new int[n];
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                arr3[k++]= arr1[i++];
            }
            else {
                arr3[k++]=arr2[j++];
            }
        }
        while(i<arr1.length)
        {
            arr3[k++]=arr1[i++];
        }
        while(j<arr2.length)
        {
            arr3[k++]=arr2[j++];
        }

        return arr3[l-1];    //because index is starting from 0 (we would find from starting from 0th index which would be the 5th element)
    }
    public static void main(String[] args) {
     int arr1[]={2,3,6,7,9};
     int arr2[]={1,4,8,10};
     int k=5;    //it has not given index
     int ans = findKthElement(arr1,arr2,k);
        System.out.println(ans);
    }
}
