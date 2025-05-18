package Strings.Q2_ReverseStringWordByWord;

public class ReverseStringWordByWord_Bruteforce
{
    public static String reverseWords(String s)
    {
        String arr[]= s.split("\\s+");
        String ans= "";
        for(int i=arr.length-1;i>=0;i--)
        {
            ans+=(arr[i]).trim()+" ";
        }
        return ans.trim();
    }
    public static void main(String[] args) {
        String s= "Some thing    is happened ";
        String ans = reverseWords(s);
        System.out.println(ans);
    }
}
