package StackAndQueue.Q25_MaximumRectangleInaMatrix;

import java.util.Stack;

public class Q25_MaximumRectangleInaMatrix_Optimal
{
    public static int maximalRectangle(char[][] matrix) {

        int cols= matrix[0].length;
        int[] heights= new int[cols];

        int maxRectangle= 0;

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(matrix[i][j]=='1')
                {
                    heights[j]+=1;
                }
                else
                {
                    heights[j]=0;
                }
            }
            maxRectangle= Math.max(maxRectangle,largestRectangleArea(heights));
        }

        return maxRectangle;

    }

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
}
