package StackAndQueue.Q21_AsteroidCollision;

import java.util.Stack;

public class Q21_AsteroidCollision_Optimal
{
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int a: asteroids)
        {
            boolean isAlive=true;   //always put it inside the for loop
            while(!stack.isEmpty() && a<0 && stack.peek() >0)
            {

                int top = stack.peek();
                if(top<-a)
                {
                    stack.pop();      //here the stack eleemnt will be exploided
                }else if(top==-a)
                {
                    isAlive=false;
                    stack.pop();            //here both stack + current element will be exploded
                    break;
                }
                else
                {
                    isAlive=false;
                    break;             //here only the current element is exploded
                }
            }

            if(isAlive)
            {
                stack.push(a);
            }

        }
        //convert the stack into integer
        int[] result = new int[stack.size()];

        for(int i=stack.size()-1;i>=0;i--)
        {
            result[i]= stack.pop();
        }

        return result;
    }
    public static void main(String[] args) {
        int arr[]= {5,10,-5};
        int ans[]= asteroidCollision(arr);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+ " ");
        }
    }
}
