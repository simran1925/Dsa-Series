package Logic_Building_Question.MathAndNumberLogic;

public class Leap_year
{

    public static Boolean leapYearOrNot(int year)
    {
        if(year % 400==0)
        {
            return true;
        }
        else if (year% 100==0)
        {
            return false;
        }
        else  if (year % 4==0)
        {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
           int year = 2025;

           if(leapYearOrNot(year))
           {
               System.out.println("Yes leap year ");
           }
           else System.out.println("no leap year");

    }
}
