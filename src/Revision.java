import java.util.*;

public class Revision
{
    public static List<Integer> generateRow(int row)
    {
        List<Integer> rowList= new ArrayList<>();
        int ans = 1;
        rowList.add(ans);
        for(int i=1;i<row;i++)
        {
            ans = ans* (row-i);
            ans = ans/i;
            rowList.add(ans);
        }
        return rowList;
    }
    public static List<List<Integer>> findPascal(int n)
    {
        List<List<Integer>> ans = new ArrayList<>();
        for(int row = 1;row<=n;row++)
        {
           ans.add(generateRow(row));
        }
        return ans;
    }
//    public static void pascalTriangle(int n){
//       for(int col=1;col<=n;col++)
//       {
//           System.out.print(findPascal(n));
//       }
//    }

    public static void main(String[] args) {
        int n=5, r=5,c=3;
        List<List<Integer>> ans = findPascal(5);
        System.out.println(ans);
    }

}
