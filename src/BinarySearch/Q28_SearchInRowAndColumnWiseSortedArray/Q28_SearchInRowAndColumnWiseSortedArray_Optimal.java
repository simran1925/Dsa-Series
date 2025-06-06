package BinarySearch.Q28_SearchInRowAndColumnWiseSortedArray;

public class Q28_SearchInRowAndColumnWiseSortedArray_Optimal
{
    public static boolean findElement(int mat[][], int target)
    {
        int row= 0;
        int col= mat[0].length-1;
        while (row<mat.length && col>=0)
        {

          if(mat[row][col]==target)
          {
              return true;
          }
          else if(mat[row][col]>target)
          {
              col--;
          }
          else {
              row++;
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
