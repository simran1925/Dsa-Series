//        *          *
//        **        **
//        ***      ***
//        ****    ****
//        *****  *****
//        ************
//        *****  *****
//        ****    ****
//        ***      ***
//        **        **
//        *          *
package Patterns;

public class Q20
{
    public static void main(String[] args)
    {
        int n=6;
        for(int i=1;i<=n-1;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int k=1;k<=n-i;k++)
            {
                System.out.print("  ");
            }
            for(int k=1;k<=n-i;k++)
            {
                System.out.print("  ");
            }
            for(int l=1;l<=i;l++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print("* ");
            }
            for(int k=1;k<=i-1;k++)
            {
                System.out.print("  ");
            } for(int k=1;k<=i-1;k++)
            {
                System.out.print("  ");
            }
            for(int l=1;l<=n-i+1;l++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
