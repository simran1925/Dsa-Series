package Recursion.Q19_PalindromicPartitioning;

import java.util.ArrayList;
import java.util.List;

public class Q19_PalindromicPartitioning_Optimal
{
    public static List<List<String>> partition(String s)
    {
        List<List<String>>  result = new ArrayList<>();
        return findPartition(s,new ArrayList<>(),0,result);
    }

    public static List<List<String>> findPartition(String s,List<String> current,int index,List<List<String>>  result)
    {
        if(index==s.length())
        {
            result.add(new ArrayList<>(current));
            return result;
        }

        for(int i=index;i<s.length();i++)
        {
            if(isPalindrome(s,index,i))
            {
                current.add(s.substring(index,i+1));
                findPartition(s,current,i+1,result);
                current.remove(current.size()-1);
            }

        }

        return result;
    }

    public static boolean isPalindrome(String s,int start,int end)
    {
        while(start<=end)
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s= "abb";
        List<List<String>> ans= partition(s);
        System.out.println(ans);
    }
}
