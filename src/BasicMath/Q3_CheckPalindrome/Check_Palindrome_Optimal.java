package BasicMath.Q3_CheckPalindrome;

class Check_Palindrome_Optimal {
    public boolean isPalindrome(int x) {
        int original = x;
        long rev= 0;
        if(x<0)
        {
            return false;
        }
        while(x>0)
        {
            int ld= x%10;
            rev= (rev* 10) + ld;
            x= x/10;
        }
        if( rev> Integer.MAX_VALUE || rev<Integer.MIN_VALUE)
        {
            return false;
        }
        if(original == (int)rev)
        {
            return true;
        }
        return false;
    }
}