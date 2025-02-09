//Time complexity= O(N)
//Space Complexity = O(n) becausse extra space i.e. hashSet is used
package Arrays.Easy.Q4_RemoveDuplicates;

import java.util.HashSet;
import java.util.Set;

public class Q4_RemoveDuplicates_Bruteforce
{

    public static void removeDuplicates(int arr[])
    {
        Set<Integer> hashSet= new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            hashSet.add(arr[i]);
        }
        System.out.println(hashSet);
    }
    public static void main(String[] args) {
        int arr[]={1,1,4,4,2,5,6,6};
        removeDuplicates(arr);
    }
}
