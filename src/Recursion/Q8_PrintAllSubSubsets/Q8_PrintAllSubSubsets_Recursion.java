package Recursion.Q8_PrintAllSubSubsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q8_PrintAllSubSubsets_Recursion
{

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        return findSubsets(nums,new ArrayList<>(),0,result);

    }

    public static List<List<Integer>> findSubsets(int [] nums, List<Integer> current,int i,List<List<Integer>> result)
    {
        if(nums.length==i)
        {
            result.add(new ArrayList<>(current));
            return result;
        }

        current.add(nums[i]);
        findSubsets(nums,current,i+1,result);
        current.remove(current.get(current.size()-1));
        findSubsets(nums,current,i+1,result);
        return result;
    }
    public static void main(String[] args) {
        int list[] = {1,2,3};
         List<List<Integer>> ans = subsets(list);
        System.out.println(ans);
    }
}
