package Recursion.Q16_Subset_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q16_Subset_2_Optimal
{
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        Arrays.sort(nums);
        return findSubsetsWithDup(nums,0,new ArrayList<>(),result);
    }
    public static List<List<Integer>> findSubsetsWithDup(int[] nums,int i, List<Integer> current, List<List<Integer>> result)
    {
        result.add(new ArrayList<>(current));

        for(int j=i;j<nums.length;j++)
        {
            if(j>i && nums[j]==nums[j-1])
            {
                continue;
            }

            current.add(nums[j]);
            findSubsetsWithDup(nums,j+1,current,result);
            current.remove(current.get(current.size()-1));
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[]= {1,2,2};
        List<List<Integer>> ans = subsetsWithDup(nums);
        System.out.println(ans);
    }

}
