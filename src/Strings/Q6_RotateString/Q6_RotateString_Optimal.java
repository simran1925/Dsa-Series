package Strings.Q6_RotateString;

public class Q6_RotateString_Optimal
{
    public static boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
        {
            return false;
        }
        return (s+s).contains(goal);
    }
    public static void main(String[] args) {
        String s= "abcde";
        String goal= "abced";
        boolean ans = rotateString(s,goal);
        System.out.println(ans);
    }
}
