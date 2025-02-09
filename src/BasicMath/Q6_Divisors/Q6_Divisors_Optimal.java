package BasicMath.Q6_Divisors;

public class Q6_Divisors_Optimal
{
    public static void main(String[] args) {
        int n=36;
        int sqrtN=(int)Math.sqrt(n);
        for(int i=1;i<=sqrtN;i++)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
                if(i!=n/i)
                {
                    System.out.print(n/i+" ");
                }
            }
        }
    }
}
