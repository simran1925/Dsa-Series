package Logic_Building_Question.MathAndNumberLogic;

import java.util.Scanner;

public class whichQuadrantDigitsLie
{


    public static void checkQuadrant(int x,int y)
    {
        if(x>0 && y>0)
        {
            System.out.println("First quadrant");
        }
        else if(x<0 && y<0)
        {
            System.out.println("Third quadrant");
        }
        else if (x>0 && y<0)
        {
            System.out.println("4th quadrant");
        }
        else
        {
            System.out.println("2nd quadrant");
        }
    }
    public static void main(String[] args) {

        int x=3, y=-8;
        checkQuadrant(x,y);



    }
}
