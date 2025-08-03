package Recursion.Q10_PrintONESubsetWhoseSumIsK;

import java.util.ArrayList;
import java.util.List;

public class Q10_PrintONESubsetWhoseSumIsK_Optimal_Recursion
{
    public static List<Integer> subsets(int nums[], int k)
    {
        return findSubsets(nums,0,new ArrayList<>(),0,k);
    }

    public static List<Integer> findSubsets(int nums[],int i,List<Integer> current,int sum,int k)
    {
        if(i==nums.length)
        {
            if(sum==k)
            {
               return current;
            }
            return null;
        }

        current.add(nums[i]);
       List<Integer> left =  findSubsets(nums,i+1,current,sum+nums[i],k);
       if(left!=null)
       {
           return left;
       }
        current.remove(current.get(current.size()-1));
        List<Integer> right= findSubsets(nums,i+1,current,sum,k);
        if(right!=null)
        {
            return right;
        }
        return new ArrayList<>();
    }
    public static void main(String[] args) {
        int nums[]= {1,2,3};
        int k= 3;
        List<Integer> ans = subsets(nums,k);
        System.out.println(ans);
    }
}
