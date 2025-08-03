package Recursion.Q6_GenerateBinaryStrings;

import java.util.ArrayList;
import java.util.List;

public class Q6_GenerateBinaryStrings_Optimal_Recursion
{
    public static List<String> generateBinaryStings(int n)
    {
       return generateStrings(n,"",new ArrayList<>(),0);
    }
    public static List<String> generateStrings(int n, String current,List<String > result,int i)
    {
        if(n==i)
        {
            result.add(current);
            return result;
        }
        generateStrings(n,current+ "0",result,i+1);
        if(current.isEmpty() || current.charAt(current.length()-1)!='1')
        {
            generateStrings(n,current+ "1", result,i+1);
        }
        System.out.println("simransimran");
        return result;
    }
    public static void main(String[] args) {
      int n=3;
     List<String> ans =  generateBinaryStings(3);
        System.out.println(ans);
    }
}
