package BinarySearch.Q26_FindRowWithMaxNoOfOne;

import java.util.ArrayList;
import java.util.Arrays;

public class Q26_FindRowWithMaxNoOfOne_Optimal
{
    public static int findCount(ArrayList<Integer> arr, int x)
    {
        int start=0;
        int end=arr.size()-1;
        int ans = arr.size();
        while (start<=end)
        {
            int mid = start+ (end-start)/2;
            if(x<=arr.get(mid))
            {
                ans = mid;
                end= mid-1;
            }
            else {
                start= mid+1;
            }
        }
        return ans;
    }
    public static int findMaxOne(ArrayList<ArrayList<Integer>> mat)
    {
        int index=-1;
        int maxOne=0;
        for(int i=0;i<mat.size();i++)
        {
            int countOne= mat.get(0).size()-findCount(mat.get(i),1);
            if(countOne>maxOne)
            {
                maxOne=countOne;
                index=i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix= new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(0,1,1)));
        matrix.add(new ArrayList<>(Arrays.asList(0,0,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
        int ans = findMaxOne(matrix);
        System.out.println(ans);
    }
}
