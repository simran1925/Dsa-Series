package Strings.Q2_CheckPalindrome;

public class Q2_CheckPalindrome_Optimal
{
    static boolean isPalindrome(String s) {
        String original= s;
        int left =0;
        int right=s.length()-1;

        while(left<right)
        {
            char ch1=s.charAt(left);
            char ch2= s.charAt(right);
            if(ch1!=ch2)
            {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
    public static void main(String[] args) {
        String string= "Simran";
        boolean ans = isPalindrome(string);
        System.out.println(ans);
    }
}
