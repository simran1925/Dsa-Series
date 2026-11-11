package StackAndQueue.Q26_SlidingWindow;

import java.util.ArrayDeque;
import java.util.Deque;

public class Q26_SlidingWindow_Optimal
{
    public static int[] maxSlidingWindow(int[] nums, int k) {

        int n= nums.length;
        int[] maxWindowElements= new int[n-k+1];
        int r=0;
        Deque<Integer> queue = new ArrayDeque<>();
        for(int i=0;i<n;i++)
        {
            if(!queue.isEmpty() && queue.peek()==i-k)
            {
                queue.poll();
            }

            while(!queue.isEmpty() && nums[queue.peekLast()]< nums[i])
            {
                queue.pollLast();
            }
            queue.offer(i);

            if(i>=k-1)
            {
                maxWindowElements[r++]= nums[queue.peek()];
            }
        }

        return maxWindowElements;


    }
    public static void main(String args[]) {
        int i, j, n, k = 3, x;
        int arr[]={4,0,-1,3,5,3,6,8};
        int ans[] = maxSlidingWindow(arr, k);
        System.out.println("Maximum element in every " + k + " window ");
        for (i = 0; i < ans.length; i++)
            System.out.print(ans[i] + "  ");

    }
}
