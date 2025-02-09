//F
//E F
//D E F
//C D E F
//B C D E F
//A B C D E F
package Patterns;

public class Q18
{
    public static void main(String[] args)
    {
        int n=6;
        char ch='F';
        char oh=ch;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
                ch=(char)(ch+1);
            }
            System.out.println();
            oh=(char)(oh-1);
            ch=oh;
        }

    }
}
