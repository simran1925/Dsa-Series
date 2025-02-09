//
//A B C D E F
//A B C D E
//A B C D
//A B C
//A B
//A
package Patterns;

public class Q15
{
    public static void main(String[] args) {
        int n=6;
        char ch='A';
        char originalCh=ch;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(ch+" ");
                ch=(char)(ch+1);
            }
            ch=originalCh;
            System.out.println();
        }
    }
}
