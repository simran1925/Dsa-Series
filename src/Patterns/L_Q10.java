//A B C
//B C D
//C D E
package Patterns;

public class L_Q10
{
    public static void main(String[] args)
    {
        int n=3;
        char ch='A';
        char innerCh=ch;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(innerCh+ " ");
                innerCh= (char)(innerCh+1);
            }
            ch= (char)(ch+1);
            innerCh=ch;
            System.out.println();
        }
    }
}
