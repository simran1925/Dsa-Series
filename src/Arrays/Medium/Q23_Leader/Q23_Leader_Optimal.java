package Arrays.Medium.Q23_Leader;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Q23_Leader_Optimal
{
    public static List<Integer> findLeader(int arr[])
    {
        List<Integer> ans= new ArrayList<>();
        int max= arr[arr.length-1];
        ans.add(max);
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]>max)
            {
                ans.add(arr[i]);
                max= arr[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }
    public static void main(String[] args) {
        int arr[]= {10, 22, 12, 3, 0, 6};
        List<Integer> list=  findLeader(arr);
        System.out.println(list);
    }
}
