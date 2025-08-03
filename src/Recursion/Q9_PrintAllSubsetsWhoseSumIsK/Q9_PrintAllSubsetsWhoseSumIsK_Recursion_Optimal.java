package Recursion.Q9_PrintAllSubsetsWhoseSumIsK;

import java.util.ArrayList;
import java.util.List;

public class Q9_PrintAllSubsetsWhoseSumIsK_Recursion_Optimal
{
    public static List<List<Integer>> subsets(int nums[],int k)
    {
        List<List<Integer>> result = new ArrayList<>();
        return findSubsets(nums,result,0,new ArrayList<>(),0,k);
    }

    public static List<List<Integer>> findSubsets(int nums[],List<List<Integer>> result,int i,List<Integer> current,int sum,int k)
    {
         if(i==nums.length)
         {
             if(sum==k)
             {
                 result.add(new ArrayList<>(current));
             }
             return result;
         }

         current.add(nums[i]);
         findSubsets(nums,result,i+1,current,sum+nums[i],k);
         current.remove(current.get(current.size()-1));
         findSubsets(nums,result,i+1,current,sum,k);
         return result;
    }
    public static void main(String[] args) {
          int nums[]= {1,2,3};
          int k= 3;
          List<List<Integer>> ans = subsets(nums,k);
        System.out.println(ans);
    }
}
