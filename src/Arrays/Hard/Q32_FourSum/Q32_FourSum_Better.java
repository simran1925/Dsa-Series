package Arrays.Hard.Q32_FourSum;

import java.util.*;

public class Q32_FourSum_Better
{
    public static List<List<Integer>> fourSum(int arr[], int target)
    {
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
               Set<Integer> tempSet = new HashSet<>();
               for(int k=j+1;k<arr.length;k++)
               {
                   int fourth = target-(arr[i]+ arr[j]+ arr[k]);
                   if(tempSet.contains(fourth))
                   {
                       List<Integer> list= Arrays.asList(arr[i], arr[j],arr[k], fourth);
                       list.sort(null);
                       set.add(list);
                   }
                   tempSet.add(arr[k]);
               }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
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
