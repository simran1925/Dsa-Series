package BinarySearch.Q26_FindRowWithMaxNoOfOne;

import java.util.ArrayList;
import java.util.Arrays;

public class Q26_FindRowWithMaxNoOfOne_Bruteforce
{
    public static int findMaxOne(ArrayList<ArrayList<Integer>> mat)
    {
        int index=-1;
        int maxOne=0;
        for(int i=0;i<mat.size();i++)
        {
            int countOne=0;
            for(int j=0;j<mat.get(0).size();j++)
            {
                if(mat.get(i).get(j)==1)
                {
                    countOne++;
                }
            }
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
