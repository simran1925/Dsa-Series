package Arrays.Hard.Q31_ThreeSum;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q31_ThreeSum_Bruteforce
{
    public static Set<List<Integer>> twoSum(int arr[])
    {
        Set<List<Integer>> ans= new HashSet<>();

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    if(arr[i]+arr[j]+ arr[k]==0)
                    {
                        List<Integer> list= Arrays.asList(arr[i],arr[j],arr[k]);
                        list.sort(null);
                        ans.add(list);
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]= {-1, 0, 1, 2, -1, -4};
        Set<List<Integer>> ans = twoSum(arr);
        for(List<Integer> list:ans)
        {
            System.out.print("[");
            for(int element: list)
            {
                System.out.print(element+ " ");
            }
            System.out.print("]");
        }
    }
}
