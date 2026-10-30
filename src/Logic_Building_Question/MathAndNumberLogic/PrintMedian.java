package Logic_Building_Question.MathAndNumberLogic;


//logic

//   min   median   max
//    b  <   a   <   c
//    c  <   a   <   b
//----------------------
//    a  <   b   <   c
//    c  <   b   <   a
//----------------------
//    a  <   c   <   b
//    b  <   c   <   a

public class PrintMedian
{
    public static void printMedian(int a,int b,int c)
    {
       if(a<b && b<c || c<b && b<a )
        {
            System.out.println("Median is : "+ b);
        }
       else  if (b<a && a<c || c<a && a<b)
       {
           System.out.println("Median is :" + a);
       }
       else if(b<c && c<a || a<c && c<b)
           System.out.println("median is "+ c);
    }
    public static void main(String[] args) {

        int a= 7,  b= 6,  c= 9;
        printMedian(a,b,c);

    }
}
