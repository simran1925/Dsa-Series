package Recursion.Q3_CountGoodNumbers;

public class Q3_CountGoodNumbers_Optimal_Recursion
{
    private static final int mod = 1_000_000_007;
    public static int countGoodNumbers(long n)
    {

        long evenCount = (n+1)/2;
        long oddCount= n/2;
        long evenWays = findMod(5,evenCount);
        long oddWays = findMod(4,oddCount);
        return (int)((evenWays%mod) *( oddWays%mod)%mod);
    }

    public static long findMod(long x, long n)
    {

        if(n==0)
        {
            return 1;
        }

        long half = findMod(x,n/2);
        long result = (half * half)%mod;
        if(n%2==1)
        {
            return (result * x)%mod;
        }
        return result;

    }

    public static void main(String[] args) {
        int n= 2;
        int ans = countGoodNumbers(n);
        System.out.println(ans);
    }
}
