package Recursion.Q22_WordBreak;

import java.util.*;

public class Q22_WordBreak_Optimal
{
    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet = new HashSet(wordDict);
        Map<String,Boolean> map = new HashMap<>();
        return findWordBreak(s,wordDictSet,map);
    }

    public static boolean findWordBreak(String s, Set<String> wordDictSet,Map<String,Boolean> map)
    {

        if(map.containsKey(s))
        {
            return map.get(s);
        }
        if(wordDictSet.contains(s))
        {
            map.put(s,true);
            return true;
        }


        for(int i=1;i<s.length();i++)
        {
            String prefix = s.substring(0,i);
            String suffix= s.substring(i);

            if(wordDictSet.contains(prefix) && findWordBreak(suffix,wordDictSet,map))
            {
                map.put(s,true);
                return true;
            }

        }
        map.put(s,false);
        return false;
    }

    public static void main(String[] args) {
        String s= "leetcode";
        List<String> wordDict= Arrays.asList("leet","code");
        Boolean ans = wordBreak(s,wordDict);
        System.out.println(ans);
    }
}
