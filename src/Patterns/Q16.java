//A
//B B
//C C C
//D D D D
//E E E E E
//F F F F F F
package Patterns;

public class Q16
{
    public static void main(String[] args)
    {
        int n=6;
        char ch='A';
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
            }
            ch=(char)(ch+1);
            System.out.println();
        }

    }
}
