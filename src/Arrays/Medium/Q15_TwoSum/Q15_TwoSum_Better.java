package Arrays.Medium.Q15_TwoSum;

import java.util.HashMap;
import java.util.Map;

public class Q15_TwoSum_Better
{
    public static boolean twoSum(int arr[],int target)
    {
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int num = arr[i];
            int moreForSum= target-num;
            if(map.containsKey(moreForSum))
            {
                return true;
            }
            map.put(num,i);
        }
        return false;
    }
    public static void main(String[] args)
    {
        int arr[]= {2, 6, 5, 8, 11};
        int target=14;
        boolean ans= twoSum(arr,target);
        System.out.println(ans);
    }
}
