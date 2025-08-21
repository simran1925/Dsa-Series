package Recursion.Q18_LetterCombination;

import java.util.ArrayList;
import java.util.List;

public class Q18_LetterCombination_Optimal
{
    public static List<String> letterCombinations(String digits) {

        String mapping[]= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(digits.isEmpty())
        {
            return new ArrayList<>();
        }
        return findLetterCombinations(digits,mapping,"",0,new ArrayList<>());

    }

    public static List<String> findLetterCombinations(String digits, String[] mapping, String current,int index,List<String> result)
    {
        if(index==digits.length())
        {
            result.add(current);
            return result;
        }
        String letters = mapping[digits.charAt(index)-'0'];

        for (char ch : letters.toCharArray())
        {
            findLetterCombinations(digits,mapping,current+ ch,index+1,result);

        }

        return result;
    }

    public static void main(String[] args) {
        String digits = "2";
        List<String> result = letterCombinations(digits);
        System.out.println(result);
    }
}
