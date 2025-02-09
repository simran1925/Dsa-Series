package Arrays;

import java.lang.reflect.Field;
public class Revision
{
    public static void ageFun(int age)
    {
        if(age<18)
        {
            throw new ArithmeticException();
        }
        System.out.println("age");
    }
    public static void main(String[] args)
    {
        int age=17;
        try{
            System.out.println("h");
        ageFun(age);
            System.out.println("hey");
    }
        catch (ArithmeticException e)
    {
        System.out.println("Age cannot be less than 18");
    }

        System.out.println(age);
    }
}
