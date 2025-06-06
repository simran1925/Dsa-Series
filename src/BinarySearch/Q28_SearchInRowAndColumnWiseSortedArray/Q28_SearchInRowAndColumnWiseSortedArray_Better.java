package BinarySearch.Q28_SearchInRowAndColumnWiseSortedArray;

import java.util.ArrayList;

public class Q28_SearchInRowAndColumnWiseSortedArray_Better
{
    public static boolean searchElementInColumns( int arr[], int target)
    {
        int start = 0;
        int end= arr.length;
        while(start<=end)
        {
            int mid= start+ (end-start)/2;
            if(arr[mid]==target)
            {
                return true;
            }
            else if(arr[mid]> target)
            {
                end = mid-1;
            }
            else {
                start= mid+1;
            }
        }
        return false;
    }
    public static boolean findElement(int mat[][], int target)
    {
        for(int i=0;i< mat.length;i++)
        {
            if(mat[i][0]<=target && target<= mat[i][mat[0].length-1])
            {
                return searchElementInColumns(mat[i],target);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[][]= {{1,2,3},{2,15,17},{5,18,20}};
        int target= 100;

        boolean ans =findElement(arr,target);
        System.out.println(ans);
    }
}
