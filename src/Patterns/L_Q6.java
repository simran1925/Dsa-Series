//        1
//        2 1
//        3 2 1
//        4 3 2 1
//
package Patterns;

public class L_Q6
{
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

}
