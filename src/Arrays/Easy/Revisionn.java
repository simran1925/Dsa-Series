package Arrays.Easy;

import java.util.*;

class Solution {
    public static int printCount(int n)
    {
        if(n==0 )
        {
            return 0;
        }
        return n + printCount(n-1);
    }


    public static void main(String[] args) {
          int ans = printCount(5);
        System.out.println(ans);
    }
}