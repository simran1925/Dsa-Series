package Arrays.Easy;

import java.util.*;

class Solution {
   public static List<Integer> generate(int n,int[] nums,int  target)
   {
       List<Integer>result= new ArrayList<>();
       return subsequence(result,new ArrayList<>(),n,0, nums, 0, target);
   }

   public static List<Integer> subsequence(List<Integer> result, List<Integer> curr,int n, int index,int[] nums, int sum, int target)
   {

       if(index==n)
       {
           if(sum==target)
           {
               System.out.println("Heyy");
               return curr;
           }
           return null;
       }

       curr.add(nums[index]);
       List<Integer> left= subsequence(result,curr ,n,index+1,nums, sum + nums[index],target);
       if(left!=null)
       {
           System.out.println("hey1");
           return left;
       }
       curr.remove(curr.get(curr.size()-1));
       List<Integer> right= subsequence(result,curr,n,index+1,nums,sum, target);
       if(right!=null)
       {
           System.out.println("hey2");
           return right;
       }

       return new ArrayList<>();

   }

    public static void main(String[] args) {
        int n=5;
//        String str= "abc";
        int[] nums= {4, 9, 2, 5, 1};
       List<Integer>  strings=  generate(n, nums, 10);
        System.out.println(strings);

    }

}