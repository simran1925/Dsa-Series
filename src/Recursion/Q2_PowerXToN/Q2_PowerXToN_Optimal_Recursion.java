package Recursion.Q2_PowerXToN;

public class Q2_PowerXToN_Optimal_Recursion
{
    public static double myPow(double x, int n)
    {
        int N = n;
        if(N<0)
        {
            x= 1/x;
            N=-N;
        }

        return solvePow( x, N);
    }

    public static double solvePow(double x, int n)
    {
        if(n==0)
        {
            return 1.0;
        }

        double half = solvePow(x,n/2);
        if(n%2==0)
        {
            return half * half;
        }
        else
        {
            return half * half * x;
        }
    }

    public static void main(String[] args) {
        int x= 2; int n=10;
        double ans =solvePow(x,n);
        System.out.println(ans);
    }
}
