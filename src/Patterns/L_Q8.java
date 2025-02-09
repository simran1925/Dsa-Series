package Patterns;

public class L_Q8
{
    public static void main(String[] args)
    {
        int n=4;
        char ch='A';
        char originalch=ch;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(ch+ " ");
                ch= (char)(ch+1);
            }
            ch=originalch;
            System.out.println();
        }

    }
}
