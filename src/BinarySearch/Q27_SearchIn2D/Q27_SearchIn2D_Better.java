package BinarySearch.Q27_SearchIn2D;

import java.util.ArrayList;
import java.util.Arrays;

public class Q27_SearchIn2D_Better
{
    public static boolean searchElementInColumns(ArrayList<Integer> arr,int target)
    {
        int start = 0;
        int end= arr.size();
        while(start<=end)
        {
            int mid= start+ (end-start)/2;
            if(arr.get(mid)==target)
            {
                return true;
            }
            else if(arr.get(mid)> target)
            {
                end = mid-1;
            }
            else {
                start= mid+1;
            }
        }
        return false;
    }
    public static boolean findElement(ArrayList<ArrayList<Integer>> mat, int target)
    {
        for(int i=0;i<mat.size();i++)
        {
            if(mat.get(i).get(0)<=target && target<= mat.get(i).get(mat.get(0).size()-1))
            {
                return searchElementInColumns(mat.get(i),target);
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
