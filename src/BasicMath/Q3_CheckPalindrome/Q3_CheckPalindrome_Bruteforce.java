package BasicMath.Q3_CheckPalindrome;

public class Q3_CheckPalindrome_Bruteforce
{
    public static void main(String[] args) {
        int n=12221;
        int rev=0;
        int original=n;
        while(n>0)
        {
            int ld=n%10;
            rev=(rev*10)+ ld;
            n=n/10;
        }
        if(original==rev)
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("NOt palindrome");
        }
    }
}
