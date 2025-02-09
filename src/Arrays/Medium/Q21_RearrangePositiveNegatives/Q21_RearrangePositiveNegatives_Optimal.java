//Time complexity: O(1)
//Space complexity = O(N)
package Arrays.Medium.Q21_RearrangePositiveNegatives;

import java.util.*;

public class Q21_RearrangePositiveNegatives_Optimal
{
        public static List<Integer> rearrange( List<Integer> list)
        {
            ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(list.size(),0));
            int p=0,n=1;
            for(int i=0;i<list.size();i++)
            {
                if(list.get(i)>0)
                {
                    ans.set(p,list.get(i));
                    p+=2;
                }
                else if(list.get(i)<0)
                {
                    ans.set(n,list.get(i));
                    n+=2;
                }
            }
            return ans;
        }
        public static void main(String[] args)
        {
//        int arr[]= {1,2,3,-3,-2,-1};
//        int arr[]= {-1,-2,-3,1,2,3}
            List listToarrange= new ArrayList(Arrays.asList(-1,-2,-3,1,2,3));
           List list= rearrange(listToarrange);
            System.out.println(list);
        }
}

