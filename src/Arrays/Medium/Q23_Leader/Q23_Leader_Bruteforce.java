package Arrays.Medium.Q23_Leader;

import java.util.ArrayList;
import java.util.List;

public class Q23_Leader_Bruteforce
{
    public static List<Integer> findLeader(int arr[])
    {
        List<Integer> list= new ArrayList<>();
        for(int i=0;i<arr.length-1;i++) {
            for (int j = i + 1; j < arr.length; j++)
            {
                if(arr[i]<arr[j])
                {
                    if(!list.contains(arr[j]))
                    {
                        list.add(arr[j]);
                    }
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int arr[]= {10, 22, 12, 3, 0, 6};
        List<Integer> list=  findLeader(arr);
        System.out.println(list);
    }
}
