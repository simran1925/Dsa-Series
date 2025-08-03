package Recursion.Q11_PrintCountOfSubsetsWhoseSumIsK;

import java.util.ArrayList;
import java.util.List;

public class Q11_PrintCountOfSubsetsWhoseSumIsK_Recursion_Optimal
{
    public static int subsets(int nums[], int k)
    {
        return findSubsets(nums,0,new ArrayList<>(),0,k);
    }

    public static int findSubsets(int nums[],int i,List<Integer> current,int sum,int k)
    {
        if(i==nums.length)
        {
            return sum==k?1:0;
        }

        current.add(nums[i]);
        int left =  findSubsets(nums,i+1,current,sum+nums[i],k);
        current.remove(current.get(current.size()-1));
        int right= findSubsets(nums,i+1,current,sum,k);
        return left+right;
    }
    public static void main(String[] args) {
        int nums[]= {1,2,3};
        int k= 3;
      int ans = subsets(nums,k);
        System.out.println(ans);
    }
}
