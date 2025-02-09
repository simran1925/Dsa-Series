//for n=6
//        6 6 6 6 6 6 6 6 6 6 6
//        6 5 5 5 5 5 5 5 5 5 6
//        6 5 4 4 4 4 4 4 4 5 6
//        6 5 4 3 3 3 3 3 4 5 6
//        6 5 4 3 2 2 2 3 4 5 6
//        6 5 4 3 2 1 2 3 4 5 6
//        6 5 4 3 2 2 2 3 4 5 6
//        6 5 4 3 3 3 3 3 4 5 6
//        6 5 4 4 4 4 4 4 4 5 6
//        6 5 5 5 5 5 5 5 5 5 6
//        6 6 6 6 6 6 6 6 6 6 6

package Patterns;

public class Q22
{
    public static void main(String[] args)
    {
        int n=6;
        int i=1,j=1;
        int flag=0;
        int count=n-i+j;
        int orCount=count;
        int lCount=6;
        int outlCount=6;
        for( i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i!=j && flag==1)
                {
                    System.out.print(count);
                }
                else if(i!=j && flag==0)
                {
                    System.out.print(count);
                    count--;
                }
                else if (i==j){
                    flag=1;
                    System.out.print(count);
                }
            }
            //refers to i
            for(int k=1;k<=n;k++)
            {
                //refers to j
                for(int l=n-1;l>=1;l--)
                {
                    if(l==k)
                    {
                        System.out.println(lCount);
                        lCount--;
                    }
                    else {
                    System.out.println(lCount);
                    }

                }
            }
            count=orCount;
            flag=0;

            outlCount--;
            lCount=outlCount;
            System.out.println();
        }
    }
}
