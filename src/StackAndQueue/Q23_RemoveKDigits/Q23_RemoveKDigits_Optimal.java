package StackAndQueue.Q23_RemoveKDigits;

import java.util.Stack;

public class Q23_RemoveKDigits_Optimal
{
    public static String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<num.length();i++)
        {
            char digit= num.charAt(i);

            while(!stack.isEmpty() && k>0 && stack.peek()>digit)
            {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }


        while(k>0)  //here also while loop will be applied + k-- should also be there
        {
            stack.pop();
            k--;
        }

        StringBuilder result = new StringBuilder();
        for(char ch: stack)   //put the digits in same order as in stack
        {
            result.append(ch);
        }

        while(result.length()>0 && result.charAt(0)=='0')   //remember here the while loop will be existed
        {
            result.deleteCharAt(0);
        }

        if(result.length()==0)
        {
            return "0";
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s= "1432219" ;int k = 3;
        String ans= removeKdigits(s,k);
        System.out.println(ans);
    }
}
