package StackAndQueue.Q11_PostfixToInfix;

import java.util.Stack;

public class Q11_PostfixToInfix_Optimal
{
    public static String postfixToInfix(String s)
    {
        Stack<String>  stack= new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch= s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                stack.push(String.valueOf(ch));
            }
            else {
                String top1= stack.peek();
                stack.pop();
                String top2= stack.peek();
                stack.pop();

                String str= "("+ top2 + ch+ top1+ ")";
                stack.push(str);
            }

        }
        return stack.peek();
    }
    public static void main(String[] args) {
        String s = "AB-DE+F*/";
        String ans=postfixToInfix(s);
        System.out.println(ans);
    }

}
