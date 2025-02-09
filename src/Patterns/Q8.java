package Patterns;

public class Q8
{
    public static void main(String[] args) {
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
            for(int l=1;l<=n-i;l++)   //or l<=(n-i+1)-1
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
