package BasicMath;

public class Q5_ArmstrongNumber
{
    public static void main(String[] args) {
        int n=153;
        int originalN=n;
        int count=(int)Math.log10(n)+1;
        int sum=0;
        while(n>0)
        {
            int ld=n%10;
            sum= (int) (sum+(double)Math.pow(ld,count));
            n=n/10;
        }
       if(originalN==sum)
       {
           System.out.println("Armstrong");
       }
       else {
           System.out.println("Not armstrong");
       }
    }
}
