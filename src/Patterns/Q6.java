//Input Format: N = 6
//Result:
//        1 2 3 4 5 6
//        1 2 3 4 5
//        1 2 3 4
//        1 2 3
//        1 2
//        1
package Patterns;

public class Q6
{
    public static void main(String[] args)
    {
        int n=6;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n+1-i);j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
