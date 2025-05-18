package Strings.Q7_AnagramString;

import java.util.Arrays;

public class Q7_AnagaramString_Better
{
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        char arr1[]= s.toCharArray();
        char arr2[]= t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        s=Arrays.toString(arr1);
        t=Arrays.toString(arr2);
        if(s.equals(t))
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str1 = "rat";
        String str2=  "car";
        boolean ans =isAnagram(str1,str2);
        System.out.println(ans);
    }
}
