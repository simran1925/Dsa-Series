package BinarySearch.Q32_MatrixMedian;

public class Q32_MatrixMedian_Optimal
{
    public static int findUpperBound(int []arr, int m,int x){
          int s=0;
          int e = m-1;
          int ans = m;
          while (s<=e)
          {
              int mid = s+ (e-s)/2;
              if(arr[mid]>x)
              {
                  ans= mid;
                  e= mid-1;
              }
              else {
                  s= mid+1;
              }
          }
          return ans;
    }

    //counting from oth row to nth row
    public static int countSmallEqual(int [][]mat, int n, int m,int x)
    {
           int count=0;
           for(int i=0;i<n;i++)
           {
               count+=findUpperBound(mat[i],m, x);
           }
           return count;
    }
    public static int findMedian(int mat[][])
    {
        int n= mat.length;
        int m= mat[0].length;
        int start =Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;

        for(int i=0;i<mat.length;i++)
        {
            start= Math.min(mat[i][0],start);
            end= Math.max(mat[i][m-1],end);
        }
        int req= (n*m)/2;
        while(start<=end)
        {
            int mid= start+ (end-start)/2;
            int smallEqual= countSmallEqual(mat,n,m,mid);
            if(smallEqual<=req)
            {
                start= mid+1;
            }
            else {
                end= mid-1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {8, 9, 11, 12, 13},
                {21, 23, 25, 27, 29}
        };
        int ans = findMedian(matrix);
        System.out.println(ans);
    }
}
