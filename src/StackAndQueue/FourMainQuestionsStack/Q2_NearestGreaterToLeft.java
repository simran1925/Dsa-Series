package StackAndQueue.FourMainQuestionsStack;

import java.util.Stack;

public class NearestGreaterToLeft
{
    public static int[] nearestGreaterToLeft(int arr[])
    {
        Stack<Integer> stack= new Stack<>();
        int ans[]= new int[arr.length];

       for(int i=0;i<arr.length;i++)
       {
           while (!stack.isEmpty() && stack.peek()<=arr[i])
           {
               stack.pop();
           }
           ans[i]= stack.isEmpty()?-1:stack.peek();
           stack.push(arr[i]);
       }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]= {3,4,1,6,7,9};
        int ans[]= nearestGreaterToLeft(arr);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+ " ");
        }
    }
}
