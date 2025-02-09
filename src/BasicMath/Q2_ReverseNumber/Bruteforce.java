//Time Complexity: O(n), where n is the length of the given number
//
//Space Complexity: O(1)
package BasicMath.Q2_ReverseNumber;

public class Bruteforce
{
    public static void main(String[] args) {
        int n=1234;
        int rev=0;
        while(n>0)
        {
            int ld=n%10;
            rev=(rev*10)+ld;
            n=n/10;
        }
        System.out.println(rev);
    }
}
