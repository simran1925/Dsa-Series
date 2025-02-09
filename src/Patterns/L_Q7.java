//A A A
//B B B
//C C C
package Patterns;

public class L_Q7
{
    public static void main(String[] args) {
        int n=4;
        char ch='A';
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)
            {
                System.out.print((ch)+ " ");
            }
            ch=(char)(ch+1);
            System.out.println();
        }
    }
}
