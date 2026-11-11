package Logic_Building_Question.MathAndNumberLogic;

import java.util.Scanner;

public class SumOfNumbers
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter a number ");     //(1-100)
//        int n= scanner.nextInt();
//        int sum = 0;

        //n=4;     (1 to 4)
//        i=5
        for(int i=1;i<=50;i++)
        {
//            sum= sum+i;

            if(i%2!=0)
            {
                System.out.println(i);
            }

            //sum = 0+1
            //sum=1;

//            i=2
//            1+2=3
            //sum=3

            //i=3
//             3+3=6
//            sum=6

            //i=4
            //6+4=10
            //sum=10
        }
//        System.out.println(sum);   //10  n=4

    }
}
