package Logic_Building_Question.MathAndNumberLogic;

public class palindromeOrNot
{
    public static boolean palindromeOrNot(int n)
    {
        int original= n;
        int rev=0;
        while (n>0)
        {
            int lastDigit = n%10;
            rev= (rev*10)+lastDigit;
            n= n/10;
        }
        if(rev==original)
        {
            return true;
        }
        return  false;
    }

    public static void main(String[] args) {
        int number= 1221;
        boolean ans= palindromeOrNot(number);
        System.out.println(ans);
    }
}
