package Arrays.Hard.Q35_MergeOverlappingIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q35_MergeOverlappingIntervals_Optimal
{
    public static  List<List<Integer>> merge(int[][] intervals) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(intervals,new Comparator<int[]> (){
            public int compare(int a[],int b[])
            {
                return a[0]-b[0];
            }
        });
        for(int i=0;i<intervals.length;i++)
        {
            if(ans.isEmpty() || ans.get(ans.size()-1).get(1)<intervals[i][0])
            {
                ans.add(Arrays.asList(intervals[i][0], intervals[i][1]));
            }
            else
            {
                ans.get(ans.size()-1).set(1,Math.max(intervals[i][1],ans.get(ans.size()-1).get(1)));
            }
        }
        //if want to return in array
//        int[][] res = new int[ans.size()][2];
//        for (int i = 0; i < ans.size(); i++) {
//            res[i][0] = ans.get(i).get(0);
//            res[i][1] = ans.get(i).get(1);
//        }
//
//        return res;
        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        List<List<Integer>> ans = merge(arr);
        System.out.print("The merged intervals are: \n");
        for (List<Integer> it : ans) {
            System.out.print("[" + it.get(0) + ", " + it.get(1) + "] ");
        }
        System.out.println();
    }
}
