package Strings.Q1_RemovePrimitiveParenthesis;

public class Q1_RemovePrimitiveParenthesis_Bruteforce
{
    public static String removeOuterParentheses(String s)
    {
        StringBuilder ans= new StringBuilder();
        int start =0;
        int balance =0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                balance++;
            }
            else if(s.charAt(i)==')')
            {
                balance--;
            }
            if(balance==0)
            {
                ans.append(s.substring(start+1,i));
                start=i+1;
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String s= "(()())(())";
        String ans = removeOuterParentheses(s);
        System.out.println(ans);
    }
}
