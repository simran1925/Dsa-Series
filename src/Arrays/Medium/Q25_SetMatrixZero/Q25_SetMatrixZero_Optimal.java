package Arrays.Medium.Q25_SetMatrixZero;

public class Q25_SetMatrixZero_Optimal {
    public static void setZeroes(int[][] matrix) {
        int col0=1;
        int n=matrix.length;
        int m= matrix[0].length;

        //step 1
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[i][0]=0;
                    if(j!=0)
                    {
                        matrix[0][j]=0;
                    }
                    else
                    {
                        col0=0;
                    }
                }
            }
        }

//step 2nd
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(matrix[i][j]!=0)
                {
                    if(matrix[i][0]==0 || matrix[0][j]==0)
                    {
                        matrix[i][j]=0;
                    }
                }
            }
        }

        //3rd step
        if(matrix[0][0]==0)
        {
            for(int j=0;j<m;j++)
            {
                matrix[0][j]=0;
            }
        }
        if(col0==0)
        {
            for(int i=0;i<n;i++)
            {
                matrix[i][0]=0;
            }
        }


        for(int i=0;i<matrix.length;i++)
        {
            for (int j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][]= {{1,0,1},{1,1,1},{0,1,1}};
        setZeroes(matrix);

    }
}
