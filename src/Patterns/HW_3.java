//        9 8 7
//        6 5 4
//        3 2 1

package Patterns;

public class HW_3
{
    public static void main(String[] args)
    {
        int n=3;
        int count=9;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(count+" ");
                count--;
            }
            System.out.println();
        }
    }

}
