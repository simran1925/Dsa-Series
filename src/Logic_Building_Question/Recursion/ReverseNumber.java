package Logic_Building_Question.Recursion;
//

public class ReverseNumber
{

    //To approach this question - always whenever you will try to call the function recursively you will be ending with n=0 and last digit as first digit all the n will be completed so
//    always use tail recusion in this case
    public static int reverseNumber(int n)
    {
        if(n<10) //means if digit is single
        {
            return n;
        }

        int count=(int) Math.log10(n);
        // e.g suppose n==4 then
        //(1234 % 10) * 1000 + recurive call(tail so every time it will be called at last )
        return (n%10 )* (int)Math.pow(10, count) + reverseNumber(n/10);

    }
    public static void main(String[] args) {
        int number=1234;
        int ans= reverseNumber(number);
        System.out.println(ans);
    }
}
