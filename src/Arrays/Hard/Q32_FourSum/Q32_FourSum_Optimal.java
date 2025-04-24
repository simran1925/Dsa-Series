package Arrays.Hard.Q32_FourSum;

import java.util.*;

public class Q32_FourSum_Optimal
{
    public static List<List<Integer>> fourSum(int nums[], int target)
    {
        List<List<Integer>> set = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            for(int j=i+1;j<nums.length;j++)
            {
                if(j>i+1 && nums[j]== nums[j-1])
                {
                    continue;
                }

                int k=j+1,l= nums.length-1;
                while(k<l)
                {

                    long sum = nums[i];
                    sum+=nums[j];  //this step is most important to sum it like this for bigger numbers
                    sum+=nums[k];
                    sum+=nums[l];
                    if(sum <target)
                    {
                        k++;
                    }
                    else if(sum >target)
                    {
                        l--;
                    }
                    else
                    {
                        List<Integer> list = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                        set.add(list);
                        k++;
                        l--;
                        while(k<l && nums[k]==nums[k-1])
                        {
                            k++;
                        }
                        while(k<l && nums[l]==nums[l+1])
                        {
                            l--;
                        }
                    }
                }

            }
        }
        // List<List<Integer>> ans = new ArrayList<>(set);
        return set;
    }
    public static void main(String[] args) {
        int arr[]= {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        List<List<Integer>> ans= fourSum(arr,9);
        for(List<Integer> list: ans)
        {
            System.out.print("[ ");
            for(int element: list)
            {
                System.out.print(element+ " ");
            }
            System.out.print(" ]");
        }
    }
}
