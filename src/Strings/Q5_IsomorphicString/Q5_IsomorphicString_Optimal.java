package Strings.Q5_IsomorphicString;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q5_IsomorphicString_Optimal {
    public static boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();

        for(int i=0;i<s.length();i++)
        {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if(map.containsKey(ch1))
            {
                if(map.get(ch1)!=ch2)
                {
                    return false;
                }
            }
            else
            {
                if(set.contains(ch2))
                {
                    return false;
                }
            }
            map.put(ch1,ch2);
            set.add(ch2);
        }

        return true;
    }
    public static void main(String[] args) {
        String str1 = "paper";
        String str2 = "title";
        boolean ans = isIsomorphic(str1,str2);
        System.out.println(ans);
    }
}
