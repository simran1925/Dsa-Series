package StackAndQueue.Q12_PrefixToInfix;

import java.util.Stack;

public class Q12_PrefixToInfix_Optimal
{
    public static String prefixToInfix(String s)
    {
        Stack<String> stack= new Stack<>();
        for(int i=s.length()-1;i>=0;i--)
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

                String str= "("+ top1 + ch+ top2+ ")";
                stack.push(str);
            }



        }
        return stack.peek();
    }
    public static void main(String[] args) {
        String s = "*+PQ-MN";
        String ans=prefixToInfix(s);
        System.out.println(ans);
    }

}
