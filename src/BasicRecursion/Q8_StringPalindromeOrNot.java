//Example 1:
//Input: Str =  “ABCDCBA”
//Output: Palindrome
//Explanation: String when reversed is the same as string.
//
//Example 2:
//Input: Str = “TAKE U FORWARD”
//Output: Not Palindrome
//Explanation: String when reversed is not the same as string.
package BasicRecursion;

public class Q8_StringPalindromeOrNot
{
    public static boolean isPalindrome(String str,int l, int r)
    {
        if(l>=r)
        {
            return false;
        }
        else if(l<r && (str.charAt(l)==str.charAt(r)))
        {
            return true;
        }
        return isPalindrome(str,l+1,r-1);
    }
    public static void main(String[] args)
    {
        String str="jora";
        int l=0;
        int r=str.length()-1;
        if(isPalindrome(str,l,r))
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }


    }
}
