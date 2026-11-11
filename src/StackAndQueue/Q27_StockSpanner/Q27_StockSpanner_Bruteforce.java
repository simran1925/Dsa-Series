package StackAndQueue.Q27_StockSpanner;

import java.util.Stack;
class StockSpanner {
    private Stack<Integer> stack;
    private Stack<Integer> stock;
    private int i;

    public StockSpanner() {
        stack = new Stack<>();
        stock = new Stack<>();    //list of stocks (the list)
        i = -1;  // will increment on each next() call
    }

    public int next(int price) {
        i++; // move to next day
        stock.push(price);

        // find next larger to left (NGL)
        while (!stack.isEmpty() && stock.get(stack.peek()) <= price) {
            stack.pop();
        }

        int ans = i - (stack.isEmpty() ? -1 : stack.peek());

        stack.push(i);
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
public class Q27_StockSpanner_Bruteforce
{

    public static void main(String[] args) {
         /*int stock[] = {100,80,60,70,60,75,85};
         int ans[]= stockSpanner(stock);
         for(int i=0;i<ans.length;i++)
         {
             System.out.print(ans[i]+ " ");
         }*/
        StockSpanner stockSpanner = new StockSpanner();
        System.out.print(stockSpanner.next(100)+ ",");
        System.out.print(stockSpanner.next(80)+ ",");
        System.out.print( stockSpanner.next(60)+ ",");
        System.out.print( stockSpanner.next(70)+ ",");
        System.out.print( stockSpanner.next(75)+ ",");
        System.out.print(stockSpanner.next(85));
    }
}
