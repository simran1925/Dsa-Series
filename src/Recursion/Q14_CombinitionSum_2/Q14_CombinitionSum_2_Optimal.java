package Recursion.Q14_CombinitionSum_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q14_CombinitionSum_2_Optimal
{
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        return findCombinationSum2(candidates,target,0,new ArrayList<>(),result);

    }
    public static List<List<Integer>> findCombinationSum2(int[] candidates,int target, int i, List<Integer>        current,List<List<Integer>> result)
    {
        if(target==0)
        {
            result.add(new ArrayList<>(current));
        }

        for(int j=i;j<candidates.length;j++)
        {
            if(j>i && candidates[j]==candidates[j-1])
            {
                continue;
            }
            if(candidates[j]>target)
            {
                break;
            }
            current.add(candidates[j]);
            findCombinationSum2(candidates,target-candidates[j],j+1,current,result);
            current.remove(current.get(current.size()-1));
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[]= {1,2,3};
        List<List<Integer>> res = combinationSum2(arr,3);
        System.out.println(res);
    }
}
