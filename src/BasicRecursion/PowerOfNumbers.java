package BasicRecursion;

public class PowerOfNumbers
{
    public static int calculatePower(int x, int n)
    {
        if(n==0)
        {
            return 1;
        }
       return x * calculatePower(x,n-1);
    }
    public static void main(String[] args) {
        int x=2; int n=3;
        int ans = calculatePower(x, n);
        System.out.println(ans);

    }
}
