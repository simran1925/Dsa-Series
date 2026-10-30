package Logic_Building_Question.MathAndNumberLogic;

public class checkWhetherSingleOrDoubleOrMultiDigit
{

    public static void checkDigitsType(int number)
    {
        int count =0;
        while (number>0)
        {
            number= number/10;
            count++;
        }

        if(count==1)
        {
            System.out.println("Single digit");
        }
        else if (count==2)
        {
            System.out.println("Double digit");
        }
        else
        {
            System.out.println("Multi digit");
        }
    }
    public static void main(String[] args) {


        int number = 12;
        checkDigitsType(number);
    }
}
