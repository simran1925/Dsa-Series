package Recursion.Q17_CombinationSum_3;

import java.util.ArrayList;
import java.util.List;

public class Q17_CombinationSum_3_Optimal
{
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> nums= new ArrayList<>();
        for(int i=1;i<=9;i++)
        {
            nums.add(i);
        }

        List<List<Integer>> result = new ArrayList<>();
        return findCombinationSum3(nums,0,result,n,new ArrayList<>(),k);
    }

    public static List<List<Integer>> findCombinationSum3(List<Integer> nums, int index, List<List<Integer>> result,int target,List<Integer> current,int k)
    {

        if(target==0 && k==current.size())
        {
            result.add(new ArrayList<>(current));
            return result;
        }

        for(int i=index;i<nums.size();i++)
        {
            if(target<nums.get(i) &&  k<current.size())
            {
                break;
            }
            current.add(nums.get(i));
            findCombinationSum3(nums,i+1,result,target-nums.get(i),current,k);
            current.remove(current.get(current.size()-1));
        }
        return result;

    }

    public static void main(String[] args) {
        int k=3;int n=7;
        List<List<Integer>> ans = combinationSum3(k,n);
        System.out.println(ans);
    }
}
