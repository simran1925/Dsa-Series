package Arrays.Easy.Q9_Union;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q9_Union_UsingMap_NotRecommended___Bruteforce
{
    public static List<Integer> findUnion(int[] arr1,int[] arr2)
    {
        Map<Integer,Integer> map= new HashMap<>();
        List<Integer> list= new ArrayList<>();
        for(int i=0;i<arr1.length;i++)
        {
            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
        }
        for(int i=0;i<arr2.length;i++)
        {
            map.put(arr2[i],map.getOrDefault(arr2[i],0)+1);
        }
        for(int i: map.keySet())
        {
            list.add(i);
        }
        return list;
    }
    public static void main(String[] args)
    {
        int arr1[]= {1,2,3,4,5};
        int arr2[]={1,2,3,4,5,6,7};
        System.out.println(findUnion(arr1,arr2));
    }
}
