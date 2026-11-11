package BasicRecursion;

import java.lang.reflect.Array;

public class ReverseStringUsingRecursion
{
    public static String reverseString(String s)
    {
        char[] reversed = functionToReverse(s.toCharArray(), 0, s.length()-1);
        return new String(reversed);
    }
    public static char[] functionToReverse(char[] s, int left, int right)
    {
        if(left>right)
        {
            return s;
        }

        char temp= s[left];
        s[left]= s[right];
        s[right]= temp;

        return functionToReverse(s,left+1, right-1);
    }
    public static void main(String[] args) {
        String s= "Simran";
        String ans=  reverseString(s);
        System.out.println(ans);

    }
}
