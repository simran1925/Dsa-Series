package Strings.Q5_IsomorphicString;

import java.util.ArrayList;
import java.util.List;

public class Q5_IsomorphicString_Bruteforce
{
    public static boolean isIsomorphic(String s, String t) {
    List<Character> list1 = new ArrayList<>();
    List<Character> list2 = new ArrayList<>();
    if(s.length() !=t.length())
    {
        return false;
    }
    if(s.length()==0)
    {
        return true;
    }
    list1.add(s.charAt(0));
    list2.add(t.charAt(0));
    for(int i=1;i<s.length();i++)
    {
        char ch1 = s.charAt(i);
        char ch2 = t.charAt(i);
        if(list1.contains(ch1))
        {
            int index = list1.indexOf(ch1);
            if(list2.get(index)!=ch2)
            {
                return false;
            }
        }
        else
        {
            list1.add(ch1);
            if(list2.contains(ch2))
            {
                return false;
            }
            list2.add(ch2);
        }
    }
    return true;
}

}
