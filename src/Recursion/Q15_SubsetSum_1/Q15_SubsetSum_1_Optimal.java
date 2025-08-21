package Recursion.Q15_SubsetSum_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q15_SubsetSum_1_Optimal
{
    public static List<Integer> subsetSum(int arr[])
    {
        List<Integer> result = new ArrayList<>();

        return findSubsetsSum(arr,0,0,result);
    }
    public static List<Integer> findSubsetsSum(int arr[], int i, int sum,List<Integer>result)
    {
        if(i==arr.length)
        {
            result.add(sum);
            Collections.sort(result);
            return result;
        }


        findSubsetsSum(arr,i+1,sum+ arr[i],result);
        findSubsetsSum(arr,i+1,sum,result);
        return result;
    }
    public static void main(String[] args) {

        int arr[]= {5,2,1};
        List<Integer> ans =subsetSum(arr);
        System.out.println(ans);
    }
}
