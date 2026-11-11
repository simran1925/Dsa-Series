package Logic_Building_Question.MathAndNumberLogic;

public class CountNumberOfDigits {

    public static int countNumberOfDigits(int n)
    {
        int count =0;
        while (n>0)
        {
            n= n/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
       int ans=  countNumberOfDigits(2344);
        System.out.println(ans);
    }
}
