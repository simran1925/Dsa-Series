package Arrays.Hard.Q29_PascalTriangle.Q29_PascalTriangle_Variation_1;

public class Q29_PascalTriangle_V1_Optimal
{
    public static long nCr(int n,int r)
    {
        int res=1;
        for(int i=0;i<r;i++)
        {
            res=res*(n-i);
            res= res/(i+1);
        }
        return res;
    }

    public static int pascalTriangle(int row, int col)
    {
        int ans=(int) nCr(row-1,col-1);
        return ans;
    }


    public static void main(String[] args) {
        int n=5, r=5,c=3;
       int ans=  pascalTriangle(r,c);
        System.out.println(ans);
    }
}
