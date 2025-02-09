//A
//A B
//A B C
//A B C D
//A B C D E
//A B C D E F
package Patterns;

public class Q14
{
    public static void main(String[] args)
    {
        int n=6;
        char ch='A';
        char originalCh=ch;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch);
                ch=(char)(ch+1);
            }
            ch=originalCh;
            System.out.println();
        }


    }
}
