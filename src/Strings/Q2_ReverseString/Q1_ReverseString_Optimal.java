package Strings.Q2_ReverseString;

public class Q1_ReverseString_Optimal
{
    public static char[] reverseString(char[] s) {
        int left=0;
        int right= s.length-1;
        while(left<=right)
        {
            char temp = s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
        return s;
    }
    public static void main(String[] args) {
         char[] string= {'S','i','m','r','a','n'};
        char[] ans = reverseString(string);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+ " ");
        }
    }
}
