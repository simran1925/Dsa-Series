//        1          1
//        12        21
//        123      321
//        1234    4321
//        12345  54321
//        123456654321

package Patterns;

public class Q12
{
    public static void main(String[] args)
    {
        int n=6;
        for(int i=1;i<=n;i++)
        {
           for(int j=1;j<=i;j++)
           {
               System.out.print(j+" ");
           }
           for(int k=1;k<=n-i;k++)
           {
               System.out.print("  ");
           } for(int k=1;k<=n-i;k++)
           {
               System.out.print("  ");
           }
           for(int l=i;l>=1;l--)
           {
               System.out.print(l+" ");
           }
            System.out.println();
        }

    }
}
