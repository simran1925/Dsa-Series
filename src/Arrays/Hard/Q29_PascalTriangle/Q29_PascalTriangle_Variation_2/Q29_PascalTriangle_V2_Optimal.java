package Arrays.Hard.Q29_PascalTriangle.Q29_PascalTriangle_Variation_2;

public class Q29_PascalTriangle_V2_Optimal
{
    public static void pascalTriangle(int n)
    {
        int ans=1;
        System.out.print(ans+ " ");
        for(int i=1;i<n;i++)
        {
            ans= ans* (n-i);
            ans= ans /i;
            System.out.print(ans);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int n=5;
        pascalTriangle(n);
//        System.out.println(ans);
    }
}
