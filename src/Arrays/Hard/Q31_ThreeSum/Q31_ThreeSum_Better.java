package Arrays.Hard.Q31_ThreeSum;

import java.util.*;

public class Q31_ThreeSum_Better
{
    public static List<List<Integer>> twoSum(int arr[])
    {
        Set<List<Integer>> ans= new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            Set<Integer> set=new HashSet<>();
            for(int j=i+1;j<arr.length;j++)
            {
                int rem = -(arr[i]+arr[j]);
                if(set.contains(rem))
                {
                    List<Integer> temp=Arrays.asList(arr[i],arr[j], rem);
                    temp.sort(null);
                    ans.add(temp);
                }
                set.add(arr[j]);
            }
        }
        List<List<Integer>> list = new ArrayList<>(ans);
        return list;
    }

    public static void main(String[] args) {
        int arr[]= {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> ans = twoSum(arr);
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
