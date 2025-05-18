package Strings.Q2_ReverseString;

public class Q1_ReverseString_Bruteforce
{
    public static String reverseString(String str)
    {
        String ans= "";
        for(int i=str.length()-1;i>=0;i--)
        {
            ans+=str.charAt(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        String str= "Simran";
        String ans =reverseString(str);
        System.out.println(ans);
    }
}
