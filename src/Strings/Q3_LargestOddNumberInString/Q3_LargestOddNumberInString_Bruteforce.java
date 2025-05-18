package Strings.Q3_LargestOddNumberInString;

public class Q3_LargestOddNumberInString_Bruteforce
{
    public static String largestOddNumber(String num) {
        StringBuilder ans= new StringBuilder();
        long maxOdd=-1;
        for(int i=0;i<num.length();i++)
        {
            StringBuilder temp = new StringBuilder();
            for(int j=i;j<num.length();j++)
            {
                char ch= num.charAt(j);
                temp.append(ch);

                long number = Long.parseLong(temp.toString());
                if((number%2)!=0)
                {
                    maxOdd= Math.max(maxOdd,number);
                }
            }
        }
        if(maxOdd<0)
        {
            return "";
        }
        return String.valueOf(maxOdd);
    }
    public static void main(String[] args) {
        String num = "35427";
        String ans = largestOddNumber(num);
        System.out.println(ans);
    }
}
