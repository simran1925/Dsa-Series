package prepare;

public class StringQuestion
{
    public static boolean isPalindrome(String s)
    {
        int l=0;
        int r=s.length()-1;
        while(l<=r)
        {
            if(s.charAt(l)!=s.charAt(r))
            {
                System.out.println("No palindrome");
                return false;
            }
            else if(s.charAt(l)==s.charAt(r))
            {
                l++;
                r--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
       String s="simmu";
       if(isPalindrome(s))
       {
           System.out.println("Palindrome");
       }
    }

}
