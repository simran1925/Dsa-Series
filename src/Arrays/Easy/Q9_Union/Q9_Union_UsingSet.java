package Arrays.Easy.Q9_Union;

import java.util.*;

public class Q9_Union_UsingSet
{
    public static List<Integer> findUnion(int[] arr1, int[] arr2)
    {
        Set<Integer> set= new HashSet<>();
        List<Integer> list= new ArrayList<>();
        for(int i=0;i<arr1.length;i++)
        {
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++)
        {
            set.add(arr2[i]);
        }
        for(int i: set)
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
