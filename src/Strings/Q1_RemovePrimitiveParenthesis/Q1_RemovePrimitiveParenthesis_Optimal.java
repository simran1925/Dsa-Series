package Strings.Q1_RemovePrimitiveParenthesis;

public class Q1_RemovePrimitiveParenthesis_Optimal
{
    public static String removeOuterParentheses(String s)
    {
        StringBuilder ans= new StringBuilder();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                if(count>0)
                {
                    ans.append(ch);
                }
                System.out.println(ans);
                System.out.println(count);
                count++;
            }
            else if(ch==')')
            {
                count--;
                if(count>0)
                {
                    ans.append(ch);
                }
                System.out.println(ans);
                System.out.println(count);

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
