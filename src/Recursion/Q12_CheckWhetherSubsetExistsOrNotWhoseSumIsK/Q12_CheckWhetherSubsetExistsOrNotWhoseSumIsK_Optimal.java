package Recursion.Q12_CheckWhetherSubsetExistsOrNotWhoseSumIsK;

import java.util.ArrayList;
import java.util.List;

public class Q12_CheckWhetherSubsetExistsOrNotWhoseSumIsK_Optimal
{
    public static boolean subsets(int nums[], int k)
    {
        return findSubsets(nums,0,new ArrayList<>(),0,k);
    }

    public static boolean findSubsets(int nums[], int i, List<Integer> current, int sum, int k)
    {
        if(i==nums.length)
        {
            return sum==k?true:false;
        }

        current.add(nums[i]);
        if(findSubsets(nums, i + 1, current, sum + nums[i], k))
        {
            return true;
        }
        current.remove(current.get(current.size()-1));
        if(findSubsets(nums, i + 1, current, sum, k))
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[]= {1,2,3};
        int k= 7;
        boolean ans = subsets(nums,k);
        System.out.println(ans);
    }
}
