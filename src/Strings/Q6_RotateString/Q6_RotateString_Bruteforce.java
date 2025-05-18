package Strings.Q6_RotateString;

public class Q6_RotateString_Bruteforce
{
    public static boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            //try all possible rotations
            s= s.substring(1)+ s.charAt(0);
            if(s.equals(goal))
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
    String s= "abcde";
    String goal= "abced";
    boolean ans = rotateString(s,goal);
        System.out.println(ans);
    }
}
