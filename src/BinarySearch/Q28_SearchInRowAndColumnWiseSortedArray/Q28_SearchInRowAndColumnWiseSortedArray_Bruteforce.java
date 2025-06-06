package BinarySearch.Q28_SearchInRowAndColumnWiseSortedArray;

import java.util.ArrayList;

public class Q28_SearchInRowAndColumnWiseSortedArray_Bruteforce
{
    public static boolean findElement(int mat[][], int target)
    {
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==target)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[][]= {{1,2,3},{2,15,17},{5,18,20}};
        int target= 5;

        boolean ans =findElement(arr,target);
        System.out.println(ans);
    }
}
