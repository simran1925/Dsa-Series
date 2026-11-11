package Logic_Building_Question.MathAndNumberLogic;

public class HighestCommonFactor
{
    public static int findHCF(int a, int b)
    {
        int highestfactor= Integer.MIN_VALUE;
        for(int i=1;i<=Math.min(a,b);i++)
        {
            if(a%i==0 && b%i==0)
            {
                if(i>highestfactor)
                {
                    highestfactor=i;
                }
            }
        }
        return highestfactor;
    }
    public static void main(String[] args) {

        int a=12, b=18;
        int ans = findHCF(a,b);
        System.out.println(ans);

    }
}
