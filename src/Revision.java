import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Revision
{
    public static int[][] printName(int[][] arr)
    {
        int n= arr.length;
        int m= arr[0].length;
       for(int i=0;i<n;i++)
       {
           for(int j=i;j<m;j++)
           {
               int temp = arr[i][j];
               arr[i][j]= arr[j][i];
               arr[j][i]= temp;
           }
       }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n/2;j++)
            {
                int temp = arr[i][j];
                arr[i][j]= arr[i][n-1-j];
                arr[i][n-1-j]= temp;
            }
        }
       return arr;

    }
    public static void main(String[] args) {
       int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
       int ans[][]=printName(arr);
      for(int i=0;i<ans.length;i++)
      {
          for(int j=0;j<ans[0].length;j++)
          {
              System.out.print(ans[i][j]);
          }
          System.out.println();
      }

    }

}
