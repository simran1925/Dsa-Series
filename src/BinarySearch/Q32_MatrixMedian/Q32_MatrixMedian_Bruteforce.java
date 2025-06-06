package BinarySearch.Q32_MatrixMedian;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q32_MatrixMedian_Bruteforce
{
    public static int findMedian(int mat[][])
    {
        int n= mat.length;
        int m= mat[0].length;
        List<Integer> list= new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                list.add(mat[i][j]);
            }
        }
        Collections.sort(list);
        return list.get((n*m)/2) ;
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
