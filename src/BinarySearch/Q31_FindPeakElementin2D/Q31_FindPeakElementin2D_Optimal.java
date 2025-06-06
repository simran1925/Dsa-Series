package BinarySearch.Q31_FindPeakElementin2D;

public class Q31_FindPeakElementin2D_Optimal
{
    public static int findMaxElement (int mat[][], int j)
    {
        int max= Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<mat.length;i++)
        {
            if(mat[i][j]>max)
            {
                max= mat[i][j];
                index= i;                }
        }
        return index;
    }
    public static int[] findPeakGrid(int[][] mat)
    {
        int start=0;
        int end = mat[0].length-1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            int row = findMaxElement(mat,mid) ;

            int left = mid-1>=0 ? mat[row][mid-1]: -1;
            int right = mid +1< mat[0].length ? mat[row][mid+1]: -1;

            if(mat[row][mid]> left && mat[row][mid]>right)
            {
                return new int[]{row,mid};
            }
            else if(right < mat[row][mid])
            {
                end = mid-1;
            }
            else {
                start= mid+1;
            }
        }
        return new int[] {-1,-1};

    }
    public static void main(String[] args) {
        int arr[][]= {{70,50,40,30,20},
                      {100,1,2,3,4}};
        int ans[] = findPeakGrid(arr);
        System.out.println("row index of peak element "+ ans[0] );
        System.out.println("col index of peak element "+ans[1] );
    }
}
