//        *
//        **
//        ***
//        ****
//        *****
//        ******
//        *****
//        ****
//        ***
//        **
//        *
package Patterns;

public class Q10
{
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++)
        {
            for(int l=1;l<=n-i;l++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
