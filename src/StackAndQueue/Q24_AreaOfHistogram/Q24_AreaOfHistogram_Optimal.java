package StackAndQueue.Q24_AreaOfHistogram;

import java.util.Stack;

public class Q24_AreaOfHistogram_Optimal
{
    //Concept here is :
    //1. we will find the nsl and nsr
    //2 then minus them nsr-nsl
    //3. then width array will be nsr-nsl- i
    //4. then area will be height[i] * width[i]
    //5. we will find the max area
    public static int largestRectangleArea(int[] heights)
    {
        //step 1 find nsl
        Stack<Integer> stack = new Stack<>();
        int[] nsl= new int[heights.length];
        int[] nsr= new int[heights.length];
        int width[]= new int[heights.length];
        int maxArea= 0;

        for(int i=0;i<heights.length;i++)
        {
            while(!stack.isEmpty() && heights[stack.peek() ]> heights[i])
            {
                stack.pop();
            }
            nsl[i]= stack.isEmpty()? -1: stack.peek();

            stack.push(i);
        }

        stack.clear();
        for(int i=heights.length-1;i>=0;i--)
        {
            while(!stack.isEmpty() && heights[stack.peek() ]>= heights[i])
            {
                stack.pop();
            }
            nsr[i]= stack.isEmpty()? heights.length: stack.peek();

            stack.push(i);
        }

        for(int i=0;i<heights.length;i++)
        {
            maxArea= Math.max(heights[i]* (nsr[i]- nsl[i]-1),maxArea);
        }
        return maxArea;

    }

    public static void main(String[] args) {
        int arr[]= {2,1,5,6,2,3};
        int maxArea= largestRectangleArea(arr);
        System.out.println(maxArea);
    }
}
