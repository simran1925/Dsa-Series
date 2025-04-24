package Arrays.Hard.Q30_Majority_Element_nBy3;

import java.util.ArrayList;
import java.util.List;

public class Q30_Majority_Element_nBy3_Bruteforce
{
    public static List<Integer>marjorityElement(int nums[])
    {
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(ans.size()==0 || ans.get(0)!=nums[i])
            {
                int count=0;
                for(int j=0;j<nums.length;j++)
                {
                    if(nums[i]==nums[j])
                    {
                        count++;
                    }
                }

                if(count>(nums.length/3))
                {
                    ans.add(nums[i]);
                }
            }
            if (ans.size() == 2) break;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]= {11, 33, 33, 11, 33, 11};
        List<Integer> ans = marjorityElement(arr);
        System.out.println(ans);
    }
}
