package Logic_Building_Question.Recursion;

public class FindFactorial
{
    public static int findFact(int n)
    {
        if(n==0) //it is a particular stair where we have to return exact value at that stair rather than again calling the function
        {
            return 1;
        }
        return n*findFact(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        int ans= findFact(n);
        System.out.println(ans);
    }
}
