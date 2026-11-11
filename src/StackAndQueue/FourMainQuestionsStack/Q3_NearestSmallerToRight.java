package StackAndQueue.FourMainQuestionsStack;

import java.util.Stack;

public class Q3_NearestSmallerToRight
{
    public static int[] nearestSmallerToRight(int arr[])
    {
        Stack<Integer> stack= new Stack<>();
        int ans[]= new int[arr.length];

        for(int i= arr.length-1;i>=0;i--)
        {
            while (!stack.isEmpty() && stack.peek()>=arr[i])
            {
                stack.pop();
            }
            if(stack.isEmpty() )
            {
                ans[i]= -1;
            }
            else {
                ans[i]= stack.peek();
            }
            stack.push(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]= {3,4,1,6,7,9};
        int ans[]= nearestSmallerToRight(arr);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+ " ");
        }
    }
}
