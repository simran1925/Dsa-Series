package StackAndQueue.Q27_StockSpanner;

import java.util.Stack;

public class Q27_StockSpanner_Optimal
{
    public static int[] stockSpanner(int stock[])
    {
        //fist step is to find the next larger to left
        Stack<Integer> stack= new Stack<>();
        int ans[]= new int[stock.length];
        for(int i=0;i<stock.length;i++)
        {
            while(!stack.isEmpty() && stock[stack.peek()] <= stock[i])
            {
                stack.pop();
            }
            ans[i]= i-(stack.isEmpty()?-1:stack.peek());

            stack.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
         int stock[] = {100,80,60,70,60,75,85};
         int ans[]= stockSpanner(stock);
         for(int i=0;i<ans.length;i++)
         {
             System.out.print(ans[i]+ " ");
         }
    }
}
