package Arrays.Hard.Q35_MergeOverlappingIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q35_MergeOverlappingIntervals_Bruteforce
{
    public static List<List<Integer>> mergeOverlappingIntervals(int nums[][])
    {
        List<List<Integer>>ans = new ArrayList<>();
        Arrays.sort(nums, new Comparator<int[]>(){

            @Override
            public int compare(int[] a, int[] b) {
                return a[0]-b[0];
            }
        });
        for(int i=0;i<nums.length;i++)
        {
            int start = nums[i][0];
            int end= nums[i][1];
            if(!ans.isEmpty() && end<=ans.get(ans.size()-1).get(1))
            {
                continue;
            }
            for(int j=i+1;j<nums.length;j++)
            {
                if(end >= nums[j][0])
                {
                    end = Math.max(end,nums[j][1]);
                }
                else {
                    break;
                }
            }
            ans.add(Arrays.asList(start,end));
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        List<List<Integer>> ans = mergeOverlappingIntervals(arr);
        System.out.print("The merged intervals are: \n");
        for (List<Integer> it : ans) {
            System.out.print("[" + it.get(0) + ", " + it.get(1) + "] ");
        }
        System.out.println();
    }
}
