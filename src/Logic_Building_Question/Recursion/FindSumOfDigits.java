package Logic_Building_Question.Recursion;

public class FindSumOfDigits
{
    public static int findSumOfDigits(int number)
    {
        if(number==0)
        {
            return 0;
        }
        int lastDigit = number%10;
        return lastDigit + findSumOfDigits(number/10);
    }
    public static void main(String[] args) {
        int number = 1234;
        int ans = findSumOfDigits(number);
        System.out.println(ans);

    }
}
