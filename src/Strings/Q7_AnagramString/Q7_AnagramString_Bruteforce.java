package Strings.Q7_AnagramString;

import java.util.ArrayList;
import java.util.List;

public class Q7_AnagramString_Bruteforce
{
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        List<Character> list = new ArrayList();
        for(int i=0;i<s.length();i++)
        {
            list.add(s.charAt(i));
        }
        for(int i=0;i<t.length();i++)
        {
            char ch= t.charAt(i);
            if(list.contains(ch))
            {
                list.remove((Character)(ch));
            }
        }
        if(list.isEmpty())
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str1 = "anagram";
        String str2=  "naagram";
        boolean ans =isAnagram(str1,str2);
        System.out.println(ans);
    }
}
