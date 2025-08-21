package StackAndQueue.Q10_InfixToPrefix;

import java.util.Stack;

public class Q10_InfixToPrefix_Optimal
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
                while (!stack.isEmpty() && (prec(stack.peek())>prec(ch) || prec(stack.peek())>=prec(ch) && ch!='^'))
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

    public static String reverseString(String s)
    {
        char[] charArray= s.toCharArray();
        int left =0;
        int right = s.length()-1;
        while (left<=right){
            char temp = charArray[left];
            charArray[left]=charArray[right];
            charArray[right]=temp;
            left++;
            right--;
        }
        return String.valueOf(charArray);
    }
    public static void main(String[] args) {
        String s = "(p+q)*(c-d)";

//        Step 1: reverse the string
        String ans = reverseString(s);
        //Step 2: replace the '(' with ')' and vice versa
        char[] arr = ans.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='(')
            {
                arr[i]=')';
            }
            else if(arr[i]==')')
            {
                arr[i]='(';
            }
        }
        //Step 3 : infix to postfix with some changed condition in last condition i.e. for operator
        ans=infixToPostfix(String.valueOf(arr));

        //step 4 : reverse the ans string again
        ans=reverseString(ans);
        System.out.println(ans);
    }
}
