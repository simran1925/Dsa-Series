package Arrays.Hard.Q29_PascalTriangle.Q29_PascalTriangle_Variation_3;

import java.util.ArrayList;
import java.util.List;

public class Q29_PascalTriangle_V3_Bruteforce
{
   public static int nCr(int n, int r)
   {
       int res=1;
       for(int i=0;i<r;i++)
       {
           res= res*(n-i);
           res= res/(i+1);
       }
       return res;
   }

   public static List<List<Integer>> pascalTriangle(int n)
   {
       List<List<Integer>> ans = new ArrayList<>();
       for(int row=1;row<=n;row++)
       {
           List<Integer>temp = new ArrayList<>();
           for(int col=1;col<=row;col++)
           {
               temp.add(nCr(row-1,col-1));
           }
           ans.add(temp);
       }
       return ans;
   }

    public static void main(String[] args) {
        int n=5;
        List<List<Integer>>ans=pascalTriangle(n);
//        List<List<Integer>> ans = pascalTriangle(n);
        for (List<Integer> it : ans) {
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
//        System.out.println(ans);
    }
}
