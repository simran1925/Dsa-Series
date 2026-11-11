package Logic_Building_Question.Recursion;

public class PrintFibonacciSeries
{
    public static int printFibonacci(int n)
    {

        if(n==1)
        {
            return 1;
        }

        if(n==0)
        {
            return 0;
        }
        return printFibonacci(n-1)+printFibonacci(n-2);

    }
    public static void main(String[] args) {
        int n=4;
        int ans = printFibonacci(n);
        System.out.println(ans);
    }
}
