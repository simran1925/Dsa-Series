package BasicMath.Q7_CheckPrimes;

public class Q7_CheckPrimes_Optimal
{
    public static void main(String[] args)
    {
        int n=29;
        int sqrtN=(int)Math.sqrt(n);
        int flag=0;
        for(int i=2;i<sqrtN;i++)
        {
            if(n%i==0)
            {
                flag=1;
            }
        }
        if(flag==1)
        {
            System.out.println("NOt prime");
        }
        else {
            System.out.println("Prime");
        }
    }

}
