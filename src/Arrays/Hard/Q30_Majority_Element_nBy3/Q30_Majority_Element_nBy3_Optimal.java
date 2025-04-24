package Arrays.Hard.Q30_Majority_Element_nBy3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q30_Majority_Element_nBy3_Optimal
{
    public static List<Integer> marjorityElement(int nums[])
    {
        List<Integer> ans = new ArrayList<>();
        int count1=0,count2=0,element1=Integer.MIN_VALUE,element2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(count1==0 && element2!=nums[i])
            {
                count1=1;
                element1= nums[i];
            }
            else if(count2==0 && element1!=nums[i])
            {
                count2=1;
                element2=nums[i];
            }
            else if(element1==nums[i])
            {
                count1++;
            }
            else if(element2==nums[i])
            {
                count2++;
            }

            else
            {
                count1--;
                count2--;
            }
        }
        int c1=0,c2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==element1 )
            {
                c1++;
            }
            else if(nums[i]==element2)
            {
                c2++;
            }
        }
        if(c1>(nums.length/3))
        {
            ans.add(element1);
        }
        if(c2>(nums.length/3))
        {
            ans.add(element2);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]= {11, 33, 33, 11, 33, 11};
        List<Integer> ans = marjorityElement(arr);
        System.out.println(ans);
    }
}
