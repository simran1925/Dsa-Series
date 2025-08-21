package Recursion.Q13_CombinitionSum;

import java.util.ArrayList;
import java.util.List;

public class Q13_CombinitionSum_Recursion
{
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        return findCombinationSum(candidates,target,0,new ArrayList<>(),result);
    }

    public static List<List<Integer>> findCombinationSum(int[] candidates,int target,int i, List<Integer> current,List<List<Integer>> result)
    {
        if(i==candidates.length)
        {
            if(target==0)
            {
                result.add(new ArrayList<>(current));
            }
            return result;
        }

        current.add(candidates[i]);
        if(candidates[i]<=target)
        {
            findCombinationSum(candidates,target-candidates[i],i,current,result);
        }
        current.remove(current.get(current.size()-1));

        findCombinationSum(candidates,target,i+1,current,result);
        return result;
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3};
        List<List<Integer>> res = combinationSum(arr,7);
        System.out.println(res);
    }
}
