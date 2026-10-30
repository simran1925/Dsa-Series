package BasicRecursion;

public class PrintEvenNumbersUsingRecursion
{
    public static void findEven(int n)
    {
        if(n==0)
        {
            return;
        }
        findEven(n-1);  //firstly head recursion  (keep storing the print ans in stack )
        if(n%2==0)
        {
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        int n=10;
        findEven(n);
    }
}
