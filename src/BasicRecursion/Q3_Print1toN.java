package BasicRecursion;

public class Q3_Print1toN
{
    public static void printNumbers(int n)
    {
        if(n==0)
        {
            return;
        }
        printNumbers(n-1);
        System.out.println(n);
    }
    public static void main(String[] args)
    {
        printNumbers(10);

    }
}
