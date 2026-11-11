package Logic_Building_Question.MathAndNumberLogic;

public class PrintFibonacciSeries
{
    public static void printFibonacciSeries(int n)
    {
        if(n==0)
        {
            return;
        }
        if(n==1){
            System.out.println(0);
        }
        int first= 0;
        int second= 1;
        int count=3;
        System.out.println(first);
        System.out.println(second);
        while(count<=n)
        {
            int newNum= first+second;
            System.out.println(newNum);
            first= second;
            second= newNum;
            count++;
        }
    }
    public static void main(String[] args) {
          int n=10;
          printFibonacciSeries(n);
    }
}
