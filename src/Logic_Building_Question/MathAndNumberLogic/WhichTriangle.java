package Logic_Building_Question.MathAndNumberLogic;

public class WhichTriangle
{

    public static boolean isValidTriangle(int a, int b , int c)
    {
        if(((a + b)> c )&& ((a+c)> b) && ((b+c)> a))
        {
            return true;
        }
        return false;
    }
    public static void typeOfTriangle(int a, int b, int c)
    {
       if(isValidTriangle(a,b,c))
       {
           if(a==b && b==c)
           {
               System.out.println("equilateral triangle");
           }
           else if (a !=b && b!=c ){
               System.out.println("scalene triangle");
           }
           else if(a==b || b==c || a==c) {
               System.out.println("isosceles triangle");
           }
       }
    }
    public static void main(String[] args) {
        int a=3,b=5,c=5;
        typeOfTriangle(a,b,c);


    }
}
