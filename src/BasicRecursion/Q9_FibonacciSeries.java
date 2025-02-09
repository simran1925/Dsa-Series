package BasicRecursion;

public class Q9_FibonacciSeries
{
    public static int fibonacci(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        int ans= fibonacci(n-1)+ fibonacci(n-2);
        return ans;
    }
    public static void printFibonacciSeries(int n) {
        System.out.print("Fibonacci series up to " + n + ": ");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    public static void main(String[] args) {
//        System.out.println(fibonacci(6));
        printFibonacciSeries(8);
    }
}
