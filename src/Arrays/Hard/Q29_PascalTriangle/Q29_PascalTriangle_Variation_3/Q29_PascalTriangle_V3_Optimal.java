package Arrays.Hard.Q29_PascalTriangle.Q29_PascalTriangle_Variation_3;

import java.util.ArrayList;
import java.util.List;

public class Q29_PascalTriangle_V3_Optimal
{

    public static List<Integer> generateRow(int row)
    {
        long ans=1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);
        for(int col=1;col<row;col++)
        {
            ans=ans*(row-col);
            ans=ans/col;
            ansRow.add((int)ans);
        }
        return ansRow;
    }

    public static List<List<Integer>> pascalTriangle(int n)
    {
        List<List<Integer>> ans = new ArrayList<>();
        for(int row=1;row<=n;row++)
        {
            ans.add(generateRow(row));
        }
        return ans;
    }

    public static void main(String[] args) {
        int n=5;
        List<List<Integer>> ans=pascalTriangle(n);
          for(List<Integer> i:ans)
          {
              for(int element: i)
              {
                  System.out.print(element);
              }
              System.out.println();
          }
    }
}
