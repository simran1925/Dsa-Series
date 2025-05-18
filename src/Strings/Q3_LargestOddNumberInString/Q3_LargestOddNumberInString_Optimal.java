package Strings.Q3_LargestOddNumberInString;

public class Q3_LargestOddNumberInString_Optimal
{
    public static String largestOddNumber(String num) {
        StringBuilder ans= new StringBuilder();
       for(int i=num.length()-1;i>=0;i--)
       {
           char ch = num.charAt(i);
           if((ch-'0')%2!=0)
           {
               ans.append(num.substring(0,i+1));
               break;
           }
       }
       return ans.toString();
    }
    public static void main(String[] args) {
        String num = "35427";
        String ans = largestOddNumber(num);
        System.out.println(ans);
    }
}
