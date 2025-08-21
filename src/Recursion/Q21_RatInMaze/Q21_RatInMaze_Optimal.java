package Recursion.Q21_RatInMaze;

import java.util.ArrayList;
import java.util.List;

public class Q21_RatInMaze_Optimal
{
    public static  List< String > findPath(int[][] a,int n)
    {
        int[][] visited = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                visited[i][j]=0;
            }
        }
        List<String> result = new ArrayList<>();
        return solve(a,n,visited,0,0,result,"");

    }

    public static List<String> solve(int[][] a , int n,int[][] visited,int i,int j,List<String> result,String current)
    {
        if(i==n-1 && j==n-1)
        {
            result.add(current);
            return result;
        }
//          DLRU
        if(i+1<n && visited[i+1][j]==0&& a[i+1][j]==1)
        {
            visited[i][j]=1;
            solve(a,n,visited,i+1,j,result,current+"D");
            visited[i][j]=0;
        }

        if(j-1>=0 && visited[i][j-1]==0&& a[i][j-1]==1)
        {
            visited[i][j]=1;
            solve(a,n,visited,i,j-1,result,current+"L");
            visited[i][j]=0;
        }

        if(j+1<n && visited[i][j+1]==0&& a[i][j+1]==1)
        {
            visited[i][j]=1;
            solve(a,n,visited,i,j+1,result,current+"R");
            visited[i][j]=0;
        }

        if(i-1>=0 && visited[i-1][j]==0&& a[i-1][j]==1)
        {
            visited[i][j]=1;
            solve(a,n,visited,i-1,j,result,current+"U");
            visited[i][j]=0;
        }
        return result;
    }
    public static void main(String[] args) {

        int n = 4;
        int[][] a = {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
        List< String > res = findPath(a, n);
        if (res.size() > 0) {
            for (int i = 0; i < res.size(); i++)
                System.out.print(res.get(i) + " ");
            System.out.println();
        } else {
            System.out.println(-1);
        }
    }
}
