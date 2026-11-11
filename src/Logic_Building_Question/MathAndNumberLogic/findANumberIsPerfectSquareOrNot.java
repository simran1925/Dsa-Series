package Logic_Building_Question.MathAndNumberLogic;

public class findANumberIsPerfectSquareOrNot
{
    public static boolean perfectSquareOrNot(int number)
    {
        for(int i=1;i<=number;i++)
        {
            int square= i*i;
            if(square==number)
            {
                return true;
            }
            else if(square>number)
            {
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int number= 39;
        boolean ans= perfectSquareOrNot(number);
        System.out.println(ans);

    }
}
