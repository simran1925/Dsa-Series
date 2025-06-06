package BinarySearch.Q27_SearchIn2D;

import java.util.ArrayList;
import java.util.Arrays;

public class Q27_SearchIn2D_Optimal
{
    public static boolean findElement(ArrayList<ArrayList<Integer>> mat, int target)
    {
        int n= mat.size();
        int m= mat.get(0).size();

        int start=0;
        int end = m*n -1;

        while (start<=end)
        {
            int mid = start+ (end-start)/2;
            int row = mid/m , col = mid%m;
            if(mat.get(row).get(col)==target)
            {
                return true;
            }
            else if( mat.get(row).get(col)> target)
            {
                end = mid-1;
            }
            else {
                start= mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix= new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1,2,3)));
        matrix.add(new ArrayList<>(Arrays.asList(4,5,6)));
        matrix.add(new ArrayList<>(Arrays.asList(7,8,9)));
        boolean ans = findElement(matrix,5);
        System.out.println(ans);
    }
}
