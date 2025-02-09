//        1
//        01
//        101
//        0101
//        10101
//        010101
package Patterns;

public class Q11
{
    public static void main(String[] args)
    {
        int n=4;
        int count=1;
        int innercount=count;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(innercount);
                if(innercount==1)
                {
                    innercount=0;
                }
                else {
                    innercount=1;
                }
            }
            if(count==1)
            {
                count=0;
            }
            else {
                count=1;
            }
            innercount=count;
            System.out.println();
        }
    }
}
