package BasicRecursion;

public class Q5_SumofFirstN
{

    public static int sum(int n,int sum)
    {
        if(n==0)
        {
            return sum;
        }
        sum=sum(n-1,sum+n);
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(10,0));
    }
}
