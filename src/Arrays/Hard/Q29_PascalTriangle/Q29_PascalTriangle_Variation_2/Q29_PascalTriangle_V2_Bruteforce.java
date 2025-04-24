package Arrays.Hard.Q29_PascalTriangle.Q29_PascalTriangle_Variation_2;

public class Q29_PascalTriangle_V2_Bruteforce
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

    public static void pascalTriangle(int n)
    {
        for(int col=1;col<=n;col++)
        {
            System.out.print(nCr((n-1),(col-1)));
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int n=5;
        pascalTriangle(n);
//        System.out.println(ans);
    }
}
