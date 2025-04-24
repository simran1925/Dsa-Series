package Arrays.Hard.Q31_ThreeSum;

import java.util.*;

public class Q31_ThreeSum_Optimal
{
    public static Set<List<Integer>> twoSum(int arr[])
    {
        Set<List<Integer>> ans= new HashSet<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++ )
        {
            if(i!=0 && arr[i]==arr[i-1]) {
                continue;
            }
            int j=i+1;
            int k= arr.length-1;

            while (j<k)
            {
                int sum = arr[i]+ arr[j]+arr[k];
                if(sum<0)
                {
                    j++;
                }
                else if (sum>0)
                {
                    k--;
                }
                else {
                    List<Integer> integers = Arrays.asList(arr[i], arr[j],arr[k]);
                    ans.add(integers);
                    j++;
                    k--;
                    while(j<k && arr[j]==arr[j-1])j++;
                    while(j<k && arr[k]== arr[k+1])k--;
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
