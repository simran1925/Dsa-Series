package BasicRecursion;

public class Q6_Factorial
{
    public static int factorial(int n)
    {
        //approach 1
        if(n==0)
        {
            return 1;
        }
        return factorial(n-1)*n;

        //approach 2
//        if(n>0)
//        {
//            return factorial(n-1, fact*n);
//        }
//        return fac;

    }
    public static void main(String[] args)
    {
        System.out.println(factorial(5) );

        //for second apprach
//        int fact=1;      //we will pass the fact as 1 here instead of return 1 on n==0
//        System.out.println(factorial(5, fact));

    }
}
