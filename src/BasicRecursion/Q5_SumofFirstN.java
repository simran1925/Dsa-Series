package BasicRecursion;

public class Q5_SumofFirstN
{

    public static int sum(int n,int sum)
    {

        //approch 1
        if(n==0)
        {
            return sum;
        }
        sum=sum(n-1,sum+n);
        return sum;

        //approch 2
//        if(n>0)
//        {
//            return sum(n-1,sum+n);
//        }
//        return sum;

        //apprach 3     (factorial apprach )
//        if(n==0)    //it is a particular stair where we have to return exact value at that stair rather than again calling the function
//        {
//            return 0;
//        }
//        return n+ sum(n-1);

    }
    public static void main(String[] args) {
        System.out.println(sum(10,0));
    }
}
