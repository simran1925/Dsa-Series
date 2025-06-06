package BinarySearch.Q27_SearchIn2D;

import java.util.ArrayList;
import java.util.Arrays;

public class Q27_SearchIn2D_Bruteforce
{
    public static boolean findElement(ArrayList<ArrayList<Integer>> mat,int target)
    {
        for(int i=0;i<mat.size();i++)
        {
            for(int j=0;j<mat.get(0).size();j++)
            {
                if(mat.get(i).get(j)==target)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix= new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1,2,3)));
        matrix.add(new ArrayList<>(Arrays.asList(4,5,6)));
        matrix.add(new ArrayList<>(Arrays.asList(7,8,9)));
        boolean ans = findElement(matrix,10);
        System.out.println(ans);
    }
}
