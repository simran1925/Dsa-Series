//        1
//        2 3
//        3 4 5
//        4 5 6 7

package Patterns;

public class HW_4
{
    public static void main(String[] args) {
        int n=4;
        int count=1;
        int innerCount=count;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(innerCount+" ");
                innerCount++;
            }
            count++;
            innerCount=count;
            System.out.println();
        }
    }
}
