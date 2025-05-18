package Strings.Q7_AnagramString;

public class Q7_AnagaramString_Optimal
{
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        int freq[]= new int[26];
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++)
        {
            freq[t.charAt(i)-'a']--;
        }
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]!=0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "rat";
        String str2=  "car";
        boolean ans =isAnagram(str1,str2);
        System.out.println(ans);
    }
}
