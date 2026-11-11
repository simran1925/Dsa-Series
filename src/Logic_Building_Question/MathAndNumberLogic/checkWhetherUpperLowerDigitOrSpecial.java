package Logic_Building_Question.MathAndNumberLogic;

public class checkWhetherUpperLowerDigitOrSpecial
{
    public  static void check(char ch)
    {
        if(ch >='A' && ch<='Z')
        {
            System.out.println("upper");
        }
        else if(ch>='a' && ch<='z')
        {
            System.out.println("lowercase");
        }
        else if(ch>='0' && ch<='9')
        {
            System.out.println("digit");
        }
        else {
            System.out.println("special character");
        }
    }

    public static void main(String[] args) {

            check('&');
    }
}
