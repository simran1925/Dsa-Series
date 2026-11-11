package Logic_Building_Question.MathAndNumberLogic;

public class ReverseANumber
{
    public static int reverseNumber(int n)
    {
        int original= n;
        int rev=0;
        while (n>0)
        {
            int lastDigit = n%10;
            rev= (rev*10)+lastDigit;
            n= n/10;
        }
        return  rev;
    }

    public static void main(String[] args) {
      int number= 1234;
      int ans= reverseNumber(number);
        System.out.println(ans);
    }
}
