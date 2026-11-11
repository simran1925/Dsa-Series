package Logic_Building_Question.MathAndNumberLogic;

public class FindFactorial
{
    public static int findFactorial(int n)
    {
        int fac=1;
        for(int i=n;i>=1;i--)
        {
            fac= fac*i;
        }
        return fac;
    }
    public static void main(String[] args) {

        int n=5;
        int ans= findFactorial(n);
        System.out.println(ans);

    }
}
