package Logic_Building_Question.MathAndNumberLogic;

public class ValidTriangleOrNot
{

    public static boolean isValidTriangle(int a, int b , int c)
    {
        if(((a + b)> c )&& ((a+c)> b) && ((b+c)> a))
        {
              return true;
        }
        return false;
    }

    //We can say a triangle is valid the sum of two sides is greater than third one
    public static void main(String[] args) {
          int a=4;int b=3;int c = 1000;

        System.out.println(isValidTriangle(a,b,c));




    }
}
