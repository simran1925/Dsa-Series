package Patterns;

public class RightUpper
{
    public static void main(String[] args)
    {
        int n=4;
        for(int i=1;i<=n;i++)
        {

            for(int k=1;k<=i-1;k++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
