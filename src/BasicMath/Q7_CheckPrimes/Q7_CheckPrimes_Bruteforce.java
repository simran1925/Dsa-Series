package BasicMath.Q7_CheckPrimes;

public class Q7_CheckPrimes_Bruteforce
{
    public static void main(String[] args)
    {
        int n=13;
        int flag=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag=1;
            }
        }
        if(flag==1)
        {
            System.out.println("Not prime");
        }
        else {
            System.out.println("Prime");
        }
    }

}
