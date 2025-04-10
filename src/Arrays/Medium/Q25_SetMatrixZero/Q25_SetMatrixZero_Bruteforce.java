package Arrays.Medium.Q25_SetMatrixZero;

import java.util.ArrayList;
import java.util.Arrays;

public class Q25_SetMatrixZero_Bruteforce
{
    public static void markRow(ArrayList<ArrayList<Integer>> matrix, int m, int n, int i)
    {
        for(int j=0;j<m;j++)
        {
            if(matrix.get(i).get(j)!=0)
            {
                matrix.get(i).set(j,-1);
            }
        }
    }
    public static void markCol(ArrayList<ArrayList<Integer>> matrix, int m,int n,int j)
    {
        for(int i=0;i<n;i++)
        {
            if(matrix.get(i).get(j)!=0)
            {
                matrix.get(i).set(j,-1);
            }
        }
    }
    public static ArrayList<ArrayList<Integer>> setMatrixZero(ArrayList<ArrayList<Integer>> matrix, int n, int m)
    {

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix.get(i).get(j)==0)
                {
                    markRow(matrix,m,n,i);
                    markCol(matrix,m,n,j);
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix.get(i).get(j)==-1)
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
