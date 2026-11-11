package Logic_Building_Question.MathAndNumberLogic;

public class ArmstrongNumber
{
    public static boolean armstrongOrNot(int n)
    {
        int sum=0;
        int original = n;
        while(n>0)
        {
            int lastDigit=n%10;
            sum+=(int)Math.pow(lastDigit,3);
            n=n/10;
        }
        if(sum==original)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

        int n= 154;
        boolean ans = armstrongOrNot(n);
        System.out.println(ans);
    }
}
