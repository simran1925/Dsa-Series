package Logic_Building_Question.MathAndNumberLogic;

public class PerfectDigit
{
    public static boolean perfectDigitOrNot(int n)
    {
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        if(sum==n)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n= 28;
        boolean ans = perfectDigitOrNot(n);
        System.out.println(ans);
    }
}
