package StackAndQueue.Q9_InfixToPostfix;

import java.util.Stack;

public class Q9_InfixToPostfix_Optimal
{
    public static int prec(char ch)
    {
        switch (ch)
        {
            case '*':
            case '/':
            {
                return 2;
            }

            case '+':
            case '-':
            {
                return 1;
            }

            case '^':
            {
                return 3;
            }
        }
        return -1;
    }
    public static String infixToPostfix(String s)
    {
        Stack<Character> stack= new Stack<>();
        String ans = "";
        for(int i=0;i<s.length();i++)
        {
            char ch= s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                ans+=ch;
            }
            else if(ch=='(')
            {
                stack.push(ch);
            }
            else if(ch==')' && !stack.isEmpty())
            {
                while (!stack.isEmpty() && stack.peek()!='(')
                {
                    ans+=stack.pop();
                }
                stack.pop();
            }
            else {
                while (!stack.isEmpty() && prec(stack.peek())>=prec(ch) )
                {
                    ans+=stack.pop();
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty())
        {
            if(stack.peek()=='(')
            {
                return "Invalid string";
            }
            ans +=stack.pop();
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "a+b*(c^d-e)";
        String ans = infixToPostfix(s);
        System.out.println(ans);
    }
}
