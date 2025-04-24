package Arrays.Hard.Q30_Majority_Element_nBy3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q30_Majority_Element_nBy3_Better
{
    public static List<Integer>marjorityElement(int nums[])
    {
        List<Integer> ans = new ArrayList<>();
        int mini= (nums.length/3)+1;

        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int value= map.getOrDefault(nums[i],0);
            map.put(nums[i], value+1);
            if(map.get(nums[i])>=mini)
            {
                ans.add(nums[i]);
            }
            if(ans.size()==2)
            {
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]= {11, 33, 33, 11, 33, 11};
        List<Integer> ans = marjorityElement(arr);
        System.out.println(ans);
    }
}
