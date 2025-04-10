package Arrays.Medium.Q25_SetMatrixZero;

import java.util.ArrayList;
import java.util.Arrays;

public class Q25_SetMatrixZero_Better
{
    public static ArrayList<ArrayList<Integer>> setMatrixZero(ArrayList<ArrayList<Integer>> matrix, int n, int m)
    {
        int[] row= new int[n];
        int[] col= new int[m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix.get(i).get(j)==0)
                {
                    row[i]=1;
                    col[j]=1;
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(row[i]==1 || col[j]==1)
                {
                    matrix.get(i).set(j,0);
                }
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix= new ArrayList<ArrayList<Integer>>();
        matrix.add(new ArrayList<>(Arrays.asList(1,0,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
        matrix.add(new ArrayList<>(Arrays.asList(0,1,1)));

        ArrayList<ArrayList<Integer>> ansMatrix=setMatrixZero(matrix,matrix.size(),matrix.get(0).size());
        for(int i=0;i<ansMatrix.size();i++)
        {
            for(int j=0;j<ansMatrix.get(0).size();j++)
            {
                System.out.print(matrix.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
