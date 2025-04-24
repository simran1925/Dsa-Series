package Arrays.Hard.Q32_FourSum;

import java.util.*;

public class Q32_FourSum_Bruteforce
{
    public static List<List<Integer>> fourSum(int arr[],int target)
    {
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    for(int l=k+1;l<arr.length;l++)
                    {
                        long sum = arr[i];
                        sum+=arr[j];  //this step is most important to sum it like this for bigger numbers
                        sum+=arr[k];
                        sum+=arr[l];
                        if(sum==target)
                        {
                            List<Integer> list = Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
                            list.sort(null);
                            set.add(list);
                        }
                    }
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
