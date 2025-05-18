package Strings.Q2_ReverseStringWordByWord;

public class ReverseStringWordByWord_Optimal
{
    public static String reverseWords(String s)
    {
        String arr[]= s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--)
        {
            ans.append(arr[i]);
            if(i>0)
            {
                ans.append(" ");
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String s= "Some thing    is happened ";
        String ans = reverseWords(s);
        System.out.println(ans);
    }
}
