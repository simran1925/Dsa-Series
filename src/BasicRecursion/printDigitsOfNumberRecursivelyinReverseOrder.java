package BasicRecursion;

public class printDigitsOfNumberRecursivelyinReverseOrder
{
    public static void printDigits(int number)
    {
        if(number==0)
            return;
        System.out.print(number%10);
        printDigits(number/10);
    }
    public static void main(String[] args) {
        printDigits(1234);
    }
}
