package StackAndQueue.Q22_SumOfSubarrayRange;

import java.util.Stack;

public class Q22_SumOfSubarrayRange_Optimal
{
    public long subArrayRanges(int[] nums)
    {
        //here we will find the the smallest of subarray and largest of subarray and then the summation of minus of them will be our ans

        //i.e result = result + (max(b)- min(b)) where b is the subarray elements

        int n= nums.length;
        int[] nsl= new int[n];
        int[] nsr= new int[n];
        int[] ngl= new int[n];
        int[] ngr= new int[n];

        long sum=0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<nums.length;i++)
        {
            while(!stack.isEmpty() && nums[stack.peek()]>nums[i])
            {
                stack.pop();
            }
            nsl[i]= stack.isEmpty()? -1: stack.peek();

            stack.push(i);
        }

        stack.clear();

        for(int i=n-1;i>=0;i--)
        {
            while(!stack.isEmpty() && nums[stack.peek()]>=nums[i])
            {
                stack.pop();
            }
            nsr[i]= stack.isEmpty()? n: stack.peek();

            stack.push(i);
        }

        stack.clear();
        for(int i=0;i<nums.length;i++)
        {
            while(!stack.isEmpty() && nums[stack.peek()]<nums[i])
            {
                stack.pop();
            }
            ngl[i]= stack.isEmpty()? -1: stack.peek();

            stack.push(i);
        }

        stack.clear();
        for(int i=n-1;i>=0;i--)
        {
            while(!stack.isEmpty() && nums[stack.peek()]<=nums[i])
            {
                stack.pop();
            }
            ngr[i]= stack.isEmpty()? n: stack.peek();

            stack.push(i);
        }

        for(int i=0;i<nums.length;i++)
        {
            long leftMin = i-nsl[i];
            long rightMin= nsr[i]-i;
            long min= (long)nums[i] * leftMin * rightMin;
            long leftMax = i-ngl[i];
            long rightMax= ngr[i]-i;
            long max= (long)nums[i] * leftMax * rightMax;

            long range= max-min;
            sum= sum+ range;

        }

        return sum;

    }
}
