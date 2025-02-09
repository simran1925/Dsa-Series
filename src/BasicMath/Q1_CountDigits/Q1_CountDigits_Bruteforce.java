package BasicMath.Q1_CountDigits;

public class Q1_CountDigits_Bruteforce
{
    public static void main(String[] args) {
        int n=12345;
        int count=0;
        while(n>0)
        {
            count++;
            n=n/10;
        }
        System.out.println(count);
    }
}
