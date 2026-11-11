package Logic_Building_Question.Recursion;

public class FindSumOfNumbers
{
    public static int findSum(int n, int sum)
    {
        if(n==0)
        {
            return sum;
        }
        sum+=n;
        return findSum(n-1, sum);
    }
    public static void main(String[] args) {
        int n=5;
        int ans = findSum(n,0);
        System.out.println(ans);
    }
}
