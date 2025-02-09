//         A
//        ABA
//       ABCBA
//      ABCDCBA
//     ABCDEDCBA
//    ABCDEFEDCBA


//Revise confusing for 3rd loop (l loop)
package Patterns;

public class Q17
{
    public static void main(String[] args)
    {
        int n=6;
        char ch='A';
        char ch1=(char)(ch-1);
        char oh=ch;
        char oh1=ch1;
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=n-i;k++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
                ch=(char)(ch+1);
            }
            for(int l=1;l<=i-1;l++)
            {
                System.out.print(ch1+" ");
                ch1=(char)(ch1-1);
            }
            ch=oh;
            oh1=(char)(oh1+1);
            ch1=oh1;
            System.out.println();
        }


    }
}
